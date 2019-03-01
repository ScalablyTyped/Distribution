package typings
package winrtLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaEncodingProperties extends js.Object {
  var properties: MediaPropertySet
  var subtype: java.lang.String
  var `type`: java.lang.String
}

object IMediaEncodingProperties {
  @scala.inline
  def apply(properties: MediaPropertySet, subtype: java.lang.String, `type`: java.lang.String): IMediaEncodingProperties = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("subtype")(subtype)
    __obj.asInstanceOf[IMediaEncodingProperties]
  }
}

