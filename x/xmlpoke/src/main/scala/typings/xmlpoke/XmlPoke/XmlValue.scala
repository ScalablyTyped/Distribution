package typings.xmlpoke.XmlPoke

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlValue extends _Value {
  var value: String
}

object XmlValue {
  @scala.inline
  def apply(value: String): XmlValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlValue]
  }
}

