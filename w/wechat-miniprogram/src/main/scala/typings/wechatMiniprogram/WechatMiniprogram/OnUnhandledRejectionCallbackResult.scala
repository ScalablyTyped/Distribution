package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnUnhandledRejectionCallbackResult extends StObject {
  
  /** 被拒绝的 Promise 对象 */
  var promise: js.Promise[js.Any]
  
  /** 拒绝原因，一般是一个 Error 对象 */
  var reason: String
}
object OnUnhandledRejectionCallbackResult {
  
  inline def apply(promise: js.Promise[js.Any], reason: String): OnUnhandledRejectionCallbackResult = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnUnhandledRejectionCallbackResult]
  }
  
  extension [Self <: OnUnhandledRejectionCallbackResult](x: Self) {
    
    inline def setPromise(value: js.Promise[js.Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
