package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IValidatorOwner extends js.Object {
  var validatedValue: js.Any = js.native
  def getDataFilteredProperties(): js.Any = js.native
  def getDataFilteredValues(): js.Any = js.native
  def getValidatorTitle(): String = js.native
  def getValidators(): js.Array[SurveyValidator] = js.native
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
    val __obj = js.Dynamic.literal(getDataFilteredProperties = js.Any.fromFunction0(getDataFilteredProperties), getDataFilteredValues = js.Any.fromFunction0(getDataFilteredValues), getValidatorTitle = js.Any.fromFunction0(getValidatorTitle), getValidators = js.Any.fromFunction0(getValidators), validatedValue = validatedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidatorOwner]
  }
  @scala.inline
  implicit class IValidatorOwnerOps[Self <: IValidatorOwner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetDataFilteredProperties(value: () => js.Any): Self = this.set("getDataFilteredProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDataFilteredValues(value: () => js.Any): Self = this.set("getDataFilteredValues", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValidatorTitle(value: () => String): Self = this.set("getValidatorTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValidators(value: () => js.Array[SurveyValidator]): Self = this.set("getValidators", js.Any.fromFunction0(value))
    @scala.inline
    def setValidatedValue(value: js.Any): Self = this.set("validatedValue", value.asInstanceOf[js.Any])
  }
  
}

