package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnUnhandledRejectionCallbackResult extends StObject {
  
  /** 被拒绝的 Promise 对象 */
  var promise: js.Promise[_] = js.native
  
  /** 拒绝原因，一般是一个 Error 对象 */
  var reason: String = js.native
}
object OnUnhandledRejectionCallbackResult {
  
  @scala.inline
  def apply(promise: js.Promise[_], reason: String): OnUnhandledRejectionCallbackResult = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnUnhandledRejectionCallbackResult]
  }
  
  @scala.inline
  implicit class OnUnhandledRejectionCallbackResultMutableBuilder[Self <: OnUnhandledRejectionCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPromise(value: js.Promise[_]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
