package typings
package atStyledDashSystemCssLib.atStyledDashSystemCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme[Styles /* <: java.lang.String */] extends js.Object {
  var borderStyles: js.UndefOr[ThemeValue[csstypeLib.csstypeMod.LineStyle]] = js.native
  var borderWidths: js.UndefOr[ThemeValue[csstypeLib.csstypeMod.BorderWidthProperty[js.Object]]] = js.native
  var borders: js.UndefOr[ThemeValue[csstypeLib.csstypeMod.BorderProperty[js.Object]]] = js.native
  var breakpoints: js.UndefOr[(js.Array[scala.Double | java.lang.String]) | js.Object] = js.native
  var colors: js.UndefOr[ThemeValue[csstypeLib.csstypeMod.ColorProperty]] = js.native
  var fontSizes: js.UndefOr[ThemeValue[csstypeLib.csstypeMod.FontSizeProperty[scala.Double]]] = js.native
  var fontWeights: js.UndefOr[ThemeValue[csstypeLib.csstypeMod.FontWeightProperty]] = js.native
  var fonts: js.UndefOr[ThemeValue[csstypeLib.csstypeMod.FontFamilyProperty]] = js.native
  var letterSpacings: js.UndefOr[ThemeValue[csstypeLib.csstypeMod.LetterSpacingProperty[java.lang.String]]] = js.native
  var lineHeights: js.UndefOr[ThemeValue[csstypeLib.csstypeMod.LineHeightProperty[java.lang.String]]] = js.native
  var radii: js.UndefOr[ThemeValue[csstypeLib.csstypeMod.BorderRadiusProperty[js.Object]]] = js.native
  var shadows: js.UndefOr[ThemeValue[csstypeLib.csstypeMod.BoxShadowProperty]] = js.native
  var sizes: js.UndefOr[
    ThemeValue[
      csstypeLib.csstypeMod.HeightProperty[js.Object] | csstypeLib.csstypeMod.WidthProperty[js.Object]
    ]
  ] = js.native
  var space: js.UndefOr[ThemeValue[scala.Double | java.lang.String]] = js.native
  var zIndices: js.UndefOr[ThemeValue[csstypeLib.csstypeMod.ZIndexProperty]] = js.native
}

