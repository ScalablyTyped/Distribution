package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemableDecorationRenderOptions extends js.Object {
  /**
  		 * Defines the rendering options of the attachment that is inserted after the decorated text.
  		 */
  var after: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.undefined
  /**
  		 * Background color of the decoration. Use rgba() and define transparent background colors to play well with other decorations.
  		 * Alternatively a color from the color registry can be [referenced](#ThemeColor).
  		 */
  var backgroundColor: js.UndefOr[String | ThemeColor] = js.undefined
  /**
  		 * Defines the rendering options of the attachment that is inserted before the decorated text.
  		 */
  var before: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var border: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'border' for setting one or more of the individual border properties.
  		 */
  var borderColor: js.UndefOr[String | ThemeColor] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'border' for setting one or more of the individual border properties.
  		 */
  var borderRadius: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'border' for setting one or more of the individual border properties.
  		 */
  var borderSpacing: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'border' for setting one or more of the individual border properties.
  		 */
  var borderStyle: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'border' for setting one or more of the individual border properties.
  		 */
  var borderWidth: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var color: js.UndefOr[String | ThemeColor] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var cursor: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var fontStyle: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var fontWeight: js.UndefOr[String] = js.undefined
  /**
  		 * An **absolute path** or an URI to an image to be rendered in the gutter.
  		 */
  var gutterIconPath: js.UndefOr[String | Uri] = js.undefined
  /**
  		 * Specifies the size of the gutter icon.
  		 * Available values are 'auto', 'contain', 'cover' and any percentage value.
  		 * For further information: https://msdn.microsoft.com/en-us/library/jj127316(v=vs.85).aspx
  		 */
  var gutterIconSize: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var letterSpacing: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var opacity: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var outline: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'outline' for setting one or more of the individual outline properties.
  		 */
  var outlineColor: js.UndefOr[String | ThemeColor] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'outline' for setting one or more of the individual outline properties.
  		 */
  var outlineStyle: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'outline' for setting one or more of the individual outline properties.
  		 */
  var outlineWidth: js.UndefOr[String] = js.undefined
  /**
  		 * The color of the decoration in the overview ruler. Use rgba() and define transparent colors to play well with other decorations.
  		 */
  var overviewRulerColor: js.UndefOr[String | ThemeColor] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var textDecoration: js.UndefOr[String] = js.undefined
}

object ThemableDecorationRenderOptions {
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
    fontStyle: String = null,
    fontWeight: String = null,
    gutterIconPath: String | Uri = null,
    gutterIconSize: String = null,
    letterSpacing: String = null,
    opacity: String = null,
    outline: String = null,
    outlineColor: String | ThemeColor = null,
    outlineStyle: String = null,
    outlineWidth: String = null,
    overviewRulerColor: String | ThemeColor = null,
    textDecoration: String = null
  ): ThemableDecorationRenderOptions = {
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
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (gutterIconPath != null) __obj.updateDynamic("gutterIconPath")(gutterIconPath.asInstanceOf[js.Any])
    if (gutterIconSize != null) __obj.updateDynamic("gutterIconSize")(gutterIconSize.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (outlineStyle != null) __obj.updateDynamic("outlineStyle")(outlineStyle.asInstanceOf[js.Any])
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth.asInstanceOf[js.Any])
    if (overviewRulerColor != null) __obj.updateDynamic("overviewRulerColor")(overviewRulerColor.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemableDecorationRenderOptions]
  }
}

