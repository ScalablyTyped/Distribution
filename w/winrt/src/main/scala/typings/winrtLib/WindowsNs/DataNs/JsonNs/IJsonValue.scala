package typings
package winrtLib.WindowsNs.DataNs.JsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonValue extends js.Object {
  var valueType: JsonValueType
  def getArray(): JsonArray
  def getBoolean(): scala.Boolean
  def getNumber(): scala.Double
  def getObject(): JsonObject
  def getString(): java.lang.String
  def stringify(): java.lang.String
}

object IJsonValue {
  @scala.inline
  def apply(
    getArray: js.Function0[JsonArray],
    getBoolean: js.Function0[scala.Boolean],
    getNumber: js.Function0[scala.Double],
    getObject: js.Function0[JsonObject],
    getString: js.Function0[java.lang.String],
    stringify: js.Function0[java.lang.String],
    valueType: JsonValueType
  ): IJsonValue = {
    val __obj = js.Dynamic.literal(getArray = getArray, getBoolean = getBoolean, getNumber = getNumber, getObject = getObject, getString = getString, stringify = stringify, valueType = valueType)
  
    __obj.asInstanceOf[IJsonValue]
  }
}

