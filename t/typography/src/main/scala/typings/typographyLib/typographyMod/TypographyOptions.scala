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

object TypographyOptions {
  @scala.inline
  def apply(
    baseFontSize: java.lang.String = null,
    baseLineHeight: scala.Int | scala.Double = null,
    blockMarginBottom: scala.Int | scala.Double = null,
    bodyColor: java.lang.String = null,
    bodyFontFamily: js.Array[java.lang.String] = null,
    bodyWeight: scala.Double | java.lang.String = null,
    boldWeight: scala.Double | java.lang.String = null,
    googleFonts: js.Array[GoogleFont] = null,
    headerColor: java.lang.String = null,
    headerFontFamily: js.Array[java.lang.String] = null,
    headerWeight: scala.Double | java.lang.String = null,
    includeNormalize: js.UndefOr[scala.Boolean] = js.undefined,
    overrideStyles: (/* VerticalRhythm */ VerticalRhythm, /* options */ TypographyOptions, /* styles */ js.Any) => js.Object = null,
    overrideThemeStyles: (/* VerticalRhythm */ VerticalRhythm, /* options */ TypographyOptions, /* styles */ js.Any) => js.Object = null,
    plugins: js.Array[_] = null,
    scaleRatio: scala.Int | scala.Double = null
  ): TypographyOptions = {
    val __obj = js.Dynamic.literal()
    if (baseFontSize != null) __obj.updateDynamic("baseFontSize")(baseFontSize)
    if (baseLineHeight != null) __obj.updateDynamic("baseLineHeight")(baseLineHeight.asInstanceOf[js.Any])
    if (blockMarginBottom != null) __obj.updateDynamic("blockMarginBottom")(blockMarginBottom.asInstanceOf[js.Any])
    if (bodyColor != null) __obj.updateDynamic("bodyColor")(bodyColor)
    if (bodyFontFamily != null) __obj.updateDynamic("bodyFontFamily")(bodyFontFamily)
    if (bodyWeight != null) __obj.updateDynamic("bodyWeight")(bodyWeight.asInstanceOf[js.Any])
    if (boldWeight != null) __obj.updateDynamic("boldWeight")(boldWeight.asInstanceOf[js.Any])
    if (googleFonts != null) __obj.updateDynamic("googleFonts")(googleFonts)
    if (headerColor != null) __obj.updateDynamic("headerColor")(headerColor)
    if (headerFontFamily != null) __obj.updateDynamic("headerFontFamily")(headerFontFamily)
    if (headerWeight != null) __obj.updateDynamic("headerWeight")(headerWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNormalize)) __obj.updateDynamic("includeNormalize")(includeNormalize)
    if (overrideStyles != null) __obj.updateDynamic("overrideStyles")(js.Any.fromFunction3(overrideStyles))
    if (overrideThemeStyles != null) __obj.updateDynamic("overrideThemeStyles")(js.Any.fromFunction3(overrideThemeStyles))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (scaleRatio != null) __obj.updateDynamic("scaleRatio")(scaleRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypographyOptions]
  }
}

