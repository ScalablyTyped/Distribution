package typings.webextensionPolyfill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesI18nMod {
  
  object I18n {
    
    /**
      * LanguageDetectionResult object that holds detected langugae reliability and array of DetectedLanguage
      */
    trait DetectLanguageCallbackResultType extends StObject {
      
      /**
        * CLD detected language reliability
        */
      var isReliable: Boolean
      
      /**
        * array of detectedLanguage
        */
      var languages: js.Array[DetectLanguageCallbackResultTypeLanguagesItemType]
    }
    object DetectLanguageCallbackResultType {
      
      inline def apply(isReliable: Boolean, languages: js.Array[DetectLanguageCallbackResultTypeLanguagesItemType]): DetectLanguageCallbackResultType = {
        val __obj = js.Dynamic.literal(isReliable = isReliable.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
        __obj.asInstanceOf[DetectLanguageCallbackResultType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DetectLanguageCallbackResultType] (val x: Self) extends AnyVal {
        
        inline def setIsReliable(value: Boolean): Self = StObject.set(x, "isReliable", value.asInstanceOf[js.Any])
        
        inline def setLanguages(value: js.Array[DetectLanguageCallbackResultTypeLanguagesItemType]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
        
        inline def setLanguagesVarargs(value: DetectLanguageCallbackResultTypeLanguagesItemType*): Self = StObject.set(x, "languages", js.Array(value*))
      }
    }
    
    /**
      * DetectedLanguage object that holds detected ISO language code and its percentage in the input string
      */
    trait DetectLanguageCallbackResultTypeLanguagesItemType extends StObject {
      
      var language: LanguageCode
      
      /**
        * The percentage of the detected language
        */
      var percentage: Double
    }
    object DetectLanguageCallbackResultTypeLanguagesItemType {
      
      inline def apply(language: LanguageCode, percentage: Double): DetectLanguageCallbackResultTypeLanguagesItemType = {
        val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any])
        __obj.asInstanceOf[DetectLanguageCallbackResultTypeLanguagesItemType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DetectLanguageCallbackResultTypeLanguagesItemType] (val x: Self) extends AnyVal {
        
        inline def setLanguage(value: LanguageCode): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
        
        inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * An ISO language code such as <code>en</code> or <code>fr</code>. For a complete list of languages supported by this
      * method, see <a href='http://src.chromium.org/viewvc/chrome/trunk/src/third_party/cld/languages/internal/languages.cc'>
      * kLanguageInfoTable</a>. For an unknown language, <code>und</code> will be returned, which means that [percentage]
      * of the text is unknown to CLD
      */
    type LanguageCode = String
    
    @js.native
    trait Static extends StObject {
      
      /**
        * Detects the language of the provided text using CLD.
        *
        * @param text User input string to be translated.
        */
      def detectLanguage(text: String): js.Promise[DetectLanguageCallbackResultType] = js.native
      
      /**
        * Gets the accept-languages of the browser. This is different from the locale used by the browser; to get the locale,
        * use $(ref:i18n.getUILanguage).
        */
      def getAcceptLanguages(): js.Promise[js.Array[LanguageCode]] = js.native
      
      /**
        * Gets the localized string for the specified message. If the message is missing, this method returns an empty string ('').
        * If the format of the <code>getMessage()</code> call is wrong &mdash; for example, <em>messageName</em>
        * is not a string or the <em>substitutions</em> array has more than 9 elements &mdash; this method returns <code>
        * undefined</code>.
        *
        * @param messageName The name of the message, as specified in the <code>$(topic:i18n-messages)[messages.json]</code> file.
        * @param substitutions Optional. Substitution strings, if the message requires any.
        * @returns Message localized for current locale.
        */
      def getMessage(messageName: String): String = js.native
      def getMessage(messageName: String, substitutions: String): String = js.native
      def getMessage(messageName: String, substitutions: js.Array[String]): String = js.native
      
      /**
        * Gets the browser UI language of the browser. This is different from $(ref:i18n.getAcceptLanguages)
        * which returns the preferred user languages.
        *
        * @returns The browser UI language code such as en-US or fr-FR.
        */
      def getUILanguage(): String = js.native
    }
  }
}
