package typings.twilio

import typings.twilio.libRestPreviewDeployedDevicesFleetMod.FleetContext
import typings.twilio.libRestPreviewDeployedDevicesFleetMod.FleetListInstance
import typings.twilio.libRestPreviewHostedNumbersAuthorizationDocumentMod.AuthorizationDocumentContext
import typings.twilio.libRestPreviewHostedNumbersAuthorizationDocumentMod.AuthorizationDocumentListInstance
import typings.twilio.libRestPreviewHostedNumbersHostedNumberOrderMod.HostedNumberOrderContext
import typings.twilio.libRestPreviewHostedNumbersHostedNumberOrderMod.HostedNumberOrderListInstance
import typings.twilio.libRestPreviewMarketplaceAvailableAddOnMod.AvailableAddOnContext
import typings.twilio.libRestPreviewMarketplaceAvailableAddOnMod.AvailableAddOnListInstance
import typings.twilio.libRestPreviewMarketplaceInstalledAddOnMod.InstalledAddOnContext
import typings.twilio.libRestPreviewMarketplaceInstalledAddOnMod.InstalledAddOnListInstance
import typings.twilio.libRestPreviewSyncServiceMod.ServiceContext
import typings.twilio.libRestPreviewSyncServiceMod.ServiceListInstance
import typings.twilio.libRestPreviewTrustedCommsBrandedChannelMod.BrandedChannelContext
import typings.twilio.libRestPreviewTrustedCommsBrandedChannelMod.BrandedChannelListInstance
import typings.twilio.libRestPreviewTrustedCommsBrandsInformationMod.BrandsInformationContext
import typings.twilio.libRestPreviewTrustedCommsBrandsInformationMod.BrandsInformationListInstance
import typings.twilio.libRestPreviewTrustedCommsCpsMod.CpsContext
import typings.twilio.libRestPreviewTrustedCommsCpsMod.CpsListInstance
import typings.twilio.libRestPreviewTrustedCommsCurrentCallMod.CurrentCallContext
import typings.twilio.libRestPreviewTrustedCommsCurrentCallMod.CurrentCallListInstance
import typings.twilio.libRestPreviewUnderstandAssistantMod.AssistantContext
import typings.twilio.libRestPreviewUnderstandAssistantMod.AssistantListInstance
import typings.twilio.libRestPreviewWirelessCommandMod.CommandContext
import typings.twilio.libRestPreviewWirelessCommandMod.CommandListInstance
import typings.twilio.libRestPreviewWirelessRatePlanMod.RatePlanContext
import typings.twilio.libRestPreviewWirelessRatePlanMod.RatePlanListInstance
import typings.twilio.libRestPreviewWirelessSimMod.SimContext
import typings.twilio.libRestPreviewWirelessSimMod.SimListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestPreviewMod {
  
  @JSImport("twilio/lib/rest/Preview", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Preview {
    /**
      * Initialize preview domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.libRestTwilioMod.^) = this()
  }
  
  @js.native
  trait Preview
    extends typings.twilio.libBaseDomainMod.^ {
    
    /**
      * @param sid - sid of instance
      */
    def assistants(sid: String): AssistantContext = js.native
    @JSName("assistants")
    val assistants_Original: AssistantListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def authorizationDocuments(sid: String): AuthorizationDocumentContext = js.native
    @JSName("authorizationDocuments")
    val authorizationDocuments_Original: AuthorizationDocumentListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def availableAddOns(sid: String): AvailableAddOnContext = js.native
    @JSName("availableAddOns")
    val availableAddOns_Original: AvailableAddOnListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def brandedChannels(sid: String): BrandedChannelContext = js.native
    @JSName("brandedChannels")
    val brandedChannels_Original: BrandedChannelListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def brandsInformation(sid: String): BrandsInformationContext = js.native
    @JSName("brandsInformation")
    val brandsInformation_Original: BrandsInformationListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def commands(sid: String): CommandContext = js.native
    @JSName("commands")
    val commands_Original: CommandListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def cps(sid: String): CpsContext = js.native
    @JSName("cps")
    val cps_Original: CpsListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def currentCalls(sid: String): CurrentCallContext = js.native
    @JSName("currentCalls")
    val currentCalls_Original: CurrentCallListInstance = js.native
    
    val deployed_devices: typings.twilio.libRestPreviewDeployedDevicesMod.^ = js.native
    
    /**
      * @param sid - sid of instance
      */
    def fleets(sid: String): FleetContext = js.native
    @JSName("fleets")
    val fleets_Original: FleetListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def hostedNumberOrders(sid: String): HostedNumberOrderContext = js.native
    @JSName("hostedNumberOrders")
    val hostedNumberOrders_Original: HostedNumberOrderListInstance = js.native
    
    val hosted_numbers: typings.twilio.libRestPreviewHostedNumbersMod.^ = js.native
    
    /**
      * @param sid - sid of instance
      */
    def installedAddOns(sid: String): InstalledAddOnContext = js.native
    @JSName("installedAddOns")
    val installedAddOns_Original: InstalledAddOnListInstance = js.native
    
    val marketplace: typings.twilio.libRestPreviewMarketplaceMod.^ = js.native
    
    /**
      * @param sid - sid of instance
      */
    def ratePlans(sid: String): RatePlanContext = js.native
    @JSName("ratePlans")
    val ratePlans_Original: RatePlanListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def services(sid: String): ServiceContext = js.native
    @JSName("services")
    val services_Original: ServiceListInstance = js.native
    
    /**
      * @param sid - sid of instance
      */
    def sims(sid: String): SimContext = js.native
    @JSName("sims")
    val sims_Original: SimListInstance = js.native
    
    val sync: typings.twilio.libRestPreviewSyncMod.^ = js.native
    
    val trusted_comms: typings.twilio.libRestPreviewTrustedCommsMod.^ = js.native
    
    val understand: typings.twilio.libRestPreviewUnderstandMod.^ = js.native
    
    val wireless: typings.twilio.libRestPreviewWirelessMod.^ = js.native
  }
}
