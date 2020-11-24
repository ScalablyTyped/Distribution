package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.facial
import typings.wechatMiniprogram.wechatMiniprogramStrings.fingerPrint
import typings.wechatMiniprogram.wechatMiniprogramStrings.speech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckIsSupportSoterAuthenticationSuccessCallbackResult extends js.Object {
  
  var errMsg: String = js.native
  
  /** 该设备支持的可被SOTER识别的生物识别方式
    *
    * 可选值：
    * - 'fingerPrint': 指纹识别;
    * - 'facial': 人脸识别;
    * - 'speech': 声纹识别（暂未支持）; */
  var supportMode: js.Array[fingerPrint | facial | speech] = js.native
}
object CheckIsSupportSoterAuthenticationSuccessCallbackResult {
  
  @scala.inline
  def apply(errMsg: String, supportMode: js.Array[fingerPrint | facial | speech]): CheckIsSupportSoterAuthenticationSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], supportMode = supportMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsSupportSoterAuthenticationSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class CheckIsSupportSoterAuthenticationSuccessCallbackResultOps[Self <: CheckIsSupportSoterAuthenticationSuccessCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setSupportModeVarargs(value: (fingerPrint | facial | speech)*): Self = this.set("supportMode", js.Array(value :_*))
    
    @scala.inline
    def setSupportMode(value: js.Array[fingerPrint | facial | speech]): Self = this.set("supportMode", value.asInstanceOf[js.Any])
  }
}
