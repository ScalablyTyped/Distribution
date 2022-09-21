package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ValidatorRunner")
@js.native
open class ValidatorRunner () extends StObject {
  
  var asyncValidators: Any = js.native
  
  def onAsyncCompleted(errors: Any): Unit = js.native
  
  def run(owner: IValidatorOwner): js.Array[SurveyError] = js.native
}
