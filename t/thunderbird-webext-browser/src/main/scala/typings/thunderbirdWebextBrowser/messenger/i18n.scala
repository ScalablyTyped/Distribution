package typings.thunderbirdWebextBrowser.messenger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18n {
  
  trait DetectLanguageReturnResult extends StObject {
    
    /** CLD detected language reliability */
    var isReliable: Boolean
    
    /** array of detectedLanguage */
    var languages: js.Array[DetectLanguageReturnResultLanguages]
  }
  object DetectLanguageReturnResult {
    
    inline def apply(isReliable: Boolean, languages: js.Array[DetectLanguageReturnResultLanguages]): DetectLanguageReturnResult = {
      val __obj = js.Dynamic.literal(isReliable = isReliable.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectLanguageReturnResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DetectLanguageReturnResult] (val x: Self) extends AnyVal {
      
      inline def setIsReliable(value: Boolean): Self = StObject.set(x, "isReliable", value.asInstanceOf[js.Any])
      
      inline def setLanguages(value: js.Array[DetectLanguageReturnResultLanguages]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesVarargs(value: DetectLanguageReturnResultLanguages*): Self = StObject.set(x, "languages", js.Array(value*))
    }
  }
  
  trait DetectLanguageReturnResultLanguages extends StObject {
    
    var language: LanguageCode
    
    /** The percentage of the detected language */
    var percentage: Double
  }
  object DetectLanguageReturnResultLanguages {
    
    inline def apply(language: LanguageCode, percentage: Double): DetectLanguageReturnResultLanguages = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectLanguageReturnResultLanguages]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DetectLanguageReturnResultLanguages] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: LanguageCode): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    }
  }
  
  type LanguageCode = String
}
