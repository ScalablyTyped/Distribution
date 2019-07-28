package typings.atStyledDashSystemCss.atStyledDashSystemCssMod

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
import typings.csstype.csstypeMod.LineStyle
import typings.csstype.csstypeMod.WidthProperty
import typings.csstype.csstypeMod.ZIndexProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme[Styles /* <: String */] extends js.Object {
  var borderStyles: js.UndefOr[ThemeValue[LineStyle]] = js.native
  var borderWidths: js.UndefOr[ThemeValue[BorderWidthProperty[js.Object]]] = js.native
  var borders: js.UndefOr[ThemeValue[BorderProperty[js.Object]]] = js.native
  var breakpoints: js.UndefOr[(js.Array[Double | String]) | js.Object] = js.native
  var colors: js.UndefOr[ThemeValue[ColorProperty]] = js.native
  var fontSizes: js.UndefOr[ThemeValue[FontSizeProperty[Double]]] = js.native
  var fontWeights: js.UndefOr[ThemeValue[FontWeightProperty]] = js.native
  var fonts: js.UndefOr[ThemeValue[FontFamilyProperty]] = js.native
  var letterSpacings: js.UndefOr[ThemeValue[LetterSpacingProperty[String]]] = js.native
  var lineHeights: js.UndefOr[ThemeValue[LineHeightProperty[String]]] = js.native
  var radii: js.UndefOr[ThemeValue[BorderRadiusProperty[js.Object]]] = js.native
  var shadows: js.UndefOr[ThemeValue[BoxShadowProperty]] = js.native
  var sizes: js.UndefOr[ThemeValue[HeightProperty[js.Object] | WidthProperty[js.Object]]] = js.native
  var space: js.UndefOr[ThemeValue[Double | String]] = js.native
  var zIndices: js.UndefOr[ThemeValue[ZIndexProperty]] = js.native
}

