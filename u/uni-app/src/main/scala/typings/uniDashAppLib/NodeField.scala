package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeField extends js.Object {
  /**
    * 节点的dataset
    */
  var dataset: js.UndefOr[js.Any] = js.undefined
  /**
    * 节点的高度
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * 节点的水平滚动位置
    */
  var scrollLeft: js.UndefOr[scala.Double] = js.undefined
  /**
    * 节点的竖直滚动位置
    */
  var scrollTop: js.UndefOr[scala.Double] = js.undefined
  /**
    * 节点 scroll-x 属性的当前值
    */
  var scrollX: js.UndefOr[scala.Double] = js.undefined
  /**
    * 节点 scroll-y 属性的当前值
    */
  var scrollY: js.UndefOr[scala.Double] = js.undefined
  /**
    * 节点的宽度
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object NodeField {
  @scala.inline
  def apply(
    dataset: js.Any = null,
    height: scala.Int | scala.Double = null,
    scrollLeft: scala.Int | scala.Double = null,
    scrollTop: scala.Int | scala.Double = null,
    scrollX: scala.Int | scala.Double = null,
    scrollY: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): NodeField = {
    val __obj = js.Dynamic.literal()
    if (dataset != null) __obj.updateDynamic("dataset")(dataset)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (scrollX != null) __obj.updateDynamic("scrollX")(scrollX.asInstanceOf[js.Any])
    if (scrollY != null) __obj.updateDynamic("scrollY")(scrollY.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeField]
  }
}

