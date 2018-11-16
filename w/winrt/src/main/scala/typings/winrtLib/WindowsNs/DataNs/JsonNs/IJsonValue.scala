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

