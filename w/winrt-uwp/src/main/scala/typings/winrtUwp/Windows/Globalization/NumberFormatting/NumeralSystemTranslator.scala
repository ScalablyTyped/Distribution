package typings.winrtUwp.Windows.Globalization.NumberFormatting

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Translates digits of the Latin numerical system into digits of another numerical system. */
@js.native
trait NumeralSystemTranslator extends js.Object {
  
  /** Gets the BCP-47 language tag(s) used to initialize this NumeralSystemTranslator object. */
  var languages: IVectorView[String] = js.native
  
  /** Gets or sets the numeral system that Latin digits will be converted to on calls to TranslateNumerals . */
  var numeralSystem: String = js.native
  
  /** Gets the language used to determine the numeral system when this object was initialized. */
  var resolvedLanguage: String = js.native
  
  /**
    * Converts a string of characters containing Latin digits to a string containing the corresponding digits of NumeralSystem .
    * @param value A string of characters containing Latin digits to be converted.
    * @return A string containing the converted digits. This string may be a different length than value.
    */
  def translateNumerals(value: String): String = js.native
}
object NumeralSystemTranslator {
  
  @scala.inline
  def apply(
    languages: IVectorView[String],
    numeralSystem: String,
    resolvedLanguage: String,
    translateNumerals: String => String
  ): NumeralSystemTranslator = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any], translateNumerals = js.Any.fromFunction1(translateNumerals))
    __obj.asInstanceOf[NumeralSystemTranslator]
  }
  
  @scala.inline
  implicit class NumeralSystemTranslatorOps[Self <: NumeralSystemTranslator] (val x: Self) extends AnyVal {
    
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
    def setLanguages(value: IVectorView[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumeralSystem(value: String): Self = this.set("numeralSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedLanguage(value: String): Self = this.set("resolvedLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslateNumerals(value: String => String): Self = this.set("translateNumerals", js.Any.fromFunction1(value))
  }
}
