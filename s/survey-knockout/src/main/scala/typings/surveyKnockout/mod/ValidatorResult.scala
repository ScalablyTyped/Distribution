package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ValidatorResult")
@js.native
class ValidatorResult protected () extends js.Object {
  def this(value: js.Any) = this()
  def this(value: js.Any, error: SurveyError) = this()
  
  var error: SurveyError = js.native
  
  var value: js.Any = js.native
}
