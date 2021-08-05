package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAtqaSuccessCallbackResult extends StObject {
  
  /** 返回 ATQA/SENS_RES 数据 */
  var atqa: ArrayBuffer
  
  var errMsg: String
}
object GetAtqaSuccessCallbackResult {
  
  inline def apply(atqa: ArrayBuffer, errMsg: String): GetAtqaSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(atqa = atqa.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAtqaSuccessCallbackResult]
  }
  
  extension [Self <: GetAtqaSuccessCallbackResult](x: Self) {
    
    inline def setAtqa(value: ArrayBuffer): Self = StObject.set(x, "atqa", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
