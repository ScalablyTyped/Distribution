package typings.styledSystem.mod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.Property.Border
import typings.csstype.mod.Property.BorderRadius
import typings.csstype.mod.Property.BorderWidth
import typings.csstype.mod.Property.BoxShadow
import typings.csstype.mod.Property.Color
import typings.csstype.mod.Property.FontFamily
import typings.csstype.mod.Property.FontSize
import typings.csstype.mod.Property.FontWeight
import typings.csstype.mod.Property.Height
import typings.csstype.mod.Property.LetterSpacing
import typings.csstype.mod.Property.LineHeight
import typings.csstype.mod.Property.Margin
import typings.csstype.mod.Property.Width
import typings.csstype.mod.Property.ZIndex
import typings.csstype.mod.StandardProperties
import typings.styledSystem.styledSystemInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme[TLength] extends StObject {
  
  var borderStyles: js.UndefOr[ObjectOrArray[Border[js.Object], /* keyof any */ String]] = js.undefined
  
  var borderWidths: js.UndefOr[ObjectOrArray[BorderWidth[TLength], /* keyof any */ String]] = js.undefined
  
  var borders: js.UndefOr[ObjectOrArray[Border[js.Object], /* keyof any */ String]] = js.undefined
  
  var breakpoints: js.UndefOr[ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]] = js.undefined
  
  var buttons: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`, String], /* keyof any */ String]] = js.undefined
  
  var colorStyles: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`, String], /* keyof any */ String]] = js.undefined
  
  var colors: js.UndefOr[ObjectOrArray[Color, /* keyof any */ String]] = js.undefined
  
  var fontSizes: js.UndefOr[ObjectOrArray[FontSize[Double], /* keyof any */ String]] = js.undefined
  
  var fontWeights: js.UndefOr[ObjectOrArray[FontWeight, /* keyof any */ String]] = js.undefined
  
  var fonts: js.UndefOr[ObjectOrArray[FontFamily, /* keyof any */ String]] = js.undefined
  
  var letterSpacings: js.UndefOr[ObjectOrArray[LetterSpacing[TLength], /* keyof any */ String]] = js.undefined
  
  var lineHeights: js.UndefOr[ObjectOrArray[LineHeight[TLength], /* keyof any */ String]] = js.undefined
  
  var mediaQueries: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var radii: js.UndefOr[ObjectOrArray[BorderRadius[TLength], /* keyof any */ String]] = js.undefined
  
  var shadows: js.UndefOr[ObjectOrArray[BoxShadow, /* keyof any */ String]] = js.undefined
  
  var sizes: js.UndefOr[ObjectOrArray[Height[js.Object] | Width[js.Object], /* keyof any */ String]] = js.undefined
  
  var space: js.UndefOr[ObjectOrArray[Margin[Double | String], /* keyof any */ String]] = js.undefined
  
  var textStyles: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`, String], /* keyof any */ String]] = js.undefined
  
  var zIndices: js.UndefOr[ObjectOrArray[ZIndex, /* keyof any */ String]] = js.undefined
}
object Theme {
  
  inline def apply[TLength](): Theme[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Theme[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Theme[?], TLength] (val x: Self & Theme[TLength]) extends AnyVal {
    
    inline def setBorderStyles(value: ObjectOrArray[Border[js.Object], /* keyof any */ String]): Self = StObject.set(x, "borderStyles", value.asInstanceOf[js.Any])
    
    inline def setBorderStylesUndefined: Self = StObject.set(x, "borderStyles", js.undefined)
    
    inline def setBorderStylesVarargs(value: Border[js.Object]*): Self = StObject.set(x, "borderStyles", js.Array(value*))
    
    inline def setBorderWidths(value: ObjectOrArray[BorderWidth[TLength], /* keyof any */ String]): Self = StObject.set(x, "borderWidths", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthsUndefined: Self = StObject.set(x, "borderWidths", js.undefined)
    
    inline def setBorderWidthsVarargs(value: BorderWidth[TLength]*): Self = StObject.set(x, "borderWidths", js.Array(value*))
    
    inline def setBorders(value: ObjectOrArray[Border[js.Object], /* keyof any */ String]): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    inline def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    inline def setBordersVarargs(value: Border[js.Object]*): Self = StObject.set(x, "borders", js.Array(value*))
    
    inline def setBreakpoints(value: ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    inline def setBreakpointsVarargs(value: (Double | String | js.Symbol)*): Self = StObject.set(x, "breakpoints", js.Array(value*))
    
    inline def setButtons(value: ObjectOrArray[StandardProperties[String | `0`, String], /* keyof any */ String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: (StandardProperties[String | `0`, String])*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setColorStyles(value: ObjectOrArray[StandardProperties[String | `0`, String], /* keyof any */ String]): Self = StObject.set(x, "colorStyles", value.asInstanceOf[js.Any])
    
    inline def setColorStylesUndefined: Self = StObject.set(x, "colorStyles", js.undefined)
    
    inline def setColorStylesVarargs(value: (StandardProperties[String | `0`, String])*): Self = StObject.set(x, "colorStyles", js.Array(value*))
    
    inline def setColors(value: ObjectOrArray[Color, /* keyof any */ String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setFontSizes(value: ObjectOrArray[FontSize[Double], /* keyof any */ String]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
    
    inline def setFontSizesUndefined: Self = StObject.set(x, "fontSizes", js.undefined)
    
    inline def setFontSizesVarargs(value: FontSize[Double]*): Self = StObject.set(x, "fontSizes", js.Array(value*))
    
    inline def setFontWeights(value: ObjectOrArray[FontWeight, /* keyof any */ String]): Self = StObject.set(x, "fontWeights", value.asInstanceOf[js.Any])
    
    inline def setFontWeightsUndefined: Self = StObject.set(x, "fontWeights", js.undefined)
    
    inline def setFontWeightsVarargs(value: FontWeight*): Self = StObject.set(x, "fontWeights", js.Array(value*))
    
    inline def setFonts(value: ObjectOrArray[FontFamily, /* keyof any */ String]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
    
    inline def setFontsVarargs(value: FontFamily*): Self = StObject.set(x, "fonts", js.Array(value*))
    
    inline def setLetterSpacings(value: ObjectOrArray[LetterSpacing[TLength], /* keyof any */ String]): Self = StObject.set(x, "letterSpacings", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingsUndefined: Self = StObject.set(x, "letterSpacings", js.undefined)
    
    inline def setLetterSpacingsVarargs(value: LetterSpacing[TLength]*): Self = StObject.set(x, "letterSpacings", js.Array(value*))
    
    inline def setLineHeights(value: ObjectOrArray[LineHeight[TLength], /* keyof any */ String]): Self = StObject.set(x, "lineHeights", value.asInstanceOf[js.Any])
    
    inline def setLineHeightsUndefined: Self = StObject.set(x, "lineHeights", js.undefined)
    
    inline def setLineHeightsVarargs(value: LineHeight[TLength]*): Self = StObject.set(x, "lineHeights", js.Array(value*))
    
    inline def setMediaQueries(value: StringDictionary[String]): Self = StObject.set(x, "mediaQueries", value.asInstanceOf[js.Any])
    
    inline def setMediaQueriesUndefined: Self = StObject.set(x, "mediaQueries", js.undefined)
    
    inline def setRadii(value: ObjectOrArray[BorderRadius[TLength], /* keyof any */ String]): Self = StObject.set(x, "radii", value.asInstanceOf[js.Any])
    
    inline def setRadiiUndefined: Self = StObject.set(x, "radii", js.undefined)
    
    inline def setRadiiVarargs(value: BorderRadius[TLength]*): Self = StObject.set(x, "radii", js.Array(value*))
    
    inline def setShadows(value: ObjectOrArray[BoxShadow, /* keyof any */ String]): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    inline def setShadowsVarargs(value: BoxShadow*): Self = StObject.set(x, "shadows", js.Array(value*))
    
    inline def setSizes(value: ObjectOrArray[Height[js.Object] | Width[js.Object], /* keyof any */ String]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSizesVarargs(value: (Height[js.Object] | Width[js.Object])*): Self = StObject.set(x, "sizes", js.Array(value*))
    
    inline def setSpace(value: ObjectOrArray[Margin[Double | String], /* keyof any */ String]): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    inline def setSpaceVarargs(value: (Margin[Double | String])*): Self = StObject.set(x, "space", js.Array(value*))
    
    inline def setTextStyles(value: ObjectOrArray[StandardProperties[String | `0`, String], /* keyof any */ String]): Self = StObject.set(x, "textStyles", value.asInstanceOf[js.Any])
    
    inline def setTextStylesUndefined: Self = StObject.set(x, "textStyles", js.undefined)
    
    inline def setTextStylesVarargs(value: (StandardProperties[String | `0`, String])*): Self = StObject.set(x, "textStyles", js.Array(value*))
    
    inline def setZIndices(value: ObjectOrArray[ZIndex, /* keyof any */ String]): Self = StObject.set(x, "zIndices", value.asInstanceOf[js.Any])
    
    inline def setZIndicesUndefined: Self = StObject.set(x, "zIndices", js.undefined)
    
    inline def setZIndicesVarargs(value: ZIndex*): Self = StObject.set(x, "zIndices", js.Array(value*))
  }
}
