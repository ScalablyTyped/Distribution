package typings.webdriverManager.httpUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestOptionsValue extends js.Object {
  
  var ignoreSSL: js.UndefOr[Boolean] = js.native
  
  var proxy: js.UndefOr[String] = js.native
}
object RequestOptionsValue {
  
  @scala.inline
  def apply(): RequestOptionsValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptionsValue]
  }
  
  @scala.inline
  implicit class RequestOptionsValueOps[Self <: RequestOptionsValue] (val x: Self) extends AnyVal {
    
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
    def setIgnoreSSL(value: Boolean): Self = this.set("ignoreSSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreSSL: Self = this.set("ignoreSSL", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
  }
}
