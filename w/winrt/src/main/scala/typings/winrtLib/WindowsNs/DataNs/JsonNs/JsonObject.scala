package typings
package winrtLib.WindowsNs.DataNs.JsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Json.JsonObject")
@js.native
class JsonObject ()
  extends IJsonObject
     with winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMap[java.lang.String, IJsonValue] {
  /* CompleteClass */
  override var size: scala.Double = js.native
  /* CompleteClass */
  override var valueType: JsonValueType = js.native
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def first(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[java.lang.String, IJsonValue]
  ] = js.native
  /* CompleteClass */
  override def getArray(): JsonArray = js.native
  /* CompleteClass */
  override def getBoolean(): scala.Boolean = js.native
  /* CompleteClass */
  override def getNamedArray(name: java.lang.String): JsonArray = js.native
  /* CompleteClass */
  override def getNamedBoolean(name: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def getNamedNumber(name: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def getNamedObject(name: java.lang.String): JsonObject = js.native
  /* CompleteClass */
  override def getNamedString(name: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getNamedValue(name: java.lang.String): JsonValue = js.native
  /* CompleteClass */
  override def getNumber(): scala.Double = js.native
  /* CompleteClass */
  override def getObject(): JsonObject = js.native
  /* CompleteClass */
  override def getString(): java.lang.String = js.native
  /* CompleteClass */
  override def getView(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, IJsonValue] = js.native
  /* CompleteClass */
  override def hasKey(key: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def insert(key: java.lang.String, value: IJsonValue): scala.Boolean = js.native
  /* CompleteClass */
  override def lookup(key: java.lang.String): IJsonValue = js.native
  /* CompleteClass */
  override def remove(key: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def setNamedValue(name: java.lang.String, value: IJsonValue): scala.Unit = js.native
  /* CompleteClass */
  override def stringify(): java.lang.String = js.native
}

@JSGlobal("Windows.Data.Json.JsonObject")
@js.native
object JsonObject extends js.Object {
  def parse(input: java.lang.String): winrtLib.WindowsNs.DataNs.JsonNs.JsonObject = js.native
  def tryParse(input: java.lang.String): winrtLib.Anon_ResultSucceeded = js.native
}

