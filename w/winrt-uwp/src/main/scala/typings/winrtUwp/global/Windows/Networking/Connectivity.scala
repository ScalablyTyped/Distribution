package typings.winrtUwp.global.Windows.Networking

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Networking.Connectivity.NetworkStatusChangedEventHandler
import typings.winrtUwp.winrtUwpStrings.networkstatuschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Retrieves connection profiles that provide connectivity, usage, and data plan information for established network connections. This data can be used by a connected application to take appropriate action when operating in challenging network scenarios or abiding by data plan limits set by a network provider. */
object Connectivity {
  
  /** Provides access to property values containing information on current usage of the attributed network connection. */
  @JSGlobal("Windows.Networking.Connectivity.AttributedNetworkUsage")
  @js.native
  abstract class AttributedNetworkUsage ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.AttributedNetworkUsage
  
  /** Defines values that indicate the authentication type used for a APN. These values are referenced when providing APN details using a CellularApnContext object. */
  @JSGlobal("Windows.Networking.Connectivity.CellularApnAuthenticationType")
  @js.native
  object CellularApnAuthenticationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.Connectivity.CellularApnAuthenticationType with Double
      ] = js.native
    
    /* 2 */ val chap: typings.winrtUwp.Windows.Networking.Connectivity.CellularApnAuthenticationType.chap with Double = js.native
    
    /* 3 */ val mschapv2: typings.winrtUwp.Windows.Networking.Connectivity.CellularApnAuthenticationType.mschapv2 with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.CellularApnAuthenticationType.none with Double = js.native
    
    /* 1 */ val pap: typings.winrtUwp.Windows.Networking.Connectivity.CellularApnAuthenticationType.pap with Double = js.native
  }
  
  /** This class contains properties used to specify an Access Point Name (APN) for a 3GPP based cellular Data Connection (PDP context). A CellularApnContext object is passed with a AcquireConnectionAsync call to establish a connection to a specific access point. */
  @JSGlobal("Windows.Networking.Connectivity.CellularApnContext")
  @js.native
  /** Creates an instance of CellularApnContext . */
  class CellularApnContext ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.CellularApnContext
  
  /** Provides access to property values that indicate the current cost of a network connection. */
  @JSGlobal("Windows.Networking.Connectivity.ConnectionCost")
  @js.native
  abstract class ConnectionCost ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.ConnectionCost
  
  /** Represents a network connection, which includes either the currently connected network or prior network connections. Provides information about the connection status and connectivity statistics. */
  @JSGlobal("Windows.Networking.Connectivity.ConnectionProfile")
  @js.native
  abstract class ConnectionProfile ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile
  
  /** The ConnectionProfileFilter class defines a set of properties that are used to improve the relevance of FindConnectionProfilesAsync results. */
  @JSGlobal("Windows.Networking.Connectivity.ConnectionProfileFilter")
  @js.native
  /** Creates an instance of ConnectionProfileFilter , which contains a set of properties that are used to improve the relevance of FindConnectionProfilesAsync results. */
  class ConnectionProfileFilter ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfileFilter
  
  /** The ConnectionSession class is used to represent a connection to an access point established with AcquireConnectionAsync . */
  @JSGlobal("Windows.Networking.Connectivity.ConnectionSession")
  @js.native
  abstract class ConnectionSession ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.ConnectionSession
  
  /** Provides the start time and duration for an established or prior connection. */
  @JSGlobal("Windows.Networking.Connectivity.ConnectivityInterval")
  @js.native
  abstract class ConnectivityInterval ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.ConnectivityInterval
  
  /** Methods defined by the ConnectivityManager class enable enforcement of traffic routing on a specific network adapter for the specified destination suffix. Once a policy is set using AddHttpRoutePolicy , traffic that matches the policy will either be routed or dropped. */
  @JSGlobal("Windows.Networking.Connectivity.ConnectivityManager")
  @js.native
  abstract class ConnectivityManager ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.ConnectivityManager
  object ConnectivityManager {
    
    /**
      * Establishes a connection to a specific access point on a network. The request is defined using a CellularApnContext object.
      * @param CellularApnContext Provides specific details about the APN.
      * @return The established APN connection.
      */
    /* static member */
    @JSGlobal("Windows.Networking.Connectivity.ConnectivityManager.acquireConnectionAsync")
    @js.native
    def acquireConnectionAsync(CellularApnContext: typings.winrtUwp.Windows.Networking.Connectivity.CellularApnContext): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Networking.Connectivity.ConnectionSession] = js.native
    
    /**
      * Specifies a RoutePolicy that the Http stack (WinInet) will follow when routing traffic.
      * @param RoutePolicy Indicates the policy for traffic routing.
      */
    /* static member */
    @JSGlobal("Windows.Networking.Connectivity.ConnectivityManager.addHttpRoutePolicy")
    @js.native
    def addHttpRoutePolicy(RoutePolicy: typings.winrtUwp.Windows.Networking.Connectivity.RoutePolicy): Unit = js.native
    
    /**
      * Removes a previously specified RoutePolicy from the Http stack (WinInet).
      * @param RoutePolicy The RoutePolicy to remove.
      */
    /* static member */
    @JSGlobal("Windows.Networking.Connectivity.ConnectivityManager.removeHttpRoutePolicy")
    @js.native
    def removeHttpRoutePolicy(RoutePolicy: typings.winrtUwp.Windows.Networking.Connectivity.RoutePolicy): Unit = js.native
  }
  
  /** Represents the current status information for the data plan associated with a connection. */
  @JSGlobal("Windows.Networking.Connectivity.DataPlanStatus")
  @js.native
  abstract class DataPlanStatus ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.DataPlanStatus
  
  /** Represents data plan specific data usage information for a connection. */
  @JSGlobal("Windows.Networking.Connectivity.DataPlanUsage")
  @js.native
  abstract class DataPlanUsage ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.DataPlanUsage
  
  /** Represents data usage information returned by the ConnectionProfile.GetLocalUsage method. */
  @JSGlobal("Windows.Networking.Connectivity.DataUsage")
  @js.native
  abstract class DataUsage ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.DataUsage
  
  /** Defines levels of granularity used when retrieving data usage statistics with GetNetworkUsageAsync . */
  @JSGlobal("Windows.Networking.Connectivity.DataUsageGranularity")
  @js.native
  object DataUsageGranularity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity with Double
      ] = js.native
    
    /* 2 */ val perDay: typings.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity.perDay with Double = js.native
    
    /* 1 */ val perHour: typings.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity.perHour with Double = js.native
    
    /* 0 */ val perMinute: typings.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity.perMinute with Double = js.native
    
    /* 3 */ val total: typings.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity.total with Double = js.native
  }
  
  /** Defines the domain authentication status for a network connection. */
  @JSGlobal("Windows.Networking.Connectivity.DomainConnectivityLevel")
  @js.native
  object DomainConnectivityLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.Connectivity.DomainConnectivityLevel with Double
      ] = js.native
    
    /* 2 */ val authenticated: typings.winrtUwp.Windows.Networking.Connectivity.DomainConnectivityLevel.authenticated with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.DomainConnectivityLevel.none with Double = js.native
    
    /* 1 */ val unauthenticated: typings.winrtUwp.Windows.Networking.Connectivity.DomainConnectivityLevel.unauthenticated with Double = js.native
  }
  
  /** Represents the association between an IP address and an adapter on the network. */
  @JSGlobal("Windows.Networking.Connectivity.IPInformation")
  @js.native
  abstract class IPInformation ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.IPInformation
  
  /** Represents physical identification data for a specific NetworkAdapter object. */
  @JSGlobal("Windows.Networking.Connectivity.LanIdentifier")
  @js.native
  abstract class LanIdentifier ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.LanIdentifier
  
  /** Represents the port specific data that enables LAN locality capabilities. */
  @JSGlobal("Windows.Networking.Connectivity.LanIdentifierData")
  @js.native
  abstract class LanIdentifierData ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.LanIdentifierData
  
  /** Represents a network adapter. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkAdapter")
  @js.native
  abstract class NetworkAdapter ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.NetworkAdapter
  
  /** Defines values that indicate the type of authentication used by the network. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkAuthenticationType")
  @js.native
  object NetworkAuthenticationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType with Double
      ] = js.native
    
    /* 9 */ val ihv: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.ihv with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.none with Double = js.native
    
    /* 2 */ val open80211: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.open80211 with Double = js.native
    
    /* 7 */ val rsna: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.rsna with Double = js.native
    
    /* 8 */ val rsnaPsk: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.rsnaPsk with Double = js.native
    
    /* 3 */ val sharedKey80211: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.sharedKey80211 with Double = js.native
    
    /* 1 */ val unknown: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.unknown with Double = js.native
    
    /* 4 */ val wpa: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.wpa with Double = js.native
    
    /* 6 */ val wpaNone: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaNone with Double = js.native
    
    /* 5 */ val wpaPsk: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaPsk with Double = js.native
  }
  
  /** Defines the level of connectivity currently available. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkConnectivityLevel")
  @js.native
  object NetworkConnectivityLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.Connectivity.NetworkConnectivityLevel with Double
      ] = js.native
    
    /* 2 */ val constrainedInternetAccess: typings.winrtUwp.Windows.Networking.Connectivity.NetworkConnectivityLevel.constrainedInternetAccess with Double = js.native
    
    /* 3 */ val internetAccess: typings.winrtUwp.Windows.Networking.Connectivity.NetworkConnectivityLevel.internetAccess with Double = js.native
    
    /* 1 */ val localAccess: typings.winrtUwp.Windows.Networking.Connectivity.NetworkConnectivityLevel.localAccess with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.NetworkConnectivityLevel.none with Double = js.native
  }
  
  /** Defines the network cost types. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkCostType")
  @js.native
  object NetworkCostType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Connectivity.NetworkCostType with Double] = js.native
    
    /* 2 */ val fixed: typings.winrtUwp.Windows.Networking.Connectivity.NetworkCostType.fixed with Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Networking.Connectivity.NetworkCostType.unknown with Double = js.native
    
    /* 1 */ val unrestricted: typings.winrtUwp.Windows.Networking.Connectivity.NetworkCostType.unrestricted with Double = js.native
    
    /* 3 */ val variable: typings.winrtUwp.Windows.Networking.Connectivity.NetworkCostType.variable with Double = js.native
  }
  
  /** Defines values that indicate the type of encryption used for authentication. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkEncryptionType")
  @js.native
  object NetworkEncryptionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType with Double
      ] = js.native
    
    /* 6 */ val ccmp: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.ccmp with Double = js.native
    
    /* 9 */ val ihv: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.ihv with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.none with Double = js.native
    
    /* 8 */ val rsnUseGroup: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.rsnUseGroup with Double = js.native
    
    /* 5 */ val tkip: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.tkip with Double = js.native
    
    /* 1 */ val unknown: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.unknown with Double = js.native
    
    /* 2 */ val wep: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.wep with Double = js.native
    
    /* 4 */ val wep104: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.wep104 with Double = js.native
    
    /* 3 */ val wep40: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.wep40 with Double = js.native
    
    /* 7 */ val wpaUseGroup: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.wpaUseGroup with Double = js.native
  }
  
  /** Provides access to network connection information for the local machine. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkInformation")
  @js.native
  abstract class NetworkInformation ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.NetworkInformation
  object NetworkInformation {
    
    @JSGlobal("Windows.Networking.Connectivity.NetworkInformation")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.Networking.Connectivity.NetworkInformation.addEventListener")
    @js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    /* static member */
    @JSGlobal("Windows.Networking.Connectivity.NetworkInformation.addEventListener")
    @js.native
    def addEventListener_networkstatuschanged(`type`: networkstatuschanged, listener: NetworkStatusChangedEventHandler): Unit = js.native
    
    /**
      * Returns an array of ConnectionProfile objects that match the filtering criteria defined by ConnectionProfileFilter .
      * @param pProfileFilter Provides the filtering criteria.
      * @return An array of ConnectionProfile objects.
      */
    /* static member */
    @JSGlobal("Windows.Networking.Connectivity.NetworkInformation.findConnectionProfilesAsync")
    @js.native
    def findConnectionProfilesAsync(pProfileFilter: typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfileFilter): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Gets a list of profiles for connections, active or otherwise, on the local machine.
      * @return An array of ConnectionProfile objects.
      */
    /* static member */
    @JSGlobal("Windows.Networking.Connectivity.NetworkInformation.getConnectionProfiles")
    @js.native
    def getConnectionProfiles(): IVectorView[typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile] = js.native
    
    /**
      * Gets a list of host names associated with the local machine.
      * @return An array of host names for the local machine.
      */
    /* static member */
    @JSGlobal("Windows.Networking.Connectivity.NetworkInformation.getHostNames")
    @js.native
    def getHostNames(): IVectorView[typings.winrtUwp.Windows.Networking.HostName] = js.native
    
    /**
      * Gets the connection profile associated with the internet connection currently used by the local machine.
      * @return The profile for the connection currently used to connect the machine to the Internet, or null if there is no connection profile with a suitable connection.
      */
    /* static member */
    @JSGlobal("Windows.Networking.Connectivity.NetworkInformation.getInternetConnectionProfile")
    @js.native
    def getInternetConnectionProfile(): typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile = js.native
    
    /**
      * Gets an array of LanIdentifier objects that contain locality information for each NetworkAdapter object that currently connected to a network.
      * @return An array of LanIdentifier objects.
      */
    /* static member */
    @JSGlobal("Windows.Networking.Connectivity.NetworkInformation.getLanIdentifiers")
    @js.native
    def getLanIdentifiers(): IVectorView[typings.winrtUwp.Windows.Networking.Connectivity.LanIdentifier] = js.native
    
    /**
      * Gets proxy configuration for a connection using the specified URI.
      * @param uri The proxy configuration URI.
      * @return Information about the connection proxy.
      */
    /* static member */
    @JSGlobal("Windows.Networking.Connectivity.NetworkInformation.getProxyConfigurationAsync")
    @js.native
    def getProxyConfigurationAsync(uri: Uri): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Networking.Connectivity.ProxyConfiguration] = js.native
    
    /**
      * Gets a sorted list of EndpointPair objects.
      * @param destinationList A list of EndpointPair objects to be sorted.
      * @param sortOptions Indicates sorting options for the returned array.
      * @return A sorted array of EndpointPair objects.
      */
    /* static member */
    @JSGlobal("Windows.Networking.Connectivity.NetworkInformation.getSortedEndpointPairs")
    @js.native
    def getSortedEndpointPairs(
      destinationList: IIterable[typings.winrtUwp.Windows.Networking.EndpointPair],
      sortOptions: typings.winrtUwp.Windows.Networking.HostNameSortOptions
    ): IVectorView[typings.winrtUwp.Windows.Networking.EndpointPair] = js.native
    
    /** Occurs when the network status changes for a connection. */
    /* static member */
    @JSGlobal("Windows.Networking.Connectivity.NetworkInformation.onnetworkstatuschanged")
    @js.native
    def onnetworkstatuschanged: NetworkStatusChangedEventHandler = js.native
    @scala.inline
    def onnetworkstatuschanged_=(x: NetworkStatusChangedEventHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onnetworkstatuschanged")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Windows.Networking.Connectivity.NetworkInformation.removeEventListener")
    @js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    /* static member */
    @JSGlobal("Windows.Networking.Connectivity.NetworkInformation.removeEventListener")
    @js.native
    def removeEventListener_networkstatuschanged(`type`: networkstatuschanged, listener: NetworkStatusChangedEventHandler): Unit = js.native
  }
  
  /** Represents a connected network. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkItem")
  @js.native
  abstract class NetworkItem ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.NetworkItem
  
  /** Represents the current network security settings. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkSecuritySettings")
  @js.native
  abstract class NetworkSecuritySettings ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.NetworkSecuritySettings
  
  /** Indicates which properties of a network have changed after a network state change background trigger. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkStateChangeEventDetails")
  @js.native
  abstract class NetworkStateChangeEventDetails ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.NetworkStateChangeEventDetails
  
  /** Defines the network connection types. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkTypes")
  @js.native
  object NetworkTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Connectivity.NetworkTypes with Double] = js.native
    
    /* 1 */ val internet: typings.winrtUwp.Windows.Networking.Connectivity.NetworkTypes.internet with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.NetworkTypes.none with Double = js.native
    
    /* 2 */ val privateNetwork: typings.winrtUwp.Windows.Networking.Connectivity.NetworkTypes.privateNetwork with Double = js.native
  }
  
  /** Represents network usage statistics returned by the ConnectionProfile . GetNetworkUsageAsync method. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkUsage")
  @js.native
  abstract class NetworkUsage ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.NetworkUsage
  
  /** Represents the proxy configuration for the current user. */
  @JSGlobal("Windows.Networking.Connectivity.ProxyConfiguration")
  @js.native
  abstract class ProxyConfiguration ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.ProxyConfiguration
  
  /** Defines the roaming states. */
  @JSGlobal("Windows.Networking.Connectivity.RoamingStates")
  @js.native
  object RoamingStates extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Connectivity.RoamingStates with Double] = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.RoamingStates.none with Double = js.native
    
    /* 1 */ val notRoaming: typings.winrtUwp.Windows.Networking.Connectivity.RoamingStates.notRoaming with Double = js.native
    
    /* 2 */ val roaming: typings.winrtUwp.Windows.Networking.Connectivity.RoamingStates.roaming with Double = js.native
  }
  
  /** The RoutePolicy class is used to represent the traffic routing policy for a special PDP Context/APN. */
  @JSGlobal("Windows.Networking.Connectivity.RoutePolicy")
  @js.native
  class RoutePolicy protected ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.RoutePolicy {
    /**
      * Creates an instance of RoutePolicy using the defined connection profile and host name values.
      * @param connectionProfile The connection profile
      * @param hostName The host name for the route policy to the special PDP context.
      * @param type The domain type of hostName when the HostNameType value indicates a domain name.
      */
    def this(
      connectionProfile: typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile,
      hostName: typings.winrtUwp.Windows.Networking.HostName,
      `type`: typings.winrtUwp.Windows.Networking.DomainNameType
    ) = this()
  }
  
  /** Used with the NetworkUsageStates structure to define the desired roaming state and shared state of a network connection. */
  @JSGlobal("Windows.Networking.Connectivity.TriStates")
  @js.native
  object TriStates extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Connectivity.TriStates with Double] = js.native
    
    /* 0 */ val doNotCare: typings.winrtUwp.Windows.Networking.Connectivity.TriStates.doNotCare with Double = js.native
    
    /* 1 */ val no: typings.winrtUwp.Windows.Networking.Connectivity.TriStates.no with Double = js.native
    
    /* 2 */ val yes: typings.winrtUwp.Windows.Networking.Connectivity.TriStates.yes with Double = js.native
  }
  
  /** Used to access information specific to a WLAN connection. */
  @JSGlobal("Windows.Networking.Connectivity.WlanConnectionProfileDetails")
  @js.native
  abstract class WlanConnectionProfileDetails ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.WlanConnectionProfileDetails
  
  /** Used to access information specific to a WWAN connection. */
  @JSGlobal("Windows.Networking.Connectivity.WwanConnectionProfileDetails")
  @js.native
  abstract class WwanConnectionProfileDetails ()
    extends typings.winrtUwp.Windows.Networking.Connectivity.WwanConnectionProfileDetails
  
  /** Defines values used to indicate the class of data service provided by a WWAN network connection. */
  @JSGlobal("Windows.Networking.Connectivity.WwanDataClass")
  @js.native
  object WwanDataClass extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass with Double] = js.native
    
    /* 8 */ val cdma1xEvdo: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xEvdo with Double = js.native
    
    /* 9 */ val cdma1xEvdoRevA: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xEvdoRevA with Double = js.native
    
    /* 12 */ val cdma1xEvdoRevB: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xEvdoRevB with Double = js.native
    
    /* 10 */ val cdma1xEvdv: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xEvdv with Double = js.native
    
    /* 7 */ val cdma1xRtt: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xRtt with Double = js.native
    
    /* 11 */ val cdma3xRtt: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.cdma3xRtt with Double = js.native
    
    /* 13 */ val cdmaUmb: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.cdmaUmb with Double = js.native
    
    /* 14 */ val custom: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.custom with Double = js.native
    
    /* 2 */ val edge: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.edge with Double = js.native
    
    /* 1 */ val gprs: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.gprs with Double = js.native
    
    /* 4 */ val hsdpa: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.hsdpa with Double = js.native
    
    /* 5 */ val hsupa: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.hsupa with Double = js.native
    
    /* 6 */ val lteAdvanced: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.lteAdvanced with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.none with Double = js.native
    
    /* 3 */ val umts: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.umts with Double = js.native
  }
  
  /** Defines the network registration states for a WWAN connection. */
  @JSGlobal("Windows.Networking.Connectivity.WwanNetworkRegistrationState")
  @js.native
  object WwanNetworkRegistrationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState with Double
      ] = js.native
    
    /* 6 */ val denied: typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.denied with Double = js.native
    
    /* 1 */ val deregistered: typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.deregistered with Double = js.native
    
    /* 3 */ val home: typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.home with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.none with Double = js.native
    
    /* 5 */ val partner: typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.partner with Double = js.native
    
    /* 4 */ val roaming: typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.roaming with Double = js.native
    
    /* 2 */ val searching: typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.searching with Double = js.native
  }
}
