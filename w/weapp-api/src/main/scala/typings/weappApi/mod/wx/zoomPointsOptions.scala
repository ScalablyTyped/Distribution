package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait zoomPointsOptions extends CommonCallbackOptions {
  //  坐标点形成的矩形边缘到地图边缘的距离，单位像素。格式为[上,右,下,左]，安卓上只能识别数组第一项，上下左右的padding一致。开发者工具暂不支持padding参数。
  var padding: js.UndefOr[js.Array[Double]] = js.native
  //  要显示在可视区域内的坐标点列表
  var points: js.Array[LocationBaseOptions] = js.native
}

object zoomPointsOptions {
  @scala.inline
  def apply(points: js.Array[LocationBaseOptions]): zoomPointsOptions = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[zoomPointsOptions]
  }
  @scala.inline
  implicit class zoomPointsOptionsOps[Self <: zoomPointsOptions] (val x: Self) extends AnyVal {
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
    def setPointsVarargs(value: LocationBaseOptions*): Self = this.set("points", js.Array(value :_*))
    @scala.inline
    def setPoints(value: js.Array[LocationBaseOptions]): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    @scala.inline
    def setPadding(value: js.Array[Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
  
}

