package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContentsSuccessCallbackResult extends js.Object {
  /** 表示内容的delta对象 */
  var delta: IAnyObject = js.native
  var errMsg: String = js.native
  /** 带标签的HTML内容 */
  var html: String = js.native
  /** 纯文本内容 */
  var text: String = js.native
}

object GetContentsSuccessCallbackResult {
  @scala.inline
  def apply(delta: IAnyObject, errMsg: String, html: String, text: String): GetContentsSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContentsSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetContentsSuccessCallbackResultOps[Self <: GetContentsSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setDelta(value: IAnyObject): Self = this.set("delta", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

