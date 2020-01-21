package typings.styledSystemCss.mod

import typings.csstype.mod.BorderProperty
import typings.csstype.mod.BorderRadiusProperty
import typings.csstype.mod.BorderWidthProperty
import typings.csstype.mod.BoxShadowProperty
import typings.csstype.mod.ColorProperty
import typings.csstype.mod.FontFamilyProperty
import typings.csstype.mod.FontSizeProperty
import typings.csstype.mod.FontWeightProperty
import typings.csstype.mod.HeightProperty
import typings.csstype.mod.LetterSpacingProperty
import typings.csstype.mod.LineHeightProperty
import typings.csstype.mod.LineStyle
import typings.csstype.mod.MarginProperty
import typings.csstype.mod.PaddingProperty
import typings.csstype.mod.WidthProperty
import typings.csstype.mod.ZIndexProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleThemeProperties extends js.Object {
  /**
    * | Prop        | CSS Property | Theme Field  |
    * | :---------- | :----------- | :----------- |
    * | borderStyle | border-style | borderStyles |
    *
    * @see https://styled-system.com/table#border
    */
  var borderStyles: js.UndefOr[ThemeValue[LineStyle]] = js.undefined
  /**
    * | Prop        | CSS Property | Theme Field  |
    * | :---------- | :----------- | :----------- |
    * | borderWidth | border-width | borderWidths |
    *
    * @see https://styled-system.com/table#border
    */
  var borderWidths: js.UndefOr[ThemeValue[BorderWidthProperty[js.Object]]] = js.undefined
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
  var borders: js.UndefOr[ThemeValue[BorderProperty[js.Object]]] = js.undefined
  /**
    * | Prop                | CSS Property     | Theme Field |
    * | :------------------ | :--------------- | :---------- |
    * | color               | color            | colors      |
    * | bg, backgroundColor | background-color | colors      |
    *
    * @see https://styled-system.com/table#color
    */
  var colors: js.UndefOr[ThemeValue[ColorProperty]] = js.undefined
  /**
    * | Prop     | CSS Property | Theme Field |
    * | :------- | :----------- | :---------- |
    * | fontSize | font-size    | fontSizes   |
    *
    * @see https://styled-system.com/table#typography
    */
  var fontSizes: js.UndefOr[ThemeValue[FontSizeProperty[Double]]] = js.undefined
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | fontWeight | font-weight  | fontWeights |
    *
    * @see https://styled-system.com/table#typography
    */
  var fontWeights: js.UndefOr[ThemeValue[FontWeightProperty]] = js.undefined
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | fontFamily | font-family  | fonts       |
    *
    * @see https://styled-system.com/table#typography
    */
  var fonts: js.UndefOr[ThemeValue[FontFamilyProperty]] = js.undefined
  /**
    * | Prop          | CSS Property   | Theme Field    |
    * | :------------ | :------------- | :------------- |
    * | letterSpacing | letter-spacing | letterSpacings |
    *
    * @see https://styled-system.com/table#typography
    */
  var letterSpacings: js.UndefOr[ThemeValue[LetterSpacingProperty[String | Double]]] = js.undefined
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | lineHeight | line-height  | lineHeights |
    *
    * @see https://styled-system.com/table#typography
    */
  var lineHeights: js.UndefOr[ThemeValue[LineHeightProperty[String]]] = js.undefined
  /**
    * | Prop         | CSS Property  | Theme Field |
    * | :----------- | :------------ | :---------- |
    * | borderRadius | border-radius | radii       |
    *
    * @see https://styled-system.com/table#border
    */
  var radii: js.UndefOr[ThemeValue[BorderRadiusProperty[js.Object]]] = js.undefined
  /**
    * | Prop       | CSS Property | Theme Field |
    * | :--------- | :----------- | :---------- |
    * | textShadow | text-shadow  | shadows     |
    * | boxShadow  | box-shadow   | shadows     |
    *
    * @see https://styled-system.com/table#shadow
    */
  var shadows: js.UndefOr[ThemeValue[BoxShadowProperty]] = js.undefined
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
  var sizes: js.UndefOr[ThemeValue[HeightProperty[js.Object] | WidthProperty[js.Object]]] = js.undefined
  /**
    * | Prop              | CSS Property                   | Theme Field |
    * | :---------------- | :----------------------------- | :---------- |
    * | m, margin	       | margin                         | space       |
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
  var space: js.UndefOr[ThemeValue[MarginProperty[Double] with PaddingProperty[Double]]] = js.undefined
  /**
    * | Prop    | CSS Property | Theme Field |
    * | :------ | :----------- | :---------- |
    * | zIndex  | z-index      | zIndices    |
    *
    * @see https://styled-system.com/table#position
    */
  var zIndices: js.UndefOr[ThemeValue[ZIndexProperty]] = js.undefined
}

object ScaleThemeProperties {
  @scala.inline
  def apply(
    borderStyles: ThemeValue[LineStyle] = null,
    borderWidths: ThemeValue[BorderWidthProperty[js.Object]] = null,
    borders: ThemeValue[BorderProperty[js.Object]] = null,
    colors: ThemeValue[ColorProperty] = null,
    fontSizes: ThemeValue[FontSizeProperty[Double]] = null,
    fontWeights: ThemeValue[FontWeightProperty] = null,
    fonts: ThemeValue[FontFamilyProperty] = null,
    letterSpacings: ThemeValue[LetterSpacingProperty[String | Double]] = null,
    lineHeights: ThemeValue[LineHeightProperty[String]] = null,
    radii: ThemeValue[BorderRadiusProperty[js.Object]] = null,
    shadows: ThemeValue[BoxShadowProperty] = null,
    sizes: ThemeValue[HeightProperty[js.Object] | WidthProperty[js.Object]] = null,
    space: ThemeValue[MarginProperty[Double] with PaddingProperty[Double]] = null,
    zIndices: ThemeValue[ZIndexProperty] = null
  ): ScaleThemeProperties = {
    val __obj = js.Dynamic.literal()
    if (borderStyles != null) __obj.updateDynamic("borderStyles")(borderStyles.asInstanceOf[js.Any])
    if (borderWidths != null) __obj.updateDynamic("borderWidths")(borderWidths.asInstanceOf[js.Any])
    if (borders != null) __obj.updateDynamic("borders")(borders.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (fontSizes != null) __obj.updateDynamic("fontSizes")(fontSizes.asInstanceOf[js.Any])
    if (fontWeights != null) __obj.updateDynamic("fontWeights")(fontWeights.asInstanceOf[js.Any])
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (letterSpacings != null) __obj.updateDynamic("letterSpacings")(letterSpacings.asInstanceOf[js.Any])
    if (lineHeights != null) __obj.updateDynamic("lineHeights")(lineHeights.asInstanceOf[js.Any])
    if (radii != null) __obj.updateDynamic("radii")(radii.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (zIndices != null) __obj.updateDynamic("zIndices")(zIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleThemeProperties]
  }
}

