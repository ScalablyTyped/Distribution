package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviewImageOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[PreviewImageCompleteCallback] = js.native
  /** 当前显示图片的链接 */
  var current: js.UndefOr[String] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[PreviewImageFailCallback] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[PreviewImageSuccessCallback] = js.native
  /** 需要预览的图片链接列表。[2.2.3](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html) 起支持云文件ID。 */
  var urls: js.Array[String] = js.native
}

object PreviewImageOption {
  @scala.inline
  def apply(urls: js.Array[String]): PreviewImageOption = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewImageOption]
  }
  @scala.inline
  implicit class PreviewImageOptionOps[Self <: PreviewImageOption] (val x: Self) extends AnyVal {
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
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setCurrent(value: String): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

