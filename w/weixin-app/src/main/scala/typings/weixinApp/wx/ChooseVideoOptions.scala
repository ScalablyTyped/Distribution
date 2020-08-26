package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体-----视频
@js.native
trait ChooseVideoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 前置或者后置摄像头，默认为前后都有，即：['front', 'back'] */
  var camera: js.UndefOr[CameraDevice] = js.native
  /** 是否压缩所选的视频源文件，默认值为true，需要压缩 */
  var compressed: js.UndefOr[Boolean] = js.native
  /** 拍摄视频最长拍摄时间，单位秒。最长支持60秒 */
  var maxDuration: js.UndefOr[Double] = js.native
  /** album 从相册选视频，camera 使用相机拍摄，默认为：['album', 'camera'] */
  var sourceType: js.UndefOr[js.Array[VideoSourceType]] = js.native
  /** 接口调用成功，返回视频文件的临时文件路径，详见返回参数说明 */
  @JSName("success")
  var success_ChooseVideoOptions: js.UndefOr[js.Function1[/* res */ VideoData, Unit]] = js.native
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
    def setCamera(value: CameraDevice): Self = this.set("camera", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    @scala.inline
    def setCompressed(value: Boolean): Self = this.set("compressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompressed: Self = this.set("compressed", js.undefined)
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

