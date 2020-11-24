package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SIPIntermediary extends js.Object {
  
  var credentialLists: CredentialListResource = js.native
  
  var domains: DomainResource = js.native
  
  var ipAccessControlLists: IPAccessControlListResource = js.native
}
object SIPIntermediary {
  
  @scala.inline
  def apply(
    credentialLists: CredentialListResource,
    domains: DomainResource,
    ipAccessControlLists: IPAccessControlListResource
  ): SIPIntermediary = {
    val __obj = js.Dynamic.literal(credentialLists = credentialLists.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], ipAccessControlLists = ipAccessControlLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[SIPIntermediary]
  }
  
  @scala.inline
  implicit class SIPIntermediaryOps[Self <: SIPIntermediary] (val x: Self) extends AnyVal {
    
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
    def setCredentialLists(value: CredentialListResource): Self = this.set("credentialLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomains(value: DomainResource): Self = this.set("domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAccessControlLists(value: IPAccessControlListResource): Self = this.set("ipAccessControlLists", value.asInstanceOf[js.Any])
  }
}
