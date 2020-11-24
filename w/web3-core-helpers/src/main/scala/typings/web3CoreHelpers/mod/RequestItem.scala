package typings.web3CoreHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestItem extends js.Object {
  
  def callback(error: js.Any, result: js.Any): Unit = js.native
  
  var payload: JsonRpcPayload = js.native
}
object RequestItem {
  
  @scala.inline
  def apply(callback: (js.Any, js.Any) => Unit, payload: JsonRpcPayload): RequestItem = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestItem]
  }
  
  @scala.inline
  implicit class RequestItemOps[Self <: RequestItem] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: (js.Any, js.Any) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPayload(value: JsonRpcPayload): Self = this.set("payload", value.asInstanceOf[js.Any])
  }
}
