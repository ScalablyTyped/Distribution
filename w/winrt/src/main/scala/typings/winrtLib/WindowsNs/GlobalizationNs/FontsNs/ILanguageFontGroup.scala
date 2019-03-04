package typings
package winrtLib.WindowsNs.GlobalizationNs.FontsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageFontGroup extends js.Object {
  var documentAlternate1Font: LanguageFont
  var documentAlternate2Font: LanguageFont
  var documentHeadingFont: LanguageFont
  var fixedWidthTextFont: LanguageFont
  var modernDocumentFont: LanguageFont
  var traditionalDocumentFont: LanguageFont
  var uICaptionFont: LanguageFont
  var uIHeadingFont: LanguageFont
  var uINotificationHeadingFont: LanguageFont
  var uITextFont: LanguageFont
  var uITitleFont: LanguageFont
}

object ILanguageFontGroup {
  @scala.inline
  def apply(
    documentAlternate1Font: LanguageFont,
    documentAlternate2Font: LanguageFont,
    documentHeadingFont: LanguageFont,
    fixedWidthTextFont: LanguageFont,
    modernDocumentFont: LanguageFont,
    traditionalDocumentFont: LanguageFont,
    uICaptionFont: LanguageFont,
    uIHeadingFont: LanguageFont,
    uINotificationHeadingFont: LanguageFont,
    uITextFont: LanguageFont,
    uITitleFont: LanguageFont
  ): ILanguageFontGroup = {
    val __obj = js.Dynamic.literal(documentAlternate1Font = documentAlternate1Font, documentAlternate2Font = documentAlternate2Font, documentHeadingFont = documentHeadingFont, fixedWidthTextFont = fixedWidthTextFont, modernDocumentFont = modernDocumentFont, traditionalDocumentFont = traditionalDocumentFont, uICaptionFont = uICaptionFont, uIHeadingFont = uIHeadingFont, uINotificationHeadingFont = uINotificationHeadingFont, uITextFont = uITextFont, uITitleFont = uITitleFont)
  
    __obj.asInstanceOf[ILanguageFontGroup]
  }
}

