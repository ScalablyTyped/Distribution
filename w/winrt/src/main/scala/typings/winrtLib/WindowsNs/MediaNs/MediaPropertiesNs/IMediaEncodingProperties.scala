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
    val __obj = js.Dynamic.literal(properties = properties, subtype = subtype)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IMediaEncodingProperties]
  }
}

