package typings.winrt.Windows.Globalization

import typings.winrt.Windows.UI.Text.FontStretch
import typings.winrt.Windows.UI.Text.FontStyle
import typings.winrt.Windows.UI.Text.FontWeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Fonts {
  
  trait ILanguageFont extends StObject {
    
    var fontFamily: String
    
    var fontStretch: FontStretch
    
    var fontStyle: FontStyle
    
    var fontWeight: FontWeight
    
    var scaleFactor: Double
  }
  object ILanguageFont {
    
    @scala.inline
    def apply(
      fontFamily: String,
      fontStretch: FontStretch,
      fontStyle: FontStyle,
      fontWeight: FontWeight,
      scaleFactor: Double
    ): ILanguageFont = {
      val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontStretch = fontStretch.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILanguageFont]
    }
    
    @scala.inline
    implicit class ILanguageFontMutableBuilder[Self <: ILanguageFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStretch(value: FontStretch): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    }
  }
  
  trait ILanguageFontGroup extends StObject {
    
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
      val __obj = js.Dynamic.literal(documentAlternate1Font = documentAlternate1Font.asInstanceOf[js.Any], documentAlternate2Font = documentAlternate2Font.asInstanceOf[js.Any], documentHeadingFont = documentHeadingFont.asInstanceOf[js.Any], fixedWidthTextFont = fixedWidthTextFont.asInstanceOf[js.Any], modernDocumentFont = modernDocumentFont.asInstanceOf[js.Any], traditionalDocumentFont = traditionalDocumentFont.asInstanceOf[js.Any], uICaptionFont = uICaptionFont.asInstanceOf[js.Any], uIHeadingFont = uIHeadingFont.asInstanceOf[js.Any], uINotificationHeadingFont = uINotificationHeadingFont.asInstanceOf[js.Any], uITextFont = uITextFont.asInstanceOf[js.Any], uITitleFont = uITitleFont.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILanguageFontGroup]
    }
    
    @scala.inline
    implicit class ILanguageFontGroupMutableBuilder[Self <: ILanguageFontGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocumentAlternate1Font(value: LanguageFont): Self = StObject.set(x, "documentAlternate1Font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentAlternate2Font(value: LanguageFont): Self = StObject.set(x, "documentAlternate2Font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentHeadingFont(value: LanguageFont): Self = StObject.set(x, "documentHeadingFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedWidthTextFont(value: LanguageFont): Self = StObject.set(x, "fixedWidthTextFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModernDocumentFont(value: LanguageFont): Self = StObject.set(x, "modernDocumentFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraditionalDocumentFont(value: LanguageFont): Self = StObject.set(x, "traditionalDocumentFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUICaptionFont(value: LanguageFont): Self = StObject.set(x, "uICaptionFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUIHeadingFont(value: LanguageFont): Self = StObject.set(x, "uIHeadingFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUINotificationHeadingFont(value: LanguageFont): Self = StObject.set(x, "uINotificationHeadingFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUITextFont(value: LanguageFont): Self = StObject.set(x, "uITextFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUITitleFont(value: LanguageFont): Self = StObject.set(x, "uITitleFont", value.asInstanceOf[js.Any])
    }
  }
  
  trait ILanguageFontGroupFactory extends StObject {
    
    def createLanguageFontGroup(languageTag: String): LanguageFontGroup
  }
  object ILanguageFontGroupFactory {
    
    @scala.inline
    def apply(createLanguageFontGroup: String => LanguageFontGroup): ILanguageFontGroupFactory = {
      val __obj = js.Dynamic.literal(createLanguageFontGroup = js.Any.fromFunction1(createLanguageFontGroup))
      __obj.asInstanceOf[ILanguageFontGroupFactory]
    }
    
    @scala.inline
    implicit class ILanguageFontGroupFactoryMutableBuilder[Self <: ILanguageFontGroupFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateLanguageFontGroup(value: String => LanguageFontGroup): Self = StObject.set(x, "createLanguageFontGroup", js.Any.fromFunction1(value))
    }
  }
  
  trait LanguageFont
    extends StObject
       with ILanguageFont
  object LanguageFont {
    
    @scala.inline
    def apply(
      fontFamily: String,
      fontStretch: FontStretch,
      fontStyle: FontStyle,
      fontWeight: FontWeight,
      scaleFactor: Double
    ): LanguageFont = {
      val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontStretch = fontStretch.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageFont]
    }
  }
  
  trait LanguageFontGroup
    extends StObject
       with ILanguageFontGroup
  object LanguageFontGroup {
    
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
    ): LanguageFontGroup = {
      val __obj = js.Dynamic.literal(documentAlternate1Font = documentAlternate1Font.asInstanceOf[js.Any], documentAlternate2Font = documentAlternate2Font.asInstanceOf[js.Any], documentHeadingFont = documentHeadingFont.asInstanceOf[js.Any], fixedWidthTextFont = fixedWidthTextFont.asInstanceOf[js.Any], modernDocumentFont = modernDocumentFont.asInstanceOf[js.Any], traditionalDocumentFont = traditionalDocumentFont.asInstanceOf[js.Any], uICaptionFont = uICaptionFont.asInstanceOf[js.Any], uIHeadingFont = uIHeadingFont.asInstanceOf[js.Any], uINotificationHeadingFont = uINotificationHeadingFont.asInstanceOf[js.Any], uITextFont = uITextFont.asInstanceOf[js.Any], uITitleFont = uITitleFont.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageFontGroup]
    }
  }
}
