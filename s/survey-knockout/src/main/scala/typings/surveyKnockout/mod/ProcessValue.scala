package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ProcessValue")
@js.native
open class ProcessValue () extends StObject {
  
  def getFirstName(text: String): String = js.native
  def getFirstName(text: String, obj: Any): String = js.native
  
  def getValue(text: String): Any = js.native
  def getValue(text: String, values: Any): Any = js.native
  
  def getValueInfo(valueInfo: Any): Unit = js.native
  
  def hasValue(text: String): Boolean = js.native
  def hasValue(text: String, values: Any): Boolean = js.native
  
  var properties: Any = js.native
  
  def setValue(obj: Any, text: String, value: Any): Unit = js.native
  
  var values: Any = js.native
}
