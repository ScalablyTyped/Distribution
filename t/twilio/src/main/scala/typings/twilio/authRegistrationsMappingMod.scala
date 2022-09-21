package typings.twilio

import typings.twilio.authRegistrationsCredentialListMappingMod.AuthRegistrationsCredentialListMappingListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authRegistrationsMappingMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain/authTypes/authRegistrationsMapping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initialize the AuthTypeRegistrationsList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    * @param domainSid - The unique string that identifies the resource
    */
  inline def AuthTypeRegistrationsList(version: typings.twilio.v2010Mod.^, accountSid: String, domainSid: String): AuthTypeRegistrationsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AuthTypeRegistrationsList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], domainSid.asInstanceOf[js.Any])).asInstanceOf[AuthTypeRegistrationsListInstance]
  
  trait AuthTypeRegistrationsListInstance extends StObject {
    
    var credentialListMappings: js.UndefOr[AuthRegistrationsCredentialListMappingListInstance] = js.undefined
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any
  }
  object AuthTypeRegistrationsListInstance {
    
    inline def apply(toJSON: () => Any): AuthTypeRegistrationsListInstance = {
      val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[AuthTypeRegistrationsListInstance]
    }
    
    extension [Self <: AuthTypeRegistrationsListInstance](x: Self) {
      
      inline def setCredentialListMappings(value: AuthRegistrationsCredentialListMappingListInstance): Self = StObject.set(x, "credentialListMappings", value.asInstanceOf[js.Any])
      
      inline def setCredentialListMappingsUndefined: Self = StObject.set(x, "credentialListMappings", js.undefined)
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait AuthTypeRegistrationsPayload
    extends StObject
       with AuthTypeRegistrationsResource
       with TwilioResponsePayload
  object AuthTypeRegistrationsPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): AuthTypeRegistrationsPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthTypeRegistrationsPayload]
    }
  }
  
  trait AuthTypeRegistrationsResource extends StObject
  
  trait AuthTypeRegistrationsSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var domainSid: js.UndefOr[String] = js.undefined
  }
  object AuthTypeRegistrationsSolution {
    
    inline def apply(): AuthTypeRegistrationsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthTypeRegistrationsSolution]
    }
    
    extension [Self <: AuthTypeRegistrationsSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setDomainSid(value: String): Self = StObject.set(x, "domainSid", value.asInstanceOf[js.Any])
      
      inline def setDomainSidUndefined: Self = StObject.set(x, "domainSid", js.undefined)
    }
  }
}
