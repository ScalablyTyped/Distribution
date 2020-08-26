package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseVideoOptions extends js.Object {
  /** 前置或者后置摄像头，默认为前后都有，即：['front', 'back'] */
  var camera: js.UndefOr[js.Array[CameraDevice]] = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.native
  /** 拍摄视频最长拍摄时间，单位秒。最长支持60秒 */
  var maxDuration: js.UndefOr[Double] = js.native
  /** album 从相册选视频，camera 使用相机拍摄，默认为：['album', 'camera'] */
  var sourceType: js.UndefOr[js.Array[VideoSourceType]] = js.native
  /** 接口调用成功，返回视频文件的临时文件路径，详见返回参数说明 */
  var success: js.UndefOr[js.Function1[/* res */ VideoData, Unit]] = js.native
}

object ChooseVideoOptions {
  @scala.inline
  def apply(): ChooseVideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseVideoOptions]
  }
  @scala.inline
  implicit class ChooseVideoOptionsOps[Self <: ChooseVideoOptions] (val x: Self) extends AnyVal {
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
    def setCameraVarargs(value: CameraDevice*): Self = this.set("camera", js.Array(value :_*))
    @scala.inline
    def setCamera(value: js.Array[CameraDevice]): Self = this.set("camera", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setMaxDuration(value: Double): Self = this.set("maxDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDuration: Self = this.set("maxDuration", js.undefined)
    @scala.inline
    def setSourceTypeVarargs(value: VideoSourceType*): Self = this.set("sourceType", js.Array(value :_*))
    @scala.inline
    def setSourceType(value: js.Array[VideoSourceType]): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ VideoData => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

