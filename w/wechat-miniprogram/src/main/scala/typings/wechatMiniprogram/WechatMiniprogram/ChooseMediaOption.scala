package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.album
import typings.wechatMiniprogram.wechatMiniprogramStrings.back
import typings.wechatMiniprogram.wechatMiniprogramStrings.camera
import typings.wechatMiniprogram.wechatMiniprogramStrings.front
import typings.wechatMiniprogram.wechatMiniprogramStrings.image
import typings.wechatMiniprogram.wechatMiniprogramStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseMediaOption extends js.Object {
  /** 仅在 sourceType 为 camera 时生效，使用前置或后置摄像头
    *
    * 可选值：
    * - 'back': 使用后置摄像头;
    * - 'front': 使用前置摄像头; */
  var camera: js.UndefOr[back | front] = js.native
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ChooseMediaCompleteCallback] = js.native
  /** 最多可以选择的文件个数 */
  var count: js.UndefOr[Double] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ChooseMediaFailCallback] = js.native
  /** 拍摄视频最长拍摄时间，单位秒。时间范围为 3s 至 30s 之间 */
  var maxDuration: js.UndefOr[Double] = js.native
  /** 文件类型
    *
    * 可选值：
    * - 'image': 只能拍摄图片或从相册选择图片;
    * - 'video': 只能拍摄视频或从相册选择视频; */
  var mediaType: js.UndefOr[js.Array[image | video]] = js.native
  /** 仅对 mediaType 为 image 时有效，是否压缩所选文件 */
  var sizeType: js.UndefOr[js.Array[String]] = js.native
  /** 图片和视频选择的来源
    *
    * 可选值：
    * - 'album': 从相册选择;
    * - 'camera': 使用相机拍摄; */
  var sourceType: js.UndefOr[js.Array[album | camera]] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ChooseMediaSuccessCallback] = js.native
}

object ChooseMediaOption {
  @scala.inline
  def apply(): ChooseMediaOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseMediaOption]
  }
  @scala.inline
  implicit class ChooseMediaOptionOps[Self <: ChooseMediaOption] (val x: Self) extends AnyVal {
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
    def setCamera(value: back | front): Self = this.set("camera", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setMaxDuration(value: Double): Self = this.set("maxDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDuration: Self = this.set("maxDuration", js.undefined)
    @scala.inline
    def setMediaTypeVarargs(value: (image | video)*): Self = this.set("mediaType", js.Array(value :_*))
    @scala.inline
    def setMediaType(value: js.Array[image | video]): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaType: Self = this.set("mediaType", js.undefined)
    @scala.inline
    def setSizeTypeVarargs(value: String*): Self = this.set("sizeType", js.Array(value :_*))
    @scala.inline
    def setSizeType(value: js.Array[String]): Self = this.set("sizeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeType: Self = this.set("sizeType", js.undefined)
    @scala.inline
    def setSourceTypeVarargs(value: (album | camera)*): Self = this.set("sourceType", js.Array(value :_*))
    @scala.inline
    def setSourceType(value: js.Array[album | camera]): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
    @scala.inline
    def setSuccess(value: /* result */ ChooseMediaSuccessCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

