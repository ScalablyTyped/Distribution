package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSoterAuthenticationOptions extends StObject {
  
  /**
    * 验证描述，即识别过程中显示在界面上的对话框提示内容
    */
  var authContent: js.UndefOr[String] = js.undefined
  
  /**
    * 挑战因子
    */
  var challenge: js.UndefOr[String] = js.undefined
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 请求使用的可接受的生物认证方式
    */
  var requestAuthModes: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ StartSoterAuthenticationRes, Unit]] = js.undefined
}
object StartSoterAuthenticationOptions {
  
  inline def apply(): StartSoterAuthenticationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSoterAuthenticationOptions]
  }
  
  extension [Self <: StartSoterAuthenticationOptions](x: Self) {
    
    inline def setAuthContent(value: String): Self = StObject.set(x, "authContent", value.asInstanceOf[js.Any])
    
    inline def setAuthContentUndefined: Self = StObject.set(x, "authContent", js.undefined)
    
    inline def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setRequestAuthModes(value: js.Array[js.Any]): Self = StObject.set(x, "requestAuthModes", value.asInstanceOf[js.Any])
    
    inline def setRequestAuthModesUndefined: Self = StObject.set(x, "requestAuthModes", js.undefined)
    
    inline def setRequestAuthModesVarargs(value: js.Any*): Self = StObject.set(x, "requestAuthModes", js.Array(value :_*))
    
    inline def setSuccess(value: /* result */ StartSoterAuthenticationRes => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
