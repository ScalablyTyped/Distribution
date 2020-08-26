package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObserveResponse extends js.Object {
   // 相交区域占目标节点的布局区域的比例
  var boundingClientRect: RectArea = js.native
  var dataset: js.Any = js.native
  var id: String = js.native
  var intersectionRatio: Double = js.native
  var intersectionRect: RectArea = js.native
  var relativeRect: RectArea = js.native
  var time: Double = js.native
}

object ObserveResponse {
  @scala.inline
  def apply(
    boundingClientRect: RectArea,
    dataset: js.Any,
    id: String,
    intersectionRatio: Double,
    intersectionRect: RectArea,
    relativeRect: RectArea,
    time: Double
  ): ObserveResponse = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], relativeRect = relativeRect.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserveResponse]
  }
  @scala.inline
  implicit class ObserveResponseOps[Self <: ObserveResponse] (val x: Self) extends AnyVal {
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
    def setBoundingClientRect(value: RectArea): Self = this.set("boundingClientRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataset(value: js.Any): Self = this.set("dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntersectionRatio(value: Double): Self = this.set("intersectionRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntersectionRect(value: RectArea): Self = this.set("intersectionRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeRect(value: RectArea): Self = this.set("relativeRect", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}

