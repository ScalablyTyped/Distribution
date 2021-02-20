package typings.winrtUwp.global.Windows.Globalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes that allow apps to select language-appropriate and script-appropriate fonts for text display. */
object Fonts {
  
  /** Provides data related to a particular font recommendation for a given language. */
  @JSGlobal("Windows.Globalization.Fonts.LanguageFont")
  @js.native
  abstract class LanguageFont ()
    extends typings.winrtUwp.Windows.Globalization.Fonts.LanguageFont
  
  /** Supplies a set of font recommendations for a given language or script for various usage cases. */
  @JSGlobal("Windows.Globalization.Fonts.LanguageFontGroup")
  @js.native
  class LanguageFontGroup protected ()
    extends typings.winrtUwp.Windows.Globalization.Fonts.LanguageFontGroup {
    /**
      * Creates a LanguageFontGroup object for a given language or script.
      * @param languageTag A BCP-47 language tag, or an ISO 15924 script identifier.
      */
    def this(languageTag: String) = this()
  }
}
