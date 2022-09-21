package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMultipleTextData
  extends StObject
     with ILocalizableOwner
     with IPanel {
  
  def getAllValues(): Any = js.native
  
  def getIsRequiredText(): String = js.native
  
  def getItemDefaultValue(name: String): Any = js.native
  
  def getMultipleTextValue(name: String): Any = js.native
  
  def getSurvey(): ISurvey = js.native
  
  def getTextProcessor(): ITextProcessor = js.native
  
  def setMultipleTextValue(name: String, value: Any): Any = js.native
}
