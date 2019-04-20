package typings
package wegameDashApiLib.wxNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonStyle extends js.Object {
  /**
    * 格式#ff0000
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 格式#ff0000
    */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  var borderWidth: js.UndefOr[scala.Double] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var left: js.UndefOr[scala.Double] = js.undefined
  var lineHeight: js.UndefOr[scala.Double] = js.undefined
  var textAlign: js.UndefOr[
    wegameDashApiLib.wegameDashApiLibStrings.left | wegameDashApiLib.wegameDashApiLibStrings.center | wegameDashApiLib.wegameDashApiLibStrings.right
  ] = js.undefined
  var top: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ButtonStyle {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    borderRadius: scala.Int | scala.Double = null,
    borderWidth: scala.Int | scala.Double = null,
    fontSize: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    lineHeight: scala.Int | scala.Double = null,
    textAlign: wegameDashApiLib.wegameDashApiLibStrings.left | wegameDashApiLib.wegameDashApiLibStrings.center | wegameDashApiLib.wegameDashApiLibStrings.right = null,
    top: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): ButtonStyle = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonStyle]
  }
}

