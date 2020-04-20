package typings.valerie

import typings.knockout.KnockoutBindingHandler
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
  var disabledWhenNotValid: KnockoutBindingHandler[_, _, _]
  /**
    * Disables the element when the chosen property or model has been touched and has failed or is pending
    * validation, enabled otherwise.<br/>
    * @name ko.bindingHandlers.disabledWhenTouchedAndNotValid
    */
  var disabledWhenTouchedAndNotValid: KnockoutBindingHandler[_, _, _]
  /**
    * Enables the element when the chosen property or model is applicable, disabled otherwise.
    * @name ko.bindingHandlers.enabledWhenApplicable
    */
  var enabledWhenApplicable: KnockoutBindingHandler[_, _, _]
  /**
    * Sets the text of the element to be a formatted representation of the specified property.
    * @name ko.bindingHandlers.formattedText
    */
  var formattedText: KnockoutBindingHandler[_, _, _]
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
  var validatedChecked: KnockoutBindingHandler[_, _, _]
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
  var validatedSelectedOptions: KnockoutBindingHandler[_, _, _]
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
  var validatedValue: KnockoutBindingHandler[_, _, _]
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
  var validationCss: KnockoutBindingHandler[_, _, _]
  /**
    * Makes the element behave like a validation message for the chosen property or model:
    * <ul>
    *     <li>makes the element visible if the value is invalid</li>
    *     <li>sets the text of the element to be the underlying validation state's message</li>
    * </ul>
    * @name ko.bindingHandlers.validationMessage
    */
  var validationMessage: KnockoutBindingHandler[_, _, _]
  /**
    * Sets the text of the element to be the underlying validation state's message.
    * @name ko.bindingHandlers.validationMessageText
    */
  var validationMessageText: KnockoutBindingHandler[_, _, _]
  /**
    * Sets the text of the element to be the underlying validation state's name.
    * @name ko.bindingHandlers.validationName
    */
  var validationName: KnockoutBindingHandler[_, _, _]
  /**
    * Makes the element visible if the chosen property or model is applicable, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenApplicable
    */
  var visibleWhenApplicable: KnockoutBindingHandler[_, _, _]
  /**
    * Makes the element visible when the entry bound to the chosen property is in focus, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenFocused
    */
  var visibleWhenFocused: KnockoutBindingHandler[_, _, _]
  /**
    * Makes the element visible when the chosen property or model has failed validation, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenInvalid
    */
  var visibleWhenInvalid: KnockoutBindingHandler[_, _, _]
  /**
    * Makes the element visible when the summary for the chosen model is not empty, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenSummaryNotEmpty
    */
  var visibleWhenSummaryNotEmpty: KnockoutBindingHandler[_, _, _]
  /**
    * Makes the element visible if the chosen property or model has been touched, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenTouched
    */
  var visibleWhenTouched: KnockoutBindingHandler[_, _, _]
  /**
    * Makes the element visible if the chosen property or model is untouched, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenUntouched
    */
  var visibleWhenUntouched: KnockoutBindingHandler[_, _, _]
  /**
    * Makes the element visible if the chosen property or model has passed validation.
    * @name ko.bindingHandlers.visibleWhenValid
    */
  var visibleWhenValid: KnockoutBindingHandler[_, _, _]
}

object KnockoutBindingHandlers {
  @scala.inline
  def apply(
    disabledWhenNotValid: KnockoutBindingHandler[_, _, _],
    disabledWhenTouchedAndNotValid: KnockoutBindingHandler[_, _, _],
    enabledWhenApplicable: KnockoutBindingHandler[_, _, _],
    formattedText: KnockoutBindingHandler[_, _, _],
    validatedChecked: KnockoutBindingHandler[_, _, _],
    validatedSelectedOptions: KnockoutBindingHandler[_, _, _],
    validatedValue: KnockoutBindingHandler[_, _, _],
    validationCss: KnockoutBindingHandler[_, _, _],
    validationMessage: KnockoutBindingHandler[_, _, _],
    validationMessageText: KnockoutBindingHandler[_, _, _],
    validationName: KnockoutBindingHandler[_, _, _],
    visibleWhenApplicable: KnockoutBindingHandler[_, _, _],
    visibleWhenFocused: KnockoutBindingHandler[_, _, _],
    visibleWhenInvalid: KnockoutBindingHandler[_, _, _],
    visibleWhenSummaryNotEmpty: KnockoutBindingHandler[_, _, _],
    visibleWhenTouched: KnockoutBindingHandler[_, _, _],
    visibleWhenUntouched: KnockoutBindingHandler[_, _, _],
    visibleWhenValid: KnockoutBindingHandler[_, _, _]
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(disabledWhenNotValid = disabledWhenNotValid.asInstanceOf[js.Any], disabledWhenTouchedAndNotValid = disabledWhenTouchedAndNotValid.asInstanceOf[js.Any], enabledWhenApplicable = enabledWhenApplicable.asInstanceOf[js.Any], formattedText = formattedText.asInstanceOf[js.Any], validatedChecked = validatedChecked.asInstanceOf[js.Any], validatedSelectedOptions = validatedSelectedOptions.asInstanceOf[js.Any], validatedValue = validatedValue.asInstanceOf[js.Any], validationCss = validationCss.asInstanceOf[js.Any], validationMessage = validationMessage.asInstanceOf[js.Any], validationMessageText = validationMessageText.asInstanceOf[js.Any], validationName = validationName.asInstanceOf[js.Any], visibleWhenApplicable = visibleWhenApplicable.asInstanceOf[js.Any], visibleWhenFocused = visibleWhenFocused.asInstanceOf[js.Any], visibleWhenInvalid = visibleWhenInvalid.asInstanceOf[js.Any], visibleWhenSummaryNotEmpty = visibleWhenSummaryNotEmpty.asInstanceOf[js.Any], visibleWhenTouched = visibleWhenTouched.asInstanceOf[js.Any], visibleWhenUntouched = visibleWhenUntouched.asInstanceOf[js.Any], visibleWhenValid = visibleWhenValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
}

