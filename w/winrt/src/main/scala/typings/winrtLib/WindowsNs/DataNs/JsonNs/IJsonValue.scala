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
    getArray: () => JsonArray,
    getBoolean: () => scala.Boolean,
    getNumber: () => scala.Double,
    getObject: () => JsonObject,
    getString: () => java.lang.String,
    stringify: () => java.lang.String,
    valueType: JsonValueType
  ): IJsonValue = {
    val __obj = js.Dynamic.literal(getArray = js.Any.fromFunction0(getArray), getBoolean = js.Any.fromFunction0(getBoolean), getNumber = js.Any.fromFunction0(getNumber), getObject = js.Any.fromFunction0(getObject), getString = js.Any.fromFunction0(getString), stringify = js.Any.fromFunction0(stringify), valueType = valueType)
  
    __obj.asInstanceOf[IJsonValue]
  }
}

