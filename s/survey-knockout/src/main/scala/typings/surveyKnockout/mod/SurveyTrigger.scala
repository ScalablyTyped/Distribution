package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SurveyTrigger")
@js.native
open class SurveyTrigger () extends Trigger {
  
  /* protected */ def isRealExecution(): Boolean = js.native
  
  def owner: ISurveyTriggerOwner = js.native
  
  /* protected */ var ownerValue: ISurveyTriggerOwner = js.native
  
  def setOwner(owner: ISurveyTriggerOwner): Unit = js.native
}
