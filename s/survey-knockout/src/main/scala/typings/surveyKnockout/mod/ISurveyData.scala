package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISurveyData extends StObject {
  
  def getAllValues(): js.Any = js.native
  
  def getComment(name: String): String = js.native
  
  def getFilteredProperties(): js.Any = js.native
  
  def getFilteredValues(): js.Any = js.native
  
  def getValue(name: String): js.Any = js.native
  
  def getVariable(name: String): js.Any = js.native
  
  def setComment(name: String, newValue: String, locNotification: js.Any): js.Any = js.native
  
  def setValue(name: String, newValue: js.Any, locNotification: js.Any): js.Any = js.native
  def setValue(name: String, newValue: js.Any, locNotification: js.Any, allowNotifyValueChanged: Boolean): js.Any = js.native
  
  def setVariable(name: String, newValue: js.Any): Unit = js.native
}
