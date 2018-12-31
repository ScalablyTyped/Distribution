package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs.FontsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supplies a set of font recommendations for a given language or script for various usage cases. */
@JSGlobal("Windows.Globalization.Fonts.LanguageFontGroup")
@js.native
class LanguageFontGroup protected () extends js.Object {
  /**
    * Creates a LanguageFontGroup object for a given language or script.
    * @param languageTag A BCP-47 language tag, or an ISO 15924 script identifier.
    */
  def this(languageTag: java.lang.String) = this()
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

