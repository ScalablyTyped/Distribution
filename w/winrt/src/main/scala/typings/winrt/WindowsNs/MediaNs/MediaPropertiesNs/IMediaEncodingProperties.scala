package typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaEncodingProperties extends js.Object {
  var properties: MediaPropertySet
  var subtype: String
  var `type`: String
}

object IMediaEncodingProperties {
  @scala.inline
  def apply(properties: MediaPropertySet, subtype: String, `type`: String): IMediaEncodingProperties = {
    val __obj = js.Dynamic.literal(properties = properties, subtype = subtype)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IMediaEncodingProperties]
  }
}

