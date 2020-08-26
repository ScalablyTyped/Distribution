package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntersectionObserverObserveCallbackResult extends js.Object {
  /** 目标边界 */
  var boundingClientRect: BoundingClientRectResult = js.native
  /** 相交比例 */
  var intersectionRatio: Double = js.native
  /** 相交区域的边界 */
  var intersectionRect: IntersectionRectResult = js.native
  /** 参照区域的边界 */
  var relativeRect: RelativeRectResult = js.native
  /** 相交检测时的时间戳 */
  var time: Double = js.native
}

object IntersectionObserverObserveCallbackResult {
  @scala.inline
  def apply(
    boundingClientRect: BoundingClientRectResult,
    intersectionRatio: Double,
    intersectionRect: IntersectionRectResult,
    relativeRect: RelativeRectResult,
    time: Double
  ): IntersectionObserverObserveCallbackResult = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], relativeRect = relativeRect.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionObserverObserveCallbackResult]
  }
  @scala.inline
  implicit class IntersectionObserverObserveCallbackResultOps[Self <: IntersectionObserverObserveCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBoundingClientRect(value: BoundingClientRectResult): Self = this.set("boundingClientRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntersectionRatio(value: Double): Self = this.set("intersectionRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntersectionRect(value: IntersectionRectResult): Self = this.set("intersectionRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeRect(value: RelativeRectResult): Self = this.set("relativeRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}

