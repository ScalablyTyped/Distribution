package typings.winrt.WindowsNs.DataNs.JsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonArray extends IJsonValue {
  def getArrayAt(index: Double): JsonArray
  def getBooleanAt(index: Double): Boolean
  def getNumberAt(index: Double): Double
  def getObjectAt(index: Double): JsonObject
  def getStringAt(index: Double): String
}

object IJsonArray {
  @scala.inline
  def apply(
    getArray: () => JsonArray,
    getArrayAt: Double => JsonArray,
    getBoolean: () => Boolean,
    getBooleanAt: Double => Boolean,
    getNumber: () => Double,
    getNumberAt: Double => Double,
    getObject: () => JsonObject,
    getObjectAt: Double => JsonObject,
    getString: () => String,
    getStringAt: Double => String,
    stringify: () => String,
    valueType: JsonValueType
  ): IJsonArray = {
    val __obj = js.Dynamic.literal(getArray = js.Any.fromFunction0(getArray), getArrayAt = js.Any.fromFunction1(getArrayAt), getBoolean = js.Any.fromFunction0(getBoolean), getBooleanAt = js.Any.fromFunction1(getBooleanAt), getNumber = js.Any.fromFunction0(getNumber), getNumberAt = js.Any.fromFunction1(getNumberAt), getObject = js.Any.fromFunction0(getObject), getObjectAt = js.Any.fromFunction1(getObjectAt), getString = js.Any.fromFunction0(getString), getStringAt = js.Any.fromFunction1(getStringAt), stringify = js.Any.fromFunction0(stringify), valueType = valueType)
  
    __obj.asInstanceOf[IJsonArray]
  }
}

