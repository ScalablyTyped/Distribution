package typings.winrt.global.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Globalization.Fonts")
@js.native
object Fonts extends js.Object {
  
  @js.native
  class LanguageFont ()
    extends typings.winrt.Windows.Globalization.Fonts.LanguageFont
  
  @js.native
  class LanguageFontGroup protected ()
    extends typings.winrt.Windows.Globalization.Fonts.LanguageFontGroup {
    def this(languageTag: String) = this()
  }
}
