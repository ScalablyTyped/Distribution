package typings.winrtUwp.Windows.Globalization.NumberFormatting

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Translates digits of the Latin numerical system into digits of another numerical system. */
trait NumeralSystemTranslator extends StObject {
  
  /** Gets the BCP-47 language tag(s) used to initialize this NumeralSystemTranslator object. */
  var languages: IVectorView[String]
  
  /** Gets or sets the numeral system that Latin digits will be converted to on calls to TranslateNumerals . */
  var numeralSystem: String
  
  /** Gets the language used to determine the numeral system when this object was initialized. */
  var resolvedLanguage: String
  
  /**
    * Converts a string of characters containing Latin digits to a string containing the corresponding digits of NumeralSystem .
    * @param value A string of characters containing Latin digits to be converted.
    * @return A string containing the converted digits. This string may be a different length than value.
    */
  def translateNumerals(value: String): String
}
object NumeralSystemTranslator {
  
  inline def apply(
    languages: IVectorView[String],
    numeralSystem: String,
    resolvedLanguage: String,
    translateNumerals: String => String
  ): NumeralSystemTranslator = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any], translateNumerals = js.Any.fromFunction1(translateNumerals))
    __obj.asInstanceOf[NumeralSystemTranslator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumeralSystemTranslator] (val x: Self) extends AnyVal {
    
    inline def setLanguages(value: IVectorView[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setNumeralSystem(value: String): Self = StObject.set(x, "numeralSystem", value.asInstanceOf[js.Any])
    
    inline def setResolvedLanguage(value: String): Self = StObject.set(x, "resolvedLanguage", value.asInstanceOf[js.Any])
    
    inline def setTranslateNumerals(value: String => String): Self = StObject.set(x, "translateNumerals", js.Any.fromFunction1(value))
  }
}
