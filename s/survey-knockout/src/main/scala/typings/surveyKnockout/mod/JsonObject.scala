package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "JsonObject")
@js.native
class JsonObject () extends js.Object {
  
  var errors: js.Array[JsonError] = js.native
  
  var lightSerializing: Boolean = js.native
  
  def toJsonObject(obj: js.Any): js.Any = js.native
  def toJsonObject(obj: js.Any, storeDefaults: Boolean): js.Any = js.native
  
  /* protected */ def toJsonObjectCore(obj: js.Any, property: JsonObjectProperty): js.Any = js.native
  /* protected */ def toJsonObjectCore(obj: js.Any, property: JsonObjectProperty, storeDefaults: Boolean): js.Any = js.native
  
  def toObject(jsonObj: js.Any, obj: js.Any): Unit = js.native
  
  def toObjectCore(jsonObj: js.Any, obj: js.Any): Unit = js.native
  
  def valueToJson(obj: js.Any, result: js.Any, property: JsonObjectProperty): Unit = js.native
  def valueToJson(obj: js.Any, result: js.Any, property: JsonObjectProperty, storeDefaults: Boolean): Unit = js.native
  
  /* protected */ def valueToObj(value: js.Any, obj: js.Any, property: JsonObjectProperty): Unit = js.native
}
/* static members */
@JSImport("survey-knockout", "JsonObject")
@js.native
object JsonObject extends js.Object {
  
  val metaData: JsonMetadata = js.native
}
