package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainInstance
  extends StObject
     with InstanceResource {
  
  var credentialListMappings: CredentialListMappingResource
  
  var ipAccessControlListMappings: IPAccessControlListMappingResource
}
object DomainInstance {
  
  @scala.inline
  def apply(
    credentialListMappings: CredentialListMappingResource,
    delete: RestMethod,
    get: RestMethod,
    ipAccessControlListMappings: IPAccessControlListMappingResource,
    post: RestMethod,
    update: RestMethod
  ): DomainInstance = {
    val __obj = js.Dynamic.literal(credentialListMappings = credentialListMappings.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], ipAccessControlListMappings = ipAccessControlListMappings.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainInstance]
  }
  
  @scala.inline
  implicit class DomainInstanceMutableBuilder[Self <: DomainInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentialListMappings(value: CredentialListMappingResource): Self = StObject.set(x, "credentialListMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAccessControlListMappings(value: IPAccessControlListMappingResource): Self = StObject.set(x, "ipAccessControlListMappings", value.asInstanceOf[js.Any])
  }
}
