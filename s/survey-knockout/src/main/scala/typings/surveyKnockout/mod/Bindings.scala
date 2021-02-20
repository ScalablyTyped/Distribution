package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "Bindings")
@js.native
class Bindings protected () extends StObject {
  def this(obj: Base) = this()
  
  def clearBinding(propertyName: String): Unit = js.native
  
  def getJson(): js.Any = js.native
  
  def getNames(): js.Array[String] = js.native
  
  def getProperties(): js.Array[JsonObjectProperty] = js.native
  
  def getPropertiesByValueName(valueName: String): js.Array[String] = js.native
  
  def getType(): String = js.native
  
  def getValueNameByPropertyName(propertyName: String): String = js.native
  
  def isEmpty(): Boolean = js.native
  
  def setBinding(propertyName: String, valueName: String): Unit = js.native
  
  def setJson(value: js.Any): Unit = js.native
}
