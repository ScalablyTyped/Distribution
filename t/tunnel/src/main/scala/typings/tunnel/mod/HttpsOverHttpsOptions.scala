package typings.tunnel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpsOverHttpsOptions extends HttpsOverHttpOptions {
  
  @JSName("proxy")
  var proxy_HttpsOverHttpsOptions: js.UndefOr[HttpsProxyOptions] = js.native
}
object HttpsOverHttpsOptions {
  
  @scala.inline
  def apply(): HttpsOverHttpsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpsOverHttpsOptions]
  }
  
  @scala.inline
  implicit class HttpsOverHttpsOptionsOps[Self <: HttpsOverHttpsOptions] (val x: Self) extends AnyVal {
    
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
    def setProxy(value: HttpsProxyOptions): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
  }
}
