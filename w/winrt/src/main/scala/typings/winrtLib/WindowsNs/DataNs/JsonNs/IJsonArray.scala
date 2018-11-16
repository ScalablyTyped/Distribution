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

