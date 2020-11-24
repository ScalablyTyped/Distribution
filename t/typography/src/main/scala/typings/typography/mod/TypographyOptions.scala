package typings.typography.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypographyOptions extends js.Object {
  
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
  implicit class TypographyOptionsOps[Self <: TypographyOptions] (val x: Self) extends AnyVal {
    
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
    def setBaseFontSize(value: String): Self = this.set("baseFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseFontSize: Self = this.set("baseFontSize", js.undefined)
    
    @scala.inline
    def setBaseLineHeight(value: Double): Self = this.set("baseLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseLineHeight: Self = this.set("baseLineHeight", js.undefined)
    
    @scala.inline
    def setBlockMarginBottom(value: Double): Self = this.set("blockMarginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockMarginBottom: Self = this.set("blockMarginBottom", js.undefined)
    
    @scala.inline
    def setBodyColor(value: String): Self = this.set("bodyColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyColor: Self = this.set("bodyColor", js.undefined)
    
    @scala.inline
    def setBodyFontFamilyVarargs(value: String*): Self = this.set("bodyFontFamily", js.Array(value :_*))
    
    @scala.inline
    def setBodyFontFamily(value: js.Array[String]): Self = this.set("bodyFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyFontFamily: Self = this.set("bodyFontFamily", js.undefined)
    
    @scala.inline
    def setBodyWeight(value: Double | String): Self = this.set("bodyWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyWeight: Self = this.set("bodyWeight", js.undefined)
    
    @scala.inline
    def setBoldWeight(value: Double | String): Self = this.set("boldWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoldWeight: Self = this.set("boldWeight", js.undefined)
    
    @scala.inline
    def setGoogleFontsVarargs(value: GoogleFont*): Self = this.set("googleFonts", js.Array(value :_*))
    
    @scala.inline
    def setGoogleFonts(value: js.Array[GoogleFont]): Self = this.set("googleFonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleFonts: Self = this.set("googleFonts", js.undefined)
    
    @scala.inline
    def setHeaderColor(value: String): Self = this.set("headerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderColor: Self = this.set("headerColor", js.undefined)
    
    @scala.inline
    def setHeaderFontFamilyVarargs(value: String*): Self = this.set("headerFontFamily", js.Array(value :_*))
    
    @scala.inline
    def setHeaderFontFamily(value: js.Array[String]): Self = this.set("headerFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFontFamily: Self = this.set("headerFontFamily", js.undefined)
    
    @scala.inline
    def setHeaderLineHeight(value: Double): Self = this.set("headerLineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderLineHeight: Self = this.set("headerLineHeight", js.undefined)
    
    @scala.inline
    def setHeaderWeight(value: Double | String): Self = this.set("headerWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderWeight: Self = this.set("headerWeight", js.undefined)
    
    @scala.inline
    def setIncludeNormalize(value: Boolean): Self = this.set("includeNormalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNormalize: Self = this.set("includeNormalize", js.undefined)
    
    @scala.inline
    def setOverrideStyles(value: (/* VerticalRhythm */ VerticalRhythm, TypographyOptions, /* styles */ js.Any) => js.Object): Self = this.set("overrideStyles", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOverrideStyles: Self = this.set("overrideStyles", js.undefined)
    
    @scala.inline
    def setOverrideThemeStyles(value: (/* VerticalRhythm */ VerticalRhythm, TypographyOptions, /* styles */ js.Any) => js.Object): Self = this.set("overrideThemeStyles", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOverrideThemeStyles: Self = this.set("overrideThemeStyles", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: js.Any*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[_]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setScaleRatio(value: Double): Self = this.set("scaleRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleRatio: Self = this.set("scaleRatio", js.undefined)
  }
}
