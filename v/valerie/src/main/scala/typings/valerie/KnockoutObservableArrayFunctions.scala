package typings.valerie

import typings.valerie.Valerie.ValidatableModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableArrayFunctions[T] extends js.Object {
  /**
    * Creates and sets a model validation state on a Knockout observable array.<br/>
    * <i>[fluent]</i>
    * @name ko.observableArray#validateAsModel
    * @method
    * @fluent
    * @param {valerie.ModelValidationState.options} [validationOptions] the options to use when creating the
    * validation state
    * @return {valerie.ModelValidationState} the validation state belonging to the observable array
    */
  def validateAsModel(): ValidatableModel[KnockoutObservableArray[T]] = js.native
}

object KnockoutObservableArrayFunctions {
  @scala.inline
  def apply[T](validateAsModel: () => ValidatableModel[KnockoutObservableArray[T]]): KnockoutObservableArrayFunctions[T] = {
    val __obj = js.Dynamic.literal(validateAsModel = js.Any.fromFunction0(validateAsModel))
    __obj.asInstanceOf[KnockoutObservableArrayFunctions[T]]
  }
  @scala.inline
  implicit class KnockoutObservableArrayFunctionsOps[Self <: KnockoutObservableArrayFunctions[_], T] (val x: Self with KnockoutObservableArrayFunctions[T]) extends AnyVal {
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
    def setValidateAsModel(value: () => ValidatableModel[KnockoutObservableArray[T]]): Self = this.set("validateAsModel", js.Any.fromFunction0(value))
  }
  
}

