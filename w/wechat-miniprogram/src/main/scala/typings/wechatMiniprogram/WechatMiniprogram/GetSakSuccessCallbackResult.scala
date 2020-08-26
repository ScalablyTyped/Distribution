package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSakSuccessCallbackResult extends js.Object {
  var errMsg: String = js.native
  /** 返回 SAK/SEL_RES 数据 */
  var sak: Double = js.native
}

object GetSakSuccessCallbackResult {
  @scala.inline
  def apply(errMsg: String, sak: Double): GetSakSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], sak = sak.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSakSuccessCallbackResult]
  }
  @scala.inline
  implicit class GetSakSuccessCallbackResultOps[Self <: GetSakSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setSak(value: Double): Self = this.set("sak", value.asInstanceOf[js.Any])
  }
  
}

