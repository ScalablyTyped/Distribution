package typings
package winrtLib.WindowsNs.DataNs.JsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonObject extends IJsonValue {
  def getNamedArray(name: java.lang.String): JsonArray
  def getNamedBoolean(name: java.lang.String): scala.Boolean
  def getNamedNumber(name: java.lang.String): scala.Double
  def getNamedObject(name: java.lang.String): JsonObject
  def getNamedString(name: java.lang.String): java.lang.String
  def getNamedValue(name: java.lang.String): JsonValue
  def setNamedValue(name: java.lang.String, value: IJsonValue): scala.Unit
}

object IJsonObject {
  @scala.inline
  def apply(
    getArray: () => JsonArray,
    getBoolean: () => scala.Boolean,
    getNamedArray: java.lang.String => JsonArray,
    getNamedBoolean: java.lang.String => scala.Boolean,
    getNamedNumber: java.lang.String => scala.Double,
    getNamedObject: java.lang.String => JsonObject,
    getNamedString: java.lang.String => java.lang.String,
    getNamedValue: java.lang.String => JsonValue,
    getNumber: () => scala.Double,
    getObject: () => JsonObject,
    getString: () => java.lang.String,
    setNamedValue: (java.lang.String, IJsonValue) => scala.Unit,
    stringify: () => java.lang.String,
    valueType: JsonValueType
  ): IJsonObject = {
    val __obj = js.Dynamic.literal(getArray = js.Any.fromFunction0(getArray), getBoolean = js.Any.fromFunction0(getBoolean), getNamedArray = js.Any.fromFunction1(getNamedArray), getNamedBoolean = js.Any.fromFunction1(getNamedBoolean), getNamedNumber = js.Any.fromFunction1(getNamedNumber), getNamedObject = js.Any.fromFunction1(getNamedObject), getNamedString = js.Any.fromFunction1(getNamedString), getNamedValue = js.Any.fromFunction1(getNamedValue), getNumber = js.Any.fromFunction0(getNumber), getObject = js.Any.fromFunction0(getObject), getString = js.Any.fromFunction0(getString), setNamedValue = js.Any.fromFunction2(setNamedValue), stringify = js.Any.fromFunction0(stringify), valueType = valueType)
  
    __obj.asInstanceOf[IJsonObject]
  }
}

