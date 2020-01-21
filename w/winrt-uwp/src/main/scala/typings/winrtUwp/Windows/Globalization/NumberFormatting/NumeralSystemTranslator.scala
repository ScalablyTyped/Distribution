package typings.winrtUwp.Windows.Globalization.NumberFormatting

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Translates digits of the Latin numerical system into digits of another numerical system. */
@JSGlobal("Windows.Globalization.NumberFormatting.NumeralSystemTranslator")
@js.native
/** Creates a NumeralSystemTranslator object initialized by the list of current runtime language values preferred by the user. */
class NumeralSystemTranslator () extends js.Object {
  /**
    * Creates a NumeralSystemTranslator object initialized by a language list.
    * @param languages A list of BCP-47 language tags, in priority order, representing the choice of languages. They must all be well-formed according to Windows.Globalization.Language.isWellFormed .
    */
  def this(languages: IIterable[String]) = this()
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

