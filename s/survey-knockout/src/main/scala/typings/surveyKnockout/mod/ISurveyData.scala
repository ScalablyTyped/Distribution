package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISurveyData extends StObject {
  
  def getAllValues(): Any = js.native
  
  def getComment(name: String): String = js.native
  
  def getFilteredProperties(): Any = js.native
  
  def getFilteredValues(): Any = js.native
  
  def getValue(name: String): Any = js.native
  
  def getVariable(name: String): Any = js.native
  
  def setComment(name: String, newValue: String, locNotification: Any): Any = js.native
  
  def setValue(name: String, newValue: Any, locNotification: Any): Any = js.native
  def setValue(name: String, newValue: Any, locNotification: Any, allowNotifyValueChanged: Boolean): Any = js.native
  
  def setVariable(name: String, newValue: Any): Unit = js.native
}
