package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasToTempFilePathOptions extends js.Object {
  /**
    * 画布标识，传入 <canvas/> 的 canvas-id
    */
  var canvasId: js.UndefOr[String] = js.native
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 输出图片高度（默认为 height * 屏幕像素密度）
    */
  var destHeight: js.UndefOr[Double] = js.native
  /**
    * 输出图片宽度（默认为 width * 屏幕像素密度）
    */
  var destWidth: js.UndefOr[Double] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 目标文件的类型，默认为 'png'
    */
  var fileType: js.UndefOr[String] = js.native
  /**
    * 画布高度（默认为canvas高度-y）
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * 图片的质量，取值范围为 (0, 1]，不在范围内时当作1.0处理
    */
  var quality: js.UndefOr[Double] = js.native
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ CanvasToTempFilePathRes, Unit]] = js.native
  /**
    * 画布宽度（默认为canvas宽度-x）
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * 画布x轴起点（默认0）
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * 画布y轴起点（默认0）
    */
  var y: js.UndefOr[Double] = js.native
}

object CanvasToTempFilePathOptions {
  @scala.inline
  def apply(): CanvasToTempFilePathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasToTempFilePathOptions]
  }
  @scala.inline
  implicit class CanvasToTempFilePathOptionsOps[Self <: CanvasToTempFilePathOptions] (val x: Self) extends AnyVal {
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
    def setDestHeight(value: Double): Self = this.set("destHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestHeight: Self = this.set("destHeight", js.undefined)
    @scala.inline
    def setDestWidth(value: Double): Self = this.set("destWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestWidth: Self = this.set("destWidth", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setFileType(value: String): Self = this.set("fileType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileType: Self = this.set("fileType", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setSuccess(value: /* result */ CanvasToTempFilePathRes => Unit): Self = this.set("success", js.Any.fromFunction1(value))
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

