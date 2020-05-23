package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarginInfo extends _SheetKeys {
  /** Bottom side margin (inches) */
  var bottom: js.UndefOr[Double] = js.undefined
  /** Footer bottom height (inches) */
  var footer: js.UndefOr[Double] = js.undefined
  /** Header top margin (inches) */
  var header: js.UndefOr[Double] = js.undefined
  /** Left side margin (inches) */
  var left: js.UndefOr[Double] = js.undefined
  /** Right side margin (inches) */
  var right: js.UndefOr[Double] = js.undefined
  /** Top side margin (inches) */
  var top: js.UndefOr[Double] = js.undefined
}

object MarginInfo {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Double] = js.undefined,
    footer: js.UndefOr[Double] = js.undefined,
    header: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): MarginInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(footer)) __obj.updateDynamic("footer")(footer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginInfo]
  }
}

