package typings
package valdrDashMessageLib.valdrNs.messageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValdrMessage extends js.Object {
  /**
    * A boolean that allows to show messages for the AngularJS built-in validators like 'required' or 'number'.
    */
  var angularMessagesEnabled: scala.Boolean
  /*
    * Default message template URL.
    */
  var templateUrl: java.lang.String
  /**
    * A boolean that shows if Angular-translate is available.
    */
  var translateAvailable: scala.Boolean
  /**
    * Adds messages for AngularJS build-in validators (eg "required" and "number") or for specific fields (eg "Person.lastName.required").
    * @param messages the list of key/value pairs.
    */
  def addMessages(messages: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit
  /**
    * Gets the validator message.
    * @param typeName the name of the type.
    * @param fieldName the name of the field.
    * @param validatorName the name of the validator.
    * @returns {string} the message.
    */
  def getMessage(typeName: java.lang.String, fieldName: java.lang.String, validatorName: java.lang.String): java.lang.String
  /**
    * Sets the default message template.
    * @param template the default message template (eg "<div class="valdr-message">{{ violation.message }}</div>").
    */
  def setTemplate(template: java.lang.String): scala.Unit
}

