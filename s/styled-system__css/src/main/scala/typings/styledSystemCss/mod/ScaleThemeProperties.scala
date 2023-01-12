package typings.styledSystemCss.mod

import typings.csstype.mod.Property.Border
import typings.csstype.mod.Property.BorderRadius
import typings.csstype.mod.Property.BorderStyle
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
import typings.csstype.mod.Property.Padding
import typings.csstype.mod.Property.Width
import typings.csstype.mod.Property.ZIndex
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
  var borderStyles: js.UndefOr[ThemeValue[BorderStyle]] = js.undefined
  
  /**
    * | Prop        | CSS Property | Theme Field  |
    * | :---------- | :----------- | :----------- |
    * | borderWidth | border-width | borderWidths |
    *
    * @see https://styled-system.com/table#border
    */
  var borderWidths: js.UndefOr[ThemeValue[BorderWidth[js.Object]]] = js.undefined
  
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
  var borders: js.UndefOr[ThemeValue[Border[js.Object]]] = js.undefined
  
  /**
    * | Prop                | CSS Property     | Theme Field |
    * | :------------------ | :--------------- | :---------- |
    * | color               | color            | colors      |
    * | bg, backgroundColor | background-color | colors      |
    *
    * @see https://styled-system.com/table#color
    */
  var colors: js.UndefOr[ThemeValue[Color]] = js.undefined
  
  /**
    * | Prop     | CSS Property | Theme Field |
    * | :------- | :----------- | :---------- |
    * | fontSize | font-size    | fontSizes   |
    *
    * @see https://styled-system.com/table#typography
    */
  var fontSizes: js.UndefOr[ThemeValue[FontSize[Double]]] = js.undefined
  
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | fontWeight | font-weight  | fontWeights |
    *
    * @see https://styled-system.com/table#typography
    */
  var fontWeights: js.UndefOr[ThemeValue[FontWeight]] = js.undefined
  
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | fontFamily | font-family  | fonts       |
    *
    * @see https://styled-system.com/table#typography
    */
  var fonts: js.UndefOr[ThemeValue[FontFamily]] = js.undefined
  
  /**
    * | Prop          | CSS Property   | Theme Field    |
    * | :------------ | :------------- | :------------- |
    * | letterSpacing | letter-spacing | letterSpacings |
    *
    * @see https://styled-system.com/table#typography
    */
  var letterSpacings: js.UndefOr[ThemeValue[LetterSpacing[String | Double]]] = js.undefined
  
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | lineHeight | line-height  | lineHeights |
    *
    * @see https://styled-system.com/table#typography
    */
  var lineHeights: js.UndefOr[ThemeValue[LineHeight[String]]] = js.undefined
  
  /**
    * | Prop         | CSS Property  | Theme Field |
    * | :----------- | :------------ | :---------- |
    * | borderRadius | border-radius | radii       |
    *
    * @see https://styled-system.com/table#border
    */
  var radii: js.UndefOr[ThemeValue[BorderRadius[js.Object]]] = js.undefined
  
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | textShadow | text-shadow  | shadows     |
    * | boxShadow  | box-shadow   | shadows     |
    *
    * @see https://styled-system.com/table#shadow
    */
  var shadows: js.UndefOr[ThemeValue[BoxShadow]] = js.undefined
  
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
  var sizes: js.UndefOr[ThemeValue[Height[js.Object] | Width[js.Object]]] = js.undefined
  
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
  var space: js.UndefOr[ThemeValue[Margin[Double] & Padding[Double]]] = js.undefined
  
  /**
    * | Prop    | CSS Property | Theme Field |
    * | :------ | :----------- | :---------- |
    * | zIndex  | z-index      | zIndices    |
    *
    * @see https://styled-system.com/table#position
    */
  var zIndices: js.UndefOr[ThemeValue[ZIndex]] = js.undefined
}
object ScaleThemeProperties {
  
