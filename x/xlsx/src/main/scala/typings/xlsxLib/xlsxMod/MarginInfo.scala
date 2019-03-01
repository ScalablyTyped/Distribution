package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarginInfo extends _SheetKeys {
  /** Bottom side margin (inches) */
  var bottom: js.UndefOr[scala.Double] = js.undefined
  /** Footer bottom height (inches) */
  var footer: js.UndefOr[scala.Double] = js.undefined
  /** Header top margin (inches) */
  var header: js.UndefOr[scala.Double] = js.undefined
  /** Left side margin (inches) */
  var left: js.UndefOr[scala.Double] = js.undefined
  /** Right side margin (inches) */
  var right: js.UndefOr[scala.Double] = js.undefined
  /** Top side margin (inches) */
  var top: js.UndefOr[scala.Double] = js.undefined
}

object MarginInfo {
  @scala.inline
  def apply(
    bottom: scala.Int | scala.Double = null,
    footer: scala.Int | scala.Double = null,
    header: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    right: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null
  ): MarginInfo = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginInfo]
  }
}

