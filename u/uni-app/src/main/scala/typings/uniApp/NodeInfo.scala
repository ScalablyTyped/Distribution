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
    bottom: js.UndefOr[Double] = js.undefined,
    context: MapContext | CanvasContext | VideoContext | EditorContext = null,
    dataset: js.Any = null,
    height: js.UndefOr[Double] = js.undefined,
    id: String = null,
    left: js.UndefOr[Double] = js.undefined,
    right: js.UndefOr[Double] = js.undefined,
    scrollLeft: js.UndefOr[Double] = js.undefined,
    scrollTop: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): NodeInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollLeft)) __obj.updateDynamic("scrollLeft")(scrollLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollTop)) __obj.updateDynamic("scrollTop")(scrollTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInfo]
  }
}

