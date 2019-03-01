package typings
package winrtLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageEncodingProperties extends IMediaEncodingProperties {
  var height: scala.Double
  var width: scala.Double
}

object IImageEncodingProperties {
  @scala.inline
  def apply(
    height: scala.Double,
    properties: MediaPropertySet,
    subtype: java.lang.String,
    `type`: java.lang.String,
    width: scala.Double
  ): IImageEncodingProperties = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("subtype")(subtype)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IImageEncodingProperties]
  }
}

