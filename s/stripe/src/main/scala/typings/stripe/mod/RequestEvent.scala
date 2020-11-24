package typings.stripe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestEvent extends js.Object {
  
  var account: js.UndefOr[String] = js.native
  
  var api_version: String = js.native
  
  var idempotency_key: js.UndefOr[String] = js.native
  
  var method: String = js.native
  
  var path: String = js.native
  
  var request_start_time: Double = js.native
}
object RequestEvent {
  
  @scala.inline
  def apply(api_version: String, method: String, path: String, request_start_time: Double): RequestEvent = {
    val __obj = js.Dynamic.literal(api_version = api_version.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], request_start_time = request_start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestEvent]
  }
  
  @scala.inline
  implicit class RequestEventOps[Self <: RequestEvent] (val x: Self) extends AnyVal {
    
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
    def setApi_version(value: String): Self = this.set("api_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_start_time(value: Double): Self = this.set("request_start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    
    @scala.inline
    def setIdempotency_key(value: String): Self = this.set("idempotency_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdempotency_key: Self = this.set("idempotency_key", js.undefined)
  }
}
