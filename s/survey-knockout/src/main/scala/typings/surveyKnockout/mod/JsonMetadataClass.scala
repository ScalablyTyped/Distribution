package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "JsonMetadataClass")
@js.native
class JsonMetadataClass protected () extends StObject {
  def this(name: String, properties: js.Array[_]) = this()
  def this(name: String, properties: js.Array[_], creator: js.Function1[/* json */ js.UndefOr[js.Any], _]) = this()
  def this(name: String, properties: js.Array[_], creator: js.UndefOr[scala.Nothing], parentName: String) = this()
  def this(
    name: String,
    properties: js.Array[_],
    creator: js.Function1[/* json */ js.UndefOr[js.Any], _],
    parentName: String
  ) = this()
  
  def createProperty(propInfo: js.Any): JsonObjectProperty = js.native
  
  def creator(): js.Any = js.native
  def creator(json: js.Any): js.Any = js.native
  
  def find(name: String): JsonObjectProperty = js.native
  
  var name: String = js.native
  
  var parentName: String = js.native
  
  var properties: js.Array[JsonObjectProperty] = js.native
}
/* static members */
object JsonMetadataClass {
  
  @JSImport("survey-knockout", "JsonMetadataClass")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "JsonMetadataClass.requiredSymbol")
  @js.native
  def requiredSymbol: String = js.native
  @scala.inline
  def requiredSymbol_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requiredSymbol")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "JsonMetadataClass.typeSymbol")
  @js.native
  def typeSymbol: String = js.native
  @scala.inline
  def typeSymbol_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typeSymbol")(x.asInstanceOf[js.Any])
}
