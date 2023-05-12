package typings.twilio

import typings.twilio.libRestTrusthubBaseMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestTrusthubV1Mod {
  
  @JSImport("twilio/lib/rest/trusthub/V1", JSImport.Default)
  @js.native
  open class default protected () extends V1 {
    /**
      * Initialize the V1 version of Trusthub
      *
      * @param domain - The Twilio (Twilio.Trusthub) domain
      */
    def this(domain: ^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.default {
    
    /** customerProfiles - { Twilio.Trusthub.V1.CustomerProfilesListInstance } resource */
    /* protected */ var _customerProfiles: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomerProfilesListInstance */ Any
      ] = js.native
    
    /** endUserTypes - { Twilio.Trusthub.V1.EndUserTypeListInstance } resource */
    /* protected */ var _endUserTypes: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndUserTypeListInstance */ Any
      ] = js.native
    
    /** endUsers - { Twilio.Trusthub.V1.EndUserListInstance } resource */
    /* protected */ var _endUsers: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndUserListInstance */ Any
      ] = js.native
    
    /** policies - { Twilio.Trusthub.V1.PoliciesListInstance } resource */
    /* protected */ var _policies: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PoliciesListInstance */ Any
      ] = js.native
    
    /** supportingDocumentTypes - { Twilio.Trusthub.V1.SupportingDocumentTypeListInstance } resource */
    /* protected */ var _supportingDocumentTypes: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportingDocumentTypeListInstance */ Any
      ] = js.native
    
    /** supportingDocuments - { Twilio.Trusthub.V1.SupportingDocumentListInstance } resource */
    /* protected */ var _supportingDocuments: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportingDocumentListInstance */ Any
      ] = js.native
    
    /** trustProducts - { Twilio.Trusthub.V1.TrustProductsListInstance } resource */
    /* protected */ var _trustProducts: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TrustProductsListInstance */ Any
      ] = js.native
    
    /** Getter for customerProfiles resource */
    def customerProfiles: Any = js.native
    
    /** Getter for endUserTypes resource */
    def endUserTypes: Any = js.native
    
    /** Getter for endUsers resource */
    def endUsers: Any = js.native
    
    /** Getter for policies resource */
    def policies: Any = js.native
    
    /** Getter for supportingDocumentTypes resource */
    def supportingDocumentTypes: Any = js.native
    
    /** Getter for supportingDocuments resource */
    def supportingDocuments: Any = js.native
    
    /** Getter for trustProducts resource */
    def trustProducts: Any = js.native
  }
}
