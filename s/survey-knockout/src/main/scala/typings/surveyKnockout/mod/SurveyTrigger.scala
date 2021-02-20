package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SurveyTrigger")
@js.native
class SurveyTrigger () extends Trigger {
  
  val isOnNextPage: Boolean = js.native
  
  val owner: ISurveyTriggerOwner = js.native
  
  var ownerValue: ISurveyTriggerOwner = js.native
  
  def setOwner(owner: ISurveyTriggerOwner): Unit = js.native
}
