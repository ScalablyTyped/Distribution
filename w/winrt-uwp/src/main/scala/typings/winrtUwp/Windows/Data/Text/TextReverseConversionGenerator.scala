package typings.winrtUwp.Windows.Data.Text

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reverse-converts a Japanese string which is mix of phonetic and ideographic characters, to a string of phonetic characters. */
trait TextReverseConversionGenerator extends StObject {
  
  /**
    * Asynchronously reverse-converts a string which contains ideographic characters to a phonetic expression.
    * @param input The string containing ideographic characters to be reverse-converted.
    * @return An asynchronous operation to return the phonetic expression.
    */
  def convertBackAsync(input: String): IPromiseWithIAsyncOperation[String]
  
  /** Determines if the language tag specified is available for reverse conversions, but is not installed on the user's device. */
  var languageAvailableButNotInstalled: Boolean
  
  /** Gets the language tag of the successfully created TextReverseConversionGenerator object. */
  var resolvedLanguage: String
}
object TextReverseConversionGenerator {
  
  inline def apply(
    convertBackAsync: String => IPromiseWithIAsyncOperation[String],
    languageAvailableButNotInstalled: Boolean,
    resolvedLanguage: String
  ): TextReverseConversionGenerator = {
    val __obj = js.Dynamic.literal(convertBackAsync = js.Any.fromFunction1(convertBackAsync), languageAvailableButNotInstalled = languageAvailableButNotInstalled.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextReverseConversionGenerator]
  }
  
  extension [Self <: TextReverseConversionGenerator](x: Self) {
    
    inline def setConvertBackAsync(value: String => IPromiseWithIAsyncOperation[String]): Self = StObject.set(x, "convertBackAsync", js.Any.fromFunction1(value))
    
    inline def setLanguageAvailableButNotInstalled(value: Boolean): Self = StObject.set(x, "languageAvailableButNotInstalled", value.asInstanceOf[js.Any])
    
    inline def setResolvedLanguage(value: String): Self = StObject.set(x, "resolvedLanguage", value.asInstanceOf[js.Any])
  }
}
