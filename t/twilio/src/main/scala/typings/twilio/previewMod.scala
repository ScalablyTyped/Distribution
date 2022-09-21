package typings.twilio

import typings.twilio.authorizationDocumentMod.AuthorizationDocumentContext
import typings.twilio.authorizationDocumentMod.AuthorizationDocumentListInstance
import typings.twilio.availableAddOnMod.AvailableAddOnContext
import typings.twilio.availableAddOnMod.AvailableAddOnListInstance
import typings.twilio.brandedChannelMod.BrandedChannelContext
import typings.twilio.brandedChannelMod.BrandedChannelListInstance
import typings.twilio.brandsInformationMod.BrandsInformationContext
import typings.twilio.brandsInformationMod.BrandsInformationListInstance
import typings.twilio.commandMod.CommandContext
import typings.twilio.commandMod.CommandListInstance
import typings.twilio.cpsMod.CpsContext
import typings.twilio.cpsMod.CpsListInstance
import typings.twilio.currentCallMod.CurrentCallContext
import typings.twilio.currentCallMod.CurrentCallListInstance
import typings.twilio.fleetMod.FleetContext
import typings.twilio.fleetMod.FleetListInstance
import typings.twilio.hostedNumberOrderMod.HostedNumberOrderContext
import typings.twilio.hostedNumberOrderMod.HostedNumberOrderListInstance
import typings.twilio.installedAddOnMod.InstalledAddOnContext
import typings.twilio.installedAddOnMod.InstalledAddOnListInstance
import typings.twilio.ratePlanMod.RatePlanContext
import typings.twilio.ratePlanMod.RatePlanListInstance
import typings.twilio.simMod.SimContext
import typings.twilio.simMod.SimListInstance
import typings.twilio.syncServiceMod.ServiceContext
import typings.twilio.syncServiceMod.ServiceListInstance
import typings.twilio.understandAssistantMod.AssistantContext
import typings.twilio.understandAssistantMod.AssistantListInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewMod {
  
  @JSImport("twilio/lib/rest/Preview", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Preview {
    /**
      * Initialize preview domain
      *
      * @param twilio - The twilio client
      */
    def this(twilio: typings.twilio.twilioMod.^) = this()
  }
  
  @js.native
  trait Preview
    extends typings.twilio.domainMod.^ {
    
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
    
    val deployed_devices: typings.twilio.deployedDevicesMod.^ = js.native
    
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
    
    val hosted_numbers: typings.twilio.hostedNumbersMod.^ = js.native
    
    /**
      * @param sid - sid of instance
      */
    def installedAddOns(sid: String): InstalledAddOnContext = js.native
    @JSName("installedAddOns")
    val installedAddOns_Original: InstalledAddOnListInstance = js.native
    
    val marketplace: typings.twilio.marketplaceMod.^ = js.native
    
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
    
    val sync: typings.twilio.syncMod.^ = js.native
    
    val trusted_comms: typings.twilio.trustedCommsMod.^ = js.native
    
    val understand: typings.twilio.understandMod.^ = js.native
    
    val wireless: typings.twilio.wirelessMod.^ = js.native
  }
}
