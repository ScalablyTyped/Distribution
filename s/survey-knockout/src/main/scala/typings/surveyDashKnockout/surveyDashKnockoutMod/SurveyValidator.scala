package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "SurveyValidator")
@js.native
class SurveyValidator () extends Base {
  var errorOwner: ISurveyErrorOwner = js.native
  val isValidateAllValues: Boolean = js.native
  val locText: LocalizableString = js.native
  var text: String = js.native
  /* protected */ def createCustomError(name: String): SurveyError = js.native
  /* protected */ def getDefaultErrorText(name: String): String = js.native
  /* protected */ def getErrorText(name: String): String = js.native
  def getLocale(): String = js.native
  def getMarkdownHtml(text: String): String = js.native
  def getProcessedText(text: String): String = js.native
  def validate(value: js.Any): ValidatorResult = js.native
  def validate(value: js.Any, name: String): ValidatorResult = js.native
  def validateAllValues(value: js.Any, values: js.Any, properties: js.Any): ValidatorResult = js.native
  def validateAllValues(value: js.Any, values: js.Any, properties: js.Any, name: String): ValidatorResult = js.native
}

