package typings
package valerieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Valerie BindingHandlers
*/
trait KnockoutBindingHandlers extends js.Object {
  /**
    * Disables the element when the chosen property or model has failed or is pending validation, enabled
    * otherwise.
    * @name ko.bindingHandlers.disabledWhenNotValid
    */
  var disabledWhenNotValid: knockoutLib.KnockoutBindingHandler[_, _, _]
  /**
    * Disables the element when the chosen property or model has been touched and has failed or is pending
    * validation, enabled otherwise.<br/>
    * @name ko.bindingHandlers.disabledWhenTouchedAndNotValid
    */
  var disabledWhenTouchedAndNotValid: knockoutLib.KnockoutBindingHandler[_, _, _]
  /**
    * Enables the element when the chosen property or model is applicable, disabled otherwise.
    * @name ko.bindingHandlers.enabledWhenApplicable
    */
  var enabledWhenApplicable: knockoutLib.KnockoutBindingHandler[_, _, _]
  /**
    * Sets the text of the element to be a formatted representation of the specified property.
    * @name ko.bindingHandlers.formattedText
    */
  var formattedText: knockoutLib.KnockoutBindingHandler[_, _, _]
  /**
    * Validates entries that can be checked, i.e. check boxes and radio buttons.
    * Functions in the same way as the <b>ko.bindingHandlers.checked</b> binding handler, with the following
    * alterations:
    * <ul>
    *     <li>registers a blur event handler so validation messages for selections can be displayed</li>
    *     <li>registers a click event handler so validation state can be marked as touched</i>
    * </ul>
    * @name ko.bindingHandlers.validatedChecked
    */
  var validatedChecked: knockoutLib.KnockoutBindingHandler[_, _, _]
  /**
    * Validates options selected in a select list.
    * Functions in the same way as the <b>ko.bindingHandlers.selectedOptions</b> binding handler, with the
    * following alterations:
    * <ul>
    *     <li>registers a blur event handler so validation messages for selections can be displayed</li>
    *     <li>registers a click event handler so validation state can be marked as touched</i>
    * </ul>
    * @name ko.bindingHandlers.validatedSelectedOptions
    */
  var validatedSelectedOptions: knockoutLib.KnockoutBindingHandler[_, _, _]
  /**
    * Validates entries that can be keyed or selected.
    * Functions in the same way as the <b>ko.bindingHandlers.value</b> binding handler, with the following
    * alterations:
    * <ul>
    *     <li>registers a blur event handler:
    *     <ul>
    *         <li>to display validation messages as entries or selections lose focus</li>
    *         <li>to reformat successfully parsed textual entries</li>
    *     </ul>
    *     </li>
    *     <li>
    *         registers a focus event handler to pause the update of any existing visible validation message
    *     </li>
    *     <li>
    *         registers a key-up event handler which validates the entry as it's being entered; this allows other
    *         entries that are shown conditionally to be available before the user tabs out of this entry
    *     </li>
    * </ul>
    * @name ko.bindingHandlers.validatedValue
    */
  var validatedValue: knockoutLib.KnockoutBindingHandler[_, _, _]
  /**
    * Sets CSS classes on the element based on the validation state of the chosen property or model.</br>
    * The names of the CSS classes used are held in the <b>ko.bindingHandlers.validationCss.classNames</b> object,
    * by default they are:
    * <ul>
    *     <li><b>failed</b> - if validation failed</li>
    *     <li><b>focused</b> - if the element is in focus</li>
    *     <li><b>passed</b> - if validation passed</li>
    *     <li><b>pending</b> - if validation is pending</li>
    *     <li><b>required</b> - if an entry is required</li>
    *     <li><b>showMessage</b> - if a validation message should be shown</li>
    *     <li><b>touched</b> - set if the model or entry has been "touched"</li>
    *     <li><b>untouched</b> - set if the model or entry has not been "touched"</li>
    * </ul>
    * @name ko.bindingHandlers.validationCss
    */
  var validationCss: knockoutLib.KnockoutBindingHandler[_, _, _]
  /**
    * Makes the element behave like a validation message for the chosen property or model:
    * <ul>
    *     <li>makes the element visible if the value is invalid</li>
    *     <li>sets the text of the element to be the underlying validation state's message</li>
    * </ul>
    * @name ko.bindingHandlers.validationMessage
    */
  var validationMessage: knockoutLib.KnockoutBindingHandler[_, _, _]
  /**
    * Sets the text of the element to be the underlying validation state's message.
    * @name ko.bindingHandlers.validationMessageText
    */
  var validationMessageText: knockoutLib.KnockoutBindingHandler[_, _, _]
  /**
    * Sets the text of the element to be the underlying validation state's name.
    * @name ko.bindingHandlers.validationName
    */
  var validationName: knockoutLib.KnockoutBindingHandler[_, _, _]
  /**
    * Makes the element visible if the chosen property or model is applicable, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenApplicable
    */
  var visibleWhenApplicable: knockoutLib.KnockoutBindingHandler[_, _, _]
  /**
    * Makes the element visible when the entry bound to the chosen property is in focus, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenFocused
    */
  var visibleWhenFocused: knockoutLib.KnockoutBindingHandler[_, _, _]
  /**
    * Makes the element visible when the chosen property or model has failed validation, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenInvalid
    */
  var visibleWhenInvalid: knockoutLib.KnockoutBindingHandler[_, _, _]
  /**
    * Makes the element visible when the summary for the chosen model is not empty, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenSummaryNotEmpty
    */
  var visibleWhenSummaryNotEmpty: knockoutLib.KnockoutBindingHandler[_, _, _]
  /**
    * Makes the element visible if the chosen property or model has been touched, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenTouched
    */
  var visibleWhenTouched: knockoutLib.KnockoutBindingHandler[_, _, _]
  /**
    * Makes the element visible if the chosen property or model is untouched, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenUntouched
    */
  var visibleWhenUntouched: knockoutLib.KnockoutBindingHandler[_, _, _]
  /**
    * Makes the element visible if the chosen property or model has passed validation.
    * @name ko.bindingHandlers.visibleWhenValid
    */
  var visibleWhenValid: knockoutLib.KnockoutBindingHandler[_, _, _]
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(
    disabledWhenNotValid: knockoutLib.KnockoutBindingHandler[_, _, _],
    disabledWhenTouchedAndNotValid: knockoutLib.KnockoutBindingHandler[_, _, _],
    enabledWhenApplicable: knockoutLib.KnockoutBindingHandler[_, _, _],
    formattedText: knockoutLib.KnockoutBindingHandler[_, _, _],
    validatedChecked: knockoutLib.KnockoutBindingHandler[_, _, _],
    validatedSelectedOptions: knockoutLib.KnockoutBindingHandler[_, _, _],
    validatedValue: knockoutLib.KnockoutBindingHandler[_, _, _],
    validationCss: knockoutLib.KnockoutBindingHandler[_, _, _],
    validationMessage: knockoutLib.KnockoutBindingHandler[_, _, _],
    validationMessageText: knockoutLib.KnockoutBindingHandler[_, _, _],
    validationName: knockoutLib.KnockoutBindingHandler[_, _, _],
    visibleWhenApplicable: knockoutLib.KnockoutBindingHandler[_, _, _],
    visibleWhenFocused: knockoutLib.KnockoutBindingHandler[_, _, _],
    visibleWhenInvalid: knockoutLib.KnockoutBindingHandler[_, _, _],
    visibleWhenSummaryNotEmpty: knockoutLib.KnockoutBindingHandler[_, _, _],
    visibleWhenTouched: knockoutLib.KnockoutBindingHandler[_, _, _],
    visibleWhenUntouched: knockoutLib.KnockoutBindingHandler[_, _, _],
    visibleWhenValid: knockoutLib.KnockoutBindingHandler[_, _, _]
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disabledWhenNotValid")(disabledWhenNotValid)
    __obj.updateDynamic("disabledWhenTouchedAndNotValid")(disabledWhenTouchedAndNotValid)
    __obj.updateDynamic("enabledWhenApplicable")(enabledWhenApplicable)
    __obj.updateDynamic("formattedText")(formattedText)
    __obj.updateDynamic("validatedChecked")(validatedChecked)
    __obj.updateDynamic("validatedSelectedOptions")(validatedSelectedOptions)
    __obj.updateDynamic("validatedValue")(validatedValue)
    __obj.updateDynamic("validationCss")(validationCss)
    __obj.updateDynamic("validationMessage")(validationMessage)
    __obj.updateDynamic("validationMessageText")(validationMessageText)
    __obj.updateDynamic("validationName")(validationName)
    __obj.updateDynamic("visibleWhenApplicable")(visibleWhenApplicable)
    __obj.updateDynamic("visibleWhenFocused")(visibleWhenFocused)
    __obj.updateDynamic("visibleWhenInvalid")(visibleWhenInvalid)
    __obj.updateDynamic("visibleWhenSummaryNotEmpty")(visibleWhenSummaryNotEmpty)
    __obj.updateDynamic("visibleWhenTouched")(visibleWhenTouched)
    __obj.updateDynamic("visibleWhenUntouched")(visibleWhenUntouched)
    __obj.updateDynamic("visibleWhenValid")(visibleWhenValid)
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
}

