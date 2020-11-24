package typings.whoisParsed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WhoIsResult extends js.Object {
  
  var creationDate: js.UndefOr[String] = js.native
  
  var domainName: String = js.native
  
  var expirationDate: js.UndefOr[String] = js.native
  
  var isAvailable: Boolean = js.native
  
  var registrar: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[js.Array[String]] = js.native
  
  var updatedDate: js.UndefOr[String] = js.native
}
object WhoIsResult {
  
  @scala.inline
  def apply(domainName: String, isAvailable: Boolean): WhoIsResult = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], isAvailable = isAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhoIsResult]
  }
  
  @scala.inline
  implicit class WhoIsResultOps[Self <: WhoIsResult] (val x: Self) extends AnyVal {
    
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
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAvailable(value: Boolean): Self = this.set("isAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: String): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: String): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    
    @scala.inline
    def setRegistrar(value: String): Self = this.set("registrar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistrar: Self = this.set("registrar", js.undefined)
    
    @scala.inline
    def setStatusVarargs(value: String*): Self = this.set("status", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: js.Array[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUpdatedDate(value: String): Self = this.set("updatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedDate: Self = this.set("updatedDate", js.undefined)
  }
}
