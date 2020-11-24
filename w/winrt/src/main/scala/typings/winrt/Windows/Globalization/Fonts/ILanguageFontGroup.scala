package typings.winrt.Windows.Globalization.Fonts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILanguageFontGroup extends js.Object {
  
  var documentAlternate1Font: LanguageFont = js.native
  
  var documentAlternate2Font: LanguageFont = js.native
  
  var documentHeadingFont: LanguageFont = js.native
  
  var fixedWidthTextFont: LanguageFont = js.native
  
  var modernDocumentFont: LanguageFont = js.native
  
  var traditionalDocumentFont: LanguageFont = js.native
  
  var uICaptionFont: LanguageFont = js.native
  
  var uIHeadingFont: LanguageFont = js.native
  
  var uINotificationHeadingFont: LanguageFont = js.native
  
  var uITextFont: LanguageFont = js.native
  
  var uITitleFont: LanguageFont = js.native
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
    val __obj = js.Dynamic.literal(documentAlternate1Font = documentAlternate1Font.asInstanceOf[js.Any], documentAlternate2Font = documentAlternate2Font.asInstanceOf[js.Any], documentHeadingFont = documentHeadingFont.asInstanceOf[js.Any], fixedWidthTextFont = fixedWidthTextFont.asInstanceOf[js.Any], modernDocumentFont = modernDocumentFont.asInstanceOf[js.Any], traditionalDocumentFont = traditionalDocumentFont.asInstanceOf[js.Any], uICaptionFont = uICaptionFont.asInstanceOf[js.Any], uIHeadingFont = uIHeadingFont.asInstanceOf[js.Any], uINotificationHeadingFont = uINotificationHeadingFont.asInstanceOf[js.Any], uITextFont = uITextFont.asInstanceOf[js.Any], uITitleFont = uITitleFont.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageFontGroup]
  }
  
  @scala.inline
  implicit class ILanguageFontGroupOps[Self <: ILanguageFontGroup] (val x: Self) extends AnyVal {
    
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
    def setUICaptionFont(value: LanguageFont): Self = this.set("uICaptionFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUIHeadingFont(value: LanguageFont): Self = this.set("uIHeadingFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUINotificationHeadingFont(value: LanguageFont): Self = this.set("uINotificationHeadingFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUITextFont(value: LanguageFont): Self = this.set("uITextFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUITitleFont(value: LanguageFont): Self = this.set("uITitleFont", value.asInstanceOf[js.Any])
  }
}
