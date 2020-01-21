package typings.valdrMessage.valdr.message

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValdrMessage extends js.Object {
  /**
    * A boolean that allows to show messages for the AngularJS built-in validators like 'required' or 'number'.
    */
  var angularMessagesEnabled: Boolean
  /*
    * Default message template URL.
    */
  var templateUrl: String
  /**
    * A boolean that shows if Angular-translate is available.
    */
  var translateAvailable: Boolean
  /**
    * Adds messages for AngularJS build-in validators (eg "required" and "number") or for specific fields (eg "Person.lastName.required").
    * @param messages the list of key/value pairs.
    */
  def addMessages(messages: StringDictionary[String]): Unit
  /**
    * Gets the validator message.
    * @param typeName the name of the type.
    * @param fieldName the name of the field.
    * @param validatorName the name of the validator.
    * @returns {string} the message.
    */
  def getMessage(typeName: String, fieldName: String, validatorName: String): String
  /**
    * Sets the default message template.
    * @param template the default message template (eg "<div class="valdr-message">{{ violation.message }}</div>").
    */
  def setTemplate(template: String): Unit
}

object ValdrMessage {
  @scala.inline
  def apply(
    addMessages: StringDictionary[String] => Unit,
    angularMessagesEnabled: Boolean,
    getMessage: (String, String, String) => String,
    setTemplate: String => Unit,
    templateUrl: String,
    translateAvailable: Boolean
  ): ValdrMessage = {
    val __obj = js.Dynamic.literal(addMessages = js.Any.fromFunction1(addMessages), angularMessagesEnabled = angularMessagesEnabled.asInstanceOf[js.Any], getMessage = js.Any.fromFunction3(getMessage), setTemplate = js.Any.fromFunction1(setTemplate), templateUrl = templateUrl.asInstanceOf[js.Any], translateAvailable = translateAvailable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValdrMessage]
  }
}

