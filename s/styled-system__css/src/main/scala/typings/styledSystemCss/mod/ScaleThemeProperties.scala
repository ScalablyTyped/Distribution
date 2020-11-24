package typings.styledSystemCss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleThemeProperties extends js.Object {
  
  /**
    * | Prop        | CSS Property | Theme Field  |
    * | :---------- | :----------- | :----------- |
    * | borderStyle | border-style | borderStyles |
    *
    * @see https://styled-system.com/table#border
    */
  var borderStyles: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ _
    ]
  ] = js.native
  
  /**
    * | Prop        | CSS Property | Theme Field  |
    * | :---------- | :----------- | :----------- |
    * | borderWidth | border-width | borderWidths |
    *
    * @see https://styled-system.com/table#border
    */
  var borderWidths: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<{}> */ _
    ]
  ] = js.native
  
  /**
    * | Prop         | CSS Property               | Theme Field |
    * | :----------- | :------------------------- | :---------- |
    * | border       | border                     | borders     |
    * | borderTop    | border-top                 | borders     |
    * | borderRight  | border-right               | borders     |
    * | borderBottom | border-bottom              | borders     |
    * | borderLeft   | border-left                | borders     |
    * | borderX      | border-left & border-right | borders     |
    * | borderY      | border-top & border-bottom | borders     |
    *
    * @see https://styled-system.com/table#border
    */
  var borders: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ _
    ]
  ] = js.native
  
  /**
    * | Prop                | CSS Property     | Theme Field |
    * | :------------------ | :--------------- | :---------- |
    * | color               | color            | colors      |
    * | bg, backgroundColor | background-color | colors      |
    *
    * @see https://styled-system.com/table#color
    */
  var colors: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ _
    ]
  ] = js.native
  
  /**
    * | Prop     | CSS Property | Theme Field |
    * | :------- | :----------- | :---------- |
    * | fontSize | font-size    | fontSizes   |
    *
    * @see https://styled-system.com/table#typography
    */
  var fontSizes: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<number> */ _
    ]
  ] = js.native
  
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | fontWeight | font-weight  | fontWeights |
    *
    * @see https://styled-system.com/table#typography
    */
  var fontWeights: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ _
    ]
  ] = js.native
  
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | fontFamily | font-family  | fonts       |
    *
    * @see https://styled-system.com/table#typography
    */
  var fonts: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ _
    ]
  ] = js.native
  
  /**
    * | Prop          | CSS Property   | Theme Field    |
    * | :------------ | :------------- | :------------- |
    * | letterSpacing | letter-spacing | letterSpacings |
    *
    * @see https://styled-system.com/table#typography
    */
  var letterSpacings: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<string | number> */ _
    ]
  ] = js.native
  
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | lineHeight | line-height  | lineHeights |
    *
    * @see https://styled-system.com/table#typography
    */
  var lineHeights: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<string> */ _
    ]
  ] = js.native
  
  /**
    * | Prop         | CSS Property  | Theme Field |
    * | :----------- | :------------ | :---------- |
    * | borderRadius | border-radius | radii       |
    *
    * @see https://styled-system.com/table#border
    */
  var radii: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<{}> */ _
    ]
  ] = js.native
  
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | textShadow | text-shadow  | shadows     |
    * | boxShadow  | box-shadow   | shadows     |
    *
    * @see https://styled-system.com/table#shadow
    */
  var shadows: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ _
    ]
  ] = js.native
  
  /**
    * | Prop      | CSS Property | Theme Field |
    * | :-------- | :----------- | :---------- |
    * | width     | width        | sizes       |
    * | height    | height       | sizes       |
    * | minWidth  | min-width    | sizes       |
    * | maxWidth  | max-width    | sizes       |
    * | minHeight | min-height   | sizes       |
    * | maxHeight | max-height   | sizes       |
    * | size      | width height | sizes       |
    *
    * @see https://styled-system.com/table#layout
    */
  var sizes: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<{}> */ _
    ]
  ] = js.native
  
  /**
    * | Prop              | CSS Property                   | Theme Field |
    * | :---------------- | :----------------------------- | :---------- |
    * | m, margin           | margin                         | space       |
    * | mt, marginTop     | margin-top                     | space       |
    * | mr, marginRight   | margin-right                   | space       |
    * | mb, marginBottom  | margin-bottom                  | space       |
    * | ml, marginLeft    | margin-left                    | space       |
    * | mx                | margin-left and margin-right   | space       |
    * | my                | margin-top and margin-bottom   | space       |
    * | p, padding        | padding                        | space       |
    * | pt, paddingTop    | padding-top                    | space       |
    * | pr, paddingRight  | padding-right                  | space       |
    * | pb, paddingBottom | padding-bottom                 | space       |
    * | pl, paddingLeft   | padding-left                   | space       |
    * | px                | padding-left and padding-right | space       |
    * | py                | padding-top and padding-bottom | space       |
    *
    * @see https://styled-system.com/table#space
    */
  var space: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Margin<number> */ js.Any
    ]
  ] = js.native
  
  /**
    * | Prop    | CSS Property | Theme Field |
    * | :------ | :----------- | :---------- |
    * | zIndex  | z-index      | zIndices    |
    *
    * @see https://styled-system.com/table#position
    */
  var zIndices: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ _
    ]
  ] = js.native
}
object ScaleThemeProperties {
  
