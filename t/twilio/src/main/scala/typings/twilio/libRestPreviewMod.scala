package typings.twilio

import typings.twilio.libRestPreviewDeployedDevicesFleetMod.FleetListInstance
import typings.twilio.libRestPreviewHostedNumbersAuthorizationDocumentMod.AuthorizationDocumentListInstance
import typings.twilio.libRestPreviewHostedNumbersHostedNumberOrderMod.HostedNumberOrderListInstance
import typings.twilio.libRestPreviewMarketplaceAvailableAddOnMod.AvailableAddOnListInstance
import typings.twilio.libRestPreviewMarketplaceInstalledAddOnMod.InstalledAddOnListInstance
import typings.twilio.libRestPreviewSyncServiceMod.ServiceListInstance
import typings.twilio.libRestPreviewUnderstandAssistantMod.AssistantListInstance
import typings.twilio.libRestPreviewWirelessCommandMod.CommandListInstance
import typings.twilio.libRestPreviewWirelessRatePlanMod.RatePlanListInstance
import typings.twilio.libRestPreviewWirelessSimMod.SimListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewMod {
  
  @JSImport("twilio/lib/rest/Preview", JSImport.Namespace)
  @js.native
  open class ^ () extends Preview
  
  @js.native
  trait Preview
    extends typings.twilio.libRestPreviewBaseMod.^ {
    
    /**
      * @deprecated - Use understand.assistants instead
      */
    def assistants: AssistantListInstance = js.native
    
    /**
      * @deprecated - Use hosted_numbers.authorizationDocuments instead
      */
    def authorizationDocuments: AuthorizationDocumentListInstance = js.native
    
    /**
      * @deprecated - Use marketplace.availableAddOns instead
      */
    def availableAddOns: AvailableAddOnListInstance = js.native
    
    /**
      * @deprecated - Use wireless.commands instead
      */
    def commands: CommandListInstance = js.native
    
    /**
      * @deprecated - Use deployed_devices.fleets instead
      */
    def fleets: FleetListInstance = js.native
    
    /**
      * @deprecated - Use hosted_numbers.hostedNumberOrders instead
      */
    def hostedNumberOrders: HostedNumberOrderListInstance = js.native
    
    /**
      * @deprecated - Use marketplace.installedAddOns instead
      */
    def installedAddOns: InstalledAddOnListInstance = js.native
    
    /**
      * @deprecated - Use wireless.ratePlans instead
      */
    def ratePlans: RatePlanListInstance = js.native
    
    /**
      * @deprecated - Use sync.services instead
      */
    def services: ServiceListInstance = js.native
    
    /**
      * @deprecated - Use wireless.sims instead
      */
    def sims: SimListInstance = js.native
  }
}
