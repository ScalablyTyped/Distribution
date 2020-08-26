package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.album
import typings.wechatMiniprogram.wechatMiniprogramStrings.camera
import typings.wechatMiniprogram.wechatMiniprogramStrings.compressed
import typings.wechatMiniprogram.wechatMiniprogramStrings.original
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseImageOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ChooseImageCompleteCallback] = js.native
  /** 最多可以选择的图片张数 */
  var count: js.UndefOr[Double] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ChooseImageFailCallback] = js.native
  /** 所选的图片的尺寸
    *
    * 可选值：
    * - 'original': 原图;
    * - 'compressed': 压缩图; */
  var sizeType: js.UndefOr[js.Array[original | compressed]] = js.native
  /** 选择图片的来源
    *
    * 可选值：
    * - 'album': 从相册选图;
    * - 'camera': 使用相机; */
  var sourceType: js.UndefOr[js.Array[album | camera]] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ChooseImageSuccessCallback] = js.native
}

object ChooseImageOption {
  @scala.inline
  def apply(): ChooseImageOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseImageOption]
  }
  @scala.inline
  implicit class ChooseImageOptionOps[Self <: ChooseImageOption] (val x: Self) extends AnyVal {
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
    def setSizeTypeVarargs(value: (original | compressed)*): Self = this.set("sizeType", js.Array(value :_*))
    @scala.inline
    def setSizeType(value: js.Array[original | compressed]): Self = this.set("sizeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeType: Self = this.set("sizeType", js.undefined)
    @scala.inline
    def setSourceTypeVarargs(value: (album | camera)*): Self = this.set("sourceType", js.Array(value :_*))
    @scala.inline
    def setSourceType(value: js.Array[album | camera]): Self = this.set("sourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("sourceType", js.undefined)
    @scala.inline
    def setSuccess(value: /* result */ ChooseImageSuccessCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

