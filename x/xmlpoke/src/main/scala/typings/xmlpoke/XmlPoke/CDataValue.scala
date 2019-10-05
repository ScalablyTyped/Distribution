package typings.xmlpoke.XmlPoke

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CDataValue extends _Value {
  var value: String
}

object CDataValue {
  @scala.inline
  def apply(value: String): CDataValue = {
    val __obj = js.Dynamic.literal(value = value)
  
    __obj.asInstanceOf[CDataValue]
  }
}

