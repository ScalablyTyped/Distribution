package typings.uniApp

import typings.uniApp.uniAppStrings.facial
import typings.uniApp.uniAppStrings.fingerPrint
import typings.uniApp.uniAppStrings.speech
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckIsSoterEnrolledInDeviceOptions extends StObject {
  
  /**
    * 认证方式
    * - fingerPrint: 指纹识别
    * - facial: 人脸识别（暂未支持）
    * - speech: 声纹识别（暂未支持）
    */
  var checkAuthMode: js.UndefOr[fingerPrint | facial | speech] = js.undefined
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object CheckIsSoterEnrolledInDeviceOptions {
  
  inline def apply(): CheckIsSoterEnrolledInDeviceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceOptions]
  }
  
  extension [Self <: CheckIsSoterEnrolledInDeviceOptions](x: Self) {
    
    inline def setCheckAuthMode(value: fingerPrint | facial | speech): Self = StObject.set(x, "checkAuthMode", value.asInstanceOf[js.Any])
    
    inline def setCheckAuthModeUndefined: Self = StObject.set(x, "checkAuthMode", js.undefined)
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
