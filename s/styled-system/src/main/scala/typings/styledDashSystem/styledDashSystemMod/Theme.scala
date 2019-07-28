package typings.styledDashSystem.styledDashSystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.csstypeMod.BorderProperty
import typings.csstype.csstypeMod.BorderRadiusProperty
import typings.csstype.csstypeMod.BorderWidthProperty
import typings.csstype.csstypeMod.BoxShadowProperty
import typings.csstype.csstypeMod.ColorProperty
import typings.csstype.csstypeMod.FontFamilyProperty
import typings.csstype.csstypeMod.FontSizeProperty
import typings.csstype.csstypeMod.FontWeightProperty
import typings.csstype.csstypeMod.HeightProperty
import typings.csstype.csstypeMod.LetterSpacingProperty
import typings.csstype.csstypeMod.LineHeightProperty
import typings.csstype.csstypeMod.StandardProperties
import typings.csstype.csstypeMod.WidthProperty
import typings.csstype.csstypeMod.ZIndexProperty
import typings.styledDashSystem.styledDashSystemNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  var borderStyles: js.UndefOr[ObjectOrArray[BorderProperty[js.Object]]] = js.undefined
  var borderWidths: js.UndefOr[ObjectOrArray[BorderWidthProperty[js.Object]]] = js.undefined
  var borders: js.UndefOr[ObjectOrArray[BorderProperty[js.Object]]] = js.undefined
  var breakpoints: js.UndefOr[(js.Array[Double | String]) | js.Object] = js.undefined
  var buttons: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`]]] = js.undefined
  var colorStyles: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`]]] = js.undefined
  var colors: js.UndefOr[ObjectOrArray[ColorProperty]] = js.undefined
  var fontSizes: js.UndefOr[ObjectOrArray[FontSizeProperty[Double]]] = js.undefined
  var fontWeights: js.UndefOr[ObjectOrArray[FontWeightProperty]] = js.undefined
  var fonts: js.UndefOr[ObjectOrArray[FontFamilyProperty]] = js.undefined
  var letterSpacings: js.UndefOr[ObjectOrArray[LetterSpacingProperty[js.Object]]] = js.undefined
  var lineHeights: js.UndefOr[ObjectOrArray[LineHeightProperty[js.Object]]] = js.undefined
  var mediaQueries: js.UndefOr[StringDictionary[String]] = js.undefined
  var radii: js.UndefOr[ObjectOrArray[BorderRadiusProperty[js.Object]]] = js.undefined
  var shadows: js.UndefOr[ObjectOrArray[BoxShadowProperty]] = js.undefined
  var sizes: js.UndefOr[ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object]]] = js.undefined
  var space: js.UndefOr[ObjectOrArray[Double | String]] = js.undefined
  var textStyles: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`]]] = js.undefined
  var zIndices: js.UndefOr[ObjectOrArray[ZIndexProperty]] = js.undefined
}

object Theme {
  @scala.inline
  def apply(
    borderStyles: ObjectOrArray[BorderProperty[js.Object]] = null,
    borderWidths: ObjectOrArray[BorderWidthProperty[js.Object]] = null,
    borders: ObjectOrArray[BorderProperty[js.Object]] = null,
    breakpoints: (js.Array[Double | String]) | js.Object = null,
    buttons: ObjectOrArray[StandardProperties[String | `0`]] = null,
    colorStyles: ObjectOrArray[StandardProperties[String | `0`]] = null,
    colors: ObjectOrArray[ColorProperty] = null,
    fontSizes: ObjectOrArray[FontSizeProperty[Double]] = null,
    fontWeights: ObjectOrArray[FontWeightProperty] = null,
    fonts: ObjectOrArray[FontFamilyProperty] = null,
    letterSpacings: ObjectOrArray[LetterSpacingProperty[js.Object]] = null,
    lineHeights: ObjectOrArray[LineHeightProperty[js.Object]] = null,
    mediaQueries: StringDictionary[String] = null,
    radii: ObjectOrArray[BorderRadiusProperty[js.Object]] = null,
    shadows: ObjectOrArray[BoxShadowProperty] = null,
    sizes: ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object]] = null,
    space: ObjectOrArray[Double | String] = null,
    textStyles: ObjectOrArray[StandardProperties[String | `0`]] = null,
    zIndices: ObjectOrArray[ZIndexProperty] = null
  ): Theme = {
    val __obj = js.Dynamic.literal()
    if (borderStyles != null) __obj.updateDynamic("borderStyles")(borderStyles.asInstanceOf[js.Any])
    if (borderWidths != null) __obj.updateDynamic("borderWidths")(borderWidths.asInstanceOf[js.Any])
    if (borders != null) __obj.updateDynamic("borders")(borders.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (colorStyles != null) __obj.updateDynamic("colorStyles")(colorStyles.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (fontSizes != null) __obj.updateDynamic("fontSizes")(fontSizes.asInstanceOf[js.Any])
    if (fontWeights != null) __obj.updateDynamic("fontWeights")(fontWeights.asInstanceOf[js.Any])
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (letterSpacings != null) __obj.updateDynamic("letterSpacings")(letterSpacings.asInstanceOf[js.Any])
    if (lineHeights != null) __obj.updateDynamic("lineHeights")(lineHeights.asInstanceOf[js.Any])
    if (mediaQueries != null) __obj.updateDynamic("mediaQueries")(mediaQueries)
    if (radii != null) __obj.updateDynamic("radii")(radii.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (textStyles != null) __obj.updateDynamic("textStyles")(textStyles.asInstanceOf[js.Any])
    if (zIndices != null) __obj.updateDynamic("zIndices")(zIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
}

