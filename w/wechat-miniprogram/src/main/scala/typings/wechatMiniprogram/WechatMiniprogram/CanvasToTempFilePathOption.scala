package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.jpg
import typings.wechatMiniprogram.wechatMiniprogramStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasToTempFilePathOption extends js.Object {
  /** 画布标识，传入 [canvas](https://developers.weixin.qq.com/miniprogram/dev/component/canvas.html) 组件实例 （canvas type="2d" 时使用该属性）。 */
  var canvas: js.UndefOr[IAnyObject] = js.native
  /** 画布标识，传入 [canvas](https://developers.weixin.qq.com/miniprogram/dev/component/canvas.html) 组件的 canvas-id */
  var canvasId: js.UndefOr[String] = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CanvasToTempFilePathCompleteCallback] = js.native
  /** 输出的图片的高度
    *
    * 最低基础库： `1.2.0` */
  var destHeight: js.UndefOr[Double] = js.native
  /** 输出的图片的宽度
    *
    * 最低基础库： `1.2.0` */
  var destWidth: js.UndefOr[Double] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CanvasToTempFilePathFailCallback] = js.native
  /** 目标文件的类型
    *
    * 可选值：
    * - 'jpg': jpg 图片;
    * - 'png': png 图片;
    *
    * 最低基础库： `1.7.0` */
  var fileType: js.UndefOr[jpg | png] = js.native
  /** 指定的画布区域的高度
    *
    * 最低基础库： `1.2.0` */
  var height: js.UndefOr[Double] = js.native
  /** 图片的质量，目前仅对 jpg 有效。取值范围为 (0, 1]，不在范围内时当作 1.0 处理。
    *
    * 最低基础库： `1.7.0` */
  var quality: js.UndefOr[Double] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CanvasToTempFilePathSuccessCallback] = js.native
  /** 指定的画布区域的宽度
    *
    * 最低基础库： `1.2.0` */
  var width: js.UndefOr[Double] = js.native
  /** 指定的画布区域的左上角横坐标
    *
    * 最低基础库： `1.2.0` */
  var x: js.UndefOr[Double] = js.native
  /** 指定的画布区域的左上角纵坐标
    *
    * 最低基础库： `1.2.0` */
  var y: js.UndefOr[Double] = js.native
}

object CanvasToTempFilePathOption {
  @scala.inline
  def apply(): CanvasToTempFilePathOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasToTempFilePathOption]
  }
  @scala.inline
  implicit class CanvasToTempFilePathOptionOps[Self <: CanvasToTempFilePathOption] (val x: Self) extends AnyVal {
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
    def setCanvas(value: IAnyObject): Self = this.set("canvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanvas: Self = this.set("canvas", js.undefined)
    @scala.inline
    def setCanvasId(value: String): Self = this.set("canvasId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanvasId: Self = this.set("canvasId", js.undefined)
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
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
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setFileType(value: jpg | png): Self = this.set("fileType", value.asInstanceOf[js.Any])
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
    def setSuccess(value: /* result */ CanvasToTempFilePathSuccessCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
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

