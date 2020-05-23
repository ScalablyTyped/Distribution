package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserveResult extends js.Object {
  /**
    * 目标节点布局区域的边界
    */
  var boundingClientRect: js.UndefOr[ObserveNodeRect] = js.undefined
  /**
    * 相交比例
    */
  var intersectionRatio: js.UndefOr[Double] = js.undefined
  /**
    * 相交区域的边界
    */
  var intersectionRect: js.UndefOr[js.Any] = js.undefined
  /**
    * 参照区域的边界
    */
  var relativeRect: js.UndefOr[ObserveNodeRect] = js.undefined
  /**
    * 相交检测时的时间戳
    */
  var time: js.UndefOr[Double] = js.undefined
}

object ObserveResult {
  @scala.inline
  def apply(
    boundingClientRect: ObserveNodeRect = null,
    intersectionRatio: js.UndefOr[Double] = js.undefined,
    intersectionRect: js.Any = null,
    relativeRect: ObserveNodeRect = null,
    time: js.UndefOr[Double] = js.undefined
  ): ObserveResult = {
    val __obj = js.Dynamic.literal()
    if (boundingClientRect != null) __obj.updateDynamic("boundingClientRect")(boundingClientRect.asInstanceOf[js.Any])
    if (!js.isUndefined(intersectionRatio)) __obj.updateDynamic("intersectionRatio")(intersectionRatio.get.asInstanceOf[js.Any])
    if (intersectionRect != null) __obj.updateDynamic("intersectionRect")(intersectionRect.asInstanceOf[js.Any])
    if (relativeRect != null) __obj.updateDynamic("relativeRect")(relativeRect.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserveResult]
  }
}

