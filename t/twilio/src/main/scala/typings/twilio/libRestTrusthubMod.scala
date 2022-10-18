package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestTrusthubMod {
  
  @JSImport("twilio/lib/rest/Trusthub", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Trusthub {
    /**
      * Initialize trusthub domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Trusthub
    extends typings.twilio.libBaseDomainMod.^ {
    
    val customerProfiles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomerProfilesListInstance */ Any = js.native
    
    val endUserTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndUserTypeListInstance */ Any = js.native
    
    val endUsers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndUserListInstance */ Any = js.native
    
    val policies: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PoliciesListInstance */ Any = js.native
    
    val supportingDocumentTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportingDocumentTypeListInstance */ Any = js.native
    
    val supportingDocuments: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportingDocumentListInstance */ Any = js.native
    
    val trustProducts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TrustProductsListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestTrusthubV1Mod.^ = js.native
  }
}
