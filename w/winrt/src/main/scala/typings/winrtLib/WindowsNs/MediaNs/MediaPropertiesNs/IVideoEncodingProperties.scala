package typings
package winrtLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVideoEncodingProperties extends IMediaEncodingProperties {
  var bitrate: scala.Double
  var frameRate: MediaRatio
  var height: scala.Double
  var pixelAspectRatio: MediaRatio
  var width: scala.Double
}

object IVideoEncodingProperties {
  @scala.inline
  def apply(
    bitrate: scala.Double,
    frameRate: MediaRatio,
    height: scala.Double,
    pixelAspectRatio: MediaRatio,
    properties: MediaPropertySet,
    subtype: java.lang.String,
    `type`: java.lang.String,
    width: scala.Double
  ): IVideoEncodingProperties = {
    val __obj = js.Dynamic.literal(bitrate = bitrate, frameRate = frameRate, height = height, pixelAspectRatio = pixelAspectRatio, properties = properties, subtype = subtype, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IVideoEncodingProperties]
  }
}

