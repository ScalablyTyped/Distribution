package typings.vscode.mod

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
  var isWholeLine: js.UndefOr[Boolean] = js.undefined
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
    backgroundColor: String | ThemeColor = null,
    before: ThemableDecorationAttachmentRenderOptions = null,
    border: String = null,
    borderColor: String | ThemeColor = null,
    borderRadius: String = null,
    borderSpacing: String = null,
    borderStyle: String = null,
    borderWidth: String = null,
    color: String | ThemeColor = null,
    cursor: String = null,
    dark: ThemableDecorationRenderOptions = null,
    fontStyle: String = null,
    fontWeight: String = null,
    gutterIconPath: String | Uri = null,
    gutterIconSize: String = null,
    isWholeLine: js.UndefOr[Boolean] = js.undefined,
    letterSpacing: String = null,
    light: ThemableDecorationRenderOptions = null,
    opacity: String = null,
    outline: String = null,
    outlineColor: String | ThemeColor = null,
    outlineStyle: String = null,
    outlineWidth: String = null,
    overviewRulerColor: String | ThemeColor = null,
    overviewRulerLane: OverviewRulerLane = null,
    rangeBehavior: DecorationRangeBehavior = null,
    textDecoration: String = null
  ): DecorationRenderOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderSpacing != null) __obj.updateDynamic("borderSpacing")(borderSpacing.asInstanceOf[js.Any])
    if (borderStyle != null) __obj.updateDynamic("borderStyle")(borderStyle.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (dark != null) __obj.updateDynamic("dark")(dark.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (gutterIconPath != null) __obj.updateDynamic("gutterIconPath")(gutterIconPath.asInstanceOf[js.Any])
    if (gutterIconSize != null) __obj.updateDynamic("gutterIconSize")(gutterIconSize.asInstanceOf[js.Any])
    if (!js.isUndefined(isWholeLine)) __obj.updateDynamic("isWholeLine")(isWholeLine.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (light != null) __obj.updateDynamic("light")(light.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (outlineStyle != null) __obj.updateDynamic("outlineStyle")(outlineStyle.asInstanceOf[js.Any])
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth.asInstanceOf[js.Any])
    if (overviewRulerColor != null) __obj.updateDynamic("overviewRulerColor")(overviewRulerColor.asInstanceOf[js.Any])
    if (overviewRulerLane != null) __obj.updateDynamic("overviewRulerLane")(overviewRulerLane.asInstanceOf[js.Any])
    if (rangeBehavior != null) __obj.updateDynamic("rangeBehavior")(rangeBehavior.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationRenderOptions]
  }
}

