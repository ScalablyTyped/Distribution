package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketTaskOnCloseCallbackResult extends js.Object {
  
  /** 一个数字值表示关闭连接的状态号，表示连接被关闭的原因。 */
  var code: Double = js.native
  
  /** 一个可读的字符串，表示连接被关闭的原因。 */
  var reason: String = js.native
}
object SocketTaskOnCloseCallbackResult {
  
  @scala.inline
  def apply(code: Double, reason: String): SocketTaskOnCloseCallbackResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketTaskOnCloseCallbackResult]
  }
  
  @scala.inline
  implicit class SocketTaskOnCloseCallbackResultOps[Self <: SocketTaskOnCloseCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
}
