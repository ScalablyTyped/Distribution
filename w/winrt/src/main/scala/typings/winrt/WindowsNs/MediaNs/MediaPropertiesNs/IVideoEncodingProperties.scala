package typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs

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
    val __obj = js.Dynamic.literal(bitrate = bitrate, frameRate = frameRate, height = height, pixelAspectRatio = pixelAspectRatio, properties = properties, subtype = subtype, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IVideoEncodingProperties]
  }
}

