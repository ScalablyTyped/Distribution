package typings.styledSystem.mod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.StandardProperties
import typings.styledSystem.styledSystemNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Theme[TLength] extends StObject {
  
  var borderStyles: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  
  var borderWidths: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLength> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  
  var borders: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  
  var breakpoints: js.UndefOr[ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]] = js.native
  
  var buttons: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]] = js.native
  
  var colorStyles: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]] = js.native
  
  var colors: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  
  var fontSizes: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<number> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  
  var fontWeights: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  
  var fonts: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  
  var letterSpacings: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLength> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  
  var lineHeights: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLength> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  
  var mediaQueries: js.UndefOr[StringDictionary[String]] = js.native
  
  var radii: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLength> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  
  var shadows: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  
  var sizes: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<{}> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  
  var space: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Margin<number | string> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  
  var textStyles: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]] = js.native
  
  var zIndices: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ _, 
      /* keyof any */ String
    ]
  ] = js.native
}
object Theme {
  
  @scala.inline
  def apply[TLength](): Theme[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Theme[TLength]]
  }
  
  @scala.inline
  implicit class ThemeMutableBuilder[Self <: Theme[_], TLength] (val x: Self with Theme[TLength]) extends AnyVal {
    
    @scala.inline
    def setBorderStyles(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ _, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "borderStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStylesUndefined: Self = StObject.set(x, "borderStyles", js.undefined)
    
    @scala.inline
    def setBorderStylesVarargs(value: js.Any*): Self = StObject.set(x, "borderStyles", js.Array(value :_*))
    
    @scala.inline
    def setBorderWidths(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<TLength> */ _, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "borderWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthsUndefined: Self = StObject.set(x, "borderWidths", js.undefined)
    
    @scala.inline
    def setBorderWidthsVarargs(value: js.Any*): Self = StObject.set(x, "borderWidths", js.Array(value :_*))
    
    @scala.inline
    def setBorders(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ _, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    @scala.inline
    def setBordersVarargs(value: js.Any*): Self = StObject.set(x, "borders", js.Array(value :_*))
    
    @scala.inline
    def setBreakpoints(value: ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    @scala.inline
    def setBreakpointsVarargs(value: (Double | String | js.Symbol)*): Self = StObject.set(x, "breakpoints", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: (StandardProperties[String | `0`])*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setColorStyles(value: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]): Self = StObject.set(x, "colorStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorStylesUndefined: Self = StObject.set(x, "colorStyles", js.undefined)
    
    @scala.inline
    def setColorStylesVarargs(value: (StandardProperties[String | `0`])*): Self = StObject.set(x, "colorStyles", js.Array(value :_*))
    
    @scala.inline
    def setColors(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ _, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: js.Any*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setFontSizes(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<number> */ _, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizesUndefined: Self = StObject.set(x, "fontSizes", js.undefined)
    
    @scala.inline
    def setFontSizesVarargs(value: js.Any*): Self = StObject.set(x, "fontSizes", js.Array(value :_*))
    
    @scala.inline
    def setFontWeights(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ _, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "fontWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightsUndefined: Self = StObject.set(x, "fontWeights", js.undefined)
    
    @scala.inline
    def setFontWeightsVarargs(value: js.Any*): Self = StObject.set(x, "fontWeights", js.Array(value :_*))
    
    @scala.inline
    def setFonts(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ _, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
    
    @scala.inline
    def setFontsVarargs(value: js.Any*): Self = StObject.set(x, "fonts", js.Array(value :_*))
    
    @scala.inline
    def setLetterSpacings(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<TLength> */ _, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "letterSpacings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingsUndefined: Self = StObject.set(x, "letterSpacings", js.undefined)
    
    @scala.inline
    def setLetterSpacingsVarargs(value: js.Any*): Self = StObject.set(x, "letterSpacings", js.Array(value :_*))
    
    @scala.inline
    def setLineHeights(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<TLength> */ _, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "lineHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightsUndefined: Self = StObject.set(x, "lineHeights", js.undefined)
    
    @scala.inline
    def setLineHeightsVarargs(value: js.Any*): Self = StObject.set(x, "lineHeights", js.Array(value :_*))
    
    @scala.inline
    def setMediaQueries(value: StringDictionary[String]): Self = StObject.set(x, "mediaQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaQueriesUndefined: Self = StObject.set(x, "mediaQueries", js.undefined)
    
    @scala.inline
    def setRadii(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLength> */ _, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "radii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiiUndefined: Self = StObject.set(x, "radii", js.undefined)
    
    @scala.inline
    def setRadiiVarargs(value: js.Any*): Self = StObject.set(x, "radii", js.Array(value :_*))
    
    @scala.inline
    def setShadows(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ _, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    @scala.inline
    def setShadowsVarargs(value: js.Any*): Self = StObject.set(x, "shadows", js.Array(value :_*))
    
    @scala.inline
    def setSizes(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<{}> */ _, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    @scala.inline
    def setSizesVarargs(value: js.Any*): Self = StObject.set(x, "sizes", js.Array(value :_*))
    
    @scala.inline
    def setSpace(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Margin<number | string> */ _, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    @scala.inline
    def setSpaceVarargs(value: js.Any*): Self = StObject.set(x, "space", js.Array(value :_*))
    
    @scala.inline
    def setTextStyles(value: ObjectOrArray[StandardProperties[String | `0`], /* keyof any */ String]): Self = StObject.set(x, "textStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStylesUndefined: Self = StObject.set(x, "textStyles", js.undefined)
    
    @scala.inline
    def setTextStylesVarargs(value: (StandardProperties[String | `0`])*): Self = StObject.set(x, "textStyles", js.Array(value :_*))
    
    @scala.inline
    def setZIndices(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ _, 
          /* keyof any */ String
        ]
    ): Self = StObject.set(x, "zIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndicesUndefined: Self = StObject.set(x, "zIndices", js.undefined)
    
    @scala.inline
    def setZIndicesVarargs(value: js.Any*): Self = StObject.set(x, "zIndices", js.Array(value :_*))
  }
}
