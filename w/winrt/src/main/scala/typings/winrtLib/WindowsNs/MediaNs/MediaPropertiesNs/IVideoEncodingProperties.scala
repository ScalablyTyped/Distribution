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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bitrate")(bitrate)
    __obj.updateDynamic("frameRate")(frameRate)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("pixelAspectRatio")(pixelAspectRatio)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("subtype")(subtype)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IVideoEncodingProperties]
  }
}

