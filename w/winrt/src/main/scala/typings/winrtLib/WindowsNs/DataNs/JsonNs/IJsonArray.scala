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
    getArray: () => JsonArray,
    getArrayAt: scala.Double => JsonArray,
    getBoolean: () => scala.Boolean,
    getBooleanAt: scala.Double => scala.Boolean,
    getNumber: () => scala.Double,
    getNumberAt: scala.Double => scala.Double,
    getObject: () => JsonObject,
    getObjectAt: scala.Double => JsonObject,
    getString: () => java.lang.String,
    getStringAt: scala.Double => java.lang.String,
    stringify: () => java.lang.String,
    valueType: JsonValueType
  ): IJsonArray = {
    val __obj = js.Dynamic.literal(getArray = js.Any.fromFunction0(getArray), getArrayAt = js.Any.fromFunction1(getArrayAt), getBoolean = js.Any.fromFunction0(getBoolean), getBooleanAt = js.Any.fromFunction1(getBooleanAt), getNumber = js.Any.fromFunction0(getNumber), getNumberAt = js.Any.fromFunction1(getNumberAt), getObject = js.Any.fromFunction0(getObject), getObjectAt = js.Any.fromFunction1(getObjectAt), getString = js.Any.fromFunction0(getString), getStringAt = js.Any.fromFunction1(getStringAt), stringify = js.Any.fromFunction0(stringify), valueType = valueType)
  
    __obj.asInstanceOf[IJsonArray]
  }
}

