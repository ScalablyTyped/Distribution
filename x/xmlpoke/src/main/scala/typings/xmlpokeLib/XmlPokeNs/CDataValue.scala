package typings
package xmlpokeLib.XmlPokeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CDataValue extends _Value {
  var value: java.lang.String
}

object CDataValue {
  @scala.inline
  def apply(value: java.lang.String): CDataValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CDataValue]
  }
}

