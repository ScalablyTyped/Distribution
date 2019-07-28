package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidatorOwner extends js.Object {
  var validatedValue: js.Any
  var validators: js.Array[SurveyValidator]
  def getDataFilteredProperties(): js.Any
  def getDataFilteredValues(): js.Any
  def getValidatorTitle(): String
}

object IValidatorOwner {
  @scala.inline
  def apply(
    getDataFilteredProperties: () => js.Any,
    getDataFilteredValues: () => js.Any,
    getValidatorTitle: () => String,
    validatedValue: js.Any,
    validators: js.Array[SurveyValidator]
  ): IValidatorOwner = {
    val __obj = js.Dynamic.literal(getDataFilteredProperties = js.Any.fromFunction0(getDataFilteredProperties), getDataFilteredValues = js.Any.fromFunction0(getDataFilteredValues), getValidatorTitle = js.Any.fromFunction0(getValidatorTitle), validatedValue = validatedValue, validators = validators)
  
    __obj.asInstanceOf[IValidatorOwner]
  }
}