  @scala.inline
  def apply(): ScaleThemeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleThemeProperties]
  }
  
  @scala.inline
  implicit class ScaleThemePropertiesOps[Self <: ScaleThemeProperties] (val x: Self) extends AnyVal {
    
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
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ _
        ]
    ): Self = this.set("borderStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderStyles: Self = this.set("borderStyles", js.undefined)
    
    @scala.inline
    def setBorderWidthsVarargs(value: js.Any*): Self = this.set("borderWidths", js.Array(value :_*))
    
    @scala.inline
    def setBorderWidths(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<{}> */ _
        ]
    ): Self = this.set("borderWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidths: Self = this.set("borderWidths", js.undefined)
    
    @scala.inline
    def setBordersVarargs(value: js.Any*): Self = this.set("borders", js.Array(value :_*))
    
    @scala.inline
    def setBorders(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ _
        ]
    ): Self = this.set("borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorders: Self = this.set("borders", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: js.Any*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ _
        ]
    ): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setFontSizesVarargs(value: js.Any*): Self = this.set("fontSizes", js.Array(value :_*))
    
    @scala.inline
    def setFontSizes(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<number> */ _
        ]
    ): Self = this.set("fontSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSizes: Self = this.set("fontSizes", js.undefined)
    
    @scala.inline
    def setFontWeightsVarargs(value: js.Any*): Self = this.set("fontWeights", js.Array(value :_*))
    
    @scala.inline
    def setFontWeights(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ _
        ]
    ): Self = this.set("fontWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeights: Self = this.set("fontWeights", js.undefined)
    
    @scala.inline
    def setFontsVarargs(value: js.Any*): Self = this.set("fonts", js.Array(value :_*))
    
    @scala.inline
    def setFonts(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ _
        ]
    ): Self = this.set("fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFonts: Self = this.set("fonts", js.undefined)
    
    @scala.inline
    def setLetterSpacingsVarargs(value: js.Any*): Self = this.set("letterSpacings", js.Array(value :_*))
    
    @scala.inline
    def setLetterSpacings(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<string | number> */ _
        ]
    ): Self = this.set("letterSpacings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacings: Self = this.set("letterSpacings", js.undefined)
    
    @scala.inline
    def setLineHeightsVarargs(value: js.Any*): Self = this.set("lineHeights", js.Array(value :_*))
    
    @scala.inline
    def setLineHeights(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<string> */ _
        ]
    ): Self = this.set("lineHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeights: Self = this.set("lineHeights", js.undefined)
    
    @scala.inline
    def setRadiiVarargs(value: js.Any*): Self = this.set("radii", js.Array(value :_*))
    
    @scala.inline
    def setRadii(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<{}> */ _
        ]
    ): Self = this.set("radii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadii: Self = this.set("radii", js.undefined)
    
    @scala.inline
    def setShadowsVarargs(value: js.Any*): Self = this.set("shadows", js.Array(value :_*))
    
    @scala.inline
    def setShadows(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ _
        ]
    ): Self = this.set("shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadows: Self = this.set("shadows", js.undefined)
    
    @scala.inline
    def setSizesVarargs(value: js.Any*): Self = this.set("sizes", js.Array(value :_*))
    
    @scala.inline
    def setSizes(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<{}> */ _
        ]
    ): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    
    @scala.inline
    def setSpaceVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Margin<number> */ js.Any)*
    ): Self = this.set("space", js.Array(value :_*))
    
    @scala.inline
    def setSpace(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Margin<number> */ js.Any
        ]
    ): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    
    @scala.inline
    def setZIndicesVarargs(value: js.Any*): Self = this.set("zIndices", js.Array(value :_*))
    
    @scala.inline
    def setZIndices(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ _
        ]
    ): Self = this.set("zIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndices: Self = this.set("zIndices", js.undefined)
  }
}
