package typings.winrt.Windows.Data.Json

import typings.winrt.Anon_Result
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Json.JsonArray")
@js.native
class JsonArray ()
  extends IJsonArray
     with IVector[IJsonValue] {
  /* CompleteClass */
  override var valueType: JsonValueType = js.native
  /* CompleteClass */
  override def first(): IIterator[IJsonValue] = js.native
  /* CompleteClass */
  override def getArray(): JsonArray = js.native
  /* CompleteClass */
  override def getArrayAt(index: Double): JsonArray = js.native
  /* CompleteClass */
  override def getBoolean(): Boolean = js.native
  /* CompleteClass */
  override def getBooleanAt(index: Double): Boolean = js.native
  /* CompleteClass */
  override def getNumber(): Double = js.native
  /* CompleteClass */
  override def getNumberAt(index: Double): Double = js.native
  /* CompleteClass */
  override def getObject(): JsonObject = js.native
  /* CompleteClass */
  override def getObjectAt(index: Double): JsonObject = js.native
  /* CompleteClass */
  override def getString(): String = js.native
  /* CompleteClass */
  override def getStringAt(index: Double): String = js.native
  /* CompleteClass */
  override def stringify(): String = js.native
}

/* static members */
@JSGlobal("Windows.Data.Json.JsonArray")
@js.native
object JsonArray extends js.Object {
  def parse(input: String): JsonArray = js.native
  def tryParse(input: String): Anon_Result = js.native
}

