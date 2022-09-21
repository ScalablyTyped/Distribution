package typings.twilio

import typings.twilio.credentialListMod.CredentialListListInstance
import typings.twilio.ipAccessControlListMod.IpAccessControlListListInstance
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.sipDomainMod.DomainListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sipMod {
  
  @JSImport("twilio/lib/rest/api/v2010/account/sip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initialize the SipList
    *
    * @param version - Version of the resource
    * @param accountSid - A 34 character string that uniquely identifies this resource.
    */
  inline def SipList(version: typings.twilio.v2010Mod.^, accountSid: String): SipListInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("SipList")(version.asInstanceOf[js.Any], accountSid.asInstanceOf[js.Any])).asInstanceOf[SipListInstance]
  
  trait SipListInstance extends StObject {
    
    var credentialLists: js.UndefOr[CredentialListListInstance] = js.undefined
    
    var domains: js.UndefOr[DomainListInstance] = js.undefined
    
    var ipAccessControlLists: js.UndefOr[IpAccessControlListListInstance] = js.undefined
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any
  }
  object SipListInstance {
    
    inline def apply(toJSON: () => Any): SipListInstance = {
      val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[SipListInstance]
    }
    
    extension [Self <: SipListInstance](x: Self) {
      
      inline def setCredentialLists(value: CredentialListListInstance): Self = StObject.set(x, "credentialLists", value.asInstanceOf[js.Any])
      
      inline def setCredentialListsUndefined: Self = StObject.set(x, "credentialLists", js.undefined)
      
      inline def setDomains(value: DomainListInstance): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
      
      inline def setIpAccessControlLists(value: IpAccessControlListListInstance): Self = StObject.set(x, "ipAccessControlLists", value.asInstanceOf[js.Any])
      
      inline def setIpAccessControlListsUndefined: Self = StObject.set(x, "ipAccessControlLists", js.undefined)
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
  
  trait SipPayload
    extends StObject
       with SipResource
       with TwilioResponsePayload
  object SipPayload {
    
    inline def apply(
      first_page_uri: String,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String
    ): SipPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[SipPayload]
    }
  }
  
  trait SipResource extends StObject
  
  trait SipSolution extends StObject {
    
    var accountSid: js.UndefOr[String] = js.undefined
  }
  object SipSolution {
    
    inline def apply(): SipSolution = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SipSolution]
    }
    
    extension [Self <: SipSolution](x: Self) {
      
      inline def setAccountSid(value: String): Self = StObject.set(x, "accountSid", value.asInstanceOf[js.Any])
      
      inline def setAccountSidUndefined: Self = StObject.set(x, "accountSid", js.undefined)
    }
  }
}
