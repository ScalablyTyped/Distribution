package typings.valdrMessage

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valdr {
  
  object message {
    
    @js.native
    trait ValdrMessage extends StObject {
      
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
      implicit class ValdrMessageMutableBuilder[Self <: ValdrMessage] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddMessages(value: StringDictionary[String] => Unit): Self = StObject.set(x, "addMessages", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAngularMessagesEnabled(value: Boolean): Self = StObject.set(x, "angularMessagesEnabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGetMessage(value: (String, String, String) => String): Self = StObject.set(x, "getMessage", js.Any.fromFunction3(value))
        
        @scala.inline
        def setSetTemplate(value: String => Unit): Self = StObject.set(x, "setTemplate", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTranslateAvailable(value: Boolean): Self = StObject.set(x, "translateAvailable", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait ValdrMessageProvider extends StObject {
      
      /**
        * Adds messages for AngularJS build-in validators (eg "required" and "number") or for specific fields (eg "Person.lastName.required").
        * @param messages the list of key/value pairs.
        */
      def addMessages(messages: StringDictionary[String]): Unit = js.native
      
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
      
      /**
        * Sets the URL for the default message template (eg "/partials/valdrMessageTemplate.html").
        * @param url the URL of the default message template.
        */
      def setTemplateUrl(url: String): Unit = js.native
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
      
      @scala.inline
      implicit class ValdrMessageProviderMutableBuilder[Self <: ValdrMessageProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddMessages(value: StringDictionary[String] => Unit): Self = StObject.set(x, "addMessages", js.Any.fromFunction1(value))
        
        @scala.inline
        def setGetMessage(value: (String, String, String) => String): Self = StObject.set(x, "getMessage", js.Any.fromFunction3(value))
        
        @scala.inline
        def setSetTemplate(value: String => Unit): Self = StObject.set(x, "setTemplate", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetTemplateUrl(value: String => Unit): Self = StObject.set(x, "setTemplateUrl", js.Any.fromFunction1(value))
      }
    }
  }
}
