package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnUnhandledRejectionCallbackResult extends js.Object {
  
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
  implicit class OnUnhandledRejectionCallbackResultOps[Self <: OnUnhandledRejectionCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPromise(value: js.Promise[_]): Self = this.set("promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
