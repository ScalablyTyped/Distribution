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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDataFilteredProperties")(getDataFilteredProperties)
    __obj.updateDynamic("getDataFilteredValues")(getDataFilteredValues)
    __obj.updateDynamic("getValidatorTitle")(getValidatorTitle)
    __obj.updateDynamic("validatedValue")(validatedValue)
    __obj.updateDynamic("validators")(validators)
    __obj.asInstanceOf[IValidatorOwner]
  }
}

