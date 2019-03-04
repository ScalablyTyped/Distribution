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
    getArray: js.Function0[JsonArray],
    getBoolean: js.Function0[scala.Boolean],
    getNamedArray: js.Function1[java.lang.String, JsonArray],
    getNamedBoolean: js.Function1[java.lang.String, scala.Boolean],
    getNamedNumber: js.Function1[java.lang.String, scala.Double],
    getNamedObject: js.Function1[java.lang.String, JsonObject],
    getNamedString: js.Function1[java.lang.String, java.lang.String],
    getNamedValue: js.Function1[java.lang.String, JsonValue],
    getNumber: js.Function0[scala.Double],
    getObject: js.Function0[JsonObject],
    getString: js.Function0[java.lang.String],
    setNamedValue: js.Function2[java.lang.String, IJsonValue, scala.Unit],
    stringify: js.Function0[java.lang.String],
    valueType: JsonValueType
  ): IJsonObject = {
    val __obj = js.Dynamic.literal(getArray = getArray, getBoolean = getBoolean, getNamedArray = getNamedArray, getNamedBoolean = getNamedBoolean, getNamedNumber = getNamedNumber, getNamedObject = getNamedObject, getNamedString = getNamedString, getNamedValue = getNamedValue, getNumber = getNumber, getObject = getObject, getString = getString, setNamedValue = setNamedValue, stringify = stringify, valueType = valueType)
  
    __obj.asInstanceOf[IJsonObject]
  }
}

