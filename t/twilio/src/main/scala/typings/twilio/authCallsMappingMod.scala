package typings.twilio

import typings.twilio.authCallsCredentialListMappingMod.AuthCallsCredentialListMappingListInstance
import typings.twilio.authCallsIpAccessControlListMappingMod.AuthCallsIpAccessControlListMappingListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authCallsMappingMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain/authTypes/authCallsMapping", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initialize the AuthTypeCallsList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    * @param domainSid - The unique string that identifies the resource
    */
  inline def AuthTypeCallsList(version: typings.twilio.v2010Mod.^, accountSid: String, domainSid: String): AuthTypeCallsListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AuthTypeCallsList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], domainSid.asInstanceOf[js.Any])).asInstanceOf[AuthTypeCallsListInstance]
  
  trait AuthTypeCallsListInstance extends StObject {
    
    var credentialListMappings: js.UndefOr[AuthCallsCredentialListMappingListInstance] = js.undefined
    
    var ipAccessControlListMappings: js.UndefOr[AuthCallsIpAccessControlListMappingListInstance] = js.undefined
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any
  }
  object AuthTypeCallsListInstance {
    
    inline def apply(toJSON: () => Any): AuthTypeCallsListInstance = {
      val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[AuthTypeCallsListInstance]
    }
    
    extension [Self <: AuthTypeCallsListInstance](x: Self) {
      
      inline def setCredentialListMappings(value: AuthCallsCredentialListMappingListInstance): Self = StObject.set(x, "credentialListMappings", value.asInstanceOf[js.Any])
      
      inline def setCredentialListMappingsUndefined: Self = StObject.set(x, "credentialListMappings", js.undefined)
      
      inline def setIpAccessControlListMappings(value: AuthCallsIpAccessControlListMappingListInstance): Self = StObject.set(x, "ipAccessControlListMappings", value.asInstanceOf[js.Any])
      
      inline def setIpAccessControlListMappingsUndefined: Self = StObject.set(x, "ipAccessControlListMappings", js.undefined)
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait AuthTypeCallsPayload
    extends StObject
       with AuthTypeCallsResource
       with TwilioResponsePayload
  object AuthTypeCallsPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): AuthTypeCallsPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthTypeCallsPayload]
    }
  }
  
  trait AuthTypeCallsResource extends StObject
  
  trait AuthTypeCallsSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var domainSid: js.UndefOr[String] = js.undefined
  }
  object AuthTypeCallsSolution {
    
    inline def apply(): AuthTypeCallsSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthTypeCallsSolution]
    }
    
    extension [Self <: AuthTypeCallsSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setDomainSid(value: String): Self = StObject.set(x, "domainSid", value.asInstanceOf[js.Any])
      
      inline def setDomainSidUndefined: Self = StObject.set(x, "domainSid", js.undefined)
    }
  }
}
