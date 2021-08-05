package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerOnMessageCallbackResult extends StObject {
  
  /** 主线程/Worker 线程向当前线程发送的消息 */
  var message: IAnyObject
}
object WorkerOnMessageCallbackResult {
  
  inline def apply(message: IAnyObject): WorkerOnMessageCallbackResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOnMessageCallbackResult]
  }
  
  extension [Self <: WorkerOnMessageCallbackResult](x: Self) {
    
    inline def setMessage(value: IAnyObject): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
