package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ValidatorRunner")
@js.native
class ValidatorRunner () extends js.Object {
  
  def onAsyncCompleted(errors: js.Array[SurveyError]): Unit = js.native
  
  def run(owner: IValidatorOwner): js.Array[SurveyError] = js.native
}