  inline def apply(): ScaleThemeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleThemeProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleThemeProperties] (val x: Self) extends AnyVal {
    
    inline def setBorderStyles(value: ThemeValue[BorderStyle]): Self = StObject.set(x, "borderStyles", value.asInstanceOf[js.Any])
    
    inline def setBorderStylesUndefined: Self = StObject.set(x, "borderStyles", js.undefined)
    
    inline def setBorderStylesVarargs(value: BorderStyle*): Self = StObject.set(x, "borderStyles", js.Array(value*))
    
    inline def setBorderWidths(value: ThemeValue[BorderWidth[js.Object]]): Self = StObject.set(x, "borderWidths", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthsUndefined: Self = StObject.set(x, "borderWidths", js.undefined)
    
    inline def setBorderWidthsVarargs(value: BorderWidth[js.Object]*): Self = StObject.set(x, "borderWidths", js.Array(value*))
    
    inline def setBorders(value: ThemeValue[Border[js.Object]]): Self = StObject.set(x, "borders", value.asInstanceOf[js.Any])
    
    inline def setBordersUndefined: Self = StObject.set(x, "borders", js.undefined)
    
    inline def setBordersVarargs(value: Border[js.Object]*): Self = StObject.set(x, "borders", js.Array(value*))
    
    inline def setColors(value: ThemeValue[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setFontSizes(value: ThemeValue[FontSize[Double]]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
    
    inline def setFontSizesUndefined: Self = StObject.set(x, "fontSizes", js.undefined)
    
    inline def setFontSizesVarargs(value: FontSize[Double]*): Self = StObject.set(x, "fontSizes", js.Array(value*))
    
    inline def setFontWeights(value: ThemeValue[FontWeight]): Self = StObject.set(x, "fontWeights", value.asInstanceOf[js.Any])
    
    inline def setFontWeightsUndefined: Self = StObject.set(x, "fontWeights", js.undefined)
    
    inline def setFontWeightsVarargs(value: FontWeight*): Self = StObject.set(x, "fontWeights", js.Array(value*))
    
    inline def setFonts(value: ThemeValue[FontFamily]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
    
    inline def setFontsVarargs(value: FontFamily*): Self = StObject.set(x, "fonts", js.Array(value*))
    
    inline def setLetterSpacings(value: ThemeValue[LetterSpacing[String | Double]]): Self = StObject.set(x, "letterSpacings", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingsUndefined: Self = StObject.set(x, "letterSpacings", js.undefined)
    
    inline def setLetterSpacingsVarargs(value: (LetterSpacing[String | Double])*): Self = StObject.set(x, "letterSpacings", js.Array(value*))
    
    inline def setLineHeights(value: ThemeValue[LineHeight[String]]): Self = StObject.set(x, "lineHeights", value.asInstanceOf[js.Any])
    
    inline def setLineHeightsUndefined: Self = StObject.set(x, "lineHeights", js.undefined)
    
    inline def setLineHeightsVarargs(value: LineHeight[String]*): Self = StObject.set(x, "lineHeights", js.Array(value*))
    
    inline def setRadii(value: ThemeValue[BorderRadius[js.Object]]): Self = StObject.set(x, "radii", value.asInstanceOf[js.Any])
    
    inline def setRadiiUndefined: Self = StObject.set(x, "radii", js.undefined)
    
    inline def setRadiiVarargs(value: BorderRadius[js.Object]*): Self = StObject.set(x, "radii", js.Array(value*))
    
    inline def setShadows(value: ThemeValue[BoxShadow]): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    inline def setShadowsVarargs(value: BoxShadow*): Self = StObject.set(x, "shadows", js.Array(value*))
    
    inline def setSizes(value: ThemeValue[Height[js.Object] | Width[js.Object]]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSizesVarargs(value: (Height[js.Object] | Width[js.Object])*): Self = StObject.set(x, "sizes", js.Array(value*))
    
    inline def setSpace(value: ThemeValue[Margin[Double] & Padding[Double]]): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    inline def setSpaceVarargs(value: (Margin[Double] & Padding[Double])*): Self = StObject.set(x, "space", js.Array(value*))
    
    inline def setZIndices(value: ThemeValue[ZIndex]): Self = StObject.set(x, "zIndices", value.asInstanceOf[js.Any])
    
    inline def setZIndicesUndefined: Self = StObject.set(x, "zIndices", js.undefined)
    
    inline def setZIndicesVarargs(value: ZIndex*): Self = StObject.set(x, "zIndices", js.Array(value*))
  }
}
