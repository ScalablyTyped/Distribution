package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHistoricalBytesSuccessCallbackResult extends StObject {
  
  var errMsg: String
  
  /** 返回历史二进制数据 */
  var histBytes: ArrayBuffer
}
object GetHistoricalBytesSuccessCallbackResult {
  
  inline def apply(errMsg: String, histBytes: ArrayBuffer): GetHistoricalBytesSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], histBytes = histBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHistoricalBytesSuccessCallbackResult]
  }
  
  extension [Self <: GetHistoricalBytesSuccessCallbackResult](x: Self) {
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setHistBytes(value: ArrayBuffer): Self = StObject.set(x, "histBytes", value.asInstanceOf[js.Any])
  }
}
