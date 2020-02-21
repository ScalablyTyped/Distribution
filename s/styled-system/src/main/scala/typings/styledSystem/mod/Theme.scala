package typings.styledSystem.mod

import org.scalablytyped.runtime.StringDictionary
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
import typings.csstype.mod.MarginProperty
import typings.csstype.mod.StandardProperties
import typings.csstype.mod.WidthProperty
import typings.csstype.mod.ZIndexProperty
import typings.styledSystem.styledSystemNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme[TLength] extends js.Object {
  var borderStyles: js.UndefOr[ObjectOrArray[BorderProperty[js.Object], String]] = js.undefined
  var borderWidths: js.UndefOr[ObjectOrArray[BorderWidthProperty[TLength], String]] = js.undefined
  var borders: js.UndefOr[ObjectOrArray[BorderProperty[js.Object], String]] = js.undefined
  var breakpoints: js.UndefOr[ObjectOrArray[Double | String | js.Symbol, String]] = js.undefined
  var buttons: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`], String]] = js.undefined
  var colorStyles: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`], String]] = js.undefined
  var colors: js.UndefOr[ObjectOrArray[ColorProperty, String]] = js.undefined
  var fontSizes: js.UndefOr[ObjectOrArray[FontSizeProperty[Double], String]] = js.undefined
  var fontWeights: js.UndefOr[ObjectOrArray[FontWeightProperty, String]] = js.undefined
  var fonts: js.UndefOr[ObjectOrArray[FontFamilyProperty, String]] = js.undefined
  var letterSpacings: js.UndefOr[ObjectOrArray[LetterSpacingProperty[TLength], String]] = js.undefined
  var lineHeights: js.UndefOr[ObjectOrArray[LineHeightProperty[TLength], String]] = js.undefined
  var mediaQueries: js.UndefOr[StringDictionary[String]] = js.undefined
  var radii: js.UndefOr[ObjectOrArray[BorderRadiusProperty[TLength], String]] = js.undefined
  var shadows: js.UndefOr[ObjectOrArray[BoxShadowProperty, String]] = js.undefined
  var sizes: js.UndefOr[ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], String]] = js.undefined
  var space: js.UndefOr[ObjectOrArray[MarginProperty[Double | String], String]] = js.undefined
  var textStyles: js.UndefOr[ObjectOrArray[StandardProperties[String | `0`], String]] = js.undefined
  var zIndices: js.UndefOr[ObjectOrArray[ZIndexProperty, String]] = js.undefined
}

object Theme {
  @scala.inline
  def apply[TLength](
    borderStyles: ObjectOrArray[BorderProperty[js.Object], String] = null,
    borderWidths: ObjectOrArray[BorderWidthProperty[TLength], String] = null,
    borders: ObjectOrArray[BorderProperty[js.Object], String] = null,
    breakpoints: ObjectOrArray[Double | String | js.Symbol, String] = null,
    buttons: ObjectOrArray[StandardProperties[String | `0`], String] = null,
    colorStyles: ObjectOrArray[StandardProperties[String | `0`], String] = null,
    colors: ObjectOrArray[ColorProperty, String] = null,
    fontSizes: ObjectOrArray[FontSizeProperty[Double], String] = null,
    fontWeights: ObjectOrArray[FontWeightProperty, String] = null,
    fonts: ObjectOrArray[FontFamilyProperty, String] = null,
    letterSpacings: ObjectOrArray[LetterSpacingProperty[TLength], String] = null,
    lineHeights: ObjectOrArray[LineHeightProperty[TLength], String] = null,
    mediaQueries: StringDictionary[String] = null,
    radii: ObjectOrArray[BorderRadiusProperty[TLength], String] = null,
    shadows: ObjectOrArray[BoxShadowProperty, String] = null,
    sizes: ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], String] = null,
    space: ObjectOrArray[MarginProperty[Double | String], String] = null,
    textStyles: ObjectOrArray[StandardProperties[String | `0`], String] = null,
    zIndices: ObjectOrArray[ZIndexProperty, String] = null
  ): Theme[TLength] = {
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
    if (mediaQueries != null) __obj.updateDynamic("mediaQueries")(mediaQueries.asInstanceOf[js.Any])
    if (radii != null) __obj.updateDynamic("radii")(radii.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (textStyles != null) __obj.updateDynamic("textStyles")(textStyles.asInstanceOf[js.Any])
    if (zIndices != null) __obj.updateDynamic("zIndices")(zIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme[TLength]]
  }
}

