package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "ExpressionValidator")
@js.native
class ExpressionValidator () extends SurveyValidator {
  def this(expression: String) = this()
  var expression: String = js.native
  /* protected */ def ensureConditionRunner(): Boolean = js.native
  /* protected */ def generateError(res: Boolean, value: js.Any): ValidatorResult = js.native
}

