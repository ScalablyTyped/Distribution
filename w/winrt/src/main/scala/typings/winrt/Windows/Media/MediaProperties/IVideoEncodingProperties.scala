package typings.winrt.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVideoEncodingProperties extends IMediaEncodingProperties {
  var bitrate: Double
  var frameRate: MediaRatio
  var height: Double
  var pixelAspectRatio: MediaRatio
  var width: Double
}

object IVideoEncodingProperties {
  @scala.inline
  def apply(
    bitrate: Double,
    frameRate: MediaRatio,
    height: Double,
    pixelAspectRatio: MediaRatio,
    properties: MediaPropertySet,
    subtype: String,
    `type`: String,
    width: Double
  ): IVideoEncodingProperties = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], frameRate = frameRate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pixelAspectRatio = pixelAspectRatio.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVideoEncodingProperties]
  }
}

