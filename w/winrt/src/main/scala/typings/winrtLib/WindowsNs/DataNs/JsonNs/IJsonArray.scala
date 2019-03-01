package typings
package winrtLib.WindowsNs.DataNs.JsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonArray extends IJsonValue {
  def getArrayAt(index: scala.Double): JsonArray
  def getBooleanAt(index: scala.Double): scala.Boolean
  def getNumberAt(index: scala.Double): scala.Double
  def getObjectAt(index: scala.Double): JsonObject
  def getStringAt(index: scala.Double): java.lang.String
}

object IJsonArray {
  @scala.inline
  def apply(
    getArray: js.Function0[JsonArray],
    getArrayAt: js.Function1[scala.Double, JsonArray],
    getBoolean: js.Function0[scala.Boolean],
    getBooleanAt: js.Function1[scala.Double, scala.Boolean],
    getNumber: js.Function0[scala.Double],
    getNumberAt: js.Function1[scala.Double, scala.Double],
    getObject: js.Function0[JsonObject],
    getObjectAt: js.Function1[scala.Double, JsonObject],
    getString: js.Function0[java.lang.String],
    getStringAt: js.Function1[scala.Double, java.lang.String],
    stringify: js.Function0[java.lang.String],
    valueType: JsonValueType
  ): IJsonArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getArray")(getArray)
    __obj.updateDynamic("getArrayAt")(getArrayAt)
    __obj.updateDynamic("getBoolean")(getBoolean)
    __obj.updateDynamic("getBooleanAt")(getBooleanAt)
    __obj.updateDynamic("getNumber")(getNumber)
    __obj.updateDynamic("getNumberAt")(getNumberAt)
    __obj.updateDynamic("getObject")(getObject)
    __obj.updateDynamic("getObjectAt")(getObjectAt)
    __obj.updateDynamic("getString")(getString)
    __obj.updateDynamic("getStringAt")(getStringAt)
    __obj.updateDynamic("stringify")(stringify)
    __obj.updateDynamic("valueType")(valueType)
    __obj.asInstanceOf[IJsonArray]
  }
}

