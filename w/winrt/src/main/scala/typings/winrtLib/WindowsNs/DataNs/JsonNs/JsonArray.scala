package typings
package winrtLib.WindowsNs.DataNs.JsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Json.JsonArray")
@js.native
class JsonArray ()
  extends IJsonArray
     with winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[IJsonValue] {
  /* CompleteClass */
  override var valueType: JsonValueType = js.native
  /* CompleteClass */
  override def first(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[IJsonValue] = js.native
  /* CompleteClass */
  override def getArray(): JsonArray = js.native
  /* CompleteClass */
  override def getArrayAt(index: scala.Double): JsonArray = js.native
  /* CompleteClass */
  override def getBoolean(): scala.Boolean = js.native
  /* CompleteClass */
  override def getBooleanAt(index: scala.Double): scala.Boolean = js.native
  /* CompleteClass */
  override def getNumber(): scala.Double = js.native
  /* CompleteClass */
  override def getNumberAt(index: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def getObject(): JsonObject = js.native
  /* CompleteClass */
  override def getObjectAt(index: scala.Double): JsonObject = js.native
  /* CompleteClass */
  override def getString(): java.lang.String = js.native
  /* CompleteClass */
  override def getStringAt(index: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def stringify(): java.lang.String = js.native
}

@JSGlobal("Windows.Data.Json.JsonArray")
@js.native
object JsonArray extends js.Object {
  def parse(input: java.lang.String): winrtLib.WindowsNs.DataNs.JsonNs.JsonArray = js.native
  def tryParse(input: java.lang.String): winrtLib.Anon_Result = js.native
}

