package typings.winrt.WindowsNs.DataNs.JsonNs

import typings.winrt.Anon_ResultSucceeded
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMap
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Json.JsonObject")
@js.native
class JsonObject ()
  extends IJsonObject
     with IMap[String, IJsonValue] {
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override var valueType: JsonValueType = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, IJsonValue]] = js.native
  /* CompleteClass */
  override def getArray(): JsonArray = js.native
  /* CompleteClass */
  override def getBoolean(): Boolean = js.native
  /* CompleteClass */
  override def getNamedArray(name: String): JsonArray = js.native
  /* CompleteClass */
  override def getNamedBoolean(name: String): Boolean = js.native
  /* CompleteClass */
  override def getNamedNumber(name: String): Double = js.native
  /* CompleteClass */
  override def getNamedObject(name: String): JsonObject = js.native
  /* CompleteClass */
  override def getNamedString(name: String): String = js.native
  /* CompleteClass */
  override def getNamedValue(name: String): JsonValue = js.native
  /* CompleteClass */
  override def getNumber(): Double = js.native
  /* CompleteClass */
  override def getObject(): JsonObject = js.native
  /* CompleteClass */
  override def getString(): String = js.native
  /* CompleteClass */
  override def getView(): IMapView[String, IJsonValue] = js.native
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /* CompleteClass */
  override def insert(key: String, value: IJsonValue): Boolean = js.native
  /* CompleteClass */
  override def lookup(key: String): IJsonValue = js.native
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
  /* CompleteClass */
  override def setNamedValue(name: String, value: IJsonValue): Unit = js.native
  /* CompleteClass */
  override def stringify(): String = js.native
}

/* static members */
@JSGlobal("Windows.Data.Json.JsonObject")
@js.native
object JsonObject extends js.Object {
  def parse(input: String): JsonObject = js.native
  def tryParse(input: String): Anon_ResultSucceeded = js.native
}

