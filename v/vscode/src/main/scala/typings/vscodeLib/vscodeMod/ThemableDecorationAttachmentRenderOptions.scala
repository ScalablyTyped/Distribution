package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemableDecorationAttachmentRenderOptions extends js.Object {
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var backgroundColor: js.UndefOr[java.lang.String | ThemeColor] = js.undefined
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var border: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * CSS styling property that will be applied to text enclosed by a decoration.
  		 */
  var borderColor: js.UndefOr[java.lang.String | ThemeColor] = js.undefined
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var color: js.UndefOr[java.lang.String | ThemeColor] = js.undefined
  /**
  		 * An **absolute path** or an URI to an image to be rendered in the attachment. Either an icon
  		 * or a text can be shown, but not both.
  		 */
  var contentIconPath: js.UndefOr[java.lang.String | Uri] = js.undefined
  /**
  		 * Defines a text content that is shown in the attachment. Either an icon or a text can be shown, but not both.
  		 */
  var contentText: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var margin: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var textDecoration: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * CSS styling property that will be applied to the decoration attachment.
  		 */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object ThemableDecorationAttachmentRenderOptions {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String | ThemeColor = null,
    border: java.lang.String = null,
    borderColor: java.lang.String | ThemeColor = null,
    color: java.lang.String | ThemeColor = null,
    contentIconPath: java.lang.String | Uri = null,
    contentText: java.lang.String = null,
    height: java.lang.String = null,
    margin: java.lang.String = null,
    textDecoration: java.lang.String = null,
    width: java.lang.String = null
  ): ThemableDecorationAttachmentRenderOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (contentIconPath != null) __obj.updateDynamic("contentIconPath")(contentIconPath.asInstanceOf[js.Any])
    if (contentText != null) __obj.updateDynamic("contentText")(contentText)
    if (height != null) __obj.updateDynamic("height")(height)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ThemableDecorationAttachmentRenderOptions]
  }
}

