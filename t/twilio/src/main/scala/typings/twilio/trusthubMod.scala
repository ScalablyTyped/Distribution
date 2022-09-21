package typings.twilio

import typings.twilio.customerProfilesMod.CustomerProfilesContext
import typings.twilio.customerProfilesMod.CustomerProfilesListInstance
import typings.twilio.policiesMod.PoliciesContext
import typings.twilio.policiesMod.PoliciesListInstance
import typings.twilio.trustProductsMod.TrustProductsContext
import typings.twilio.trustProductsMod.TrustProductsListInstance
import typings.twilio.v1EndUserMod.EndUserContext
import typings.twilio.v1EndUserMod.EndUserListInstance
import typings.twilio.v1EndUserTypeMod.EndUserTypeContext
import typings.twilio.v1EndUserTypeMod.EndUserTypeListInstance
import typings.twilio.v1SupportingDocumentMod.SupportingDocumentContext
import typings.twilio.v1SupportingDocumentMod.SupportingDocumentListInstance
import typings.twilio.v1SupportingDocumentTypeMod.SupportingDocumentTypeContext
import typings.twilio.v1SupportingDocumentTypeMod.SupportingDocumentTypeListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trusthubMod {
  
  @JSImport("twilio/lib/rest/Trusthub", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Trusthub {
    /**
      * Initialize trusthub domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Trusthub
    extends typings.twilio.domainMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def customerProfiles(sid: String): CustomerProfilesContext = js.native
    @JSName("customerProfiles")
    val customerProfiles_Original: CustomerProfilesListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def endUserTypes(sid: String): EndUserTypeContext = js.native
    @JSName("endUserTypes")
    val endUserTypes_Original: EndUserTypeListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def endUsers(sid: String): EndUserContext = js.native
    @JSName("endUsers")
    val endUsers_Original: EndUserListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def policies(sid: String): PoliciesContext = js.native
    @JSName("policies")
    val policies_Original: PoliciesListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def supportingDocumentTypes(sid: String): SupportingDocumentTypeContext = js.native
    @JSName("supportingDocumentTypes")
    val supportingDocumentTypes_Original: SupportingDocumentTypeListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def supportingDocuments(sid: String): SupportingDocumentContext = js.native
    @JSName("supportingDocuments")
    val supportingDocuments_Original: SupportingDocumentListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def trustProducts(sid: String): TrustProductsContext = js.native
    @JSName("trustProducts")
    val trustProducts_Original: TrustProductsListInstance = js.native
    
    val v1: typings.twilio.trusthubV1Mod.^ = js.native
  }
}
