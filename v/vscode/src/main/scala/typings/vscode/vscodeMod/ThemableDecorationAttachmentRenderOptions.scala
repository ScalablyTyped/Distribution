package typings.vscode.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemableDecorationAttachmentRenderOptions extends js.Object {
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var backgroundColor: js.UndefOr[String | ThemeColor] = js.undefined
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var border: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var borderColor: js.UndefOr[String | ThemeColor] = js.undefined
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var color: js.UndefOr[String | ThemeColor] = js.undefined
  /**
  		 * An **absolute path** or an URI to an image to be rendered in the attachment. Either an icon
  		 * or a text can be shown, but not both.
  		 */
  var contentIconPath: js.UndefOr[String | Uri] = js.undefined
  /**
  		 * Defines a text content that is shown in the attachment. Either an icon or a text can be shown, but not both.
  		 */
  var contentText: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var fontStyle: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var fontWeight: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var height: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var margin: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var textDecoration: js.UndefOr[String] = js.undefined
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var width: js.UndefOr[String] = js.undefined
}

object ThemableDecorationAttachmentRenderOptions {
  @scala.inline
  def apply(
    backgroundColor: String | ThemeColor = null,
    border: String = null,
    borderColor: String | ThemeColor = null,
    color: String | ThemeColor = null,
    contentIconPath: String | Uri = null,
    contentText: String = null,
    fontStyle: String = null,
    fontWeight: String = null,
    height: String = null,
    margin: String = null,
    textDecoration: String = null,
    width: String = null
  ): ThemableDecorationAttachmentRenderOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentIconPath != null) __obj.updateDynamic("contentIconPath")(contentIconPath.asInstanceOf[js.Any])
    if (contentText != null) __obj.updateDynamic("contentText")(contentText)
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (height != null) __obj.updateDynamic("height")(height)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ThemableDecorationAttachmentRenderOptions]
  }
}

