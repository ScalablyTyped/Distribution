package typings.winrtUwp.Windows.Globalization.Fonts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supplies a set of font recommendations for a given language or script for various usage cases. */
trait LanguageFontGroup extends js.Object {
  /** Gets a font that is recommended as an additional option for use in documents beyond the recommendations provided by DocumentHeadingFont , ModernDocumentFont and TraditionalDocumentFont . */
  var documentAlternate1Font: LanguageFont
  /** Gets a font that is recommended as an additional option for use in documents beyond the recommendations provided by DocumentHeadingFont , ModernDocumentFont and TraditionalDocumentFont . */
  var documentAlternate2Font: LanguageFont
  /** Gets a font that is recommended for use in document headings. */
  var documentHeadingFont: LanguageFont
  /** Gets a font that is recommended for displaying fixed-width characters. */
  var fixedWidthTextFont: LanguageFont
  /** Gets a font that is recommended for typical document body text following modern style conventions. */
  var modernDocumentFont: LanguageFont
  /** Gets a font that is recommended for typical document body text following traditional style conventions. */
  var traditionalDocumentFont: LanguageFont
  /** Gets a font that is recommended for special UI elements, such as captions, that are displayed at sizes smaller than typical UI body text. */
  var uiCaptionFont: LanguageFont
  /** Gets a font that is recommended for special UI elements, such as headings, that are displayed at sizes somewhat larger than typical UI body text. */
  var uiHeadingFont: LanguageFont
  /** Gets a font that is recommended for special UI elements, such as headings in notifications or other app messages, that are displayed at UI body text size or only slightly larger yet need to be differentiated from UI body text. */
  var uiNotificationHeadingFont: LanguageFont
  /** Gets a font that is recommended for typical UI body text. */
  var uiTextFont: LanguageFont
  /** Gets a font that is recommended for special UI elements set at sizes much larger than typical UI body text. */
  var uiTitleFont: LanguageFont
}

object LanguageFontGroup {
  @scala.inline
  def apply(
    documentAlternate1Font: LanguageFont,
    documentAlternate2Font: LanguageFont,
    documentHeadingFont: LanguageFont,
    fixedWidthTextFont: LanguageFont,
    modernDocumentFont: LanguageFont,
    traditionalDocumentFont: LanguageFont,
    uiCaptionFont: LanguageFont,
    uiHeadingFont: LanguageFont,
    uiNotificationHeadingFont: LanguageFont,
    uiTextFont: LanguageFont,
    uiTitleFont: LanguageFont
  ): LanguageFontGroup = {
    val __obj = js.Dynamic.literal(documentAlternate1Font = documentAlternate1Font.asInstanceOf[js.Any], documentAlternate2Font = documentAlternate2Font.asInstanceOf[js.Any], documentHeadingFont = documentHeadingFont.asInstanceOf[js.Any], fixedWidthTextFont = fixedWidthTextFont.asInstanceOf[js.Any], modernDocumentFont = modernDocumentFont.asInstanceOf[js.Any], traditionalDocumentFont = traditionalDocumentFont.asInstanceOf[js.Any], uiCaptionFont = uiCaptionFont.asInstanceOf[js.Any], uiHeadingFont = uiHeadingFont.asInstanceOf[js.Any], uiNotificationHeadingFont = uiNotificationHeadingFont.asInstanceOf[js.Any], uiTextFont = uiTextFont.asInstanceOf[js.Any], uiTitleFont = uiTitleFont.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageFontGroup]
  }
}

