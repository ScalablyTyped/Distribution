package typings.tldjs.anon

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Domain extends js.Object {
  
  var domain: ReturnType[js.Function1[/* host */ String, String | Null]] = js.native
  
  var hostname: ReturnType[js.Function1[/* host */ String, String | Null]] = js.native
  
  var isIp: Boolean = js.native
  
  var isValid: ReturnType[js.Function1[/* host */ String, Boolean]] = js.native
  
  var publicSuffix: ReturnType[js.Function1[/* host */ String, String | Null]] = js.native
  
  var subdomain: ReturnType[js.Function1[/* host */ String, String | Null]] = js.native
  
  var tldExists: ReturnType[js.Function1[/* host */ String, Boolean]] = js.native
}
object Domain {
  
  @scala.inline
  def apply(
    domain: ReturnType[js.Function1[/* host */ String, String | Null]],
    hostname: ReturnType[js.Function1[/* host */ String, String | Null]],
    isIp: Boolean,
    isValid: ReturnType[js.Function1[/* host */ String, Boolean]],
    publicSuffix: ReturnType[js.Function1[/* host */ String, String | Null]],
    subdomain: ReturnType[js.Function1[/* host */ String, String | Null]],
    tldExists: ReturnType[js.Function1[/* host */ String, Boolean]]
  ): Domain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], isIp = isIp.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], publicSuffix = publicSuffix.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], tldExists = tldExists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit class DomainOps[Self <: Domain] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIp(value: Boolean): Self = this.set("isIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: ReturnType[js.Function1[/* host */ String, Boolean]]): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicSuffix(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = this.set("publicSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdomain(value: ReturnType[js.Function1[/* host */ String, String | Null]]): Self = this.set("subdomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTldExists(value: ReturnType[js.Function1[/* host */ String, Boolean]]): Self = this.set("tldExists", value.asInstanceOf[js.Any])
  }
}
