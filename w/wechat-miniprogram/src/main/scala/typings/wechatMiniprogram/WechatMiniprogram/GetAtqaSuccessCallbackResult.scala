package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAtqaSuccessCallbackResult extends js.Object {
  /** 返回 ATQA/SENS_RES 数据 */
  var atqa: ArrayBuffer = js.native
  var errMsg: String = js.native
}

object GetAtqaSuccessCallbackResult {
  @scala.inline
  def apply(atqa: ArrayBuffer, errMsg: String): GetAtqaSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(atqa = atqa.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAtqaSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetAtqaSuccessCallbackResultOps[Self <: GetAtqaSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setAtqa(value: ArrayBuffer): Self = this.set("atqa", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
  
}

