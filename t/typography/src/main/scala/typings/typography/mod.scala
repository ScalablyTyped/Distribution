package typings.typography

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typography", JSImport.Default)
  @js.native
  class default protected () extends Typography {
    def this(opts: TypographyOptions) = this()
  }
  
  @js.native
  trait BaseLine extends StObject {
    
    var fontSize: String = js.native
    
    var lineHeight: String = js.native
  }
  object BaseLine {
    
    @scala.inline
    def apply(fontSize: String, lineHeight: String): BaseLine = {
      val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseLine]
    }
    
    @scala.inline
    implicit class BaseLineMutableBuilder[Self <: BaseLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GoogleFont extends StObject {
    
    var name: String = js.native
    
    var styles: js.Array[String] = js.native
  }
  object GoogleFont {
    
    @scala.inline
    def apply(name: String, styles: js.Array[String]): GoogleFont = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoogleFont]
    }
    
    @scala.inline
    implicit class GoogleFontMutableBuilder[Self <: GoogleFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Typography extends StObject {
    
    def adjustFontSizeTo(): js.Object = js.native
    def adjustFontSizeTo(value: String): js.Object = js.native
    def adjustFontSizeTo(value: Double): js.Object = js.native
    @JSName("adjustFontSizeTo")
    var adjustFontSizeTo_Original: js.Function1[/* value */ js.UndefOr[Double | String], js.Object] = js.native
    
    def createStyles(): String = js.native
    
    def establishBaseline(): BaseLine = js.native
    @JSName("establishBaseline")
    var establishBaseline_Original: js.Function0[BaseLine] = js.native
    
    def injectStyles(): Unit = js.native
    
    def linesForFontSize(fontSize: Double): Double = js.native
    @JSName("linesForFontSize")
    var linesForFontSize_Original: js.Function1[/* fontSize */ Double, Double] = js.native
    
    var options: TypographyOptions = js.native
    
    def rhythm(value: Double): String = js.native
    @JSName("rhythm")
    var rhythm_Original: js.Function1[/* value */ Double, String] = js.native
    
    def scale(value: Double): BaseLine = js.native
    @JSName("scale")
    var scale_Original: js.Function1[/* value */ Double, BaseLine] = js.native
    
    def toJSON(): js.Object = js.native
  }
  
  @js.native
  trait TypographyOptions extends StObject {
    
    var baseFontSize: js.UndefOr[String] = js.native
    
    var baseLineHeight: js.UndefOr[Double] = js.native
    
    var blockMarginBottom: js.UndefOr[Double] = js.native
    
    var bodyColor: js.UndefOr[String] = js.native
    
    var bodyFontFamily: js.UndefOr[js.Array[String]] = js.native
    
    var bodyWeight: js.UndefOr[Double | String] = js.native
    
    var boldWeight: js.UndefOr[Double | String] = js.native
    
    var googleFonts: js.UndefOr[js.Array[GoogleFont]] = js.native
    
    var headerColor: js.UndefOr[String] = js.native
    
    var headerFontFamily: js.UndefOr[js.Array[String]] = js.native
    
    var headerLineHeight: js.UndefOr[Double] = js.native
    
    var headerWeight: js.UndefOr[Double | String] = js.native
    
    var includeNormalize: js.UndefOr[Boolean] = js.native
    
    var overrideStyles: js.UndefOr[
        js.Function3[
          /* VerticalRhythm */ VerticalRhythm, 
          /* options */ this.type, 
          /* styles */ js.Any, 
          js.Object
        ]
      ] = js.native
    
    var overrideThemeStyles: js.UndefOr[
        js.Function3[
          /* VerticalRhythm */ VerticalRhythm, 
          /* options */ this.type, 
          /* styles */ js.Any, 
          js.Object
        ]
      ] = js.native
    
    var plugins: js.UndefOr[js.Array[_]] = js.native
    
    var scaleRatio: js.UndefOr[Double] = js.native
  }
  object TypographyOptions {
    
    @scala.inline
    def apply(): TypographyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypographyOptions]
    }
    
    @scala.inline
    implicit class TypographyOptionsMutableBuilder[Self <: TypographyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseFontSize(value: String): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseFontSizeUndefined: Self = StObject.set(x, "baseFontSize", js.undefined)
      
      @scala.inline
      def setBaseLineHeight(value: Double): Self = StObject.set(x, "baseLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseLineHeightUndefined: Self = StObject.set(x, "baseLineHeight", js.undefined)
      
      @scala.inline
      def setBlockMarginBottom(value: Double): Self = StObject.set(x, "blockMarginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockMarginBottomUndefined: Self = StObject.set(x, "blockMarginBottom", js.undefined)
      
      @scala.inline
      def setBodyColor(value: String): Self = StObject.set(x, "bodyColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyColorUndefined: Self = StObject.set(x, "bodyColor", js.undefined)
      
      @scala.inline
      def setBodyFontFamily(value: js.Array[String]): Self = StObject.set(x, "bodyFontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyFontFamilyUndefined: Self = StObject.set(x, "bodyFontFamily", js.undefined)
      
      @scala.inline
      def setBodyFontFamilyVarargs(value: String*): Self = StObject.set(x, "bodyFontFamily", js.Array(value :_*))
      
      @scala.inline
      def setBodyWeight(value: Double | String): Self = StObject.set(x, "bodyWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyWeightUndefined: Self = StObject.set(x, "bodyWeight", js.undefined)
      
      @scala.inline
      def setBoldWeight(value: Double | String): Self = StObject.set(x, "boldWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldWeightUndefined: Self = StObject.set(x, "boldWeight", js.undefined)
      
      @scala.inline
      def setGoogleFonts(value: js.Array[GoogleFont]): Self = StObject.set(x, "googleFonts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoogleFontsUndefined: Self = StObject.set(x, "googleFonts", js.undefined)
      
      @scala.inline
      def setGoogleFontsVarargs(value: GoogleFont*): Self = StObject.set(x, "googleFonts", js.Array(value :_*))
      
      @scala.inline
      def setHeaderColor(value: String): Self = StObject.set(x, "headerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderColorUndefined: Self = StObject.set(x, "headerColor", js.undefined)
      
      @scala.inline
      def setHeaderFontFamily(value: js.Array[String]): Self = StObject.set(x, "headerFontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFontFamilyUndefined: Self = StObject.set(x, "headerFontFamily", js.undefined)
      
      @scala.inline
      def setHeaderFontFamilyVarargs(value: String*): Self = StObject.set(x, "headerFontFamily", js.Array(value :_*))
      
      @scala.inline
      def setHeaderLineHeight(value: Double): Self = StObject.set(x, "headerLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderLineHeightUndefined: Self = StObject.set(x, "headerLineHeight", js.undefined)
      
      @scala.inline
      def setHeaderWeight(value: Double | String): Self = StObject.set(x, "headerWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderWeightUndefined: Self = StObject.set(x, "headerWeight", js.undefined)
      
      @scala.inline
      def setIncludeNormalize(value: Boolean): Self = StObject.set(x, "includeNormalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeNormalizeUndefined: Self = StObject.set(x, "includeNormalize", js.undefined)
      
      @scala.inline
      def setOverrideStyles(value: (/* VerticalRhythm */ VerticalRhythm, TypographyOptions, /* styles */ js.Any) => js.Object): Self = StObject.set(x, "overrideStyles", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOverrideStylesUndefined: Self = StObject.set(x, "overrideStyles", js.undefined)
      
      @scala.inline
      def setOverrideThemeStyles(value: (/* VerticalRhythm */ VerticalRhythm, TypographyOptions, /* styles */ js.Any) => js.Object): Self = StObject.set(x, "overrideThemeStyles", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOverrideThemeStylesUndefined: Self = StObject.set(x, "overrideThemeStyles", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[_]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setScaleRatio(value: Double): Self = StObject.set(x, "scaleRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleRatioUndefined: Self = StObject.set(x, "scaleRatio", js.undefined)
    }
  }
  
  @js.native
  trait VerticalRhythm extends StObject {
    
    def adjustFontSizeTo(): js.Object = js.native
    def adjustFontSizeTo(value: String): js.Object = js.native
    def adjustFontSizeTo(value: Double): js.Object = js.native
    
    def establishBaseline(): BaseLine = js.native
    
    def linesForFontSize(fontSize: Double): Double = js.native
    
    def rhythm(value: Double): String = js.native
    
    def scale(value: Double): BaseLine = js.native
  }
}
