package typings
package valerieLib

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
  def validateAsModel(): valerieLib.ValerieNs.ValidatableModel[KnockoutObservableArray[T]]
}

object KnockoutObservableArrayFunctions {
  @scala.inline
  def apply[T](validateAsModel: js.Function0[valerieLib.ValerieNs.ValidatableModel[KnockoutObservableArray[T]]]): KnockoutObservableArrayFunctions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("validateAsModel")(validateAsModel)
    __obj.asInstanceOf[KnockoutObservableArrayFunctions[T]]
  }
}

