package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSelectedTextRangeSuccessCallbackResult extends js.Object {
  /** 输入框光标结束位置 */
  var end: Double = js.native
  var errMsg: String = js.native
  /** 输入框光标起始位置 */
  var start: Double = js.native
}

object GetSelectedTextRangeSuccessCallbackResult {
  @scala.inline
  def apply(end: Double, errMsg: String, start: Double): GetSelectedTextRangeSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSelectedTextRangeSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetSelectedTextRangeSuccessCallbackResultOps[Self <: GetSelectedTextRangeSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

