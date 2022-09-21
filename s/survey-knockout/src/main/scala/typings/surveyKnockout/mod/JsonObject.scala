package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "JsonObject")
@js.native
open class JsonObject () extends StObject {
  
  var errors: Any = js.native
  
  var lightSerializing: Boolean = js.native
  
  def toJsonObject(obj: Any): Any = js.native
  def toJsonObject(obj: Any, storeDefaults: Boolean): Any = js.native
  
  def toJsonObjectCore(obj: Any, property: JsonObjectProperty): Any = js.native
  def toJsonObjectCore(obj: Any, property: JsonObjectProperty, storeDefaults: Boolean): Any = js.native
  
  def toObject(jsonObj: Any, obj: Any): Unit = js.native
  
  def toObjectCore(jsonObj: Any, obj: Any): Unit = js.native
  
  def valueToJson(obj: Any, result: Any, property: JsonObjectProperty): Unit = js.native
  def valueToJson(obj: Any, result: Any, property: JsonObjectProperty, storeDefaults: Boolean): Unit = js.native
  
  def valueToObj(value: Any, obj: Any, property: JsonObjectProperty): Unit = js.native
}
/* static members */
object JsonObject {
  
  @JSImport("survey-knockout", "JsonObject")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "JsonObject.metaDataValue")
  @js.native
  def metaDataValue: JsonMetadata = js.native
  inline def metaDataValue_=(x: JsonMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metaDataValue")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "JsonObject.positionPropertyName")
  @js.native
  def positionPropertyName: String = js.native
  inline def positionPropertyName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positionPropertyName")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "JsonObject.typePropertyName")
  @js.native
  def typePropertyName: String = js.native
  inline def typePropertyName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typePropertyName")(x.asInstanceOf[js.Any])
}
