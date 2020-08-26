package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadFontFaceOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[LoadFontFaceCompleteCallback] = js.native
  /** 可选的字体描述符 */
  var desc: js.UndefOr[DescOption] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[LoadFontFaceFailCallback] = js.native
  /** 定义的字体名称 */
  var family: String = js.native
  /** 是否全局生效
    *
    * 最低基础库： `2.10.0` */
  var global: js.UndefOr[Boolean] = js.native
  /** 字体资源的地址。建议格式为 TTF 和 WOFF，WOFF2 在低版本的iOS上会不兼容。 */
  var source: String = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[LoadFontFaceSuccessCallback] = js.native
}

object LoadFontFaceOption {
  @scala.inline
  def apply(family: String, source: String): LoadFontFaceOption = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadFontFaceOption]
  }
  @scala.inline
  implicit class LoadFontFaceOptionOps[Self <: LoadFontFaceOption] (val x: Self) extends AnyVal {
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
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* result */ LoadFontFaceCompleteCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setDesc(value: DescOption): Self = this.set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    @scala.inline
    def setFail(value: /* result */ LoadFontFaceCompleteCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setSuccess(value: /* result */ LoadFontFaceCompleteCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

