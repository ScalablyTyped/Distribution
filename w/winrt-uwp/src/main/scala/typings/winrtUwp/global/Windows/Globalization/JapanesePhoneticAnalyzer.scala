package typings.winrtUwp.global.Windows.Globalization

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reads a Japanese string that is a combination of Kanji characters and Hiragana characters, and returns a collection of proper readings from the string with word breaks. */
/* note: abstract class */ @JSGlobal("Windows.Globalization.JapanesePhoneticAnalyzer")
@js.native
open class JapanesePhoneticAnalyzer ()
  extends StObject
     with typings.winrtUwp.Windows.Globalization.JapanesePhoneticAnalyzer
object JapanesePhoneticAnalyzer {
  
  @JSGlobal("Windows.Globalization.JapanesePhoneticAnalyzer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Reads a Japanese string that is a combination of Kanji characters and Hiragana characters, and returns a collection of proper readings from the string with word breaks.
    * @param input A Japanese string that is a combination of Kanji characters and Hiragana characters.
    * @return A collection of JapanesePhoneme objects that represent proper readings from the string with word breaks.
    */
  /* static member */
  inline def getWords(input: String): IVectorView[typings.winrtUwp.Windows.Globalization.JapanesePhoneme] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWords")(input.asInstanceOf[js.Any]).asInstanceOf[IVectorView[typings.winrtUwp.Windows.Globalization.JapanesePhoneme]]
  /**
    * Reads a Japanese string that is a combination of Kanji characters and Hiragana characters, and returns a collection of proper readings from the string with word breaks. Optionally uses the "Mono Ruby" strategy in breaking multi-Kanji words into multiple Kanji words.
    * @param input A Japanese string that is a combination of Kanji characters and Hiragana characters.
    * @param monoRuby Specifies the use of the word-breaking strategy "Mono Ruby".
    * @return A collection of JapanesePhoneme objects that represent proper readings from the string with word breaks.
    */
  /* static member */
  inline def getWords(input: String, monoRuby: Boolean): IVectorView[typings.winrtUwp.Windows.Globalization.JapanesePhoneme] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWords")(input.asInstanceOf[js.Any], monoRuby.asInstanceOf[js.Any])).asInstanceOf[IVectorView[typings.winrtUwp.Windows.Globalization.JapanesePhoneme]]
}
