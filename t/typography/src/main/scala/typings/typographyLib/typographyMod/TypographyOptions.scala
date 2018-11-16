package typings
package typographyLib.typographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TypographyOptions extends js.Object {
  var baseFontSize: js.UndefOr[java.lang.String] = js.undefined
  var baseLineHeight: js.UndefOr[scala.Double] = js.undefined
  var blockMarginBottom: js.UndefOr[scala.Double] = js.undefined
  var bodyColor: js.UndefOr[java.lang.String] = js.undefined
  var bodyFontFamily: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var bodyWeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var boldWeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var googleFonts: js.UndefOr[js.Array[GoogleFont]] = js.undefined
  var headerColor: js.UndefOr[java.lang.String] = js.undefined
  var headerFontFamily: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var headerWeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var includeNormalize: js.UndefOr[scala.Boolean] = js.undefined
  var overrideStyles: js.UndefOr[
    js.Function3[
      /* VerticalRhythm */ VerticalRhythm, 
      /* options */ TypographyOptions, 
      /* styles */ js.Any, 
      js.Object
    ]
  ] = js.undefined
  var overrideThemeStyles: js.UndefOr[
    js.Function3[
      /* VerticalRhythm */ VerticalRhythm, 
      /* options */ TypographyOptions, 
      /* styles */ js.Any, 
      js.Object
    ]
  ] = js.undefined
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  var scaleRatio: js.UndefOr[scala.Double] = js.undefined
}

