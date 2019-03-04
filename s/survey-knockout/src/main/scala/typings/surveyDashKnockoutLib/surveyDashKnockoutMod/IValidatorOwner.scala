package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidatorOwner extends js.Object {
  var validatedValue: js.Any
  var validators: js.Array[SurveyValidator]
  def getDataFilteredProperties(): js.Any
  def getDataFilteredValues(): js.Any
  def getValidatorTitle(): java.lang.String
}

object IValidatorOwner {
  @scala.inline
  def apply(
    getDataFilteredProperties: js.Function0[js.Any],
    getDataFilteredValues: js.Function0[js.Any],
    getValidatorTitle: js.Function0[java.lang.String],
    validatedValue: js.Any,
    validators: js.Array[SurveyValidator]
  ): IValidatorOwner = {
    val __obj = js.Dynamic.literal(getDataFilteredProperties = getDataFilteredProperties, getDataFilteredValues = getDataFilteredValues, getValidatorTitle = getValidatorTitle, validatedValue = validatedValue, validators = validators)
  
    __obj.asInstanceOf[IValidatorOwner]
  }
}

