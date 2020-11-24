package typings.xmlrpc.mod

import typings.xmlrpc.anon.Processors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends js.Object {
  
  var cookies: js.UndefOr[Cookies] = js.native
  
  def getCookie(name: String): String = js.native
  
  var headersProcessors: Processors = js.native
  
  var isSecure: Boolean = js.native
  
  def methodCall(
    method: String,
    params: js.Array[_],
    callback: js.Function2[/* error */ js.Object, /* value */ js.Any, Unit]
  ): Unit = js.native
  
  var options: ClientOptions = js.native
  
  def setCookie(name: String, value: String): this.type = js.native
}
object Client {
  
  @scala.inline
  def apply(
    getCookie: String => String,
    headersProcessors: Processors,
    isSecure: Boolean,
    methodCall: (String, js.Array[_], js.Function2[/* error */ js.Object, /* value */ js.Any, Unit]) => Unit,
    options: ClientOptions,
    setCookie: (String, String) => Client
  ): Client = {
    val __obj = js.Dynamic.literal(getCookie = js.Any.fromFunction1(getCookie), headersProcessors = headersProcessors.asInstanceOf[js.Any], isSecure = isSecure.asInstanceOf[js.Any], methodCall = js.Any.fromFunction3(methodCall), options = options.asInstanceOf[js.Any], setCookie = js.Any.fromFunction2(setCookie))
    __obj.asInstanceOf[Client]
  }
  
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    
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
    def setGetCookie(value: String => String): Self = this.set("getCookie", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeadersProcessors(value: Processors): Self = this.set("headersProcessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSecure(value: Boolean): Self = this.set("isSecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodCall(
      value: (String, js.Array[_], js.Function2[/* error */ js.Object, /* value */ js.Any, Unit]) => Unit
    ): Self = this.set("methodCall", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOptions(value: ClientOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCookie(value: (String, String) => Client): Self = this.set("setCookie", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCookies(value: Cookies): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
  }
}
