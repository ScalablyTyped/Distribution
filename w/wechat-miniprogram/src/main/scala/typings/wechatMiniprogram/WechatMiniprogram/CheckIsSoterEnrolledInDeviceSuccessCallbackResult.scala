package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckIsSoterEnrolledInDeviceSuccessCallbackResult extends StObject {
  
  /** 错误信息 */
  var errMsg: String
  
  /** 是否已录入信息 */
  var isEnrolled: Boolean
}
object CheckIsSoterEnrolledInDeviceSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, isEnrolled: Boolean): CheckIsSoterEnrolledInDeviceSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], isEnrolled = isEnrolled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class CheckIsSoterEnrolledInDeviceSuccessCallbackResultMutableBuilder[Self <: CheckIsSoterEnrolledInDeviceSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnrolled(value: Boolean): Self = StObject.set(x, "isEnrolled", value.asInstanceOf[js.Any])
  }
}
