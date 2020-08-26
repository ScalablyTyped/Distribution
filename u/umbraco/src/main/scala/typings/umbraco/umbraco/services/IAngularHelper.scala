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
@js.native
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
  def getCurrentForm(scope: IScope): js.Any = js.native
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
  def getNullForm(formName: String): IFormController = js.native
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
  def getRequiredCurrentForm(scope: IScope): js.Object = js.native
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
  def rejectedPromise(objReject: js.Object): Unit = js.native
  /**
    * @ngdoc function
    * @name safeApply
    * @methodOf umbraco.services.angularHelper
    * @function
    *
    * @description
    * This checks if a digest/apply is already occuring, if not it will force an apply call
    */
  def safeApply(scope: IScope, fn: js.Function): Unit = js.native
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
  @scala.inline
  implicit class IAngularHelperOps[Self <: IAngularHelper] (val x: Self) extends AnyVal {
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
    def setGetCurrentForm(value: IScope => js.Any): Self = this.set("getCurrentForm", js.Any.fromFunction1(value))
    @scala.inline
    def setGetNullForm(value: String => IFormController): Self = this.set("getNullForm", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRequiredCurrentForm(value: IScope => js.Object): Self = this.set("getRequiredCurrentForm", js.Any.fromFunction1(value))
    @scala.inline
    def setRejectedPromise(value: js.Object => Unit): Self = this.set("rejectedPromise", js.Any.fromFunction1(value))
    @scala.inline
    def setSafeApply(value: (IScope, js.Function) => Unit): Self = this.set("safeApply", js.Any.fromFunction2(value))
  }
  
}

