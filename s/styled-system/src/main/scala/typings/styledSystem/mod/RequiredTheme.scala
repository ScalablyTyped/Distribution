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

/* Inlined std.Required<styled-system.styled-system.Theme<styled-system.styled-system.TLengthStyledSystem>> */
trait RequiredTheme extends StObject {
  
  var borderStyles: ObjectOrArray[Border[js.Object], /* keyof any */ String]
  
  var borderWidths: ObjectOrArray[BorderWidth[TLengthStyledSystem], /* keyof any */ String]
  
  var borders: ObjectOrArray[Border[js.Object], /* keyof any */ String]
  
  var breakpoints: ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]
  
  var buttons: ObjectOrArray[StandardProperties[String | `0`, String], /* keyof any */ String]
  
  var colorStyles: ObjectOrArray[StandardProperties[String | `0`, String], /* keyof any */ String]
  
  var colors: ObjectOrArray[Color, /* keyof any */ String]
  
  var fontSizes: ObjectOrArray[FontSize[Double], /* keyof any */ String]
  
  var fontWeights: ObjectOrArray[FontWeight, /* keyof any */ String]
  
  var fonts: ObjectOrArray[FontFamily, /* keyof any */ String]
  
  var letterSpacings: ObjectOrArray[LetterSpacing[TLengthStyledSystem], /* keyof any */ String]
  
  var lineHeights: ObjectOrArray[LineHeight[TLengthStyledSystem], /* keyof any */ String]
  
  var mediaQueries: StringDictionary[String]
  
  var radii: ObjectOrArray[BorderRadius[TLengthStyledSystem], /* keyof any */ String]
  
  var shadows: ObjectOrArray[BoxShadow, /* keyof any */ String]
  
  var sizes: ObjectOrArray[Height[js.Object] | Width[js.Object], /* keyof any */ String]
  
  var space: ObjectOrArray[Margin[Double | String], /* keyof any */ String]
  
  var textStyles: ObjectOrArray[StandardProperties[String | `0`, String], /* keyof any */ String]
  
  var zIndices: ObjectOrArray[ZIndex, /* keyof any */ String]
}
object RequiredTheme {
  
