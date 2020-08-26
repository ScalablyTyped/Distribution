package typings.styledSystem.mod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.StandardProperties
import typings.styledSystem.styledSystemNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme[TLength] extends js.Object {
  var borderStyles: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<{}> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var borderWidths: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderWidthProperty<TLength> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var borders: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<{}> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var breakpoints: js.UndefOr[ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]] = js.native
  var buttons: js.UndefOr[
    ObjectOrArray[
      StandardProperties[(String with js.Object) | `0`, String with js.Object], 
      /* keyof any */ String
    ]
  ] = js.native
  var colorStyles: js.UndefOr[
    ObjectOrArray[
      StandardProperties[(String with js.Object) | `0`, String with js.Object], 
      /* keyof any */ String
    ]
  ] = js.native
  var colors: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var fontSizes: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontSizeProperty<number> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var fontWeights: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontWeightProperty */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var fonts: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontFamilyProperty */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var letterSpacings: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LetterSpacingProperty<TLength> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var lineHeights: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LineHeightProperty<TLength> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var mediaQueries: js.UndefOr[StringDictionary[String]] = js.native
  var radii: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderRadiusProperty<TLength> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var shadows: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BoxShadowProperty */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var sizes: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<{}> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var space: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MarginProperty<number | string> */ _, 
      /* keyof any */ String
    ]
  ] = js.native
  var textStyles: js.UndefOr[
    ObjectOrArray[
      StandardProperties[(String with js.Object) | `0`, String with js.Object], 
      /* keyof any */ String
    ]
  ] = js.native
  var zIndices: js.UndefOr[
    ObjectOrArray[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ZIndexProperty */ _, 
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
  implicit class ThemeOps[Self <: Theme[_], TLength] (val x: Self with Theme[TLength]) extends AnyVal {
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
    def setBorderStylesVarargs(value: js.Any*): Self = this.set("borderStyles", js.Array(value :_*))
    @scala.inline
    def setBorderStyles(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<{}> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("borderStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderStyles: Self = this.set("borderStyles", js.undefined)
    @scala.inline
    def setBorderWidthsVarargs(value: js.Any*): Self = this.set("borderWidths", js.Array(value :_*))
    @scala.inline
    def setBorderWidths(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderWidthProperty<TLength> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("borderWidths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidths: Self = this.set("borderWidths", js.undefined)
    @scala.inline
    def setBordersVarargs(value: js.Any*): Self = this.set("borders", js.Array(value :_*))
    @scala.inline
    def setBorders(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<{}> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("borders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorders: Self = this.set("borders", js.undefined)
    @scala.inline
    def setBreakpointsVarargs(value: (Double | String | js.Symbol)*): Self = this.set("breakpoints", js.Array(value :_*))
    @scala.inline
    def setBreakpoints(value: ObjectOrArray[Double | String | js.Symbol, /* keyof any */ String]): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakpoints: Self = this.set("breakpoints", js.undefined)
    @scala.inline
    def setButtonsVarargs(value: (StandardProperties[(String with js.Object) | `0`, String with js.Object])*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(
      value: ObjectOrArray[
          StandardProperties[(String with js.Object) | `0`, String with js.Object], 
          /* keyof any */ String
        ]
    ): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setColorStylesVarargs(value: (StandardProperties[(String with js.Object) | `0`, String with js.Object])*): Self = this.set("colorStyles", js.Array(value :_*))
    @scala.inline
    def setColorStyles(
      value: ObjectOrArray[
          StandardProperties[(String with js.Object) | `0`, String with js.Object], 
          /* keyof any */ String
        ]
    ): Self = this.set("colorStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorStyles: Self = this.set("colorStyles", js.undefined)
    @scala.inline
    def setColorsVarargs(value: js.Any*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setFontSizesVarargs(value: js.Any*): Self = this.set("fontSizes", js.Array(value :_*))
    @scala.inline
    def setFontSizes(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontSizeProperty<number> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("fontSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSizes: Self = this.set("fontSizes", js.undefined)
    @scala.inline
    def setFontWeightsVarargs(value: js.Any*): Self = this.set("fontWeights", js.Array(value :_*))
    @scala.inline
    def setFontWeights(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontWeightProperty */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("fontWeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeights: Self = this.set("fontWeights", js.undefined)
    @scala.inline
    def setFontsVarargs(value: js.Any*): Self = this.set("fonts", js.Array(value :_*))
    @scala.inline
    def setFonts(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontFamilyProperty */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("fonts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFonts: Self = this.set("fonts", js.undefined)
    @scala.inline
    def setLetterSpacingsVarargs(value: js.Any*): Self = this.set("letterSpacings", js.Array(value :_*))
    @scala.inline
    def setLetterSpacings(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LetterSpacingProperty<TLength> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("letterSpacings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetterSpacings: Self = this.set("letterSpacings", js.undefined)
    @scala.inline
    def setLineHeightsVarargs(value: js.Any*): Self = this.set("lineHeights", js.Array(value :_*))
    @scala.inline
    def setLineHeights(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LineHeightProperty<TLength> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("lineHeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeights: Self = this.set("lineHeights", js.undefined)
    @scala.inline
    def setMediaQueries(value: StringDictionary[String]): Self = this.set("mediaQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaQueries: Self = this.set("mediaQueries", js.undefined)
    @scala.inline
    def setRadiiVarargs(value: js.Any*): Self = this.set("radii", js.Array(value :_*))
    @scala.inline
    def setRadii(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderRadiusProperty<TLength> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("radii", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadii: Self = this.set("radii", js.undefined)
    @scala.inline
    def setShadowsVarargs(value: js.Any*): Self = this.set("shadows", js.Array(value :_*))
    @scala.inline
    def setShadows(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BoxShadowProperty */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("shadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadows: Self = this.set("shadows", js.undefined)
    @scala.inline
    def setSizesVarargs(value: js.Any*): Self = this.set("sizes", js.Array(value :_*))
    @scala.inline
    def setSizes(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<{}> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    @scala.inline
    def setSpaceVarargs(value: js.Any*): Self = this.set("space", js.Array(value :_*))
    @scala.inline
    def setSpace(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MarginProperty<number | string> */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    @scala.inline
    def setTextStylesVarargs(value: (StandardProperties[(String with js.Object) | `0`, String with js.Object])*): Self = this.set("textStyles", js.Array(value :_*))
    @scala.inline
    def setTextStyles(
      value: ObjectOrArray[
          StandardProperties[(String with js.Object) | `0`, String with js.Object], 
          /* keyof any */ String
        ]
    ): Self = this.set("textStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyles: Self = this.set("textStyles", js.undefined)
    @scala.inline
    def setZIndicesVarargs(value: js.Any*): Self = this.set("zIndices", js.Array(value :_*))
    @scala.inline
    def setZIndices(
      value: ObjectOrArray[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ZIndexProperty */ _, 
          /* keyof any */ String
        ]
    ): Self = this.set("zIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndices: Self = this.set("zIndices", js.undefined)
  }
  
}

