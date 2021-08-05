package typings.styledSystem.mod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.StandardProperties
import typings.styledSystem.styledSystemNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme[TLength] extends StObject {
  
  var borderStyles: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var borderWidths: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLength> */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var borders: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var breakpoints: js.UndefOr[ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]] = js.undefined
  
  var buttons: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]] = js.undefined
  
  var colorStyles: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]] = js.undefined
  
  var colors: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var fontSizes: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<number> */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var fontWeights: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var fonts: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var letterSpacings: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLength> */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var lineHeights: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLength> */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var mediaQueries: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var radii: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLength> */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var shadows: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var sizes: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<{}> */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var space: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Margin<number | string> */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
  
  var textStyles: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]] = js.undefined
  
  var zIndices: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ js.Any, 
      /* keyof any */ String
    ]
  ] = js.undefined
}
object Theme {
  
  inline def apply[TLength](): Theme[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Theme[TLength]]
  }
  
  extension [Self <: Theme[?], TLength](x: Self & Theme[TLength]) {
    
    inline def setBorderStyles(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "borderStyles", value.asInstanceOf[js.Any])
    
    inline def setBorderStylesUndefined: Self = StObject.set(x, "borderStyles", js.undefined)
    
    inline def setBorderStylesVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any)*
    ): Self = StObject.set(x, "borderStyles", js.Array(value :_*))
    
    inline def setBorderWidths(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLength> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "borderWidths", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthsUndefined: Self = StObject.set(x, "borderWidths", js.undefined)
    
    inline def setBorderWidthsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLength> */ js.Any)*
    ): Self = StObject.set(x, "borderWidths", js.Array(value :_*))
    
    inline def setBorders(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    inline def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    inline def setBordersVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any)*
    ): Self = StObject.set(x, "borders", js.Array(value :_*))
    
    inline def setBreakpoints(value: ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    inline def setBreakpointsVarargs(value: (Double | String | js.Symbol)*): Self = StObject.set(x, "breakpoints", js.Array(value :_*))
    
    inline def setButtons(value: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: (StandardProperties[String | `0`])*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    inline def setColorStyles(value: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]): Self = StObject.set(x, "colorStyles", value.asInstanceOf[js.Any])
    
    inline def setColorStylesUndefined: Self = StObject.set(x, "colorStyles", js.undefined)
    
    inline def setColorStylesVarargs(value: (StandardProperties[String | `0`])*): Self = StObject.set(x, "colorStyles", js.Array(value :_*))
    
    inline def setColors(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any)*
    ): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    inline def setFontSizes(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<number> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
    
    inline def setFontSizesUndefined: Self = StObject.set(x, "fontSizes", js.undefined)
    
    inline def setFontSizesVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<number> */ js.Any)*
    ): Self = StObject.set(x, "fontSizes", js.Array(value :_*))
    
    inline def setFontWeights(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "fontWeights", value.asInstanceOf[js.Any])
    
    inline def setFontWeightsUndefined: Self = StObject.set(x, "fontWeights", js.undefined)
    
    inline def setFontWeightsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ js.Any)*
    ): Self = StObject.set(x, "fontWeights", js.Array(value :_*))
    
    inline def setFonts(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
    
    inline def setFontsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ js.Any)*
    ): Self = StObject.set(x, "fonts", js.Array(value :_*))
    
    inline def setLetterSpacings(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLength> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "letterSpacings", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingsUndefined: Self = StObject.set(x, "letterSpacings", js.undefined)
    
    inline def setLetterSpacingsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLength> */ js.Any)*
    ): Self = StObject.set(x, "letterSpacings", js.Array(value :_*))
    
    inline def setLineHeights(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLength> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "lineHeights", value.asInstanceOf[js.Any])
    
    inline def setLineHeightsUndefined: Self = StObject.set(x, "lineHeights", js.undefined)
    
    inline def setLineHeightsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLength> */ js.Any)*
    ): Self = StObject.set(x, "lineHeights", js.Array(value :_*))
    
    inline def setMediaQueries(value: StringDictionary[String]): Self = StObject.set(x, "mediaQueries", value.asInstanceOf[js.Any])
    
    inline def setMediaQueriesUndefined: Self = StObject.set(x, "mediaQueries", js.undefined)
    
    inline def setRadii(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLength> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "radii", value.asInstanceOf[js.Any])
    
    inline def setRadiiUndefined: Self = StObject.set(x, "radii", js.undefined)
    
    inline def setRadiiVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLength> */ js.Any)*
    ): Self = StObject.set(x, "radii", js.Array(value :_*))
    
    inline def setShadows(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    inline def setShadowsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ js.Any)*
    ): Self = StObject.set(x, "shadows", js.Array(value :_*))
    
    inline def setSizes(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<{}> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSizesVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<{}> */ js.Any)*
    ): Self = StObject.set(x, "sizes", js.Array(value :_*))
    
    inline def setSpace(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Margin<number | string> */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    inline def setSpaceVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Margin<number | string> */ js.Any)*
    ): Self = StObject.set(x, "space", js.Array(value :_*))
    
    inline def setTextStyles(value: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]): Self = StObject.set(x, "textStyles", value.asInstanceOf[js.Any])
    
    inline def setTextStylesUndefined: Self = StObject.set(x, "textStyles", js.undefined)
    
    inline def setTextStylesVarargs(value: (StandardProperties[String | `0`])*): Self = StObject.set(x, "textStyles", js.Array(value :_*))
    
    inline def setZIndices(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ js.Any, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "zIndices", value.asInstanceOf[js.Any])
    
    inline def setZIndicesUndefined: Self = StObject.set(x, "zIndices", js.undefined)
    
    inline def setZIndicesVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ js.Any)*
    ): Self = StObject.set(x, "zIndices", js.Array(value :_*))
  }
}
