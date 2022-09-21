package typings.twilio

import typings.twilio.authCallsMappingMod.AuthTypeCallsListInstance
import typings.twilio.authRegistrationsMappingMod.AuthTypeRegistrationsListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authTypesMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip/domain/authTypes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initialize the AuthTypesList
    *
    * @param version - Version of the resource
    * @param accountSid - The SID of the Account that created the resource
    * @param domainSid - The unique string that identifies the resource
    */
  inline def AuthTypesList(version: typings.twilio.v2010Mod.^, accountSid: String, domainSid: String): AuthTypesListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("AuthTypesList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any], domainSid.asInstanceOf[js.Any])).asInstanceOf[AuthTypesListInstance]
  
  trait AuthTypesListInstance extends StObject {
    
    var calls: js.UndefOr[AuthTypeCallsListInstance] = js.undefined
    
    var registrations: js.UndefOr[AuthTypeRegistrationsListInstance] = js.undefined
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any
  }
  object AuthTypesListInstance {
    
    inline def apply(toJSON: () => Any): AuthTypesListInstance = {
      val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[AuthTypesListInstance]
    }
    
    extension [Self <: AuthTypesListInstance](x: Self) {
      
      inline def setCalls(value: AuthTypeCallsListInstance): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
      
      inline def setCallsUndefined: Self = StObject.set(x, "calls", js.undefined)
      
      inline def setRegistrations(value: AuthTypeRegistrationsListInstance): Self = StObject.set(x, "registrations", value.asInstanceOf[js.Any])
      
      inline def setRegistrationsUndefined: Self = StObject.set(x, "registrations", js.undefined)
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait AuthTypesPayload
    extends StObject
       with AuthTypesResource
       with TwilioResponsePayload
  object AuthTypesPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): AuthTypesPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthTypesPayload]
    }
  }
  
  trait AuthTypesResource extends StObject
  
  trait AuthTypesSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
    
    var domainSid: js.UndefOr[String] = js.undefined
  }
  object AuthTypesSolution {
    
    inline def apply(): AuthTypesSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthTypesSolution]
    }
    
    extension [Self <: AuthTypesSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
      
      inline def setDomainSid(value: String): Self = StObject.set(x, "domainSid", value.asInstanceOf[js.Any])
      
      inline def setDomainSidUndefined: Self = StObject.set(x, "domainSid", js.undefined)
    }
  }
}
