package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends BaseTheme {
  var borders: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.BorderProperty[js.Object]]] = js.undefined
  var buttons: js.UndefOr[
    ObjectOrArray[
      csstypeLib.csstypeMod.StandardProperties[java.lang.String | styledDashSystemLib.styledDashSystemLibNumbers.`0`]
    ]
  ] = js.undefined
  var colorStyles: js.UndefOr[
    ObjectOrArray[
      csstypeLib.csstypeMod.StandardProperties[java.lang.String | styledDashSystemLib.styledDashSystemLibNumbers.`0`]
    ]
  ] = js.undefined
  var fontWeights: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.FontWeightProperty]] = js.undefined
  var fonts: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.FontFamilyProperty]] = js.undefined
  var heights: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.HeightProperty[js.Object]]] = js.undefined
  var letterSpacings: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.LetterSpacingProperty[js.Object]]] = js.undefined
  var lineHeights: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.LineHeightProperty[js.Object]]] = js.undefined
  var maxHeights: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.HeightProperty[js.Object]]] = js.undefined
  var maxWidths: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.WidthProperty[js.Object]]] = js.undefined
  var minHeights: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.HeightProperty[js.Object]]] = js.undefined
  var minWidths: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.WidthProperty[js.Object]]] = js.undefined
  var opacity: js.UndefOr[ObjectOrArray[csstypeLib.GlobalsNumber]] = js.undefined
  var radii: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.BorderRadiusProperty[js.Object]]] = js.undefined
  var shadows: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.BoxShadowProperty]] = js.undefined
  var textStyles: js.UndefOr[
    ObjectOrArray[
      csstypeLib.csstypeMod.StandardProperties[java.lang.String | styledDashSystemLib.styledDashSystemLibNumbers.`0`]
    ]
  ] = js.undefined
}

object Theme {
  @scala.inline
  def apply(
    borders: ObjectOrArray[csstypeLib.csstypeMod.BorderProperty[js.Object]] = null,
    breakpoints: js.Array[java.lang.String] | js.Array[scala.Double] | js.Object = null,
    buttons: ObjectOrArray[
      csstypeLib.csstypeMod.StandardProperties[java.lang.String | styledDashSystemLib.styledDashSystemLibNumbers.`0`]
    ] = null,
    colorStyles: ObjectOrArray[
      csstypeLib.csstypeMod.StandardProperties[java.lang.String | styledDashSystemLib.styledDashSystemLibNumbers.`0`]
    ] = null,
    colors: ObjectOrArray[csstypeLib.csstypeMod.ColorProperty] = null,
    fontSizes: js.Array[scala.Double] = null,
    fontWeights: ObjectOrArray[csstypeLib.csstypeMod.FontWeightProperty] = null,
    fonts: ObjectOrArray[csstypeLib.csstypeMod.FontFamilyProperty] = null,
    heights: ObjectOrArray[csstypeLib.csstypeMod.HeightProperty[js.Object]] = null,
    letterSpacings: ObjectOrArray[csstypeLib.csstypeMod.LetterSpacingProperty[js.Object]] = null,
    lineHeights: ObjectOrArray[csstypeLib.csstypeMod.LineHeightProperty[js.Object]] = null,
    maxHeights: ObjectOrArray[csstypeLib.csstypeMod.HeightProperty[js.Object]] = null,
    maxWidths: ObjectOrArray[csstypeLib.csstypeMod.WidthProperty[js.Object]] = null,
    minHeights: ObjectOrArray[csstypeLib.csstypeMod.HeightProperty[js.Object]] = null,
    minWidths: ObjectOrArray[csstypeLib.csstypeMod.WidthProperty[js.Object]] = null,
    opacity: ObjectOrArray[csstypeLib.GlobalsNumber] = null,
    radii: ObjectOrArray[csstypeLib.csstypeMod.BorderRadiusProperty[js.Object]] = null,
    shadows: ObjectOrArray[csstypeLib.csstypeMod.BoxShadowProperty] = null,
    space: js.Array[scala.Double] = null,
    textStyles: ObjectOrArray[
      csstypeLib.csstypeMod.StandardProperties[java.lang.String | styledDashSystemLib.styledDashSystemLibNumbers.`0`]
    ] = null
  ): Theme = {
    val __obj = js.Dynamic.literal()
    if (borders != null) __obj.updateDynamic("borders")(borders.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (colorStyles != null) __obj.updateDynamic("colorStyles")(colorStyles.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (fontSizes != null) __obj.updateDynamic("fontSizes")(fontSizes)
    if (fontWeights != null) __obj.updateDynamic("fontWeights")(fontWeights.asInstanceOf[js.Any])
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (heights != null) __obj.updateDynamic("heights")(heights.asInstanceOf[js.Any])
    if (letterSpacings != null) __obj.updateDynamic("letterSpacings")(letterSpacings.asInstanceOf[js.Any])
    if (lineHeights != null) __obj.updateDynamic("lineHeights")(lineHeights.asInstanceOf[js.Any])
    if (maxHeights != null) __obj.updateDynamic("maxHeights")(maxHeights.asInstanceOf[js.Any])
    if (maxWidths != null) __obj.updateDynamic("maxWidths")(maxWidths.asInstanceOf[js.Any])
    if (minHeights != null) __obj.updateDynamic("minHeights")(minHeights.asInstanceOf[js.Any])
    if (minWidths != null) __obj.updateDynamic("minWidths")(minWidths.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radii != null) __obj.updateDynamic("radii")(radii.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space)
    if (textStyles != null) __obj.updateDynamic("textStyles")(textStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
}

