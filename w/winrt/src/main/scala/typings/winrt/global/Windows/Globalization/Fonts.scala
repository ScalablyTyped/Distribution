package typings.winrt.global.Windows.Globalization

import typings.winrt.Windows.UI.Text.FontStretch
import typings.winrt.Windows.UI.Text.FontStyle
import typings.winrt.Windows.UI.Text.FontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.Fonts")
@js.native
object Fonts extends js.Object {
  @js.native
  class LanguageFont ()
    extends typings.winrt.Windows.Globalization.Fonts.LanguageFont {
    /* CompleteClass */
    override var fontFamily: String = js.native
    /* CompleteClass */
    override var fontStretch: FontStretch = js.native
    /* CompleteClass */
    override var fontStyle: FontStyle = js.native
    /* CompleteClass */
    override var fontWeight: FontWeight = js.native
    /* CompleteClass */
    override var scaleFactor: Double = js.native
  }
  
  @js.native
  class LanguageFontGroup protected ()
    extends typings.winrt.Windows.Globalization.Fonts.LanguageFontGroup {
    def this(languageTag: String) = this()
    /* CompleteClass */
    override var documentAlternate1Font: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var documentAlternate2Font: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var documentHeadingFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var fixedWidthTextFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var modernDocumentFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var traditionalDocumentFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var uICaptionFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var uIHeadingFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var uINotificationHeadingFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var uITextFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
    /* CompleteClass */
    override var uITitleFont: typings.winrt.Windows.Globalization.Fonts.LanguageFont = js.native
  }
  
}

