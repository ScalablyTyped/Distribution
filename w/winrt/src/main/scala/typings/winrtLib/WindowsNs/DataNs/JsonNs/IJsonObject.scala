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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getArray")(getArray)
    __obj.updateDynamic("getBoolean")(getBoolean)
    __obj.updateDynamic("getNamedArray")(getNamedArray)
    __obj.updateDynamic("getNamedBoolean")(getNamedBoolean)
    __obj.updateDynamic("getNamedNumber")(getNamedNumber)
    __obj.updateDynamic("getNamedObject")(getNamedObject)
    __obj.updateDynamic("getNamedString")(getNamedString)
    __obj.updateDynamic("getNamedValue")(getNamedValue)
    __obj.updateDynamic("getNumber")(getNumber)
    __obj.updateDynamic("getObject")(getObject)
    __obj.updateDynamic("getString")(getString)
    __obj.updateDynamic("setNamedValue")(setNamedValue)
    __obj.updateDynamic("stringify")(stringify)
    __obj.updateDynamic("valueType")(valueType)
    __obj.asInstanceOf[IJsonObject]
  }
}

