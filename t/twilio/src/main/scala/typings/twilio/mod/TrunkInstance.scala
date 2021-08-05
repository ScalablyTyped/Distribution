package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrunkInstance
  extends StObject
     with InstanceResource {
  
  var credentialLists: CredentialListResource
  
  var ipAccessControlLists: IPAccessControlListResource
  
  var originationUrls: OriginationURLResource
  
  def phoneNumbers(resourceSid: String): PhoneNumberInstance
  @JSName("phoneNumbers")
  var phoneNumbers_Original: PhoneNumberResource
}
object TrunkInstance {
  
  inline def apply(
    credentialLists: CredentialListResource,
    delete: RestMethod,
    get: RestMethod,
    ipAccessControlLists: IPAccessControlListResource,
    originationUrls: OriginationURLResource,
    phoneNumbers: /* resourceSid */ String => PhoneNumberInstance,
    post: RestMethod,
    update: RestMethod
  ): TrunkInstance = {
    val __obj = js.Dynamic.literal(credentialLists = credentialLists.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], ipAccessControlLists = ipAccessControlLists.asInstanceOf[js.Any], originationUrls = originationUrls.asInstanceOf[js.Any], phoneNumbers = js.Any.fromFunction1(phoneNumbers), post = post.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrunkInstance]
  }
  
  extension [Self <: TrunkInstance](x: Self) {
    
    inline def setCredentialLists(value: CredentialListResource): Self = StObject.set(x, "credentialLists", value.asInstanceOf[js.Any])
    
    inline def setIpAccessControlLists(value: IPAccessControlListResource): Self = StObject.set(x, "ipAccessControlLists", value.asInstanceOf[js.Any])
    
    inline def setOriginationUrls(value: OriginationURLResource): Self = StObject.set(x, "originationUrls", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbers(value: /* resourceSid */ String => PhoneNumberInstance): Self = StObject.set(x, "phoneNumbers", js.Any.fromFunction1(value))
  }
}
