package typings.webPush.anon

import typings.node.Buffer
import typings.webPush.mod.Headers
import typings.webPush.webPushStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined web-push.web-push.RequestDetails & {  body :node.Buffer} */
@js.native
trait RequestDetailsbodyBuffer extends js.Object {
  
  var body: (Buffer | Null) with Buffer = js.native
  
  var endpoint: String = js.native
  
  var headers: Headers = js.native
  
  var method: POST = js.native
  
  var proxy: js.UndefOr[String] = js.native
}
object RequestDetailsbodyBuffer {
  
  @scala.inline
  def apply(body: (Buffer | Null) with Buffer, endpoint: String, headers: Headers, method: POST): RequestDetailsbodyBuffer = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDetailsbodyBuffer]
  }
  
  @scala.inline
  implicit class RequestDetailsbodyBufferOps[Self <: RequestDetailsbodyBuffer] (val x: Self) extends AnyVal {
    
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
    def setBody(value: (Buffer | Null) with Buffer): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: POST): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
  }
}
