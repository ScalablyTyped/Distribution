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
    val __obj = js.Dynamic.literal(height = height, properties = properties, subtype = subtype, width = width)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IImageEncodingProperties]
  }
}

