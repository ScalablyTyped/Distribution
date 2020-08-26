package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadFileSuccessCallbackResult extends js.Object {
  /** 文件内容 */
  var data: String | ArrayBuffer = js.native
  var errMsg: String = js.native
}

object ReadFileSuccessCallbackResult {
  @scala.inline
  def apply(data: String | ArrayBuffer, errMsg: String): ReadFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadFileSuccessCallbackResult]
  }
  @scala.inline
  implicit class ReadFileSuccessCallbackResultOps[Self <: ReadFileSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setData(value: String | ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
  
}

