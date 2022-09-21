package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadSuccessCallbackResult extends StObject {
  
  /** 被写入的缓存区的对象，即接口入参的 arrayBuffer */
  var arrayBuffer: js.typedarray.ArrayBuffer
  
  /** 实际读取的字节数 */
  var bytesRead: Double
  
  var errMsg: String
}
object ReadSuccessCallbackResult {
  
  inline def apply(arrayBuffer: js.typedarray.ArrayBuffer, bytesRead: Double, errMsg: String): ReadSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadSuccessCallbackResult]
  }
  
  extension [Self <: ReadSuccessCallbackResult](x: Self) {
    
    inline def setArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "arrayBuffer", value.asInstanceOf[js.Any])
    
    inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
