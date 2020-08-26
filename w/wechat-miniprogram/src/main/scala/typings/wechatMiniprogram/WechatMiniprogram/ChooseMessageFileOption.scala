package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.all
import typings.wechatMiniprogram.wechatMiniprogramStrings.file
import typings.wechatMiniprogram.wechatMiniprogramStrings.image
import typings.wechatMiniprogram.wechatMiniprogramStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseMessageFileOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ChooseMessageFileCompleteCallback] = js.native
  /** 最多可以选择的文件个数，可以 0～100 */
  var count: Double = js.native
  /** 根据文件拓展名过滤，仅 type==file 时有效。每一项都不能是空字符串。默认不过滤。
    *
    * 最低基础库： `2.6.0` */
  var extension: js.UndefOr[js.Array[String]] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ChooseMessageFileFailCallback] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ChooseMessageFileSuccessCallback] = js.native
  /** 所选的文件的类型
    *
    * 可选值：
    * - 'all': 从所有文件选择;
    * - 'video': 只能选择视频文件;
    * - 'image': 只能选择图片文件;
    * - 'file': 可以选择除了图片和视频之外的其它的文件; */
  var `type`: js.UndefOr[all | video | image | file] = js.native
}

object ChooseMessageFileOption {
  @scala.inline
  def apply(count: Double): ChooseMessageFileOption = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseMessageFileOption]
  }
  @scala.inline
  implicit class ChooseMessageFileOptionOps[Self <: ChooseMessageFileOption] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setExtensionVarargs(value: String*): Self = this.set("extension", js.Array(value :_*))
    @scala.inline
    def setExtension(value: js.Array[String]): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* result */ ChooseMessageFileSuccessCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setType(value: all | video | image | file): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

