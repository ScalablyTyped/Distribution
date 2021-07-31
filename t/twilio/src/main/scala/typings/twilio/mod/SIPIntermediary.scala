package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SIPIntermediary extends StObject {
  
  var credentialLists: CredentialListResource
  
  var domains: DomainResource
  
  var ipAccessControlLists: IPAccessControlListResource
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
  implicit class SIPIntermediaryMutableBuilder[Self <: SIPIntermediary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentialLists(value: CredentialListResource): Self = StObject.set(x, "credentialLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomains(value: DomainResource): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAccessControlLists(value: IPAccessControlListResource): Self = StObject.set(x, "ipAccessControlLists", value.asInstanceOf[js.Any])
  }
}
