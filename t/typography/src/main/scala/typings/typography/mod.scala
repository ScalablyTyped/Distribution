package typings.typography

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typography", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Typography {
    def this(opts: TypographyOptions) = this()
    
    /* CompleteClass */
    override def adjustFontSizeTo(): js.Object = js.native
    /* CompleteClass */
    override def adjustFontSizeTo(value: String): js.Object = js.native
    /* CompleteClass */
    override def adjustFontSizeTo(value: Double): js.Object = js.native
    /* CompleteClass */
    @JSName("adjustFontSizeTo")
    var adjustFontSizeTo_Original: js.Function1[/* value */ js.UndefOr[Double | String], js.Object] = js.native
    
    /* CompleteClass */
    override def createStyles(): String = js.native
    
    /* CompleteClass */
    override def establishBaseline(): BaseLine = js.native
    /* CompleteClass */
    @JSName("establishBaseline")
    var establishBaseline_Original: js.Function0[BaseLine] = js.native
    
    /* CompleteClass */
    override def injectStyles(): Unit = js.native
    
    /* CompleteClass */
    override def linesForFontSize(fontSize: Double): Double = js.native
    /* CompleteClass */
    @JSName("linesForFontSize")
    var linesForFontSize_Original: js.Function1[/* fontSize */ Double, Double] = js.native
    
    /* CompleteClass */
    var options: TypographyOptions = js.native
    
    /* CompleteClass */
    override def rhythm(value: Double): String = js.native
    /* CompleteClass */
    @JSName("rhythm")
    var rhythm_Original: js.Function1[/* value */ Double, String] = js.native
    
    /* CompleteClass */
    override def scale(value: Double): BaseLine = js.native
    /* CompleteClass */
    @JSName("scale")
    var scale_Original: js.Function1[/* value */ Double, BaseLine] = js.native
    
    /* CompleteClass */
    override def toJSON(): js.Object = js.native
  }
  
  trait BaseLine extends StObject {
    
    var fontSize: String
    
    var lineHeight: String
  }
  object BaseLine {
    
    inline def apply(fontSize: String, lineHeight: String): BaseLine = {
      val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseLine]
    }
    
    extension [Self <: BaseLine](x: Self) {
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    }
  }
  
  trait GoogleFont extends StObject {
    
    var name: String
    
    var styles: js.Array[String]
  }
  object GoogleFont {
    
    inline def apply(name: String, styles: js.Array[String]): GoogleFont = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoogleFont]
    }
    
    extension [Self <: GoogleFont](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
    }
  }
  
  trait Typography extends StObject {
    
    def adjustFontSizeTo(): js.Object
    def adjustFontSizeTo(value: String): js.Object
    def adjustFontSizeTo(value: Double): js.Object
    @JSName("adjustFontSizeTo")
    var adjustFontSizeTo_Original: js.Function1[/* value */ js.UndefOr[Double | String], js.Object]
    
    def createStyles(): String
    
    def establishBaseline(): BaseLine
    @JSName("establishBaseline")
    var establishBaseline_Original: js.Function0[BaseLine]
    
    def injectStyles(): Unit
    
    def linesForFontSize(fontSize: Double): Double
    @JSName("linesForFontSize")
    var linesForFontSize_Original: js.Function1[/* fontSize */ Double, Double]
    
    var options: TypographyOptions
    
    def rhythm(value: Double): String
    @JSName("rhythm")
    var rhythm_Original: js.Function1[/* value */ Double, String]
    
    def scale(value: Double): BaseLine
    @JSName("scale")
    var scale_Original: js.Function1[/* value */ Double, BaseLine]
    
    def toJSON(): js.Object
  }
  object Typography {
    
    inline def apply(
      adjustFontSizeTo: /* value */ js.UndefOr[Double | String] => js.Object,
      createStyles: () => String,
      establishBaseline: () => BaseLine,
      injectStyles: () => Unit,
      linesForFontSize: /* fontSize */ Double => Double,
      options: TypographyOptions,
      rhythm: /* value */ Double => String,
      scale: /* value */ Double => BaseLine,
      toJSON: () => js.Object
    ): Typography = {
      val __obj = js.Dynamic.literal(adjustFontSizeTo = js.Any.fromFunction1(adjustFontSizeTo), createStyles = js.Any.fromFunction0(createStyles), establishBaseline = js.Any.fromFunction0(establishBaseline), injectStyles = js.Any.fromFunction0(injectStyles), linesForFontSize = js.Any.fromFunction1(linesForFontSize), options = options.asInstanceOf[js.Any], rhythm = js.Any.fromFunction1(rhythm), scale = js.Any.fromFunction1(scale), toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[Typography]
    }
    
    extension [Self <: Typography](x: Self) {
      
      inline def setAdjustFontSizeTo(value: /* value */ js.UndefOr[Double | String] => js.Object): Self = StObject.set(x, "adjustFontSizeTo", js.Any.fromFunction1(value))
      
      inline def setCreateStyles(value: () => String): Self = StObject.set(x, "createStyles", js.Any.fromFunction0(value))
      
      inline def setEstablishBaseline(value: () => BaseLine): Self = StObject.set(x, "establishBaseline", js.Any.fromFunction0(value))
      
      inline def setInjectStyles(value: () => Unit): Self = StObject.set(x, "injectStyles", js.Any.fromFunction0(value))
      
      inline def setLinesForFontSize(value: /* fontSize */ Double => Double): Self = StObject.set(x, "linesForFontSize", js.Any.fromFunction1(value))
      
      inline def setOptions(value: TypographyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRhythm(value: /* value */ Double => String): Self = StObject.set(x, "rhythm", js.Any.fromFunction1(value))
      
      inline def setScale(value: /* value */ Double => BaseLine): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
      
      inline def setToJSON(value: () => js.Object): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait TypographyOptions extends StObject {
    
    var baseFontSize: js.UndefOr[String] = js.undefined
    
    var baseLineHeight: js.UndefOr[Double] = js.undefined
    
    var blockMarginBottom: js.UndefOr[Double] = js.undefined
    
    var bodyColor: js.UndefOr[String] = js.undefined
    
    var bodyFontFamily: js.UndefOr[js.Array[String]] = js.undefined
    
    var bodyWeight: js.UndefOr[Double | String] = js.undefined
    
    var boldWeight: js.UndefOr[Double | String] = js.undefined
    
    var googleFonts: js.UndefOr[js.Array[GoogleFont]] = js.undefined
    
    var headerColor: js.UndefOr[String] = js.undefined
    
    var headerFontFamily: js.UndefOr[js.Array[String]] = js.undefined
    
    var headerLineHeight: js.UndefOr[Double] = js.undefined
    
    var headerWeight: js.UndefOr[Double | String] = js.undefined
    
    var includeNormalize: js.UndefOr[Boolean] = js.undefined
    
    var overrideStyles: js.UndefOr[
        js.Function3[
          /* VerticalRhythm */ VerticalRhythm, 
          /* options */ this.type, 
          /* styles */ js.Any, 
          js.Object
        ]
      ] = js.undefined
    
    var overrideThemeStyles: js.UndefOr[
        js.Function3[
          /* VerticalRhythm */ VerticalRhythm, 
          /* options */ this.type, 
          /* styles */ js.Any, 
          js.Object
        ]
      ] = js.undefined
    
    var plugins: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var scaleRatio: js.UndefOr[Double] = js.undefined
  }
  object TypographyOptions {
    
    inline def apply(): TypographyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypographyOptions]
    }
    
    extension [Self <: TypographyOptions](x: Self) {
      
      inline def setBaseFontSize(value: String): Self = StObject.set(x, "baseFontSize", value.asInstanceOf[js.Any])
      
      inline def setBaseFontSizeUndefined: Self = StObject.set(x, "baseFontSize", js.undefined)
      
      inline def setBaseLineHeight(value: Double): Self = StObject.set(x, "baseLineHeight", value.asInstanceOf[js.Any])
      
      inline def setBaseLineHeightUndefined: Self = StObject.set(x, "baseLineHeight", js.undefined)
      
      inline def setBlockMarginBottom(value: Double): Self = StObject.set(x, "blockMarginBottom", value.asInstanceOf[js.Any])
      
      inline def setBlockMarginBottomUndefined: Self = StObject.set(x, "blockMarginBottom", js.undefined)
      
      inline def setBodyColor(value: String): Self = StObject.set(x, "bodyColor", value.asInstanceOf[js.Any])
      
      inline def setBodyColorUndefined: Self = StObject.set(x, "bodyColor", js.undefined)
      
      inline def setBodyFontFamily(value: js.Array[String]): Self = StObject.set(x, "bodyFontFamily", value.asInstanceOf[js.Any])
      
      inline def setBodyFontFamilyUndefined: Self = StObject.set(x, "bodyFontFamily", js.undefined)
      
      inline def setBodyFontFamilyVarargs(value: String*): Self = StObject.set(x, "bodyFontFamily", js.Array(value :_*))
      
      inline def setBodyWeight(value: Double | String): Self = StObject.set(x, "bodyWeight", value.asInstanceOf[js.Any])
      
      inline def setBodyWeightUndefined: Self = StObject.set(x, "bodyWeight", js.undefined)
      
      inline def setBoldWeight(value: Double | String): Self = StObject.set(x, "boldWeight", value.asInstanceOf[js.Any])
      
      inline def setBoldWeightUndefined: Self = StObject.set(x, "boldWeight", js.undefined)
      
      inline def setGoogleFonts(value: js.Array[GoogleFont]): Self = StObject.set(x, "googleFonts", value.asInstanceOf[js.Any])
      
      inline def setGoogleFontsUndefined: Self = StObject.set(x, "googleFonts", js.undefined)
      
      inline def setGoogleFontsVarargs(value: GoogleFont*): Self = StObject.set(x, "googleFonts", js.Array(value :_*))
      
      inline def setHeaderColor(value: String): Self = StObject.set(x, "headerColor", value.asInstanceOf[js.Any])
      
      inline def setHeaderColorUndefined: Self = StObject.set(x, "headerColor", js.undefined)
      
      inline def setHeaderFontFamily(value: js.Array[String]): Self = StObject.set(x, "headerFontFamily", value.asInstanceOf[js.Any])
      
      inline def setHeaderFontFamilyUndefined: Self = StObject.set(x, "headerFontFamily", js.undefined)
      
      inline def setHeaderFontFamilyVarargs(value: String*): Self = StObject.set(x, "headerFontFamily", js.Array(value :_*))
      
      inline def setHeaderLineHeight(value: Double): Self = StObject.set(x, "headerLineHeight", value.asInstanceOf[js.Any])
      
      inline def setHeaderLineHeightUndefined: Self = StObject.set(x, "headerLineHeight", js.undefined)
      
      inline def setHeaderWeight(value: Double | String): Self = StObject.set(x, "headerWeight", value.asInstanceOf[js.Any])
      
      inline def setHeaderWeightUndefined: Self = StObject.set(x, "headerWeight", js.undefined)
      
      inline def setIncludeNormalize(value: Boolean): Self = StObject.set(x, "includeNormalize", value.asInstanceOf[js.Any])
      
      inline def setIncludeNormalizeUndefined: Self = StObject.set(x, "includeNormalize", js.undefined)
      
      inline def setOverrideStyles(value: (/* VerticalRhythm */ VerticalRhythm, TypographyOptions, /* styles */ js.Any) => js.Object): Self = StObject.set(x, "overrideStyles", js.Any.fromFunction3(value))
      
      inline def setOverrideStylesUndefined: Self = StObject.set(x, "overrideStyles", js.undefined)
      
      inline def setOverrideThemeStyles(value: (/* VerticalRhythm */ VerticalRhythm, TypographyOptions, /* styles */ js.Any) => js.Object): Self = StObject.set(x, "overrideThemeStyles", js.Any.fromFunction3(value))
      
      inline def setOverrideThemeStylesUndefined: Self = StObject.set(x, "overrideThemeStyles", js.undefined)
      
      inline def setPlugins(value: js.Array[js.Any]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: js.Any*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      inline def setScaleRatio(value: Double): Self = StObject.set(x, "scaleRatio", value.asInstanceOf[js.Any])
      
      inline def setScaleRatioUndefined: Self = StObject.set(x, "scaleRatio", js.undefined)
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
