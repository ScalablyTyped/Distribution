package typings
package winrtLib.WindowsNs.DataNs.JsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Json.JsonValue")
@js.native
class JsonValue () extends IJsonValue {
  /* CompleteClass */
  override var valueType: JsonValueType = js.native
  /* CompleteClass */
  override def getArray(): JsonArray = js.native
  /* CompleteClass */
  override def getBoolean(): scala.Boolean = js.native
  /* CompleteClass */
  override def getNumber(): scala.Double = js.native
  /* CompleteClass */
  override def getObject(): JsonObject = js.native
  /* CompleteClass */
  override def getString(): java.lang.String = js.native
  /* CompleteClass */
  override def stringify(): java.lang.String = js.native
}

@JSGlobal("Windows.Data.Json.JsonValue")
@js.native
object JsonValue extends js.Object {
  def createBooleanValue(input: scala.Boolean): winrtLib.WindowsNs.DataNs.JsonNs.JsonValue = js.native
  def createNumberValue(input: scala.Double): winrtLib.WindowsNs.DataNs.JsonNs.JsonValue = js.native
  def createStringValue(input: java.lang.String): winrtLib.WindowsNs.DataNs.JsonNs.JsonValue = js.native
  def parse(input: java.lang.String): winrtLib.WindowsNs.DataNs.JsonNs.JsonValue = js.native
  def tryParse(input: java.lang.String): winrtLib.Anon_ResultSucceededBoolean = js.native
}

