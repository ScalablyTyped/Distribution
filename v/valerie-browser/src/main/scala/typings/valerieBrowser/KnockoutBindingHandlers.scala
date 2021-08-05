package typings.valerieBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
* Valerie BindingHandlers
*/
trait KnockoutBindingHandlers extends StObject {
  
  /**
    * Disables the element when the chosen property or model has failed or is pending validation, enabled
    * otherwise.
    * @name ko.bindingHandlers.disabledWhenNotValid
    */
  var disabledWhenNotValid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  
  /**
    * Disables the element when the chosen property or model has been touched and has failed or is pending
    * validation, enabled otherwise.<br/>
    * @name ko.bindingHandlers.disabledWhenTouchedAndNotValid
    */
  var disabledWhenTouchedAndNotValid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  
  /**
    * Enables the element when the chosen property or model is applicable, disabled otherwise.
    * @name ko.bindingHandlers.enabledWhenApplicable
    */
  var enabledWhenApplicable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  
  /**
    * Sets the text of the element to be a formatted representation of the specified property.
    * @name ko.bindingHandlers.formattedText
    */
  var formattedText: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  
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
  var validatedChecked: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  
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
  var validatedSelectedOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  
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
  var validatedValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  
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
  var validationCss: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  
  /**
    * Makes the element behave like a validation message for the chosen property or model:
    * <ul>
    *     <li>makes the element visible if the value is invalid</li>
    *     <li>sets the text of the element to be the underlying validation state's message</li>
    * </ul>
    * @name ko.bindingHandlers.validationMessage
    */
  var validationMessage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  
  /**
    * Sets the text of the element to be the underlying validation state's message.
    * @name ko.bindingHandlers.validationMessageText
    */
  var validationMessageText: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  
  /**
    * Sets the text of the element to be the underlying validation state's name.
    * @name ko.bindingHandlers.validationName
    */
  var validationName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  
  /**
    * Makes the element visible if the chosen property or model is applicable, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenApplicable
    */
  var visibleWhenApplicable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  
  /**
    * Makes the element visible when the entry bound to the chosen property is in focus, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenFocused
    */
  var visibleWhenFocused: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  
  /**
    * Makes the element visible when the chosen property or model has failed validation, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenInvalid
    */
  var visibleWhenInvalid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  
  /**
    * Makes the element visible when the summary for the chosen model is not empty, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenSummaryNotEmpty
    */
  var visibleWhenSummaryNotEmpty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  
  /**
    * Makes the element visible if the chosen property or model has been touched, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenTouched
    */
  var visibleWhenTouched: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  
  /**
    * Makes the element visible if the chosen property or model is untouched, invisible otherwise.
    * @name ko.bindingHandlers.visibleWhenUntouched
    */
  var visibleWhenUntouched: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  
  /**
    * Makes the element visible if the chosen property or model has passed validation.
    * @name ko.bindingHandlers.visibleWhenValid
    */
  var visibleWhenValid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
}
object KnockoutBindingHandlers {
  
  inline def apply(
    disabledWhenNotValid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    disabledWhenTouchedAndNotValid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    enabledWhenApplicable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    formattedText: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    validatedChecked: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    validatedSelectedOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    validatedValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    validationCss: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    validationMessage: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    validationMessageText: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    validationName: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    visibleWhenApplicable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    visibleWhenFocused: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    visibleWhenInvalid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    visibleWhenSummaryNotEmpty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    visibleWhenTouched: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    visibleWhenUntouched: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any,
    visibleWhenValid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
  ): KnockoutBindingHandlers = {
    val __obj = js.Dynamic.literal(disabledWhenNotValid = disabledWhenNotValid.asInstanceOf[js.Any], disabledWhenTouchedAndNotValid = disabledWhenTouchedAndNotValid.asInstanceOf[js.Any], enabledWhenApplicable = enabledWhenApplicable.asInstanceOf[js.Any], formattedText = formattedText.asInstanceOf[js.Any], validatedChecked = validatedChecked.asInstanceOf[js.Any], validatedSelectedOptions = validatedSelectedOptions.asInstanceOf[js.Any], validatedValue = validatedValue.asInstanceOf[js.Any], validationCss = validationCss.asInstanceOf[js.Any], validationMessage = validationMessage.asInstanceOf[js.Any], validationMessageText = validationMessageText.asInstanceOf[js.Any], validationName = validationName.asInstanceOf[js.Any], visibleWhenApplicable = visibleWhenApplicable.asInstanceOf[js.Any], visibleWhenFocused = visibleWhenFocused.asInstanceOf[js.Any], visibleWhenInvalid = visibleWhenInvalid.asInstanceOf[js.Any], visibleWhenSummaryNotEmpty = visibleWhenSummaryNotEmpty.asInstanceOf[js.Any], visibleWhenTouched = visibleWhenTouched.asInstanceOf[js.Any], visibleWhenUntouched = visibleWhenUntouched.asInstanceOf[js.Any], visibleWhenValid = visibleWhenValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutBindingHandlers]
  }
  
  extension [Self <: KnockoutBindingHandlers](x: Self) {
    
    inline def setDisabledWhenNotValid(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "disabledWhenNotValid", value.asInstanceOf[js.Any])
    
    inline def setDisabledWhenTouchedAndNotValid(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "disabledWhenTouchedAndNotValid", value.asInstanceOf[js.Any])
    
    inline def setEnabledWhenApplicable(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "enabledWhenApplicable", value.asInstanceOf[js.Any])
    
    inline def setFormattedText(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "formattedText", value.asInstanceOf[js.Any])
    
    inline def setValidatedChecked(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "validatedChecked", value.asInstanceOf[js.Any])
    
    inline def setValidatedSelectedOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "validatedSelectedOptions", value.asInstanceOf[js.Any])
    
    inline def setValidatedValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "validatedValue", value.asInstanceOf[js.Any])
    
    inline def setValidationCss(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "validationCss", value.asInstanceOf[js.Any])
    
    inline def setValidationMessage(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
    
    inline def setValidationMessageText(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "validationMessageText", value.asInstanceOf[js.Any])
    
    inline def setValidationName(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "validationName", value.asInstanceOf[js.Any])
    
    inline def setVisibleWhenApplicable(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "visibleWhenApplicable", value.asInstanceOf[js.Any])
    
    inline def setVisibleWhenFocused(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "visibleWhenFocused", value.asInstanceOf[js.Any])
    
    inline def setVisibleWhenInvalid(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "visibleWhenInvalid", value.asInstanceOf[js.Any])
    
    inline def setVisibleWhenSummaryNotEmpty(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "visibleWhenSummaryNotEmpty", value.asInstanceOf[js.Any])
    
    inline def setVisibleWhenTouched(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "visibleWhenTouched", value.asInstanceOf[js.Any])
    
    inline def setVisibleWhenUntouched(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "visibleWhenUntouched", value.asInstanceOf[js.Any])
    
    inline def setVisibleWhenValid(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler */ js.Any
    ): Self = StObject.set(x, "visibleWhenValid", value.asInstanceOf[js.Any])
  }
}
