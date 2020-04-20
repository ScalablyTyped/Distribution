package typings.valerie

import typings.valerie.Valerie_.ValidatableModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def validateAsModel(): ValidatableModel[KnockoutObservableArray[T]]
}

object KnockoutObservableArrayFunctions {
  @scala.inline
  def apply[T](validateAsModel: () => ValidatableModel[KnockoutObservableArray[T]]): KnockoutObservableArrayFunctions[T] = {
    val __obj = js.Dynamic.literal(validateAsModel = js.Any.fromFunction0(validateAsModel))
    __obj.asInstanceOf[KnockoutObservableArrayFunctions[T]]
  }
}

