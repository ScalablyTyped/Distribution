package typings.winrtUwp.Windows.Globalization.Fonts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Supplies a set of font recommendations for a given language or script for various usage cases. */
@js.native
trait LanguageFontGroup extends js.Object {
  
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
  
  @scala.inline
  implicit class LanguageFontGroupOps[Self <: LanguageFontGroup] (val x: Self) extends AnyVal {
    
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
    def setDocumentAlternate1Font(value: LanguageFont): Self = this.set("documentAlternate1Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentAlternate2Font(value: LanguageFont): Self = this.set("documentAlternate2Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentHeadingFont(value: LanguageFont): Self = this.set("documentHeadingFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedWidthTextFont(value: LanguageFont): Self = this.set("fixedWidthTextFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModernDocumentFont(value: LanguageFont): Self = this.set("modernDocumentFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraditionalDocumentFont(value: LanguageFont): Self = this.set("traditionalDocumentFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiCaptionFont(value: LanguageFont): Self = this.set("uiCaptionFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiHeadingFont(value: LanguageFont): Self = this.set("uiHeadingFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiNotificationHeadingFont(value: LanguageFont): Self = this.set("uiNotificationHeadingFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiTextFont(value: LanguageFont): Self = this.set("uiTextFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiTitleFont(value: LanguageFont): Self = this.set("uiTitleFont", value.asInstanceOf[js.Any])
  }
}
