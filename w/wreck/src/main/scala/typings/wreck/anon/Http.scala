package typings.wreck.anon

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Http extends js.Object {
  
  var http: Agent = js.native
  
  var https: Agent = js.native
  
  var httpsAllowUnauthorized: Agent = js.native
}
object Http {
  
  @scala.inline
  def apply(http: Agent, https: Agent, httpsAllowUnauthorized: Agent): Http = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any], https = https.asInstanceOf[js.Any], httpsAllowUnauthorized = httpsAllowUnauthorized.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http]
  }
  
  @scala.inline
  implicit class HttpOps[Self <: Http] (val x: Self) extends AnyVal {
    
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
    def setHttp(value: Agent): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttps(value: Agent): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpsAllowUnauthorized(value: Agent): Self = this.set("httpsAllowUnauthorized", value.asInstanceOf[js.Any])
  }
}
