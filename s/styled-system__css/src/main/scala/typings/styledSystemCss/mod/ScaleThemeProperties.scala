package typings.styledSystemCss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleThemeProperties extends StObject {
  
  /**
    * | Prop        | CSS Property | Theme Field  |
    * | :---------- | :----------- | :----------- |
    * | borderStyle | border-style | borderStyles |
    *
    * @see https://styled-system.com/table#border
    */
  var borderStyles: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ js.Any
    ]
  ] = js.undefined
  
  /**
    * | Prop        | CSS Property | Theme Field  |
    * | :---------- | :----------- | :----------- |
    * | borderWidth | border-width | borderWidths |
    *
    * @see https://styled-system.com/table#border
    */
  var borderWidths: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<{}> */ js.Any
    ]
  ] = js.undefined
  
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
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any
    ]
  ] = js.undefined
  
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
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
    ]
  ] = js.undefined
  
  /**
    * | Prop     | CSS Property | Theme Field |
    * | :------- | :----------- | :---------- |
    * | fontSize | font-size    | fontSizes   |
    *
    * @see https://styled-system.com/table#typography
    */
  var fontSizes: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<number> */ js.Any
    ]
  ] = js.undefined
  
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | fontWeight | font-weight  | fontWeights |
    *
    * @see https://styled-system.com/table#typography
    */
  var fontWeights: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ js.Any
    ]
  ] = js.undefined
  
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | fontFamily | font-family  | fonts       |
    *
    * @see https://styled-system.com/table#typography
    */
  var fonts: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ js.Any
    ]
  ] = js.undefined
  
  /**
    * | Prop          | CSS Property   | Theme Field    |
    * | :------------ | :------------- | :------------- |
    * | letterSpacing | letter-spacing | letterSpacings |
    *
    * @see https://styled-system.com/table#typography
    */
  var letterSpacings: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<string | number> */ js.Any
    ]
  ] = js.undefined
  
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | lineHeight | line-height  | lineHeights |
    *
    * @see https://styled-system.com/table#typography
    */
  var lineHeights: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<string> */ js.Any
    ]
  ] = js.undefined
  
  /**
    * | Prop         | CSS Property  | Theme Field |
    * | :----------- | :------------ | :---------- |
    * | borderRadius | border-radius | radii       |
    *
    * @see https://styled-system.com/table#border
    */
  var radii: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<{}> */ js.Any
    ]
  ] = js.undefined
  
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
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ js.Any
    ]
  ] = js.undefined
  
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
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<{}> */ js.Any
    ]
  ] = js.undefined
  
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
  ] = js.undefined
  
  /**
    * | Prop    | CSS Property | Theme Field |
    * | :------ | :----------- | :---------- |
    * | zIndex  | z-index      | zIndices    |
    *
    * @see https://styled-system.com/table#position
    */
  var zIndices: js.UndefOr[
    ThemeValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ js.Any
    ]
  ] = js.undefined
}
object ScaleThemeProperties {
  
  @scala.inline
  def apply(): ScaleThemeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleThemeProperties]
  }
  
  @scala.inline
  implicit class ScaleThemePropertiesMutableBuilder[Self <: ScaleThemeProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderStyles(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ js.Any
        ]
    ): Self = StObject.set(x, "borderStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStylesUndefined: Self = StObject.set(x, "borderStyles", js.undefined)
    
    @scala.inline
    def setBorderStylesVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderStyle */ js.Any)*
    ): Self = StObject.set(x, "borderStyles", js.Array(value :_*))
    
    @scala.inline
    def setBorderWidths(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<{}> */ js.Any
        ]
    ): Self = StObject.set(x, "borderWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthsUndefined: Self = StObject.set(x, "borderWidths", js.undefined)
    
    @scala.inline
    def setBorderWidthsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderWidth<{}> */ js.Any)*
    ): Self = StObject.set(x, "borderWidths", js.Array(value :_*))
    
    @scala.inline
    def setBorders(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any
        ]
    ): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    @scala.inline
    def setBordersVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Border<{}> */ js.Any)*
    ): Self = StObject.set(x, "borders", js.Array(value :_*))
    
    @scala.inline
    def setColors(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any
        ]
    ): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Color */ js.Any)*
    ): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setFontSizes(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<number> */ js.Any
        ]
    ): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizesUndefined: Self = StObject.set(x, "fontSizes", js.undefined)
    
    @scala.inline
    def setFontSizesVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontSize<number> */ js.Any)*
    ): Self = StObject.set(x, "fontSizes", js.Array(value :_*))
    
    @scala.inline
    def setFontWeights(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ js.Any
        ]
    ): Self = StObject.set(x, "fontWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightsUndefined: Self = StObject.set(x, "fontWeights", js.undefined)
    
    @scala.inline
    def setFontWeightsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontWeight */ js.Any)*
    ): Self = StObject.set(x, "fontWeights", js.Array(value :_*))
    
    @scala.inline
    def setFonts(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ js.Any
        ]
    ): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
    
    @scala.inline
    def setFontsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FontFamily */ js.Any)*
    ): Self = StObject.set(x, "fonts", js.Array(value :_*))
    
    @scala.inline
    def setLetterSpacings(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<string | number> */ js.Any
        ]
    ): Self = StObject.set(x, "letterSpacings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingsUndefined: Self = StObject.set(x, "letterSpacings", js.undefined)
    
    @scala.inline
    def setLetterSpacingsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LetterSpacing<string | number> */ js.Any)*
    ): Self = StObject.set(x, "letterSpacings", js.Array(value :_*))
    
    @scala.inline
    def setLineHeights(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<string> */ js.Any
        ]
    ): Self = StObject.set(x, "lineHeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightsUndefined: Self = StObject.set(x, "lineHeights", js.undefined)
    
    @scala.inline
    def setLineHeightsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.LineHeight<string> */ js.Any)*
    ): Self = StObject.set(x, "lineHeights", js.Array(value :_*))
    
    @scala.inline
    def setRadii(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<{}> */ js.Any
        ]
    ): Self = StObject.set(x, "radii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiiUndefined: Self = StObject.set(x, "radii", js.undefined)
    
    @scala.inline
    def setRadiiVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<{}> */ js.Any)*
    ): Self = StObject.set(x, "radii", js.Array(value :_*))
    
    @scala.inline
    def setShadows(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ js.Any
        ]
    ): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    @scala.inline
    def setShadowsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ js.Any)*
    ): Self = StObject.set(x, "shadows", js.Array(value :_*))
    
    @scala.inline
    def setSizes(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<{}> */ js.Any
        ]
    ): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    @scala.inline
    def setSizesVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<{}> */ js.Any)*
    ): Self = StObject.set(x, "sizes", js.Array(value :_*))
    
    @scala.inline
    def setSpace(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Margin<number> */ js.Any
        ]
    ): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    @scala.inline
    def setSpaceVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Margin<number> */ js.Any)*
    ): Self = StObject.set(x, "space", js.Array(value :_*))
    
    @scala.inline
    def setZIndices(
      value: ThemeValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ js.Any
        ]
    ): Self = StObject.set(x, "zIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndicesUndefined: Self = StObject.set(x, "zIndices", js.undefined)
    
    @scala.inline
    def setZIndicesVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ js.Any)*
    ): Self = StObject.set(x, "zIndices", js.Array(value :_*))
  }
}
