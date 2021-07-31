package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.formHelper
  * @function
  *
  * @description
  * A utility class used to streamline how forms are developed, to ensure that validation is check and displayed consistently and to ensure that the correct events
  * fire when they need to.
  */
trait IFormHelper extends StObject {
  
  /**
    * @ngdoc function
    * @name umbraco.services.formHelper#handleError
    * @methodOf umbraco.services.formHelper
    * @function
    *
    * @description
    * Needs to be called when a form submission fails, this will wire up all server validation errors in ModelState and
    * add the correct messages to the notifications. If a server error has occurred this will show a ysod.
    *
    * @param {object} err The error object returned from the http promise
    */
  def handleError(err: js.Object): Unit
  
  /**
    * @ngdoc function
    * @name umbraco.services.formHelper#handleServerValidation
    * @methodOf umbraco.services.formHelper
    * @function
    *
    * @description
    * This wires up all of the server validation model state so that valServer and valServerField directives work
    *
    * @param {object} err The error object returned from the http promise
    */
  def handleServerValidation(modelState: IModelState): Unit
  
  /**
    * @ngdoc function
    * @name umbraco.services.formHelper#submitForm
    * @methodOf umbraco.services.formHelper
    * @function
    *
    * @description
    * Called by controllers when a form has been successfully submitted. the correct events execute
    * and that the notifications are displayed if there are any.
    *
    * @param {object} args An object containing arguments for form submission
    */
  def resetForm(args: js.Any*): Unit
  
  /**
    * @ngdoc function
    * @name umbraco.services.formHelper#submitForm
    * @methodOf umbraco.services.formHelper
    * @function
    *
    * @description
    * Called by controllers when submitting a form - this ensures that all client validation is checked,
    * server validation is cleared, that the correct events execute and status messages are displayed.
    * This returns true if the form is valid, otherwise false if form submission cannot continue.
    *
    * @param {object} args An object containing arguments for form submission
    */
  def submitForm(args: js.Any*): Unit
}
object IFormHelper {
  
  @scala.inline
  def apply(
    handleError: js.Object => Unit,
    handleServerValidation: IModelState => Unit,
    resetForm: /* repeated */ js.Any => Unit,
    submitForm: /* repeated */ js.Any => Unit
  ): IFormHelper = {
    val __obj = js.Dynamic.literal(handleError = js.Any.fromFunction1(handleError), handleServerValidation = js.Any.fromFunction1(handleServerValidation), resetForm = js.Any.fromFunction1(resetForm), submitForm = js.Any.fromFunction1(submitForm))
    __obj.asInstanceOf[IFormHelper]
  }
  
  @scala.inline
  implicit class IFormHelperMutableBuilder[Self <: IFormHelper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandleError(value: js.Object => Unit): Self = StObject.set(x, "handleError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleServerValidation(value: IModelState => Unit): Self = StObject.set(x, "handleServerValidation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetForm(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "resetForm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubmitForm(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "submitForm", js.Any.fromFunction1(value))
  }
}