  inline def apply(
    borderStyles: ObjectOrArray[Border[js.Object], /* keyof any */ String],
    borderWidths: ObjectOrArray[BorderWidth[TLengthStyledSystem], /* keyof any */ String],
    borders: ObjectOrArray[Border[js.Object], /* keyof any */ String],
    breakpoints: ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String],
    buttons: ObjectOrArray[StandardProperties[String | `0`, String], /* keyof any */ String],
    colorStyles: ObjectOrArray[StandardProperties[String | `0`, String], /* keyof any */ String],
    colors: ObjectOrArray[Color, /* keyof any */ String],
    fontSizes: ObjectOrArray[FontSize[Double], /* keyof any */ String],
    fontWeights: ObjectOrArray[FontWeight, /* keyof any */ String],
    fonts: ObjectOrArray[FontFamily, /* keyof any */ String],
    letterSpacings: ObjectOrArray[LetterSpacing[TLengthStyledSystem], /* keyof any */ String],
    lineHeights: ObjectOrArray[LineHeight[TLengthStyledSystem], /* keyof any */ String],
    mediaQueries: StringDictionary[String],
    radii: ObjectOrArray[BorderRadius[TLengthStyledSystem], /* keyof any */ String],
    shadows: ObjectOrArray[BoxShadow, /* keyof any */ String],
    sizes: ObjectOrArray[Height[js.Object] | Width[js.Object], /* keyof any */ String],
    space: ObjectOrArray[Margin[Double | String], /* keyof any */ String],
    textStyles: ObjectOrArray[StandardProperties[String | `0`, String], /* keyof any */ String],
    zIndices: ObjectOrArray[ZIndex, /* keyof any */ String]
  ): RequiredTheme = {
    val __obj = js.Dynamic.literal(borderStyles = borderStyles.asInstanceOf[js.Any], borderWidths = borderWidths.asInstanceOf[js.Any], borders = borders.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], colorStyles = colorStyles.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], fontSizes = fontSizes.asInstanceOf[js.Any], fontWeights = fontWeights.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], letterSpacings = letterSpacings.asInstanceOf[js.Any], lineHeights = lineHeights.asInstanceOf[js.Any], mediaQueries = mediaQueries.asInstanceOf[js.Any], radii = radii.asInstanceOf[js.Any], shadows = shadows.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], textStyles = textStyles.asInstanceOf[js.Any], zIndices = zIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredTheme]
  }
  
  extension [Self <: RequiredTheme](x: Self) {
    
    inline def setBorderStyles(value: ObjectOrArray[Border[js.Object], /* keyof any */ String]): Self = StObject.set(x, "borderStyles", value.asInstanceOf[js.Any])
    
    inline def setBorderStylesVarargs(value: Border[js.Object]*): Self = StObject.set(x, "borderStyles", js.Array(value*))
    
    inline def setBorderWidths(value: ObjectOrArray[BorderWidth[TLengthStyledSystem], /* keyof any */ String]): Self = StObject.set(x, "borderWidths", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthsVarargs(value: BorderWidth[TLengthStyledSystem]*): Self = StObject.set(x, "borderWidths", js.Array(value*))
    
    inline def setBorders(value: ObjectOrArray[Border[js.Object], /* keyof any */ String]): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    inline def setBordersVarargs(value: Border[js.Object]*): Self = StObject.set(x, "borders", js.Array(value*))
    
    inline def setBreakpoints(value: ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsVarargs(value: (Double | String | js.Symbol)*): Self = StObject.set(x, "breakpoints", js.Array(value*))
    
    inline def setButtons(value: ObjectOrArray[StandardProperties[String | `0`, String], /* keyof any */ String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsVarargs(value: (StandardProperties[String | `0`, String])*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setColorStyles(value: ObjectOrArray[StandardProperties[String | `0`, String], /* keyof any */ String]): Self = StObject.set(x, "colorStyles", value.asInstanceOf[js.Any])
    
    inline def setColorStylesVarargs(value: (StandardProperties[String | `0`, String])*): Self = StObject.set(x, "colorStyles", js.Array(value*))
    
    inline def setColors(value: ObjectOrArray[Color, /* keyof any */ String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setFontSizes(value: ObjectOrArray[FontSize[Double], /* keyof any */ String]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
    
    inline def setFontSizesVarargs(value: FontSize[Double]*): Self = StObject.set(x, "fontSizes", js.Array(value*))
    
    inline def setFontWeights(value: ObjectOrArray[FontWeight, /* keyof any */ String]): Self = StObject.set(x, "fontWeights", value.asInstanceOf[js.Any])
    
    inline def setFontWeightsVarargs(value: FontWeight*): Self = StObject.set(x, "fontWeights", js.Array(value*))
    
    inline def setFonts(value: ObjectOrArray[FontFamily, /* keyof any */ String]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setFontsVarargs(value: FontFamily*): Self = StObject.set(x, "fonts", js.Array(value*))
    
    inline def setLetterSpacings(value: ObjectOrArray[LetterSpacing[TLengthStyledSystem], /* keyof any */ String]): Self = StObject.set(x, "letterSpacings", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingsVarargs(value: LetterSpacing[TLengthStyledSystem]*): Self = StObject.set(x, "letterSpacings", js.Array(value*))
    
    inline def setLineHeights(value: ObjectOrArray[LineHeight[TLengthStyledSystem], /* keyof any */ String]): Self = StObject.set(x, "lineHeights", value.asInstanceOf[js.Any])
    
    inline def setLineHeightsVarargs(value: LineHeight[TLengthStyledSystem]*): Self = StObject.set(x, "lineHeights", js.Array(value*))
    
    inline def setMediaQueries(value: StringDictionary[String]): Self = StObject.set(x, "mediaQueries", value.asInstanceOf[js.Any])
    
    inline def setRadii(value: ObjectOrArray[BorderRadius[TLengthStyledSystem], /* keyof any */ String]): Self = StObject.set(x, "radii", value.asInstanceOf[js.Any])
    
    inline def setRadiiVarargs(value: BorderRadius[TLengthStyledSystem]*): Self = StObject.set(x, "radii", js.Array(value*))
    
    inline def setShadows(value: ObjectOrArray[BoxShadow, /* keyof any */ String]): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsVarargs(value: BoxShadow*): Self = StObject.set(x, "shadows", js.Array(value*))
    
    inline def setSizes(value: ObjectOrArray[Height[js.Object] | Width[js.Object], /* keyof any */ String]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesVarargs(value: (Height[js.Object] | Width[js.Object])*): Self = StObject.set(x, "sizes", js.Array(value*))
    
    inline def setSpace(value: ObjectOrArray[Margin[Double | String], /* keyof any */ String]): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceVarargs(value: (Margin[Double | String])*): Self = StObject.set(x, "space", js.Array(value*))
    
    inline def setTextStyles(value: ObjectOrArray[StandardProperties[String | `0`, String], /* keyof any */ String]): Self = StObject.set(x, "textStyles", value.asInstanceOf[js.Any])
    
    inline def setTextStylesVarargs(value: (StandardProperties[String | `0`, String])*): Self = StObject.set(x, "textStyles", js.Array(value*))
    
    inline def setZIndices(value: ObjectOrArray[ZIndex, /* keyof any */ String]): Self = StObject.set(x, "zIndices", value.asInstanceOf[js.Any])
    
    inline def setZIndicesVarargs(value: ZIndex*): Self = StObject.set(x, "zIndices", js.Array(value*))
  }
}
