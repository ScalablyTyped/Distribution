package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorationRenderOptions extends ThemableDecorationRenderOptions {
  /**
  		 * Overwrite options for dark themes.
  		 */
  var dark: js.UndefOr[ThemableDecorationRenderOptions] = js.undefined
  /**
  		 * Should the decoration be rendered also on the whitespace after the line text.
  		 * Defaults to `false`.
  		 */
  var isWholeLine: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Overwrite options for light themes.
  		 */
  var light: js.UndefOr[ThemableDecorationRenderOptions] = js.undefined
  /**
  		 * The position in the overview ruler where the decoration should be rendered.
  		 */
  var overviewRulerLane: js.UndefOr[OverviewRulerLane] = js.undefined
  /**
  		 * Customize the growing behavior of the decoration when edits occur at the edges of the decoration's range.
  		 * Defaults to `DecorationRangeBehavior.OpenOpen`.
  		 */
  var rangeBehavior: js.UndefOr[DecorationRangeBehavior] = js.undefined
}

object DecorationRenderOptions {
  @scala.inline
  def apply(
    after: ThemableDecorationAttachmentRenderOptions = null,
    backgroundColor: java.lang.String | ThemeColor = null,
    before: ThemableDecorationAttachmentRenderOptions = null,
    border: java.lang.String = null,
    borderColor: java.lang.String | ThemeColor = null,
    borderRadius: java.lang.String = null,
    borderSpacing: java.lang.String = null,
    borderStyle: java.lang.String = null,
    borderWidth: java.lang.String = null,
    color: java.lang.String | ThemeColor = null,
    cursor: java.lang.String = null,
    dark: ThemableDecorationRenderOptions = null,
    fontStyle: java.lang.String = null,
    fontWeight: java.lang.String = null,
    gutterIconPath: java.lang.String | Uri = null,
    gutterIconSize: java.lang.String = null,
    isWholeLine: js.UndefOr[scala.Boolean] = js.undefined,
    letterSpacing: java.lang.String = null,
    light: ThemableDecorationRenderOptions = null,
    opacity: java.lang.String = null,
    outline: java.lang.String = null,
    outlineColor: java.lang.String | ThemeColor = null,
    outlineStyle: java.lang.String = null,
    outlineWidth: java.lang.String = null,
    overviewRulerColor: java.lang.String | ThemeColor = null,
    overviewRulerLane: OverviewRulerLane = null,
    rangeBehavior: DecorationRangeBehavior = null,
    textDecoration: java.lang.String = null
  ): DecorationRenderOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before)
    if (border != null) __obj.updateDynamic("border")(border)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius)
    if (borderSpacing != null) __obj.updateDynamic("borderSpacing")(borderSpacing)
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle)
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (dark != null) __obj.updateDynamic("dark")(dark)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (gutterIconPath != null) __obj.updateDynamic("gutterIconPath")(gutterIconPath.asInstanceOf[js.Any])
    if (gutterIconSize != null) __obj.updateDynamic("gutterIconSize")(gutterIconSize)
    if (!js.isUndefined(isWholeLine)) __obj.updateDynamic("isWholeLine")(isWholeLine)
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing)
    if (light != null) __obj.updateDynamic("light")(light)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (outlineStyle != null) __obj.updateDynamic("outlineStyle")(outlineStyle)
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth)
    if (overviewRulerColor != null) __obj.updateDynamic("overviewRulerColor")(overviewRulerColor.asInstanceOf[js.Any])
    if (overviewRulerLane != null) __obj.updateDynamic("overviewRulerLane")(overviewRulerLane)
    if (rangeBehavior != null) __obj.updateDynamic("rangeBehavior")(rangeBehavior)
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
    __obj.asInstanceOf[DecorationRenderOptions]
  }
}

