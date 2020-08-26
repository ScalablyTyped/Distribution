package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClipboardDataSuccessCallbackOption extends js.Object {
  /** 剪贴板的内容 */
  var data: String = js.native
}

object GetClipboardDataSuccessCallbackOption {
  @scala.inline
  def apply(data: String): GetClipboardDataSuccessCallbackOption = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClipboardDataSuccessCallbackOption]
  }
  @scala.inline
  implicit class GetClipboardDataSuccessCallbackOptionOps[Self <: GetClipboardDataSuccessCallbackOption] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

