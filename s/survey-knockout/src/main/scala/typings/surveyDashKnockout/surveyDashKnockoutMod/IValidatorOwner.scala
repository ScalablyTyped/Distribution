package typings.surveyDashKnockout.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidatorOwner extends js.Object {
  var validatedValue: js.Any
  def getDataFilteredProperties(): js.Any
  def getDataFilteredValues(): js.Any
  def getValidatorTitle(): String
  def getValidators(): js.Array[SurveyValidator]
}

object IValidatorOwner {
  @scala.inline
  def apply(
    getDataFilteredProperties: () => js.Any,
    getDataFilteredValues: () => js.Any,
    getValidatorTitle: () => String,
    getValidators: () => js.Array[SurveyValidator],
    validatedValue: js.Any
  ): IValidatorOwner = {
    val __obj = js.Dynamic.literal(getDataFilteredProperties = js.Any.fromFunction0(getDataFilteredProperties), getDataFilteredValues = js.Any.fromFunction0(getDataFilteredValues), getValidatorTitle = js.Any.fromFunction0(getValidatorTitle), getValidators = js.Any.fromFunction0(getValidators), validatedValue = validatedValue)
  
    __obj.asInstanceOf[IValidatorOwner]
  }
}

