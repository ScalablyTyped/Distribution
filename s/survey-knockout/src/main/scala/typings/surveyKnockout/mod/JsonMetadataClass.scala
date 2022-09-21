package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "JsonMetadataClass")
@js.native
open class JsonMetadataClass protected () extends StObject {
  def this(name: String, properties: Any) = this()
  def this(name: String, properties: Any, creator: js.Function1[/* json */ js.UndefOr[Any], Any]) = this()
  def this(
    name: String,
    properties: Any,
    creator: js.Function1[/* json */ js.UndefOr[Any], Any],
    parentName: String
  ) = this()
  def this(name: String, properties: Any, creator: Unit, parentName: String) = this()
  
  def createProperty(propInfo: Any): JsonObjectProperty = js.native
  def createProperty(propInfo: Any, isCustom: Boolean): JsonObjectProperty = js.native
  
  def creator(): Any = js.native
  def creator(json: Any): Any = js.native
  
  def find(name: String): JsonObjectProperty = js.native
  
  def isCustom: Boolean = js.native
  
  var isCustomValue: Boolean = js.native
  
  var name: String = js.native
  
  var parentName: String = js.native
  
  var properties: Any = js.native
}
/* static members */
object JsonMetadataClass {
  
  @JSImport("survey-knockout", "JsonMetadataClass")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "JsonMetadataClass.requiredSymbol")
  @js.native
  def requiredSymbol: String = js.native
  inline def requiredSymbol_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requiredSymbol")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "JsonMetadataClass.typeSymbol")
  @js.native
  def typeSymbol: String = js.native
  inline def typeSymbol_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeSymbol")(x.asInstanceOf[js.Any])
}
