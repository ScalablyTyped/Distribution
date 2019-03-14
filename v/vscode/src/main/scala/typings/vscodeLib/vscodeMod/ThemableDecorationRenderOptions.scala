package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemableDecorationRenderOptions extends js.Object {
  /**
  		 * Defines the rendering options of the attachment that is inserted after the decorated text
  		 */
  var after: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.undefined
  /**
  		 * Background color of the decoration. Use rgba() and define transparent background colors to play well with other decorations.
  		 * Alternativly a color from the color registry an be [referenced](#ColorIdentifier).
  		 */
  var backgroundColor: js.UndefOr[java.lang.String | ThemeColor] = js.undefined
  /**
  		 * Defines the rendering options of the attachment that is inserted before the decorated text
  		 */
  var before: js.UndefOr[ThemableDecorationAttachmentRenderOptions] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var border: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'border' for setting one or more of the individual border properties.
  		 */
  var borderColor: js.UndefOr[java.lang.String | ThemeColor] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'border' for setting one or more of the individual border properties.
  		 */
  var borderRadius: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'border' for setting one or more of the individual border properties.
  		 */
  var borderSpacing: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'border' for setting one or more of the individual border properties.
  		 */
  var borderStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'border' for setting one or more of the individual border properties.
  		 */
  var borderWidth: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var color: js.UndefOr[java.lang.String | ThemeColor] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * An **absolute path** or an URI to an image to be rendered in the gutter.
  		 */
  var gutterIconPath: js.UndefOr[java.lang.String | Uri] = js.undefined
  /**
  		 * Specifies the size of the gutter icon.
  		 * Available values are 'auto', 'contain', 'cover' and any percentage value.
  		 * For further information: https://msdn.microsoft.com/en-us/library/jj127316(v=vs.85).aspx
  		 */
  var gutterIconSize: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var letterSpacing: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var outline: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'outline' for setting one or more of the individual outline properties.
  		 */
  var outlineColor: js.UndefOr[java.lang.String | ThemeColor] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'outline' for setting one or more of the individual outline properties.
  		 */
  var outlineStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 * Better use 'outline' for setting one or more of the individual outline properties.
  		 */
  var outlineWidth: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * The color of the decoration in the overview ruler. Use rgba() and define transparent colors to play well with other decorations.
  		 */
  var overviewRulerColor: js.UndefOr[java.lang.String | ThemeColor] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var textDecoration: js.UndefOr[java.lang.String] = js.undefined
}

object ThemableDecorationRenderOptions {
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
    gutterIconPath: java.lang.String | Uri = null,
    gutterIconSize: java.lang.String = null,
    letterSpacing: java.lang.String = null,
    outline: java.lang.String = null,
    outlineColor: java.lang.String | ThemeColor = null,
    outlineStyle: java.lang.String = null,
    outlineWidth: java.lang.String = null,
    overviewRulerColor: java.lang.String | ThemeColor = null,
    textDecoration: java.lang.String = null
  ): ThemableDecorationRenderOptions = {
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
    if (gutterIconPath != null) __obj.updateDynamic("gutterIconPath")(gutterIconPath.asInstanceOf[js.Any])
    if (gutterIconSize != null) __obj.updateDynamic("gutterIconSize")(gutterIconSize)
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor.asInstanceOf[js.Any])
    if (outlineStyle != null) __obj.updateDynamic("outlineStyle")(outlineStyle)
    if (outlineWidth != null) __obj.updateDynamic("outlineWidth")(outlineWidth)
    if (overviewRulerColor != null) __obj.updateDynamic("overviewRulerColor")(overviewRulerColor.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
    __obj.asInstanceOf[ThemableDecorationRenderOptions]
  }
}

