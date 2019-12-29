package typings.winrtDashUwp.Windows.Globalization

import typings.winrtDashUwp.Windows.UI.Text.FontStretch
import typings.winrtDashUwp.Windows.UI.Text.FontStyle
import typings.winrtDashUwp.Windows.UI.Text.FontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides classes that allow apps to select language-appropriate and script-appropriate fonts for text display. */
@JSGlobal("Windows.Globalization.Fonts")
@js.native
object Fonts extends js.Object {
  /** Provides data related to a particular font recommendation for a given language. */
  @js.native
  abstract class LanguageFont () extends js.Object {
    /** Gets the family name of the font. */
    var fontFamily: String = js.native
    /** Gets the FontStretch property of the font. */
    var fontStretch: FontStretch = js.native
    /** Gets the FontStyle property of the font. */
    var fontStyle: FontStyle = js.native
    /** Gets the weight of the font ( FontWeight ). */
    var fontWeight: FontWeight = js.native
    /** Gets a recommended font size scaling factor for the font. */
    var scaleFactor: Double = js.native
  }
  
  /** Supplies a set of font recommendations for a given language or script for various usage cases. */
  @js.native
  class LanguageFontGroup protected () extends js.Object {
    /**
      * Creates a LanguageFontGroup object for a given language or script.
      * @param languageTag A BCP-47 language tag, or an ISO 15924 script identifier.
      */
    def this(languageTag: String) = this()
    /** Gets a font that is recommended as an additional option for use in documents beyond the recommendations provided by DocumentHeadingFont , ModernDocumentFont and TraditionalDocumentFont . */
    var documentAlternate1Font: LanguageFont = js.native
    /** Gets a font that is recommended as an additional option for use in documents beyond the recommendations provided by DocumentHeadingFont , ModernDocumentFont and TraditionalDocumentFont . */
    var documentAlternate2Font: LanguageFont = js.native
    /** Gets a font that is recommended for use in document headings. */
    var documentHeadingFont: LanguageFont = js.native
    /** Gets a font that is recommended for displaying fixed-width characters. */
    var fixedWidthTextFont: LanguageFont = js.native
    /** Gets a font that is recommended for typical document body text following modern style conventions. */
    var modernDocumentFont: LanguageFont = js.native
    /** Gets a font that is recommended for typical document body text following traditional style conventions. */
    var traditionalDocumentFont: LanguageFont = js.native
    /** Gets a font that is recommended for special UI elements, such as captions, that are displayed at sizes smaller than typical UI body text. */
    var uiCaptionFont: LanguageFont = js.native
    /** Gets a font that is recommended for special UI elements, such as headings, that are displayed at sizes somewhat larger than typical UI body text. */
    var uiHeadingFont: LanguageFont = js.native
    /** Gets a font that is recommended for special UI elements, such as headings in notifications or other app messages, that are displayed at UI body text size or only slightly larger yet need to be differentiated from UI body text. */
    var uiNotificationHeadingFont: LanguageFont = js.native
    /** Gets a font that is recommended for typical UI body text. */
    var uiTextFont: LanguageFont = js.native
    /** Gets a font that is recommended for special UI elements set at sizes much larger than typical UI body text. */
    var uiTitleFont: LanguageFont = js.native
  }
  
}

