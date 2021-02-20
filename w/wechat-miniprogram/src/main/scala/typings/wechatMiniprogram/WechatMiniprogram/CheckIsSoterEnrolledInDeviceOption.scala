package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.facial
import typings.wechatMiniprogram.wechatMiniprogramStrings.fingerPrint
import typings.wechatMiniprogram.wechatMiniprogramStrings.speech
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckIsSoterEnrolledInDeviceOption extends StObject {
  
  /** 认证方式
    *
    * 可选值：
    * - 'fingerPrint': 指纹识别;
    * - 'facial': 人脸识别;
    * - 'speech': 声纹识别（暂未支持）; */
  var checkAuthMode: fingerPrint | facial | speech = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CheckIsSoterEnrolledInDeviceCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CheckIsSoterEnrolledInDeviceFailCallback] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CheckIsSoterEnrolledInDeviceSuccessCallback] = js.native
}
object CheckIsSoterEnrolledInDeviceOption {
  
  @scala.inline
  def apply(checkAuthMode: fingerPrint | facial | speech): CheckIsSoterEnrolledInDeviceOption = {
    val __obj = js.Dynamic.literal(checkAuthMode = checkAuthMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceOption]
  }
  
  @scala.inline
  implicit class CheckIsSoterEnrolledInDeviceOptionMutableBuilder[Self <: CheckIsSoterEnrolledInDeviceOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckAuthMode(value: fingerPrint | facial | speech): Self = StObject.set(x, "checkAuthMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ CheckIsSoterEnrolledInDeviceSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
