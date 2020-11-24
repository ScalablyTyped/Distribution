package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.facial
import typings.wechatMiniprogram.wechatMiniprogramStrings.fingerPrint
import typings.wechatMiniprogram.wechatMiniprogramStrings.speech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSoterAuthenticationOption extends js.Object {
  
  /** 验证描述，即识别过程中显示在界面上的对话框提示内容 */
  var authContent: js.UndefOr[String] = js.native
  
  /** 挑战因子。挑战因子为调用者为此次生物鉴权准备的用于签名的字符串关键识别信息，将作为 `resultJSON` 的一部分，供调用者识别本次请求。例如：如果场景为请求用户对某订单进行授权确认，则可以将订单号填入此参数。 */
  var challenge: String = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartSoterAuthenticationCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartSoterAuthenticationFailCallback] = js.native
  
  /** 请求使用的可接受的生物认证方式
    *
    * 可选值：
    * - 'fingerPrint': 指纹识别;
    * - 'facial': 人脸识别;
    * - 'speech': 声纹识别（暂未支持）; */
  var requestAuthModes: js.Array[fingerPrint | facial | speech] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartSoterAuthenticationSuccessCallback] = js.native
}
object StartSoterAuthenticationOption {
  
  @scala.inline
  def apply(challenge: String, requestAuthModes: js.Array[fingerPrint | facial | speech]): StartSoterAuthenticationOption = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], requestAuthModes = requestAuthModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSoterAuthenticationOption]
  }
  
  @scala.inline
  implicit class StartSoterAuthenticationOptionOps[Self <: StartSoterAuthenticationOption] (val x: Self) extends AnyVal {
    
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
    def setChallenge(value: String): Self = this.set("challenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestAuthModesVarargs(value: (fingerPrint | facial | speech)*): Self = this.set("requestAuthModes", js.Array(value :_*))
    
    @scala.inline
    def setRequestAuthModes(value: js.Array[fingerPrint | facial | speech]): Self = this.set("requestAuthModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthContent(value: String): Self = this.set("authContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthContent: Self = this.set("authContent", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ StartSoterAuthenticationSuccessCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
