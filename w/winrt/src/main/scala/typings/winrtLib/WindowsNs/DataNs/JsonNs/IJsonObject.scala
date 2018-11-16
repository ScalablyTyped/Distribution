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

