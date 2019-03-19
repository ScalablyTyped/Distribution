package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRect extends js.Object {
  /**
    * 节点的下边界坐标
    */
  var bottom: js.UndefOr[scala.Double] = js.undefined
  /**
    * 节点的dataset
    */
  var dataset: js.UndefOr[js.Any] = js.undefined
  /**
    * 节点的高度
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * 节点的ID
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 节点的左边界坐标
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
    * 节点的右边界坐标
    */
  var right: js.UndefOr[scala.Double] = js.undefined
  /**
    * 节点的上边界坐标
    */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
    * 节点的宽度
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object NodeRect {
  @scala.inline
  def apply(
    bottom: scala.Int | scala.Double = null,
    dataset: js.Any = null,
    height: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    left: scala.Int | scala.Double = null,
    right: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): NodeRect = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeRect]
  }
}

