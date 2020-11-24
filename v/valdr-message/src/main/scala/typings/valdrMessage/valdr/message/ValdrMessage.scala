package typings.valdrMessage.valdr.message

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValdrMessage extends js.Object {
  
  /**
    * Adds messages for AngularJS build-in validators (eg "required" and "number") or for specific fields (eg "Person.lastName.required").
    * @param messages the list of key/value pairs.
    */
  def addMessages(messages: StringDictionary[String]): Unit = js.native
  
  /**
    * A boolean that allows to show messages for the AngularJS built-in validators like 'required' or 'number'.
    */
  var angularMessagesEnabled: Boolean = js.native
  
  /**
    * Gets the validator message.
    * @param typeName the name of the type.
    * @param fieldName the name of the field.
    * @param validatorName the name of the validator.
    * @returns {string} the message.
    */
  def getMessage(typeName: String, fieldName: String, validatorName: String): String = js.native
  
  /**
    * Sets the default message template.
    * @param template the default message template (eg "<div class="valdr-message">{{ violation.message }}</div>").
    */
  def setTemplate(template: String): Unit = js.native
  
  /*
    * Default message template URL.
    */
  var templateUrl: String = js.native
  
  /**
    * A boolean that shows if Angular-translate is available.
    */
  var translateAvailable: Boolean = js.native
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
  
  @scala.inline
  implicit class ValdrMessageOps[Self <: ValdrMessage] (val x: Self) extends AnyVal {
    
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
    def setAddMessages(value: StringDictionary[String] => Unit): Self = this.set("addMessages", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAngularMessagesEnabled(value: Boolean): Self = this.set("angularMessagesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMessage(value: (String, String, String) => String): Self = this.set("getMessage", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetTemplate(value: String => Unit): Self = this.set("setTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateAvailable(value: Boolean): Self = this.set("translateAvailable", value.asInstanceOf[js.Any])
  }
}
