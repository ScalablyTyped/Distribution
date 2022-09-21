package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRandomValuesSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 随机数内容，长度为传入的字节数 */
  var randomValues: js.typedarray.ArrayBuffer
}
object GetRandomValuesSuccessCallbackResult {
  
  inline def apply(errMsg: String, randomValues: js.typedarray.ArrayBuffer): GetRandomValuesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], randomValues = randomValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRandomValuesSuccessCallbackResult]
  }
  
  extension [Self <: GetRandomValuesSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setRandomValues(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "randomValues", value.asInstanceOf[js.Any])
  }
}
