package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestMessagingV1Mod {
  
  @JSImport("twilio/lib/rest/messaging/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Messaging
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.libRestMessagingMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.libBaseVersionMod.^ {
    
    val brandRegistrations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BrandRegistrationListInstance */ Any = js.native
    
    val deactivations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeactivationsListInstance */ Any = js.native
    
    val externalCampaign: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExternalCampaignListInstance */ Any = js.native
    
    val services: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any = js.native
    
    val tollfreeVerifications: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TollfreeVerificationListInstance */ Any = js.native
    
    val usecases: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UsecaseListInstance */ Any = js.native
  }
}
