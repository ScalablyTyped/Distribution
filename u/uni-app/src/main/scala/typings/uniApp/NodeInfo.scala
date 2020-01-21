package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeInfo extends js.Object {
  /**
    * 节点的下边界坐标
    */
  var bottom: js.UndefOr[Double] = js.undefined
  /**
    * 节点对应的 Context 对象
    */
  var context: js.UndefOr[MapContext | CanvasContext | VideoContext | EditorContext] = js.undefined
  /**
    * 节点的dataset
    */
  var dataset: js.UndefOr[js.Any] = js.undefined
  /**
    * 节点的高度
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * 节点的ID
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * 节点的左边界坐标
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * 节点的右边界坐标
    */
  var right: js.UndefOr[Double] = js.undefined
  /**
    * 节点的水平滚动位置
    */
  var scrollLeft: js.UndefOr[Double] = js.undefined
  /**
    * 节点的垂直滚动位置
    */
  var scrollTop: js.UndefOr[Double] = js.undefined
  /**
    * 节点的上边界坐标
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    * 节点的宽度
    */
  var width: js.UndefOr[Double] = js.undefined
}

object NodeInfo {
  @scala.inline
  def apply(
    bottom: Int | Double = null,
    context: MapContext | CanvasContext | VideoContext | EditorContext = null,
    dataset: js.Any = null,
    height: Int | Double = null,
    id: String = null,
    left: Int | Double = null,
    right: Int | Double = null,
    scrollLeft: Int | Double = null,
    scrollTop: Int | Double = null,
    top: Int | Double = null,
    width: Int | Double = null
  ): NodeInfo = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfo]
  }
}

