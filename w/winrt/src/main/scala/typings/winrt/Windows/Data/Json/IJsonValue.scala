package typings.winrt.Windows.Data.Json

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonValue extends js.Object {
  var valueType: JsonValueType
  def getArray(): JsonArray
  def getBoolean(): Boolean
  def getNumber(): Double
  def getObject(): JsonObject
  def getString(): String
  def stringify(): String
}

object IJsonValue {
  @scala.inline
  def apply(
    getArray: () => JsonArray,
    getBoolean: () => Boolean,
    getNumber: () => Double,
    getObject: () => JsonObject,
    getString: () => String,
    stringify: () => String,
    valueType: JsonValueType
  ): IJsonValue = {
    val __obj = js.Dynamic.literal(getArray = js.Any.fromFunction0(getArray), getBoolean = js.Any.fromFunction0(getBoolean), getNumber = js.Any.fromFunction0(getNumber), getObject = js.Any.fromFunction0(getObject), getString = js.Any.fromFunction0(getString), stringify = js.Any.fromFunction0(stringify), valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonValue]
  }
}

