package typings.winrt.global.Windows.Networking

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType
import typings.winrt.Windows.Networking.Connectivity.NetworkCostType
import typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType
import typings.winrt.Windows.Networking.Connectivity.NetworkTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Connectivity {
  
  @JSGlobal("Windows.Networking.Connectivity.ConnectionCost")
  @js.native
  open class ConnectionCost ()
    extends StObject
       with typings.winrt.Windows.Networking.Connectivity.ConnectionCost {
    
    /* CompleteClass */
    var approachingDataLimit: Boolean = js.native
    
    /* CompleteClass */
    var networkCostType: NetworkCostType = js.native
    
    /* CompleteClass */
    var overDataLimit: Boolean = js.native
    
    /* CompleteClass */
    var roaming: Boolean = js.native
  }
  
  @JSGlobal("Windows.Networking.Connectivity.ConnectionProfile")
  @js.native
  open class ConnectionProfile ()
    extends StObject
       with typings.winrt.Windows.Networking.Connectivity.ConnectionProfile
  
  @JSGlobal("Windows.Networking.Connectivity.DataPlanStatus")
  @js.native
  open class DataPlanStatus ()
    extends StObject
       with typings.winrt.Windows.Networking.Connectivity.DataPlanStatus {
    
    /* CompleteClass */
    var dataLimitInMegabytes: Double = js.native
    
    /* CompleteClass */
    var dataPlanUsage: typings.winrt.Windows.Networking.Connectivity.DataPlanUsage = js.native
    
    /* CompleteClass */
    var inboundBitsPerSecond: Double = js.native
    
    /* CompleteClass */
    var maxTransferSizeInMegabytes: Double = js.native
    
    /* CompleteClass */
    var nextBillingCycle: js.Date = js.native
    
    /* CompleteClass */
    var outboundBitsPerSecond: Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Connectivity.DataPlanUsage")
  @js.native
  open class DataPlanUsage ()
    extends StObject
       with typings.winrt.Windows.Networking.Connectivity.DataPlanUsage {
    
    /* CompleteClass */
    var lastSyncTime: js.Date = js.native
    
    /* CompleteClass */
    var megabytesUsed: Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Connectivity.DataUsage")
  @js.native
  open class DataUsage ()
    extends StObject
       with typings.winrt.Windows.Networking.Connectivity.DataUsage {
    
    /* CompleteClass */
    var bytesReceived: Double = js.native
    
    /* CompleteClass */
    var bytesSent: Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Connectivity.IPInformation")
  @js.native
  open class IPInformation ()
    extends StObject
       with typings.winrt.Windows.Networking.Connectivity.IPInformation {
    
    /* CompleteClass */
    var networkAdapter: typings.winrt.Windows.Networking.Connectivity.NetworkAdapter = js.native
    
    /* CompleteClass */
    var prefixLength: Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Connectivity.LanIdentifier")
  @js.native
  open class LanIdentifier ()
    extends StObject
       with typings.winrt.Windows.Networking.Connectivity.LanIdentifier {
    
    /* CompleteClass */
    var infrastructureId: typings.winrt.Windows.Networking.Connectivity.LanIdentifierData = js.native
    
    /* CompleteClass */
    var networkAdapterId: String = js.native
    
    /* CompleteClass */
    var portId: typings.winrt.Windows.Networking.Connectivity.LanIdentifierData = js.native
  }
  
  @JSGlobal("Windows.Networking.Connectivity.LanIdentifierData")
  @js.native
  open class LanIdentifierData ()
    extends StObject
       with typings.winrt.Windows.Networking.Connectivity.LanIdentifierData {
    
    /* CompleteClass */
    var `type`: Double = js.native
    
    /* CompleteClass */
    var value: IVectorView[Double] = js.native
  }
  
  @JSGlobal("Windows.Networking.Connectivity.NetworkAdapter")
  @js.native
  open class NetworkAdapter ()
    extends StObject
       with typings.winrt.Windows.Networking.Connectivity.NetworkAdapter {
    
    /* CompleteClass */
    override def getConnectedProfileAsync(): IAsyncOperation[typings.winrt.Windows.Networking.Connectivity.ConnectionProfile] = js.native
    
    /* CompleteClass */
    var ianaInterfaceType: Double = js.native
    
    /* CompleteClass */
    var inboundMaxBitsPerSecond: Double = js.native
    
    /* CompleteClass */
    var networkAdapterId: String = js.native
    
    /* CompleteClass */
    var networkItem: typings.winrt.Windows.Networking.Connectivity.NetworkItem = js.native
    
    /* CompleteClass */
    var outboundMaxBitsPerSecond: Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Connectivity.NetworkAuthenticationType")
  @js.native
  object NetworkAuthenticationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType & Double] = js.native
    
    /* 9 */ val ihv: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.ihv & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.none & Double = js.native
    
    /* 2 */ val open80211: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.open80211 & Double = js.native
    
    /* 7 */ val rsna: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.rsna & Double = js.native
    
    /* 8 */ val rsnaPsk: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.rsnaPsk & Double = js.native
    
    /* 3 */ val sharedKey80211: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.sharedKey80211 & Double = js.native
    
    /* 1 */ val unknown: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.unknown & Double = js.native
    
    /* 4 */ val wpa: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.wpa & Double = js.native
    
    /* 6 */ val wpaNone: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaNone & Double = js.native
    
    /* 5 */ val wpaPsk: typings.winrt.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaPsk & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Connectivity.NetworkConnectivityLevel")
  @js.native
  object NetworkConnectivityLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel & Double] = js.native
    
    /* 2 */ val constrainedInternetAccess: typings.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel.constrainedInternetAccess & Double = js.native
    
    /* 3 */ val internetAccess: typings.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel.internetAccess & Double = js.native
    
    /* 1 */ val localAccess: typings.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel.localAccess & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Networking.Connectivity.NetworkConnectivityLevel.none & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Connectivity.NetworkCostType")
  @js.native
  object NetworkCostType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Connectivity.NetworkCostType & Double] = js.native
    
    /* 2 */ val fixed: typings.winrt.Windows.Networking.Connectivity.NetworkCostType.fixed & Double = js.native
    
    /* 0 */ val unknown: typings.winrt.Windows.Networking.Connectivity.NetworkCostType.unknown & Double = js.native
    
    /* 1 */ val unrestricted: typings.winrt.Windows.Networking.Connectivity.NetworkCostType.unrestricted & Double = js.native
    
    /* 3 */ val variable: typings.winrt.Windows.Networking.Connectivity.NetworkCostType.variable & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Connectivity.NetworkEncryptionType")
  @js.native
  object NetworkEncryptionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType & Double] = js.native
    
    /* 6 */ val ccmp: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.ccmp & Double = js.native
    
    /* 9 */ val ihv: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.ihv & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.none & Double = js.native
    
    /* 8 */ val rsnUseGroup: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.rsnUseGroup & Double = js.native
    
    /* 5 */ val tkip: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.tkip & Double = js.native
    
    /* 1 */ val unknown: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.unknown & Double = js.native
    
    /* 2 */ val wep: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wep & Double = js.native
    
    /* 4 */ val wep104: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wep104 & Double = js.native
    
    /* 3 */ val wep40: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wep40 & Double = js.native
    
    /* 7 */ val wpaUseGroup: typings.winrt.Windows.Networking.Connectivity.NetworkEncryptionType.wpaUseGroup & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Connectivity.NetworkInformation")
  @js.native
  open class NetworkInformation ()
    extends StObject
       with typings.winrt.Windows.Networking.Connectivity.NetworkInformation
  /* static members */
  object NetworkInformation {
    
    @JSGlobal("Windows.Networking.Connectivity.NetworkInformation")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getConnectionProfiles(): IVectorView[typings.winrt.Windows.Networking.Connectivity.ConnectionProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConnectionProfiles")().asInstanceOf[IVectorView[typings.winrt.Windows.Networking.Connectivity.ConnectionProfile]]
    
    inline def getHostNames(): IVectorView[typings.winrt.Windows.Networking.HostName] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostNames")().asInstanceOf[IVectorView[typings.winrt.Windows.Networking.HostName]]
    
    inline def getInternetConnectionProfile(): typings.winrt.Windows.Networking.Connectivity.ConnectionProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("getInternetConnectionProfile")().asInstanceOf[typings.winrt.Windows.Networking.Connectivity.ConnectionProfile]
    
    inline def getLanIdentifiers(): IVectorView[typings.winrt.Windows.Networking.Connectivity.LanIdentifier] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanIdentifiers")().asInstanceOf[IVectorView[typings.winrt.Windows.Networking.Connectivity.LanIdentifier]]
    
    inline def getProxyConfigurationAsync(uri: Uri): IAsyncOperation[typings.winrt.Windows.Networking.Connectivity.ProxyConfiguration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProxyConfigurationAsync")(uri.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Networking.Connectivity.ProxyConfiguration]]
    
    inline def getSortedEndpointPairs(
      destinationList: IIterable[typings.winrt.Windows.Networking.EndpointPair],
      sortOptions: typings.winrt.Windows.Networking.HostNameSortOptions
    ): IVectorView[typings.winrt.Windows.Networking.EndpointPair] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSortedEndpointPairs")(destinationList.asInstanceOf[js.Any], sortOptions.asInstanceOf[js.Any])).asInstanceOf[IVectorView[typings.winrt.Windows.Networking.EndpointPair]]
    
    @JSGlobal("Windows.Networking.Connectivity.NetworkInformation.onnetworkstatuschanged")
    @js.native
    def onnetworkstatuschanged: Any = js.native
    inline def onnetworkstatuschanged_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onnetworkstatuschanged")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Networking.Connectivity.NetworkItem")
  @js.native
  open class NetworkItem ()
    extends StObject
       with typings.winrt.Windows.Networking.Connectivity.NetworkItem {
    
    /* CompleteClass */
    override def getNetworkTypes(): NetworkTypes = js.native
    
    /* CompleteClass */
    var networkId: String = js.native
  }
  
  @JSGlobal("Windows.Networking.Connectivity.NetworkSecuritySettings")
  @js.native
  open class NetworkSecuritySettings ()
    extends StObject
       with typings.winrt.Windows.Networking.Connectivity.NetworkSecuritySettings {
    
    /* CompleteClass */
    var networkAuthenticationType: NetworkAuthenticationType = js.native
    
    /* CompleteClass */
    var networkEncryptionType: NetworkEncryptionType = js.native
  }
  
  @JSGlobal("Windows.Networking.Connectivity.NetworkTypes")
  @js.native
  object NetworkTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Connectivity.NetworkTypes & Double] = js.native
    
    /* 1 */ val internet: typings.winrt.Windows.Networking.Connectivity.NetworkTypes.internet & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Networking.Connectivity.NetworkTypes.none & Double = js.native
    
    /* 2 */ val privateNetwork: typings.winrt.Windows.Networking.Connectivity.NetworkTypes.privateNetwork & Double = js.native
  }
  
  @JSGlobal("Windows.Networking.Connectivity.ProxyConfiguration")
  @js.native
  open class ProxyConfiguration ()
    extends StObject
       with typings.winrt.Windows.Networking.Connectivity.ProxyConfiguration {
    
    /* CompleteClass */
    var canConnectDirectly: Boolean = js.native
    
    /* CompleteClass */
    var proxyUris: IVectorView[Uri] = js.native
  }
  
  @JSGlobal("Windows.Networking.Connectivity.RoamingStates")
  @js.native
  object RoamingStates extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Networking.Connectivity.RoamingStates & Double] = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Networking.Connectivity.RoamingStates.none & Double = js.native
    
    /* 1 */ val notRoaming: typings.winrt.Windows.Networking.Connectivity.RoamingStates.notRoaming & Double = js.native
    
    /* 2 */ val roaming: typings.winrt.Windows.Networking.Connectivity.RoamingStates.roaming & Double = js.native
  }
}
