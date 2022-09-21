package typings.twilio

import typings.twilio.brandRegistrationMod.BrandRegistrationContext
import typings.twilio.brandRegistrationMod.BrandRegistrationListInstance
import typings.twilio.deactivationMod.DeactivationsContext
import typings.twilio.deactivationMod.DeactivationsListInstance
import typings.twilio.externalCampaignMod.ExternalCampaignListInstance
import typings.twilio.messagingV1ServiceMod.ServiceContext
import typings.twilio.messagingV1ServiceMod.ServiceListInstance
import typings.twilio.tollfreeVerificationMod.TollfreeVerificationContext
import typings.twilio.tollfreeVerificationMod.TollfreeVerificationListInstance
import typings.twilio.usecaseMod.UsecaseListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagingV1Mod {
  
  @JSImport("twilio/lib/rest/messaging/V1", JSImport.Namespace)
  @js.native
  open class ^ protected () extends V1 {
    /**
      * Initialize the V1 version of Messaging
      *
      * @param domain - The twilio domain
      */
    def this(domain: typings.twilio.restMessagingMod.^) = this()
  }
  
  @js.native
  trait V1
    extends typings.twilio.versionMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def brandRegistrations(sid: String): BrandRegistrationContext = js.native
    @JSName("brandRegistrations")
    val brandRegistrations_Original: BrandRegistrationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def deactivations(sid: String): DeactivationsContext = js.native
    @JSName("deactivations")
    val deactivations_Original: DeactivationsListInstance = js.native
    
    val externalCampaign: ExternalCampaignListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def services(sid: String): ServiceContext = js.native
    @JSName("services")
    val services_Original: ServiceListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def tollfreeVerifications(sid: String): TollfreeVerificationContext = js.native
    @JSName("tollfreeVerifications")
    val tollfreeVerifications_Original: TollfreeVerificationListInstance = js.native
    
    val usecases: UsecaseListInstance = js.native
  }
}
