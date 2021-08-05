package typings.winrt.global.Windows.Networking

import typings.std.Uint8Array
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Devices.Sms.CellularClass
import typings.winrt.Windows.Devices.Sms.ISmsMessage
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Networking.Connectivity.NetworkAdapter
import typings.winrt.Windows.Networking.Connectivity.NetworkCostType
import typings.winrt.Windows.Networking.NetworkOperators.DataClasses
import typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus
import typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType
import typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandRadioState
import typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus
import typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType
import typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState
import typings.winrt.Windows.Networking.NetworkOperators.ProfileMediaType
import typings.winrt.Windows.Networking.NetworkOperators.ProfileUsage
import typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode
import typings.winrt.anon.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NetworkOperators {
  
  @JSGlobal("Windows.Networking.NetworkOperators.DataClasses")
  @js.native
  object DataClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.NetworkOperators.DataClasses & Double] = js.native
    
    /* 8 */ val cdma1xEvdo: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma1xEvdo & Double = js.native
    
    /* 9 */ val cdma1xEvdoRevA: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma1xEvdoRevA & Double = js.native
    
    /* 12 */ val cdma1xEvdoRevB: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma1xEvdoRevB & Double = js.native
    
    /* 10 */ val cdma1xEvdv: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma1xEvdv & Double = js.native
    
    /* 7 */ val cdma1xRtt: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma1xRtt & Double = js.native
    
    /* 11 */ val cdma3xRtt: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.cdma3xRtt & Double = js.native
    
    /* 13 */ val cdmaUmb: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.cdmaUmb & Double = js.native
    
    /* 14 */ val custom: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.custom & Double = js.native
    
    /* 2 */ val edge: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.edge & Double = js.native
    
    /* 1 */ val gprs: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.gprs & Double = js.native
    
    /* 4 */ val hsdpa: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.hsdpa & Double = js.native
    
    /* 5 */ val hsupa: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.hsupa & Double = js.native
    
    /* 6 */ val lteAdvanced: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.lteAdvanced & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.none & Double = js.native
    
    /* 3 */ val umts: typings.winrt.Windows.Networking.NetworkOperators.DataClasses.umts & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationContext")
  @js.native
  class HotspotAuthenticationContext ()
    extends StObject
       with typings.winrt.Windows.Networking.NetworkOperators.HotspotAuthenticationContext {
    
    /* CompleteClass */
    override def abortAuthentication(markAsManual: Boolean): Unit = js.native
    
    /* CompleteClass */
    var authenticationUrl: Uri = js.native
    
    /* CompleteClass */
    override def issueCredentials(userName: String, password: String, extraParameters: String, markAsManualConnectOnFailure: Boolean): Unit = js.native
    
    /* CompleteClass */
    var networkAdapter: NetworkAdapter = js.native
    
    /* CompleteClass */
    var redirectMessageUrl: Uri = js.native
    
    /* CompleteClass */
    var redirectMessageXml: XmlDocument = js.native
    
    /* CompleteClass */
    override def skipAuthentication(): Unit = js.native
    
    /* CompleteClass */
    override def triggerAttentionRequired(packageRelativeApplicationId: String, applicationParameters: String): Unit = js.native
    
    /* CompleteClass */
    var wirelessNetworkId: Uint8Array = js.native
  }
  /* static members */
  object HotspotAuthenticationContext {
    
    @JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationContext")
    @js.native
    val ^ : js.Any = js.native
    
    inline def tryGetAuthenticationContext(evenToken: String): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("tryGetAuthenticationContext")(evenToken.asInstanceOf[js.Any]).asInstanceOf[Context]
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.HotspotAuthenticationEventDetails")
  @js.native
  class HotspotAuthenticationEventDetails ()
    extends StObject
       with typings.winrt.Windows.Networking.NetworkOperators.HotspotAuthenticationEventDetails {
    
    /* CompleteClass */
    var eventToken: String = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
  @js.native
  class MobileBroadbandAccount ()
    extends StObject
       with typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccount {
    
    /* CompleteClass */
    var currentDeviceInformation: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation = js.native
    
    /* CompleteClass */
    var currentNetwork: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandNetwork = js.native
    
    /* CompleteClass */
    var networkAccountId: String = js.native
    
    /* CompleteClass */
    var serviceProviderGuid: String = js.native
    
    /* CompleteClass */
    var serviceProviderName: String = js.native
  }
  /* static members */
  object MobileBroadbandAccount {
    
    @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccount.availableNetworkAccountIds")
    @js.native
    def availableNetworkAccountIds: IVectorView[String] = js.native
    inline def availableNetworkAccountIds_=(x: IVectorView[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableNetworkAccountIds")(x.asInstanceOf[js.Any])
    
    inline def createFromNetworkAccountId(networkAccountId: String): typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccount = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromNetworkAccountId")(networkAccountId.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccount]
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountEventArgs")
  @js.native
  class MobileBroadbandAccountEventArgs ()
    extends StObject
       with typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountEventArgs {
    
    /* CompleteClass */
    var networkAccountId: String = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountUpdatedEventArgs")
  @js.native
  class MobileBroadbandAccountUpdatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountUpdatedEventArgs {
    
    /* CompleteClass */
    var hasDeviceInformationChanged: Boolean = js.native
    
    /* CompleteClass */
    var hasNetworkChanged: Boolean = js.native
    
    /* CompleteClass */
    var networkAccountId: String = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcher")
  @js.native
  class MobileBroadbandAccountWatcher ()
    extends StObject
       with typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcher {
    
    /* CompleteClass */
    var onaccountadded: js.Any = js.native
    
    /* CompleteClass */
    var onaccountremoved: js.Any = js.native
    
    /* CompleteClass */
    var onaccountupdated: js.Any = js.native
    
    /* CompleteClass */
    var onenumerationcompleted: js.Any = js.native
    
    /* CompleteClass */
    var onstopped: js.Any = js.native
    
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /* CompleteClass */
    var status: MobileBroadbandAccountWatcherStatus = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus")
  @js.native
  object MobileBroadbandAccountWatcherStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus & Double
      ] = js.native
    
    /* 4 */ val aborted: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus.aborted & Double = js.native
    
    /* 0 */ val created: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus.created & Double = js.native
    
    /* 2 */ val enumerationCompleted: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus.enumerationCompleted & Double = js.native
    
    /* 1 */ val started: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus.started & Double = js.native
    
    /* 3 */ val stopped: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcherStatus.stopped & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation")
  @js.native
  class MobileBroadbandDeviceInformation ()
    extends StObject
       with typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceInformation {
    
    /* CompleteClass */
    var cellularClass: CellularClass = js.native
    
    /* CompleteClass */
    var currentRadioState: MobileBroadbandRadioState = js.native
    
    /* CompleteClass */
    var customDataClass: String = js.native
    
    /* CompleteClass */
    var dataClasses: DataClasses = js.native
    
    /* CompleteClass */
    var deviceId: String = js.native
    
    /* CompleteClass */
    var deviceType: MobileBroadbandDeviceType = js.native
    
    /* CompleteClass */
    var firmwareInformation: String = js.native
    
    /* CompleteClass */
    var manufacturer: String = js.native
    
    /* CompleteClass */
    var mobileEquipmentId: String = js.native
    
    /* CompleteClass */
    var model: String = js.native
    
    /* CompleteClass */
    var networkDeviceStatus: NetworkDeviceStatus = js.native
    
    /* CompleteClass */
    var simIccId: String = js.native
    
    /* CompleteClass */
    var subscriberId: String = js.native
    
    /* CompleteClass */
    var telephoneNumbers: IVectorView[String] = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandDeviceType")
  @js.native
  object MobileBroadbandDeviceType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType & Double
      ] = js.native
    
    /* 1 */ val embedded: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.embedded & Double = js.native
    
    /* 3 */ val remote: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.remote & Double = js.native
    
    /* 2 */ val removable: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.removable & Double = js.native
    
    /* 0 */ val unknown: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandDeviceType.unknown & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandNetwork")
  @js.native
  class MobileBroadbandNetwork ()
    extends StObject
       with typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandNetwork {
    
    /* CompleteClass */
    var accessPointName: String = js.native
    
    /* CompleteClass */
    var activationNetworkError: Double = js.native
    
    /* CompleteClass */
    var networkAdapter: NetworkAdapter = js.native
    
    /* CompleteClass */
    var networkRegistrationState: NetworkRegistrationState = js.native
    
    /* CompleteClass */
    var packetAttachNetworkError: Double = js.native
    
    /* CompleteClass */
    var registeredDataClass: DataClasses = js.native
    
    /* CompleteClass */
    var registeredProviderId: String = js.native
    
    /* CompleteClass */
    var registeredProviderName: String = js.native
    
    /* CompleteClass */
    var registrationNetworkError: Double = js.native
    
    /* CompleteClass */
    override def showConnectionUI(): Unit = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandRadioState")
  @js.native
  object MobileBroadbandRadioState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandRadioState & Double
      ] = js.native
    
    /* 0 */ val off: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandRadioState.off & Double = js.native
    
    /* 1 */ val on: typings.winrt.Windows.Networking.NetworkOperators.MobileBroadbandRadioState.on & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.NetworkDeviceStatus")
  @js.native
  object NetworkDeviceStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus & Double] = js.native
    
    /* 5 */ val accountNotActivated: typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.accountNotActivated & Double = js.native
    
    /* 3 */ val badSim: typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.badSim & Double = js.native
    
    /* 7 */ val deviceBlocked: typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceBlocked & Double = js.native
    
    /* 4 */ val deviceHardwareFailure: typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceHardwareFailure & Double = js.native
    
    /* 6 */ val deviceLocked: typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceLocked & Double = js.native
    
    /* 0 */ val deviceNotReady: typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceNotReady & Double = js.native
    
    /* 1 */ val deviceReady: typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceReady & Double = js.native
    
    /* 2 */ val simNotInserted: typings.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.simNotInserted & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType")
  @js.native
  object NetworkOperatorEventMessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType & Double
      ] = js.native
    
    /* 1 */ val cdma: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.cdma & Double = js.native
    
    /* 5 */ val dataPlanDeleted: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.dataPlanDeleted & Double = js.native
    
    /* 4 */ val dataPlanReset: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.dataPlanReset & Double = js.native
    
    /* 3 */ val dataPlanThresholdReached: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.dataPlanThresholdReached & Double = js.native
    
    /* 0 */ val gsm: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.gsm & Double = js.native
    
    /* 6 */ val profileConnected: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.profileConnected & Double = js.native
    
    /* 7 */ val profileDisconnected: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.profileDisconnected & Double = js.native
    
    /* 9 */ val registeredHome: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.registeredHome & Double = js.native
    
    /* 8 */ val registeredRoaming: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.registeredRoaming & Double = js.native
    
    /* 2 */ val ussd: typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType.ussd & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorNotificationEventDetails")
  @js.native
  class NetworkOperatorNotificationEventDetails ()
    extends StObject
       with typings.winrt.Windows.Networking.NetworkOperators.NetworkOperatorNotificationEventDetails {
    
    /* CompleteClass */
    var encodingType: Double = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var networkAccountId: String = js.native
    
    /* CompleteClass */
    var notificationType: NetworkOperatorEventMessageType = js.native
    
    /* CompleteClass */
    var ruleId: String = js.native
    
    /* CompleteClass */
    var smsMessage: ISmsMessage = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.NetworkRegistrationState")
  @js.native
  object NetworkRegistrationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState & Double
      ] = js.native
    
    /* 6 */ val denied: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.denied & Double = js.native
    
    /* 1 */ val deregistered: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.deregistered & Double = js.native
    
    /* 3 */ val home: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.home & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.none & Double = js.native
    
    /* 5 */ val partner: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.partner & Double = js.native
    
    /* 4 */ val roaming: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.roaming & Double = js.native
    
    /* 2 */ val searching: typings.winrt.Windows.Networking.NetworkOperators.NetworkRegistrationState.searching & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.ProfileMediaType")
  @js.native
  object ProfileMediaType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.NetworkOperators.ProfileMediaType & Double] = js.native
    
    /* 0 */ val wlan: typings.winrt.Windows.Networking.NetworkOperators.ProfileMediaType.wlan & Double = js.native
    
    /* 1 */ val wwan: typings.winrt.Windows.Networking.NetworkOperators.ProfileMediaType.wwan & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.ProvisionFromXmlDocumentResults")
  @js.native
  class ProvisionFromXmlDocumentResults ()
    extends StObject
       with typings.winrt.Windows.Networking.NetworkOperators.ProvisionFromXmlDocumentResults {
    
    /* CompleteClass */
    var allElementsProvisioned: Boolean = js.native
    
    /* CompleteClass */
    var provisionResultsXml: String = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.ProvisionedProfile")
  @js.native
  class ProvisionedProfile ()
    extends StObject
       with typings.winrt.Windows.Networking.NetworkOperators.ProvisionedProfile {
    
    /* CompleteClass */
    override def updateCost(value: NetworkCostType): Unit = js.native
    
    /* CompleteClass */
    override def updateUsage(value: ProfileUsage): Unit = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
  @js.native
  class ProvisioningAgent ()
    extends StObject
       with typings.winrt.Windows.Networking.NetworkOperators.ProvisioningAgent {
    
    /* CompleteClass */
    override def getProvisionedProfile(mediaType: ProfileMediaType, profileName: String): typings.winrt.Windows.Networking.NetworkOperators.ProvisionedProfile = js.native
    
    /* CompleteClass */
    override def provisionFromXmlDocumentAsync(provisioningXmlDocument: String): IAsyncOperation[
        typings.winrt.Windows.Networking.NetworkOperators.ProvisionFromXmlDocumentResults
      ] = js.native
  }
  /* static members */
  object ProvisioningAgent {
    
    @JSGlobal("Windows.Networking.NetworkOperators.ProvisioningAgent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFromNetworkAccountId(networkAccountId: String): typings.winrt.Windows.Networking.NetworkOperators.ProvisioningAgent = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromNetworkAccountId")(networkAccountId.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Networking.NetworkOperators.ProvisioningAgent]
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.UssdMessage")
  @js.native
  class UssdMessage protected ()
    extends StObject
       with typings.winrt.Windows.Networking.NetworkOperators.UssdMessage {
    def this(messageText: String) = this()
    
    /* CompleteClass */
    var dataCodingScheme: Double = js.native
    
    /* CompleteClass */
    override def getPayload(): Uint8Array = js.native
    
    /* CompleteClass */
    var payloadAsText: String = js.native
    
    /* CompleteClass */
    override def setPayload(value: Uint8Array): Unit = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.UssdReply")
  @js.native
  class UssdReply ()
    extends StObject
       with typings.winrt.Windows.Networking.NetworkOperators.UssdReply {
    
    /* CompleteClass */
    var message: typings.winrt.Windows.Networking.NetworkOperators.UssdMessage = js.native
    
    /* CompleteClass */
    var resultCode: UssdResultCode = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.UssdResultCode")
  @js.native
  object UssdResultCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode & Double] = js.native
    
    /* 1 */ val actionRequired: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.actionRequired & Double = js.native
    
    /* 5 */ val networkTimeout: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.networkTimeout & Double = js.native
    
    /* 0 */ val noActionRequired: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.noActionRequired & Double = js.native
    
    /* 4 */ val operationNotSupported: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.operationNotSupported & Double = js.native
    
    /* 3 */ val otherLocalClient: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.otherLocalClient & Double = js.native
    
    /* 2 */ val terminated: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.terminated & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
  @js.native
  class UssdSession ()
    extends StObject
       with typings.winrt.Windows.Networking.NetworkOperators.UssdSession {
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def sendMessageAndGetReplyAsync(message: typings.winrt.Windows.Networking.NetworkOperators.UssdMessage): IAsyncOperation[typings.winrt.Windows.Networking.NetworkOperators.UssdReply] = js.native
  }
  /* static members */
  object UssdSession {
    
    @JSGlobal("Windows.Networking.NetworkOperators.UssdSession")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFromNetworkAccountId(networkAccountId: String): typings.winrt.Windows.Networking.NetworkOperators.UssdSession = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromNetworkAccountId")(networkAccountId.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Networking.NetworkOperators.UssdSession]
    
    inline def createFromNetworkInterfaceId(networkInterfaceId: String): typings.winrt.Windows.Networking.NetworkOperators.UssdSession = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromNetworkInterfaceId")(networkInterfaceId.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Networking.NetworkOperators.UssdSession]
  }
}
