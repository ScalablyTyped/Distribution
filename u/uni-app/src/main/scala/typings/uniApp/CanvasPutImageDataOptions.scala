package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasPutImageDataOptions extends js.Object {
  /**
    * 画布标识，传入 <canvas/> 的 canvas-id
    */
  var canvasId: js.UndefOr[String] = js.native
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 图像像素点数据，一维数组，每四项表示一个像素点的rgba
    */
  var data: js.UndefOr[js.Array[_]] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 源图像数据矩形区域的高度
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 源图像数据矩形区域的宽度
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * 源图像数据在目标画布中的位置偏移量（x 轴方向的偏移量）
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * 源图像数据在目标画布中的位置偏移量（y 轴方向的偏移量）
    */
  var y: js.UndefOr[Double] = js.native
}

object CanvasPutImageDataOptions {
  @scala.inline
  def apply(): CanvasPutImageDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasPutImageDataOptions]
  }
  @scala.inline
  implicit class CanvasPutImageDataOptionsOps[Self <: CanvasPutImageDataOptions] (val x: Self) extends AnyVal {
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
    def setCanvasId(value: String): Self = this.set("canvasId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanvasId: Self = this.set("canvasId", js.undefined)
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

