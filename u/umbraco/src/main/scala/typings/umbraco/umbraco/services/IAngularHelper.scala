package typings.umbraco.umbraco.services

import typings.angular.mod.IFormController
import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.angularHelper
  * @function
  *
  * @description
  * Some angular helper/extension methods
  */
trait IAngularHelper extends js.Object {
  /**
    * @ngdoc function
    * @name getCurrentForm
    * @methodOf umbraco.services.angularHelper
    * @function
    *
    * @description
    * Returns the current form object applied to the scope or null if one is not found
    */
  def getCurrentForm(scope: IScope): js.Any
  /**
    * @ngdoc function
    * @name getNullForm
    * @methodOf umbraco.services.angularHelper
    * @function
    *
    * @description
    * Returns a null angular FormController, mostly for use in unit tests
    *      NOTE: This is actually the same construct as angular uses internally for creating a null form but they don't expose
    *          any of this publicly to us, so we need to create our own.
    *
    * @param {string} formName The form name to assign
    */
  def getNullForm(formName: String): IFormController
  /**
    * @ngdoc function
    * @name validateHasForm
    * @methodOf umbraco.services.angularHelper
    * @function
    *
    * @description
    * This will validate that the current scope has an assigned form object, if it doesn't an exception is thrown, if
    * it does we return the form object.
    */
  def getRequiredCurrentForm(scope: IScope): js.Object
  /**
    * @ngdoc function
    * @name umbraco.services.angularHelper#rejectedPromise
    * @methodOf umbraco.services.angularHelper
    * @function
    *
    * @description
    * In some situations we need to return a promise as a rejection, normally based on invalid data. This
    * is a wrapper to do that so we can save on writing a bit of code.
    *
    * @param {object} objReject The object to send back with the promise rejection
    */
  def rejectedPromise(objReject: js.Object): Unit
  /**
    * @ngdoc function
    * @name safeApply
    * @methodOf umbraco.services.angularHelper
    * @function
    *
    * @description
    * This checks if a digest/apply is already occuring, if not it will force an apply call
    */
  def safeApply(scope: IScope, fn: js.Function): Unit
}

object IAngularHelper {
  @scala.inline
  def apply(
    getCurrentForm: IScope => js.Any,
    getNullForm: String => IFormController,
    getRequiredCurrentForm: IScope => js.Object,
    rejectedPromise: js.Object => Unit,
    safeApply: (IScope, js.Function) => Unit
  ): IAngularHelper = {
    val __obj = js.Dynamic.literal(getCurrentForm = js.Any.fromFunction1(getCurrentForm), getNullForm = js.Any.fromFunction1(getNullForm), getRequiredCurrentForm = js.Any.fromFunction1(getRequiredCurrentForm), rejectedPromise = js.Any.fromFunction1(rejectedPromise), safeApply = js.Any.fromFunction2(safeApply))
  
    __obj.asInstanceOf[IAngularHelper]
  }
}

