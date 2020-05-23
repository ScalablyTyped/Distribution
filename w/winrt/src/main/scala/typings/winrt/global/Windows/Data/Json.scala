package typings.winrt.global.Windows.Data

import typings.winrt.Windows.Data.Json.IJsonValue
import typings.winrt.Windows.Data.Json.JsonErrorStatus
import typings.winrt.Windows.Data.Json.JsonValueType
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.anon.Result
import typings.winrt.anon.ResultSucceeded
import typings.winrt.anon.Succeeded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Json")
@js.native
object Json extends js.Object {
  @js.native
  class JsonArray ()
    extends typings.winrt.Windows.Data.Json.JsonArray {
    /* CompleteClass */
    override var valueType: JsonValueType = js.native
    /* CompleteClass */
    override def first(): IIterator[IJsonValue] = js.native
    /* CompleteClass */
    override def getArray(): typings.winrt.Windows.Data.Json.JsonArray = js.native
    /* CompleteClass */
    override def getArrayAt(index: Double): typings.winrt.Windows.Data.Json.JsonArray = js.native
    /* CompleteClass */
    override def getBoolean(): Boolean = js.native
    /* CompleteClass */
    override def getBooleanAt(index: Double): Boolean = js.native
    /* CompleteClass */
    override def getNumber(): Double = js.native
    /* CompleteClass */
    override def getNumberAt(index: Double): Double = js.native
    /* CompleteClass */
    override def getObject(): typings.winrt.Windows.Data.Json.JsonObject = js.native
    /* CompleteClass */
    override def getObjectAt(index: Double): typings.winrt.Windows.Data.Json.JsonObject = js.native
    /* CompleteClass */
    override def getString(): String = js.native
    /* CompleteClass */
    override def getStringAt(index: Double): String = js.native
    /* CompleteClass */
    override def stringify(): String = js.native
  }
  
  @js.native
  class JsonError ()
    extends typings.winrt.Windows.Data.Json.JsonError
  
  @js.native
  class JsonObject ()
    extends typings.winrt.Windows.Data.Json.JsonObject {
    /* CompleteClass */
    override var size: Double = js.native
    /* CompleteClass */
    override var valueType: JsonValueType = js.native
    /* CompleteClass */
    override def clear(): Unit = js.native
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, IJsonValue]] = js.native
    /* CompleteClass */
    override def getArray(): typings.winrt.Windows.Data.Json.JsonArray = js.native
    /* CompleteClass */
    override def getBoolean(): Boolean = js.native
    /* CompleteClass */
    override def getNamedArray(name: String): typings.winrt.Windows.Data.Json.JsonArray = js.native
    /* CompleteClass */
    override def getNamedBoolean(name: String): Boolean = js.native
    /* CompleteClass */
    override def getNamedNumber(name: String): Double = js.native
    /* CompleteClass */
    override def getNamedObject(name: String): typings.winrt.Windows.Data.Json.JsonObject = js.native
    /* CompleteClass */
    override def getNamedString(name: String): String = js.native
    /* CompleteClass */
    override def getNamedValue(name: String): typings.winrt.Windows.Data.Json.JsonValue = js.native
    /* CompleteClass */
    override def getNumber(): Double = js.native
    /* CompleteClass */
    override def getObject(): typings.winrt.Windows.Data.Json.JsonObject = js.native
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
  
  @js.native
  class JsonValue ()
    extends typings.winrt.Windows.Data.Json.JsonValue {
    /* CompleteClass */
    override var valueType: JsonValueType = js.native
    /* CompleteClass */
    override def getArray(): typings.winrt.Windows.Data.Json.JsonArray = js.native
    /* CompleteClass */
    override def getBoolean(): Boolean = js.native
    /* CompleteClass */
    override def getNumber(): Double = js.native
    /* CompleteClass */
    override def getObject(): typings.winrt.Windows.Data.Json.JsonObject = js.native
    /* CompleteClass */
    override def getString(): String = js.native
    /* CompleteClass */
    override def stringify(): String = js.native
  }
  
  /* static members */
  @js.native
  object JsonArray extends js.Object {
    def parse(input: String): typings.winrt.Windows.Data.Json.JsonArray = js.native
    def tryParse(input: String): ResultSucceeded = js.native
  }
  
  /* static members */
  @js.native
  object JsonError extends js.Object {
    def getStatus(hresult: Double): JsonErrorStatus = js.native
  }
  
  @js.native
  object JsonErrorStatus extends js.Object {
    /* 4 */ val implementationLimit: typings.winrt.Windows.Data.Json.JsonErrorStatus.implementationLimit with Double = js.native
    /* 2 */ val invalidJsonNumber: typings.winrt.Windows.Data.Json.JsonErrorStatus.invalidJsonNumber with Double = js.native
    /* 1 */ val invalidJsonString: typings.winrt.Windows.Data.Json.JsonErrorStatus.invalidJsonString with Double = js.native
    /* 3 */ val jsonValueNotFound: typings.winrt.Windows.Data.Json.JsonErrorStatus.jsonValueNotFound with Double = js.native
    /* 0 */ val unknown: typings.winrt.Windows.Data.Json.JsonErrorStatus.unknown with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Data.Json.JsonErrorStatus with Double] = js.native
  }
  
  /* static members */
  @js.native
  object JsonObject extends js.Object {
    def parse(input: String): typings.winrt.Windows.Data.Json.JsonObject = js.native
    def tryParse(input: String): Succeeded = js.native
  }
  
  /* static members */
  @js.native
  object JsonValue extends js.Object {
    def createBooleanValue(input: Boolean): typings.winrt.Windows.Data.Json.JsonValue = js.native
    def createNumberValue(input: Double): typings.winrt.Windows.Data.Json.JsonValue = js.native
    def createStringValue(input: String): typings.winrt.Windows.Data.Json.JsonValue = js.native
    def parse(input: String): typings.winrt.Windows.Data.Json.JsonValue = js.native
    def tryParse(input: String): Result = js.native
  }
  
  @js.native
  object JsonValueType extends js.Object {
    /* 4 */ val array: typings.winrt.Windows.Data.Json.JsonValueType.array with Double = js.native
    /* 1 */ val boolean: typings.winrt.Windows.Data.Json.JsonValueType.boolean with Double = js.native
    /* 0 */ val null_ : typings.winrt.Windows.Data.Json.JsonValueType.null_ with Double = js.native
    /* 2 */ val number: typings.winrt.Windows.Data.Json.JsonValueType.number with Double = js.native
    /* 5 */ val `object`: typings.winrt.Windows.Data.Json.JsonValueType.`object` with Double = js.native
    /* 3 */ val string: typings.winrt.Windows.Data.Json.JsonValueType.string with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Data.Json.JsonValueType with Double] = js.native
  }
  
}

