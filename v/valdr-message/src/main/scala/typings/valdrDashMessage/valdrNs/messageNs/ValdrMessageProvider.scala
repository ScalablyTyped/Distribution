package typings.valdrDashMessage.valdrNs.messageNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValdrMessageProvider extends js.Object {
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
  /**
    * Sets the URL for the default message template (eg "/partials/valdrMessageTemplate.html").
    * @param url the URL of the default message template.
    */
  def setTemplateUrl(url: String): Unit
}

object ValdrMessageProvider {
  @scala.inline
  def apply(
    addMessages: StringDictionary[String] => Unit,
    getMessage: (String, String, String) => String,
    setTemplate: String => Unit,
    setTemplateUrl: String => Unit
  ): ValdrMessageProvider = {
    val __obj = js.Dynamic.literal(addMessages = js.Any.fromFunction1(addMessages), getMessage = js.Any.fromFunction3(getMessage), setTemplate = js.Any.fromFunction1(setTemplate), setTemplateUrl = js.Any.fromFunction1(setTemplateUrl))
  
    __obj.asInstanceOf[ValdrMessageProvider]
  }
}

