package typings.winrt.global.Windows.Networking

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.anon.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NetworkOperators {
  
  @JSGlobal("Windows.Networking.NetworkOperators.DataClasses")
  @js.native
  object DataClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.NetworkOperators.DataClasses with Double] = js.native
    
    /* 8 */ val cdma1xEvdo: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma1xEvdo with Double = js.native
    
    /* 9 */ val cdma1xEvdoRevA: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma1xEvdoRevA with Double = js.native
    
    /* 12 */ val cdma1xEvdoRevB: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma1xEvdoRevB with Double = js.native
    
    /* 10 */ val cdma1xEvdv: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma1xEvdv with Double = js.native
    
    /* 7 */ val cdma1xRtt: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma1xRtt with Double = js.native
    
    /* 11 */ val cdma3xRtt: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma3xRtt with Double = js.native
    
    /* 13 */ val cdmaUmb: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.cdmaUmb with Double = js.native
    
    /* 14 */ val custom: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.custom with Double = js.native
    
    /* 2 */ val edge: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.edge with Double = js.native
    
    /* 1 */ val gprs: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.gprs with Double = js.native
    
    /* 4 */ val hsdpa: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.hsdpa with Double = js.native
    
    /* 5 */ val hsupa: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.hsupa with Double = js.native
    
    /* 6 */ val lteAdvanced: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.lteAdvanced with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.none with Double = js.native
    
    /* 3 */ val umts: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.umts with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationContext")
  @js.native
  class HotspotAuthenticationContext ()
    extends typings.winrt.Windows.Networking.NetworkOperators.HotspotAuthenticationContext
  /* static members */
  object HotspotAuthenticationContext {
    
    @JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationContext.tryGetAuthenticationContext")
    @js.native
    def tryGetAuthenticationContext(evenToken: String): Context = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationEventDetails")
  @js.native
  class HotspotAuthenticationEventDetails ()
    extends typings.winrt.Windows.Networking.NetworkOperators.HotspotAuthenticationEventDetails
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
  @js.native
  class MobileBroadbandAccount ()
    extends typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccount
  /* static members */
  object MobileBroadbandAccount {
    
    @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount.availableNetworkAccountIds")
    @js.native
    def availableNetworkAccountIds: IVectorView[String] = js.native
    @scala.inline
    def availableNetworkAccountIds_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableNetworkAccountIds")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount.createFromNetworkAccountId")
    @js.native
    def createFromNetworkAccountId(networkAccountId: String): typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccount = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountEventArgs")
  @js.native
  class MobileBroadbandAccountEventArgs ()
    extends typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountEventArgs
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountUpdatedEventArgs")
  @js.native
  class MobileBroadbandAccountUpdatedEventArgs ()
    extends typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountUpdatedEventArgs
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcher")
  @js.native
  class MobileBroadbandAccountWatcher ()
    extends typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcher
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus")
  @js.native
  object MobileBroadbandAccountWatcherStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus with Double
      ] = js.native
    
    /* 4 */ val aborted: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus.aborted with Double = js.native
    
    /* 0 */ val created: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus.created with Double = js.native
    
    /* 2 */ val enumerationCompleted: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus.enumerationCompleted with Double = js.native
    
    /* 1 */ val started: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus.started with Double = js.native
    
    /* 3 */ val stopped: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus.stopped with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation")
  @js.native
  class MobileBroadbandDeviceInformation ()
    extends typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceType")
  @js.native
  object MobileBroadbandDeviceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType with Double
      ] = js.native
    
    /* 1 */ val embedded: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.embedded with Double = js.native
    
    /* 3 */ val remote: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.remote with Double = js.native
    
    /* 2 */ val removable: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.removable with Double = js.native
    
    /* 0 */ val unknown: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.unknown with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandNetwork")
  @js.native
  class MobileBroadbandNetwork ()
    extends typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandNetwork
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandRadioState")
  @js.native
  object MobileBroadbandRadioState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandRadioState with Double
      ] = js.native
    
    /* 0 */ val off: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandRadioState.off with Double = js.native
    
    /* 1 */ val on: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandRadioState.on with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.NetworkDeviceStatus")
  @js.native
  object NetworkDeviceStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus with Double
      ] = js.native
    
    /* 5 */ val accountNotActivated: typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.accountNotActivated with Double = js.native
    
    /* 3 */ val badSim: typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.badSim with Double = js.native
    
    /* 7 */ val deviceBlocked: typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceBlocked with Double = js.native
    
    /* 4 */ val deviceHardwareFailure: typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceHardwareFailure with Double = js.native
    
    /* 6 */ val deviceLocked: typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceLocked with Double = js.native
    
    /* 0 */ val deviceNotReady: typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceNotReady with Double = js.native
    
    /* 1 */ val deviceReady: typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceReady with Double = js.native
    
    /* 2 */ val simNotInserted: typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.simNotInserted with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType")
  @js.native
  object NetworkOperatorEventMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType with Double
      ] = js.native
    
    /* 1 */ val cdma: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.cdma with Double = js.native
    
    /* 5 */ val dataPlanDeleted: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.dataPlanDeleted with Double = js.native
    
    /* 4 */ val dataPlanReset: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.dataPlanReset with Double = js.native
    
    /* 3 */ val dataPlanThresholdReached: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.dataPlanThresholdReached with Double = js.native
    
    /* 0 */ val gsm: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.gsm with Double = js.native
    
    /* 6 */ val profileConnected: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.profileConnected with Double = js.native
    
    /* 7 */ val profileDisconnected: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.profileDisconnected with Double = js.native
    
    /* 9 */ val registeredHome: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.registeredHome with Double = js.native
    
    /* 8 */ val registeredRoaming: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.registeredRoaming with Double = js.native
    
    /* 2 */ val ussd: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.ussd with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorNotificationEventDetails")
  @js.native
  class NetworkOperatorNotificationEventDetails ()
    extends typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorNotificationEventDetails
  
  @JSGlobal("Windows.Networking.NetworkOperators.NetworkRegistrationState")
  @js.native
  object NetworkRegistrationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState with Double
      ] = js.native
    
    /* 6 */ val denied: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.denied with Double = js.native
    
    /* 1 */ val deregistered: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.deregistered with Double = js.native
    
    /* 3 */ val home: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.home with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.none with Double = js.native
    
    /* 5 */ val partner: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.partner with Double = js.native
    
    /* 4 */ val roaming: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.roaming with Double = js.native
    
    /* 2 */ val searching: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.searching with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.ProfileMediaType")
  @js.native
  object ProfileMediaType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.NetworkOperators.ProfileMediaType with Double] = js.native
    
    /* 0 */ val wlan: typings.winrt.Windows.Networking.NetworkOperators.ProfileMediaType.wlan with Double = js.native
    
    /* 1 */ val wwan: typings.winrt.Windows.Networking.NetworkOperators.ProfileMediaType.wwan with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.ProvisionFromXmlDocumentResults")
  @js.native
  class ProvisionFromXmlDocumentResults ()
    extends typings.winrt.Windows.Networking.NetworkOperators.ProvisionFromXmlDocumentResults
  
  @JSGlobal("Windows.Networking.NetworkOperators.ProvisionedProfile")
  @js.native
  class ProvisionedProfile ()
    extends typings.winrt.Windows.Networking.NetworkOperators.ProvisionedProfile
  
  @JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
  @js.native
  class ProvisioningAgent ()
    extends typings.winrt.Windows.Networking.NetworkOperators.ProvisioningAgent
  /* static members */
  object ProvisioningAgent {
    
    @JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent.createFromNetworkAccountId")
    @js.native
    def createFromNetworkAccountId(networkAccountId: String): typings.winrt.Windows.Networking.NetworkOperators.ProvisioningAgent = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.UssdMessage")
  @js.native
  class UssdMessage protected ()
    extends typings.winrt.Windows.Networking.NetworkOperators.UssdMessage {
    def this(messageText: String) = this()
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.UssdReply")
  @js.native
  class UssdReply ()
    extends typings.winrt.Windows.Networking.NetworkOperators.UssdReply
  
  @JSGlobal("Windows.Networking.NetworkOperators.UssdResultCode")
  @js.native
  object UssdResultCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode with Double] = js.native
    
    /* 1 */ val actionRequired: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.actionRequired with Double = js.native
    
    /* 5 */ val networkTimeout: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.networkTimeout with Double = js.native
    
    /* 0 */ val noActionRequired: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.noActionRequired with Double = js.native
    
    /* 4 */ val operationNotSupported: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.operationNotSupported with Double = js.native
    
    /* 3 */ val otherLocalClient: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.otherLocalClient with Double = js.native
    
    /* 2 */ val terminated: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.terminated with Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
  @js.native
  class UssdSession ()
    extends typings.winrt.Windows.Networking.NetworkOperators.UssdSession
  /* static members */
  object UssdSession {
    
    @JSGlobal("Windows.Networking.NetworkOperators.UssdSession.createFromNetworkAccountId")
    @js.native
    def createFromNetworkAccountId(networkAccountId: String): typings.winrt.Windows.Networking.NetworkOperators.UssdSession = js.native
    
    @JSGlobal("Windows.Networking.NetworkOperators.UssdSession.createFromNetworkInterfaceId")
    @js.native
    def createFromNetworkInterfaceId(networkInterfaceId: String): typings.winrt.Windows.Networking.NetworkOperators.UssdSession = js.native
  }
}
