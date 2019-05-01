package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines how the widget should be arranged. When setting the layout of a widget using **LayoutData**, all currently set layout attributes not in the new LayoutData object will be implicitly reset to null (i.e. "not specified").
  */
trait LayoutData extends js.Object {
  var baseline: js.UndefOr[Widget | Selector] = js.undefined
  var bottom: js.UndefOr[tabrisLib.margin] = js.undefined
  var centerX: js.UndefOr[tabrisLib.offset] = js.undefined
  var centerY: js.UndefOr[tabrisLib.offset] = js.undefined
  var height: js.UndefOr[tabrisLib.dimension] = js.undefined
  var left: js.UndefOr[tabrisLib.margin] = js.undefined
  var right: js.UndefOr[tabrisLib.margin] = js.undefined
  var top: js.UndefOr[tabrisLib.margin] = js.undefined
  var width: js.UndefOr[tabrisLib.dimension] = js.undefined
}

object LayoutData {
  @scala.inline
  def apply(
    baseline: Widget | Selector = null,
    bottom: tabrisLib.margin = null,
    centerX: js.UndefOr[tabrisLib.offset] = js.undefined,
    centerY: js.UndefOr[tabrisLib.offset] = js.undefined,
    height: js.UndefOr[tabrisLib.dimension] = js.undefined,
    left: tabrisLib.margin = null,
    right: tabrisLib.margin = null,
    top: tabrisLib.margin = null,
    width: js.UndefOr[tabrisLib.dimension] = js.undefined
  ): LayoutData = {
    val __obj = js.Dynamic.literal()
    if (baseline != null) __obj.updateDynamic("baseline")(baseline.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (!js.isUndefined(centerX)) __obj.updateDynamic("centerX")(centerX)
    if (!js.isUndefined(centerY)) __obj.updateDynamic("centerY")(centerY)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (top != null) __obj.updateDynamic("top")(top)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[LayoutData]
  }
}

