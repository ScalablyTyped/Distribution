package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "SurveyValidator")
@js.native
class SurveyValidator () extends Base {
  val isValidateAllValues: scala.Boolean = js.native
  var locOwner: ILocalizableOwner = js.native
  val locText: LocalizableString = js.native
  var text: java.lang.String = js.native
  /* protected */ def createCustomError(name: java.lang.String): SurveyError = js.native
  /* protected */ def getDefaultErrorText(name: java.lang.String): java.lang.String = js.native
  /* protected */ def getErrorText(name: java.lang.String): java.lang.String = js.native
  def getLocale(): java.lang.String = js.native
  def getMarkdownHtml(text: java.lang.String): java.lang.String = js.native
  def getProcessedText(text: java.lang.String): java.lang.String = js.native
  def validate(value: js.Any): ValidatorResult = js.native
  def validate(value: js.Any, name: java.lang.String): ValidatorResult = js.native
  def validateAllValues(value: js.Any, values: js.Any, properties: js.Any): ValidatorResult = js.native
  def validateAllValues(value: js.Any, values: js.Any, properties: js.Any, name: java.lang.String): ValidatorResult = js.native
}

