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

trait _Theme extends js.Object

object _Theme {
  @scala.inline
  def PartialScaleThemeProperti(
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
  ): _Theme = {
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
    __obj.asInstanceOf[_Theme]
  }
  @scala.inline
  def ThemeBreakPoints(breakpoints: js.Array[Double | String]): _Theme = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Theme]
  }
}

