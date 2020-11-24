package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckIsSoterEnrolledInDeviceSuccessCallbackResult extends js.Object {
  
  /** 错误信息 */
  var errMsg: String = js.native
  
  /** 是否已录入信息 */
  var isEnrolled: Boolean = js.native
}
object CheckIsSoterEnrolledInDeviceSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, isEnrolled: Boolean): CheckIsSoterEnrolledInDeviceSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], isEnrolled = isEnrolled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class CheckIsSoterEnrolledInDeviceSuccessCallbackResultOps[Self <: CheckIsSoterEnrolledInDeviceSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setIsEnrolled(value: Boolean): Self = this.set("isEnrolled", value.asInstanceOf[js.Any])
  }
}
