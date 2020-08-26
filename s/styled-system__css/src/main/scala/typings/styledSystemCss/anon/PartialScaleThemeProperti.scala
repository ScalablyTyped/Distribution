package typings.styledSystemCss.anon

import typings.styledSystemCss.mod.ThemeValue
import typings.styledSystemCss.mod._Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@styled-system/css.@styled-system/css.ScaleThemeProperties> */
@js.native
trait PartialScaleThemeProperti extends _Theme {
  var borderStyles: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LineStyle */ _
    ]
  ] = js.native
  var borderWidths: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderWidthProperty<{}> */ _
    ]
  ] = js.native
  var borders: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<{}> */ _
    ]
  ] = js.native
  var colors: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ _
    ]
  ] = js.native
  var fontSizes: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontSizeProperty<number> */ _
    ]
  ] = js.native
  var fontWeights: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontWeightProperty */ _
    ]
  ] = js.native
  var fonts: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontFamilyProperty */ _
    ]
  ] = js.native
  var letterSpacings: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LetterSpacingProperty<string | number> */ _
    ]
  ] = js.native
  var lineHeights: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LineHeightProperty<string> */ _
    ]
  ] = js.native
  var radii: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderRadiusProperty<{}> */ _
    ]
  ] = js.native
  var shadows: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BoxShadowProperty */ _
    ]
  ] = js.native
  var sizes: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<{}> */ _
    ]
  ] = js.native
  var space: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MarginProperty<number> */ js.Any
    ]
  ] = js.native
  var zIndices: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ZIndexProperty */ _
    ]
  ] = js.native
}

object PartialScaleThemeProperti {
  @scala.inline
  def apply(): PartialScaleThemeProperti = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScaleThemeProperti]
  }
  @scala.inline
  implicit class PartialScaleThemePropertiOps[Self <: PartialScaleThemeProperti] (val x: Self) extends AnyVal {
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
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LineStyle */ _
        ]
    ): Self = this.set("borderStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderStyles: Self = this.set("borderStyles", js.undefined)
    @scala.inline
    def setBorderWidthsVarargs(value: js.Any*): Self = this.set("borderWidths", js.Array(value :_*))
    @scala.inline
    def setBorderWidths(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderWidthProperty<{}> */ _
        ]
    ): Self = this.set("borderWidths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidths: Self = this.set("borderWidths", js.undefined)
    @scala.inline
    def setBordersVarargs(value: js.Any*): Self = this.set("borders", js.Array(value :_*))
    @scala.inline
    def setBorders(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderProperty<{}> */ _
        ]
    ): Self = this.set("borders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorders: Self = this.set("borders", js.undefined)
    @scala.inline
    def setColorsVarargs(value: js.Any*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ColorProperty */ _
        ]
    ): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setFontSizesVarargs(value: js.Any*): Self = this.set("fontSizes", js.Array(value :_*))
    @scala.inline
    def setFontSizes(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontSizeProperty<number> */ _
        ]
    ): Self = this.set("fontSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSizes: Self = this.set("fontSizes", js.undefined)
    @scala.inline
    def setFontWeightsVarargs(value: js.Any*): Self = this.set("fontWeights", js.Array(value :_*))
    @scala.inline
    def setFontWeights(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontWeightProperty */ _
        ]
    ): Self = this.set("fontWeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeights: Self = this.set("fontWeights", js.undefined)
    @scala.inline
    def setFontsVarargs(value: js.Any*): Self = this.set("fonts", js.Array(value :_*))
    @scala.inline
    def setFonts(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontFamilyProperty */ _
        ]
    ): Self = this.set("fonts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFonts: Self = this.set("fonts", js.undefined)
    @scala.inline
    def setLetterSpacingsVarargs(value: js.Any*): Self = this.set("letterSpacings", js.Array(value :_*))
    @scala.inline
    def setLetterSpacings(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LetterSpacingProperty<string | number> */ _
        ]
    ): Self = this.set("letterSpacings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetterSpacings: Self = this.set("letterSpacings", js.undefined)
    @scala.inline
    def setLineHeightsVarargs(value: js.Any*): Self = this.set("lineHeights", js.Array(value :_*))
    @scala.inline
    def setLineHeights(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LineHeightProperty<string> */ _
        ]
    ): Self = this.set("lineHeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeights: Self = this.set("lineHeights", js.undefined)
    @scala.inline
    def setRadiiVarargs(value: js.Any*): Self = this.set("radii", js.Array(value :_*))
    @scala.inline
    def setRadii(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderRadiusProperty<{}> */ _
        ]
    ): Self = this.set("radii", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadii: Self = this.set("radii", js.undefined)
    @scala.inline
    def setShadowsVarargs(value: js.Any*): Self = this.set("shadows", js.Array(value :_*))
    @scala.inline
    def setShadows(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BoxShadowProperty */ _
        ]
    ): Self = this.set("shadows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadows: Self = this.set("shadows", js.undefined)
    @scala.inline
    def setSizesVarargs(value: js.Any*): Self = this.set("sizes", js.Array(value :_*))
    @scala.inline
    def setSizes(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<{}> */ _
        ]
    ): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    @scala.inline
    def setSpaceVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MarginProperty<number> */ js.Any)*
    ): Self = this.set("space", js.Array(value :_*))
    @scala.inline
    def setSpace(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MarginProperty<number> */ js.Any
        ]
    ): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    @scala.inline
    def setZIndicesVarargs(value: js.Any*): Self = this.set("zIndices", js.Array(value :_*))
    @scala.inline
    def setZIndices(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.ZIndexProperty */ _
        ]
    ): Self = this.set("zIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndices: Self = this.set("zIndices", js.undefined)
  }
  
}

