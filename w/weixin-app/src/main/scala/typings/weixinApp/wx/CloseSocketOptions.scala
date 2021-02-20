package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 关闭WebSocket连接。
  */
@js.native
trait CloseSocketOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var code: js.UndefOr[Double] = js.native
  
  // 一个数字值表示关闭连接的状态号，表示连接被关闭的原因。如果这个参数没有被指定，默认的取值是1000 （表示正常连接关闭）    1.4.0
  var reason: js.UndefOr[String] = js.native
}
object CloseSocketOptions {
  
  @scala.inline
  def apply(): CloseSocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseSocketOptions]
  }
  
  @scala.inline
  implicit class CloseSocketOptionsMutableBuilder[Self <: CloseSocketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
