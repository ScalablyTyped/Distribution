package typings.twilio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestMessagingMod {
  
  @JSImport("twilio/lib/rest/Messaging", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Messaging {
    /**
      * Initialize messaging domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Messaging
    extends typings.twilio.libBaseDomainMod.^ {
    
    val brandRegistrations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BrandRegistrationListInstance */ Any = js.native
    
    val deactivations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeactivationsListInstance */ Any = js.native
    
    val externalCampaign: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExternalCampaignListInstance */ Any = js.native
    
    val services: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceListInstance */ Any = js.native
    
    val tollfreeVerifications: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TollfreeVerificationListInstance */ Any = js.native
    
    val usecases: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UsecaseListInstance */ Any = js.native
    
    val v1: typings.twilio.libRestMessagingV1Mod.^ = js.native
  }
}
