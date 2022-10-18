package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestTrusthubV1Mod {
  
  @JSImport("twilio/lib/rest/trusthub/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Trusthub
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestTrusthubMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val customerProfiles: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomerProfilesListInstance */ Any = js.native
    
    val endUserTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndUserTypeListInstance */ Any = js.native
    
    val endUsers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndUserListInstance */ Any = js.native
    
    val policies: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PoliciesListInstance */ Any = js.native
    
    val supportingDocumentTypes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportingDocumentTypeListInstance */ Any = js.native
    
    val supportingDocuments: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportingDocumentListInstance */ Any = js.native
    
    val trustProducts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TrustProductsListInstance */ Any = js.native
  }
}
