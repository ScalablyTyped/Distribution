package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends js.Object {
  var borderStyles: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.BorderProperty[js.Object]]] = js.undefined
  var borderWidths: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.BorderWidthProperty[js.Object]]] = js.undefined
  var borders: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.BorderProperty[js.Object]]] = js.undefined
  var breakpoints: js.UndefOr[(js.Array[scala.Double | java.lang.String]) | js.Object] = js.undefined
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
  var colors: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.ColorProperty]] = js.undefined
  var fontSizes: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.FontSizeProperty[scala.Double]]] = js.undefined
  var fontWeights: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.FontWeightProperty]] = js.undefined
  var fonts: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.FontFamilyProperty]] = js.undefined
  var letterSpacings: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.LetterSpacingProperty[js.Object]]] = js.undefined
  var lineHeights: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.LineHeightProperty[js.Object]]] = js.undefined
  var mediaQueries: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var radii: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.BorderRadiusProperty[js.Object]]] = js.undefined
  var shadows: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.BoxShadowProperty]] = js.undefined
  var sizes: js.UndefOr[
    ObjectOrArray[
      csstypeLib.csstypeMod.HeightProperty[js.Object] | csstypeLib.csstypeMod.WidthProperty[js.Object]
    ]
  ] = js.undefined
  var space: js.UndefOr[ObjectOrArray[scala.Double | java.lang.String]] = js.undefined
  var textStyles: js.UndefOr[
    ObjectOrArray[
      csstypeLib.csstypeMod.StandardProperties[java.lang.String | styledDashSystemLib.styledDashSystemLibNumbers.`0`]
    ]
  ] = js.undefined
  var zIndices: js.UndefOr[ObjectOrArray[csstypeLib.csstypeMod.ZIndexProperty]] = js.undefined
}

object Theme {
  @scala.inline
  def apply(
    borderStyles: ObjectOrArray[csstypeLib.csstypeMod.BorderProperty[js.Object]] = null,
    borderWidths: ObjectOrArray[csstypeLib.csstypeMod.BorderWidthProperty[js.Object]] = null,
    borders: ObjectOrArray[csstypeLib.csstypeMod.BorderProperty[js.Object]] = null,
    breakpoints: (js.Array[scala.Double | java.lang.String]) | js.Object = null,
    buttons: ObjectOrArray[
      csstypeLib.csstypeMod.StandardProperties[java.lang.String | styledDashSystemLib.styledDashSystemLibNumbers.`0`]
    ] = null,
    colorStyles: ObjectOrArray[
      csstypeLib.csstypeMod.StandardProperties[java.lang.String | styledDashSystemLib.styledDashSystemLibNumbers.`0`]
    ] = null,
    colors: ObjectOrArray[csstypeLib.csstypeMod.ColorProperty] = null,
    fontSizes: ObjectOrArray[csstypeLib.csstypeMod.FontSizeProperty[scala.Double]] = null,
    fontWeights: ObjectOrArray[csstypeLib.csstypeMod.FontWeightProperty] = null,
    fonts: ObjectOrArray[csstypeLib.csstypeMod.FontFamilyProperty] = null,
    letterSpacings: ObjectOrArray[csstypeLib.csstypeMod.LetterSpacingProperty[js.Object]] = null,
    lineHeights: ObjectOrArray[csstypeLib.csstypeMod.LineHeightProperty[js.Object]] = null,
    mediaQueries: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    radii: ObjectOrArray[csstypeLib.csstypeMod.BorderRadiusProperty[js.Object]] = null,
    shadows: ObjectOrArray[csstypeLib.csstypeMod.BoxShadowProperty] = null,
    sizes: ObjectOrArray[
      csstypeLib.csstypeMod.HeightProperty[js.Object] | csstypeLib.csstypeMod.WidthProperty[js.Object]
    ] = null,
    space: ObjectOrArray[scala.Double | java.lang.String] = null,
    textStyles: ObjectOrArray[
      csstypeLib.csstypeMod.StandardProperties[java.lang.String | styledDashSystemLib.styledDashSystemLibNumbers.`0`]
    ] = null,
    zIndices: ObjectOrArray[csstypeLib.csstypeMod.ZIndexProperty] = null
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

