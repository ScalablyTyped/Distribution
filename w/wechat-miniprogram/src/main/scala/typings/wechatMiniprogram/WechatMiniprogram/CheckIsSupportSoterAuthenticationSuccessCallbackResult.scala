package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.facial
import typings.wechatMiniprogram.wechatMiniprogramStrings.fingerPrint
import typings.wechatMiniprogram.wechatMiniprogramStrings.speech
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckIsSupportSoterAuthenticationSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 该设备支持的可被SOTER识别的生物识别方式
    *
    * 可选值：
    * - 'fingerPrint': 指纹识别;
    * - 'facial': 人脸识别;
    * - 'speech': 声纹识别（暂未支持）; */
  var supportMode: js.Array[fingerPrint | facial | speech]
}
object CheckIsSupportSoterAuthenticationSuccessCallbackResult {
  
  inline def apply(errMsg: String, supportMode: js.Array[fingerPrint | facial | speech]): CheckIsSupportSoterAuthenticationSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], supportMode = supportMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsSupportSoterAuthenticationSuccessCallbackResult]
  }
  
  extension [Self <: CheckIsSupportSoterAuthenticationSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setSupportMode(value: js.Array[fingerPrint | facial | speech]): Self = StObject.set(x, "supportMode", value.asInstanceOf[js.Any])
    
    inline def setSupportModeVarargs(value: (fingerPrint | facial | speech)*): Self = StObject.set(x, "supportMode", js.Array(value :_*))
  }
}
