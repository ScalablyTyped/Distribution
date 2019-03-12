package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.serverValidationManager
  * @function
  *
  * @description
  * Used to handle server side validation and wires up the UI with the messages. There are 2 types of validation messages, one
  * is for user defined properties (called Properties) and the other is for field properties which are attached to the native
  * model objects (not user defined). The methods below are named according to these rules: Properties vs Fields.
  */
trait IServerValidationManager extends js.Object {
  /**
    * @ngdoc function
    * @name addFieldError
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Adds an error message for a native content item field (not a user defined property, for Example, 'Name')
    */
  def addFieldError(fieldName: java.lang.String, errorMsg: java.lang.String): scala.Unit
  /**
    * @ngdoc function
    * @name addPropertyError
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Adds an error message for the content property
    */
  def addPropertyError(propertyAlias: java.lang.String, fieldName: java.lang.String, errorMsg: java.lang.String): scala.Unit
  /**
    * @ngdoc function
    * @name clear
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Clears all errors
    */
  def clear(): scala.Unit
  /**
    * @ngdoc function
    * @name umbraco.services.serverValidationManager#subscribe
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    *  This method needs to be called once all field and property errors are wired up.
    *
    *  In some scenarios where the error collection needs to be persisted over a route change
    *   (i.e. when a content item (or any item) is created and the route redirects to the editor)
    *   the controller should call this method once the data is bound to the scope
    *   so that any persisted validation errors are re-bound to their controls. Once they are re-binded this then clears the validation
    *   colleciton so that if another route change occurs, the previously persisted validation errors are not re-bound to the new item.
    */
  def executeAndClearAllSubscriptions(): scala.Unit
  /**
    * @ngdoc function
    * @name getFieldCallbacks
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Gets all callbacks that has been registered using the subscribe method for the field.
    */
  def getFieldCallbacks(fieldName: java.lang.String): js.Any
  /**
    * @ngdoc function
    * @name getFieldError
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Gets the error message for a content field
    */
  def getFieldError(fieldName: java.lang.String): java.lang.String
  /**
    * @ngdoc function
    * @name getPropertyCallbacks
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Gets all callbacks that has been registered using the subscribe method for the propertyAlias + fieldName combo.
    * This will always return any callbacks registered for just the property (i.e. field name is empty) and for ones with an
    * explicit field name set.
    */
  def getPropertyCallbacks(propertyAlias: java.lang.String, fieldName: java.lang.String): scala.Unit
  /**
    * @ngdoc function
    * @name getPropertyError
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Gets the error message for the content property
    */
  def getPropertyError(propertyAlias: java.lang.String, fieldName: java.lang.String): java.lang.String
  /**
    * @ngdoc function
    * @name hasFieldError
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Checks if a content field has an error
    */
  def hasFieldError(fieldName: java.lang.String): scala.Boolean
  /**
    * @ngdoc function
    * @name hasPropertyError
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Checks if the content property + field name combo has an error
    */
  def hasPropertyError(propertyAlias: java.lang.String, fieldName: java.lang.String): scala.Boolean
  /**
    * @ngdoc function
    * @name removePropertyError
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Removes an error message for the content property
    */
  def removePropertyError(propertyAlias: java.lang.String, fieldName: java.lang.String): scala.Unit
  /**
    * @ngdoc function
    * @name reset
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    * Clears all errors and notifies all callbacks that all server errros are now valid - used when submitting a form
    */
  def reset(): scala.Unit
  /**
    * @ngdoc function
    * @name umbraco.services.serverValidationManager#subscribe
    * @methodOf umbraco.services.serverValidationManager
    * @function
    *
    * @description
    *  Adds a callback method that is executed whenever validation changes for the field name + property specified.
    *  This is generally used for server side validation in order to match up a server side validation error with
    *  a particular field, otherwise we can only pinpoint that there is an error for a content property, not the
    *  property's specific field. This is used with the val-server directive in which the directive specifies the
    *  field alias to listen for.
    *  If propertyAlias is null, then this subscription is for a field property (not a user defined property).
    */
  def subscribe(propertyAlias: java.lang.String, fieldName: java.lang.String, callback: js.Function): scala.Unit
}

object IServerValidationManager {
  @scala.inline
  def apply(
    addFieldError: (java.lang.String, java.lang.String) => scala.Unit,
    addPropertyError: (java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    clear: () => scala.Unit,
    executeAndClearAllSubscriptions: () => scala.Unit,
    getFieldCallbacks: java.lang.String => js.Any,
    getFieldError: java.lang.String => java.lang.String,
    getPropertyCallbacks: (java.lang.String, java.lang.String) => scala.Unit,
    getPropertyError: (java.lang.String, java.lang.String) => java.lang.String,
    hasFieldError: java.lang.String => scala.Boolean,
    hasPropertyError: (java.lang.String, java.lang.String) => scala.Boolean,
    removePropertyError: (java.lang.String, java.lang.String) => scala.Unit,
    reset: () => scala.Unit,
    subscribe: (java.lang.String, java.lang.String, js.Function) => scala.Unit
  ): IServerValidationManager = {
    val __obj = js.Dynamic.literal(addFieldError = js.Any.fromFunction2(addFieldError), addPropertyError = js.Any.fromFunction3(addPropertyError), clear = js.Any.fromFunction0(clear), executeAndClearAllSubscriptions = js.Any.fromFunction0(executeAndClearAllSubscriptions), getFieldCallbacks = js.Any.fromFunction1(getFieldCallbacks), getFieldError = js.Any.fromFunction1(getFieldError), getPropertyCallbacks = js.Any.fromFunction2(getPropertyCallbacks), getPropertyError = js.Any.fromFunction2(getPropertyError), hasFieldError = js.Any.fromFunction1(hasFieldError), hasPropertyError = js.Any.fromFunction2(hasPropertyError), removePropertyError = js.Any.fromFunction2(removePropertyError), reset = js.Any.fromFunction0(reset), subscribe = js.Any.fromFunction3(subscribe))
  
    __obj.asInstanceOf[IServerValidationManager]
  }
}

