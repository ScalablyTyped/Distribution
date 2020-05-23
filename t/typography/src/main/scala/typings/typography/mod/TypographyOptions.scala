package typings.typography.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypographyOptions extends js.Object {
  var baseFontSize: js.UndefOr[String] = js.undefined
  var baseLineHeight: js.UndefOr[Double] = js.undefined
  var blockMarginBottom: js.UndefOr[Double] = js.undefined
  var bodyColor: js.UndefOr[String] = js.undefined
  var bodyFontFamily: js.UndefOr[js.Array[String]] = js.undefined
  var bodyWeight: js.UndefOr[Double | String] = js.undefined
  var boldWeight: js.UndefOr[Double | String] = js.undefined
  var googleFonts: js.UndefOr[js.Array[GoogleFont]] = js.undefined
  var headerColor: js.UndefOr[String] = js.undefined
  var headerFontFamily: js.UndefOr[js.Array[String]] = js.undefined
  var headerLineHeight: js.UndefOr[Double] = js.undefined
  var headerWeight: js.UndefOr[Double | String] = js.undefined
  var includeNormalize: js.UndefOr[Boolean] = js.undefined
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
  var scaleRatio: js.UndefOr[Double] = js.undefined
}

object TypographyOptions {
  @scala.inline
  def apply(
    baseFontSize: String = null,
    baseLineHeight: js.UndefOr[Double] = js.undefined,
    blockMarginBottom: js.UndefOr[Double] = js.undefined,
    bodyColor: String = null,
    bodyFontFamily: js.Array[String] = null,
    bodyWeight: Double | String = null,
    boldWeight: Double | String = null,
    googleFonts: js.Array[GoogleFont] = null,
    headerColor: String = null,
    headerFontFamily: js.Array[String] = null,
    headerLineHeight: js.UndefOr[Double] = js.undefined,
    headerWeight: Double | String = null,
    includeNormalize: js.UndefOr[Boolean] = js.undefined,
    overrideStyles: (/* VerticalRhythm */ VerticalRhythm, /* options */ TypographyOptions, /* styles */ js.Any) => js.Object = null,
    overrideThemeStyles: (/* VerticalRhythm */ VerticalRhythm, /* options */ TypographyOptions, /* styles */ js.Any) => js.Object = null,
    plugins: js.Array[_] = null,
    scaleRatio: js.UndefOr[Double] = js.undefined
  ): TypographyOptions = {
    val __obj = js.Dynamic.literal()
    if (baseFontSize != null) __obj.updateDynamic("baseFontSize")(baseFontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(baseLineHeight)) __obj.updateDynamic("baseLineHeight")(baseLineHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blockMarginBottom)) __obj.updateDynamic("blockMarginBottom")(blockMarginBottom.get.asInstanceOf[js.Any])
    if (bodyColor != null) __obj.updateDynamic("bodyColor")(bodyColor.asInstanceOf[js.Any])
    if (bodyFontFamily != null) __obj.updateDynamic("bodyFontFamily")(bodyFontFamily.asInstanceOf[js.Any])
    if (bodyWeight != null) __obj.updateDynamic("bodyWeight")(bodyWeight.asInstanceOf[js.Any])
    if (boldWeight != null) __obj.updateDynamic("boldWeight")(boldWeight.asInstanceOf[js.Any])
    if (googleFonts != null) __obj.updateDynamic("googleFonts")(googleFonts.asInstanceOf[js.Any])
    if (headerColor != null) __obj.updateDynamic("headerColor")(headerColor.asInstanceOf[js.Any])
    if (headerFontFamily != null) __obj.updateDynamic("headerFontFamily")(headerFontFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(headerLineHeight)) __obj.updateDynamic("headerLineHeight")(headerLineHeight.get.asInstanceOf[js.Any])
    if (headerWeight != null) __obj.updateDynamic("headerWeight")(headerWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNormalize)) __obj.updateDynamic("includeNormalize")(includeNormalize.get.asInstanceOf[js.Any])
    if (overrideStyles != null) __obj.updateDynamic("overrideStyles")(js.Any.fromFunction3(overrideStyles))
    if (overrideThemeStyles != null) __obj.updateDynamic("overrideThemeStyles")(js.Any.fromFunction3(overrideThemeStyles))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleRatio)) __obj.updateDynamic("scaleRatio")(scaleRatio.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypographyOptions]
  }
}

