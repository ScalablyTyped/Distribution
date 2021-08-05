package typings.winrtUwp.global.Windows.Networking

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Networking.Connectivity.CellularApnAuthenticationType
import typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType
import typings.winrtUwp.Windows.Networking.Connectivity.NetworkCostType
import typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType
import typings.winrtUwp.Windows.Networking.Connectivity.NetworkStatusChangedEventHandler
import typings.winrtUwp.Windows.Networking.Connectivity.NetworkTypes
import typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass
import typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtUwp.winrtUwpStrings.networkstatuschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Retrieves connection profiles that provide connectivity, usage, and data plan information for established network connections. This data can be used by a connected application to take appropriate action when operating in challenging network scenarios or abiding by data plan limits set by a network provider. */
object Connectivity {
  
  /** Provides access to property values containing information on current usage of the attributed network connection. */
  @JSGlobal("Windows.Networking.Connectivity.AttributedNetworkUsage")
  @js.native
  abstract class AttributedNetworkUsage ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.AttributedNetworkUsage {
    
    /** Gets the Id of the of the app. */
    /* CompleteClass */
    var attributionId: String = js.native
    
    /** Gets the name of the app. */
    /* CompleteClass */
    var attributionName: String = js.native
    
    /** Gets the thumbnail of the app. */
    /* CompleteClass */
    var attributionThumbnail: IRandomAccessStreamReference = js.native
    
    /** Gets the number of bytes received by the app over the network. */
    /* CompleteClass */
    var bytesReceived: Double = js.native
    
    /** Gets the number of bytes sent by the app over the network. */
    /* CompleteClass */
    var bytesSent: Double = js.native
  }
  
  /** Defines values that indicate the authentication type used for a APN. These values are referenced when providing APN details using a CellularApnContext object. */
  @JSGlobal("Windows.Networking.Connectivity.CellularApnAuthenticationType")
  @js.native
  object CellularApnAuthenticationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.Connectivity.CellularApnAuthenticationType & Double
      ] = js.native
    
    /* 2 */ val chap: typings.winrtUwp.Windows.Networking.Connectivity.CellularApnAuthenticationType.chap & Double = js.native
    
    /* 3 */ val mschapv2: typings.winrtUwp.Windows.Networking.Connectivity.CellularApnAuthenticationType.mschapv2 & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.CellularApnAuthenticationType.none & Double = js.native
    
    /* 1 */ val pap: typings.winrtUwp.Windows.Networking.Connectivity.CellularApnAuthenticationType.pap & Double = js.native
  }
  
  /** This class contains properties used to specify an Access Point Name (APN) for a 3GPP based cellular Data Connection (PDP context). A CellularApnContext object is passed with a AcquireConnectionAsync call to establish a connection to a specific access point. */
  @JSGlobal("Windows.Networking.Connectivity.CellularApnContext")
  @js.native
  /** Creates an instance of CellularApnContext . */
  class CellularApnContext ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.CellularApnContext {
    
    /** Indicates the name of the access point to establish a connection with. */
    /* CompleteClass */
    var accessPointName: String = js.native
    
    /** Indicates the authentication method, as defined by CellularApnAuthenticationType , that is used by the access point. */
    /* CompleteClass */
    var authenticationType: CellularApnAuthenticationType = js.native
    
    /** Indicates if data compression will be used at the data link for header and data transfer. */
    /* CompleteClass */
    var isCompressionEnabled: Boolean = js.native
    
    /** Indicates the password used to authenticate when connecting to the access point. */
    /* CompleteClass */
    var password: String = js.native
    
    /** Indicates the provider ID associated with the access point. */
    /* CompleteClass */
    var providerId: String = js.native
    
    /** Indicates the user name used to authenticate when connecting to the access point. */
    /* CompleteClass */
    var userName: String = js.native
  }
  
  /** Provides access to property values that indicate the current cost of a network connection. */
  @JSGlobal("Windows.Networking.Connectivity.ConnectionCost")
  @js.native
  abstract class ConnectionCost ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.ConnectionCost {
    
    /** Gets a value that indicates if a connection is approaching the data usage allowance specified by the data plan. */
    /* CompleteClass */
    var approachingDataLimit: Boolean = js.native
    
    /** Gets a value that indicates whether background data usage has been restricted. */
    /* CompleteClass */
    var backgroundDataUsageRestricted: Boolean = js.native
    
    /** Gets a value that indicates the current network cost for a connection. */
    /* CompleteClass */
    var networkCostType: NetworkCostType = js.native
    
    /** Gets a value that indicates if the connection has exceeded the data usage allowance specified by the data plan. */
    /* CompleteClass */
    var overDataLimit: Boolean = js.native
    
    /** Gets a value that indicates whether the connection is connected to a network outside of the home provider. */
    /* CompleteClass */
    var roaming: Boolean = js.native
  }
  
  /** Represents a network connection, which includes either the currently connected network or prior network connections. Provides information about the connection status and connectivity statistics. */
  @JSGlobal("Windows.Networking.Connectivity.ConnectionProfile")
  @js.native
  abstract class ConnectionProfile ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile
  
  /** The ConnectionProfileFilter class defines a set of properties that are used to improve the relevance of FindConnectionProfilesAsync results. */
  @JSGlobal("Windows.Networking.Connectivity.ConnectionProfileFilter")
  @js.native
  /** Creates an instance of ConnectionProfileFilter , which contains a set of properties that are used to improve the relevance of FindConnectionProfilesAsync results. */
  class ConnectionProfileFilter ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfileFilter {
    
    /** Gets or sets whether background data usage is restricted by this connection profile filter. */
    /* CompleteClass */
    var isBackgroundDataUsageRestricted: Boolean = js.native
    
    /** Indicates if connection profiles that represent currently established connections are included in query results. */
    /* CompleteClass */
    var isConnected: Boolean = js.native
    
    /** Gets or sets whether the data limit has been exceeded under the current connection profile filter. */
    /* CompleteClass */
    var isOverDataLimit: Boolean = js.native
    
    /** Gets or sets whether roaming is active in the connection profile filter. */
    /* CompleteClass */
    var isRoaming: Boolean = js.native
    
    /** Indicates if connection profiles that represent WLAN (WiFi) connections are included in query results. */
    /* CompleteClass */
    var isWlanConnectionProfile: Boolean = js.native
    
    /** Indicates if connection profiles that represent WWAN (mobile) connections are included in query results. */
    /* CompleteClass */
    var isWwanConnectionProfile: Boolean = js.native
    
    /** Defines a specific NetworkCostType value to query for. */
    /* CompleteClass */
    var networkCostType: NetworkCostType = js.native
    
    /** Gets available data as raw data. */
    /* CompleteClass */
    var rawData: IBuffer = js.native
    
    /** Indicates a specific network operator ID to query for. */
    /* CompleteClass */
    var serviceProviderGuid: String = js.native
  }
  
  /** The ConnectionSession class is used to represent a connection to an access point established with AcquireConnectionAsync . */
  @JSGlobal("Windows.Networking.Connectivity.ConnectionSession")
  @js.native
  abstract class ConnectionSession ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.ConnectionSession {
    
    /** Closes the connection to the access point. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Retrieves the ConnectionProfile associated with the connection session. */
    /* CompleteClass */
    var connectionProfile: typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile = js.native
  }
  
  /** Provides the start time and duration for an established or prior connection. */
  @JSGlobal("Windows.Networking.Connectivity.ConnectivityInterval")
  @js.native
  abstract class ConnectivityInterval ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.ConnectivityInterval {
    
    /** Indicates the duration of connectivity. */
    /* CompleteClass */
    var connectionDuration: Double = js.native
    
    /** Indicates when the connection was initially established. */
    /* CompleteClass */
    var startTime: Date = js.native
  }
  
  /** Methods defined by the ConnectivityManager class enable enforcement of traffic routing on a specific network adapter for the specified destination suffix. Once a policy is set using AddHttpRoutePolicy , traffic that matches the policy will either be routed or dropped. */
  @JSGlobal("Windows.Networking.Connectivity.ConnectivityManager")
  @js.native
  abstract class ConnectivityManager ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.ConnectivityManager
  object ConnectivityManager {
    
    @JSGlobal("Windows.Networking.Connectivity.ConnectivityManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Establishes a connection to a specific access point on a network. The request is defined using a CellularApnContext object.
      * @param CellularApnContext Provides specific details about the APN.
      * @return The established APN connection.
      */
    /* static member */
    inline def acquireConnectionAsync(CellularApnContext: typings.winrtUwp.Windows.Networking.Connectivity.CellularApnContext): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Networking.Connectivity.ConnectionSession] = ^.asInstanceOf[js.Dynamic].applyDynamic("acquireConnectionAsync")(CellularApnContext.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Networking.Connectivity.ConnectionSession]]
    
    /**
      * Specifies a RoutePolicy that the Http stack (WinInet) will follow when routing traffic.
      * @param RoutePolicy Indicates the policy for traffic routing.
      */
    /* static member */
    inline def addHttpRoutePolicy(RoutePolicy: typings.winrtUwp.Windows.Networking.Connectivity.RoutePolicy): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addHttpRoutePolicy")(RoutePolicy.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Removes a previously specified RoutePolicy from the Http stack (WinInet).
      * @param RoutePolicy The RoutePolicy to remove.
      */
    /* static member */
    inline def removeHttpRoutePolicy(RoutePolicy: typings.winrtUwp.Windows.Networking.Connectivity.RoutePolicy): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHttpRoutePolicy")(RoutePolicy.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /** Represents the current status information for the data plan associated with a connection. */
  @JSGlobal("Windows.Networking.Connectivity.DataPlanStatus")
  @js.native
  abstract class DataPlanStatus ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.DataPlanStatus {
    
    /** Gets a value indicating the maximum data transfer allowance for a connection within each billing cycle, as defined by the data plan. */
    /* CompleteClass */
    var dataLimitInMegabytes: Double = js.native
    
    /** Gets a DataPlanUsage object that indicates the amount of data transferred over the connection, in megabytes, and the last time this value was refreshed. */
    /* CompleteClass */
    var dataPlanUsage: typings.winrtUwp.Windows.Networking.Connectivity.DataPlanUsage = js.native
    
    /** Gets a value indicating the nominal rate of the inbound data transfer occurring on the connection. */
    /* CompleteClass */
    var inboundBitsPerSecond: Double = js.native
    
    /** Gets a value indicates the maximum size of a transfer that is allowed without user consent on a metered network. */
    /* CompleteClass */
    var maxTransferSizeInMegabytes: Double = js.native
    
    /** Gets a value indicating the date and time of the next billing cycle. */
    /* CompleteClass */
    var nextBillingCycle: Date = js.native
    
    /** Gets a value indicating the nominal rate of the outbound data transfer. */
    /* CompleteClass */
    var outboundBitsPerSecond: Double = js.native
  }
  
  /** Represents data plan specific data usage information for a connection. */
  @JSGlobal("Windows.Networking.Connectivity.DataPlanUsage")
  @js.native
  abstract class DataPlanUsage ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.DataPlanUsage {
    
    /** Gets a DateTime object indicating the date and time when the MegabytesUsed property was last updated. */
    /* CompleteClass */
    var lastSyncTime: Date = js.native
    
    /** Gets a value indicating the total amount of data transferred, in megabytes, over the connection. */
    /* CompleteClass */
    var megabytesUsed: Double = js.native
  }
  
  /** Represents data usage information returned by the ConnectionProfile.GetLocalUsage method. */
  @JSGlobal("Windows.Networking.Connectivity.DataUsage")
  @js.native
  abstract class DataUsage ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.DataUsage {
    
    /** Gets a value indicating the number of bytes received by a connection over a specific period of time. */
    /* CompleteClass */
    var bytesReceived: Double = js.native
    
    /** Gets a value indicating the number of bytes sent by the connection over a specific period of time. */
    /* CompleteClass */
    var bytesSent: Double = js.native
  }
  
  /** Defines levels of granularity used when retrieving data usage statistics with GetNetworkUsageAsync . */
  @JSGlobal("Windows.Networking.Connectivity.DataUsageGranularity")
  @js.native
  object DataUsageGranularity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity & Double] = js.native
    
    /* 2 */ val perDay: typings.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity.perDay & Double = js.native
    
    /* 1 */ val perHour: typings.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity.perHour & Double = js.native
    
    /* 0 */ val perMinute: typings.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity.perMinute & Double = js.native
    
    /* 3 */ val total: typings.winrtUwp.Windows.Networking.Connectivity.DataUsageGranularity.total & Double = js.native
  }
  
  /** Defines the domain authentication status for a network connection. */
  @JSGlobal("Windows.Networking.Connectivity.DomainConnectivityLevel")
  @js.native
  object DomainConnectivityLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.Connectivity.DomainConnectivityLevel & Double
      ] = js.native
    
    /* 2 */ val authenticated: typings.winrtUwp.Windows.Networking.Connectivity.DomainConnectivityLevel.authenticated & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.DomainConnectivityLevel.none & Double = js.native
    
    /* 1 */ val unauthenticated: typings.winrtUwp.Windows.Networking.Connectivity.DomainConnectivityLevel.unauthenticated & Double = js.native
  }
  
  /** Represents the association between an IP address and an adapter on the network. */
  @JSGlobal("Windows.Networking.Connectivity.IPInformation")
  @js.native
  abstract class IPInformation ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.IPInformation {
    
    /** Retrieves the network adapter associated with the IP address. */
    /* CompleteClass */
    var networkAdapter: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAdapter = js.native
    
    /** Retrieves the length of the prefix, or network part of the IP address. */
    /* CompleteClass */
    var prefixLength: Double = js.native
  }
  
  /** Represents physical identification data for a specific NetworkAdapter object. */
  @JSGlobal("Windows.Networking.Connectivity.LanIdentifier")
  @js.native
  abstract class LanIdentifier ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.LanIdentifier {
    
    /** Gets a LanIdentifierData object containing locality identification information for the network adapter's connection. */
    /* CompleteClass */
    var infrastructureId: typings.winrtUwp.Windows.Networking.Connectivity.LanIdentifierData = js.native
    
    /** Gets the adapter GUID that identifies the network adapter to associate with the locality information. */
    /* CompleteClass */
    var networkAdapterId: String = js.native
    
    /** Gets a LanIdentifierData object containing the port ID from the Link Layer Discovery Protocol (LLDP) locality information for an Ethernet type network adapter. */
    /* CompleteClass */
    var portId: typings.winrtUwp.Windows.Networking.Connectivity.LanIdentifierData = js.native
  }
  
  /** Represents the port specific data that enables LAN locality capabilities. */
  @JSGlobal("Windows.Networking.Connectivity.LanIdentifierData")
  @js.native
  abstract class LanIdentifierData ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.LanIdentifierData {
    
    /** Gets a value indicating the type of data stored in the value field of the LanIdentifierData object according to the Link Layer Discovery Protocol (LLDP) protocol. */
    /* CompleteClass */
    var `type`: Double = js.native
    
    /** Gets the serialized value. */
    /* CompleteClass */
    var value: IVectorView[Double] = js.native
  }
  
  /** Represents a network adapter. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkAdapter")
  @js.native
  abstract class NetworkAdapter ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.NetworkAdapter {
    
    /**
      * Gets the connection profile currently associated with the network adapter.
      * @return The connection profile associated with this network adapter.
      */
    /* CompleteClass */
    override def getConnectedProfileAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile] = js.native
    
    /** Gets a value indicating the network interface type as defined by the Internet Assigned Names Authority (IANA) for the NetworkAdapter . */
    /* CompleteClass */
    var ianaInterfaceType: Double = js.native
    
    /** Gets a value indicating the maximum inbound data transfer rate in bits per second. */
    /* CompleteClass */
    var inboundMaxBitsPerSecond: Double = js.native
    
    /** Gets the network adapter ID. */
    /* CompleteClass */
    var networkAdapterId: String = js.native
    
    /** Gets the NetworkItem object that represents the connected network. */
    /* CompleteClass */
    var networkItem: typings.winrtUwp.Windows.Networking.Connectivity.NetworkItem = js.native
    
    /** Gets a value indicating the maximum outbound speed in bits per second. */
    /* CompleteClass */
    var outboundMaxBitsPerSecond: Double = js.native
  }
  
  /** Defines values that indicate the type of authentication used by the network. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkAuthenticationType")
  @js.native
  object NetworkAuthenticationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType & Double
      ] = js.native
    
    /* 9 */ val ihv: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.ihv & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.none & Double = js.native
    
    /* 2 */ val open80211: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.open80211 & Double = js.native
    
    /* 7 */ val rsna: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.rsna & Double = js.native
    
    /* 8 */ val rsnaPsk: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.rsnaPsk & Double = js.native
    
    /* 3 */ val sharedKey80211: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.sharedKey80211 & Double = js.native
    
    /* 1 */ val unknown: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.unknown & Double = js.native
    
    /* 4 */ val wpa: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.wpa & Double = js.native
    
    /* 6 */ val wpaNone: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaNone & Double = js.native
    
    /* 5 */ val wpaPsk: typings.winrtUwp.Windows.Networking.Connectivity.NetworkAuthenticationType.wpaPsk & Double = js.native
  }
  
  /** Defines the level of connectivity currently available. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkConnectivityLevel")
  @js.native
  object NetworkConnectivityLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.Connectivity.NetworkConnectivityLevel & Double
      ] = js.native
    
    /* 2 */ val constrainedInternetAccess: typings.winrtUwp.Windows.Networking.Connectivity.NetworkConnectivityLevel.constrainedInternetAccess & Double = js.native
    
    /* 3 */ val internetAccess: typings.winrtUwp.Windows.Networking.Connectivity.NetworkConnectivityLevel.internetAccess & Double = js.native
    
    /* 1 */ val localAccess: typings.winrtUwp.Windows.Networking.Connectivity.NetworkConnectivityLevel.localAccess & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.NetworkConnectivityLevel.none & Double = js.native
  }
  
  /** Defines the network cost types. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkCostType")
  @js.native
  object NetworkCostType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Connectivity.NetworkCostType & Double] = js.native
    
    /* 2 */ val fixed: typings.winrtUwp.Windows.Networking.Connectivity.NetworkCostType.fixed & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Networking.Connectivity.NetworkCostType.unknown & Double = js.native
    
    /* 1 */ val unrestricted: typings.winrtUwp.Windows.Networking.Connectivity.NetworkCostType.unrestricted & Double = js.native
    
    /* 3 */ val variable: typings.winrtUwp.Windows.Networking.Connectivity.NetworkCostType.variable & Double = js.native
  }
  
  /** Defines values that indicate the type of encryption used for authentication. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkEncryptionType")
  @js.native
  object NetworkEncryptionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType & Double] = js.native
    
    /* 6 */ val ccmp: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.ccmp & Double = js.native
    
    /* 9 */ val ihv: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.ihv & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.none & Double = js.native
    
    /* 8 */ val rsnUseGroup: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.rsnUseGroup & Double = js.native
    
    /* 5 */ val tkip: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.tkip & Double = js.native
    
    /* 1 */ val unknown: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.unknown & Double = js.native
    
    /* 2 */ val wep: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.wep & Double = js.native
    
    /* 4 */ val wep104: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.wep104 & Double = js.native
    
    /* 3 */ val wep40: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.wep40 & Double = js.native
    
    /* 7 */ val wpaUseGroup: typings.winrtUwp.Windows.Networking.Connectivity.NetworkEncryptionType.wpaUseGroup & Double = js.native
  }
  
  /** Provides access to network connection information for the local machine. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkInformation")
  @js.native
  abstract class NetworkInformation ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.NetworkInformation
  object NetworkInformation {
    
    @JSGlobal("Windows.Networking.Connectivity.NetworkInformation")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_networkstatuschanged(`type`: networkstatuschanged, listener: NetworkStatusChangedEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Returns an array of ConnectionProfile objects that match the filtering criteria defined by ConnectionProfileFilter .
      * @param pProfileFilter Provides the filtering criteria.
      * @return An array of ConnectionProfile objects.
      */
    /* static member */
    inline def findConnectionProfilesAsync(pProfileFilter: typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfileFilter): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findConnectionProfilesAsync")(pProfileFilter.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
    
    /**
      * Gets a list of profiles for connections, active or otherwise, on the local machine.
      * @return An array of ConnectionProfile objects.
      */
    /* static member */
    inline def getConnectionProfiles(): IVectorView[typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConnectionProfiles")().asInstanceOf[IVectorView[typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile]]
    
    /**
      * Gets a list of host names associated with the local machine.
      * @return An array of host names for the local machine.
      */
    /* static member */
    inline def getHostNames(): IVectorView[typings.winrtUwp.Windows.Networking.HostName] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostNames")().asInstanceOf[IVectorView[typings.winrtUwp.Windows.Networking.HostName]]
    
    /**
      * Gets the connection profile associated with the internet connection currently used by the local machine.
      * @return The profile for the connection currently used to connect the machine to the Internet, or null if there is no connection profile with a suitable connection.
      */
    /* static member */
    inline def getInternetConnectionProfile(): typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("getInternetConnectionProfile")().asInstanceOf[typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile]
    
    /**
      * Gets an array of LanIdentifier objects that contain locality information for each NetworkAdapter object that currently connected to a network.
      * @return An array of LanIdentifier objects.
      */
    /* static member */
    inline def getLanIdentifiers(): IVectorView[typings.winrtUwp.Windows.Networking.Connectivity.LanIdentifier] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanIdentifiers")().asInstanceOf[IVectorView[typings.winrtUwp.Windows.Networking.Connectivity.LanIdentifier]]
    
    /**
      * Gets proxy configuration for a connection using the specified URI.
      * @param uri The proxy configuration URI.
      * @return Information about the connection proxy.
      */
    /* static member */
    inline def getProxyConfigurationAsync(uri: Uri): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Networking.Connectivity.ProxyConfiguration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProxyConfigurationAsync")(uri.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Networking.Connectivity.ProxyConfiguration]]
    
    /**
      * Gets a sorted list of EndpointPair objects.
      * @param destinationList A list of EndpointPair objects to be sorted.
      * @param sortOptions Indicates sorting options for the returned array.
      * @return A sorted array of EndpointPair objects.
      */
    /* static member */
    inline def getSortedEndpointPairs(
      destinationList: IIterable[typings.winrtUwp.Windows.Networking.EndpointPair],
      sortOptions: typings.winrtUwp.Windows.Networking.HostNameSortOptions
    ): IVectorView[typings.winrtUwp.Windows.Networking.EndpointPair] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSortedEndpointPairs")(destinationList.asInstanceOf[js.Any], sortOptions.asInstanceOf[js.Any])).asInstanceOf[IVectorView[typings.winrtUwp.Windows.Networking.EndpointPair]]
    
    /** Occurs when the network status changes for a connection. */
    /* static member */
    @JSGlobal("Windows.Networking.Connectivity.NetworkInformation.onnetworkstatuschanged")
    @js.native
    def onnetworkstatuschanged: NetworkStatusChangedEventHandler = js.native
    inline def onnetworkstatuschanged_=(x: NetworkStatusChangedEventHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onnetworkstatuschanged")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_networkstatuschanged(`type`: networkstatuschanged, listener: NetworkStatusChangedEventHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /** Represents a connected network. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkItem")
  @js.native
  abstract class NetworkItem ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.NetworkItem {
    
    /**
      * Gets a NetworkTypes value indicating the network type for a NetworkItem .
      * @return The type of a network.
      */
    /* CompleteClass */
    override def getNetworkTypes(): NetworkTypes = js.native
    
    /** Gets the network ID. */
    /* CompleteClass */
    var networkId: String = js.native
  }
  
  /** Represents the current network security settings. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkSecuritySettings")
  @js.native
  abstract class NetworkSecuritySettings ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.NetworkSecuritySettings {
    
    /** Retrieves the type of authentication used by the network. */
    /* CompleteClass */
    var networkAuthenticationType: NetworkAuthenticationType = js.native
    
    /** Retrieves the type of encryption used by the network. */
    /* CompleteClass */
    var networkEncryptionType: NetworkEncryptionType = js.native
  }
  
  /** Indicates which properties of a network have changed after a network state change background trigger. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkStateChangeEventDetails")
  @js.native
  abstract class NetworkStateChangeEventDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.NetworkStateChangeEventDetails {
    
    /** Indicates if a connected network has a new connection cost. */
    /* CompleteClass */
    var hasNewConnectionCost: Boolean = js.native
    
    /** Indicates a connected network has a new domain connectivity level. */
    /* CompleteClass */
    var hasNewDomainConnectivityLevel: Boolean = js.native
    
    /** Indicates if the list of host names returned by GetHostNames has changed. */
    /* CompleteClass */
    var hasNewHostNameList: Boolean = js.native
    
    /** Indicates if the local machine has a new connection profile associated with the current internet connection. */
    /* CompleteClass */
    var hasNewInternetConnectionProfile: Boolean = js.native
    
    /** Indicates if the network connectivity level for any connection profiles has changed. */
    /* CompleteClass */
    var hasNewNetworkConnectivityLevel: Boolean = js.native
    
    /** Gets a value indicating whether the network state change event shows a new tethering client count. */
    /* CompleteClass */
    var hasNewTetheringClientCount: Boolean = js.native
    
    /** Gets a value that indicates whether the tethering operational state has changed. */
    /* CompleteClass */
    var hasNewTetheringOperationalState: Boolean = js.native
    
    /** Indicates if the network state change event represents a change to the registration state of a WWAN connection. The current registration state can be retrieved from WwanConnectionProfileDetails.GetNetworkRegistrationState . */
    /* CompleteClass */
    var hasNewWwanRegistrationState: Boolean = js.native
  }
  
  /** Defines the network connection types. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkTypes")
  @js.native
  object NetworkTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Connectivity.NetworkTypes & Double] = js.native
    
    /* 1 */ val internet: typings.winrtUwp.Windows.Networking.Connectivity.NetworkTypes.internet & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.NetworkTypes.none & Double = js.native
    
    /* 2 */ val privateNetwork: typings.winrtUwp.Windows.Networking.Connectivity.NetworkTypes.privateNetwork & Double = js.native
  }
  
  /** Represents network usage statistics returned by the ConnectionProfile . GetNetworkUsageAsync method. */
  @JSGlobal("Windows.Networking.Connectivity.NetworkUsage")
  @js.native
  abstract class NetworkUsage ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.NetworkUsage {
    
    /** Indicates the number of bytes received by the connection of a specific period of time. */
    /* CompleteClass */
    var bytesReceived: Double = js.native
    
    /** Indicates the number of bytes sent by a connection over a specific period of time. */
    /* CompleteClass */
    var bytesSent: Double = js.native
    
    /** Indicates the duration of connectivity. */
    /* CompleteClass */
    var connectionDuration: Double = js.native
  }
  
  /** Represents the proxy configuration for the current user. */
  @JSGlobal("Windows.Networking.Connectivity.ProxyConfiguration")
  @js.native
  abstract class ProxyConfiguration ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.ProxyConfiguration {
    
    /** Gets a value that indicates if this configuration can connect directly. */
    /* CompleteClass */
    var canConnectDirectly: Boolean = js.native
    
    /** Gets a list of URIs for the proxies from the proxy configuration. */
    /* CompleteClass */
    var proxyUris: IVectorView[Uri] = js.native
  }
  
  /** Defines the roaming states. */
  @JSGlobal("Windows.Networking.Connectivity.RoamingStates")
  @js.native
  object RoamingStates extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Connectivity.RoamingStates & Double] = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.RoamingStates.none & Double = js.native
    
    /* 1 */ val notRoaming: typings.winrtUwp.Windows.Networking.Connectivity.RoamingStates.notRoaming & Double = js.native
    
    /* 2 */ val roaming: typings.winrtUwp.Windows.Networking.Connectivity.RoamingStates.roaming & Double = js.native
  }
  
  /** The RoutePolicy class is used to represent the traffic routing policy for a special PDP Context/APN. */
  @JSGlobal("Windows.Networking.Connectivity.RoutePolicy")
  @js.native
  class RoutePolicy protected ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.RoutePolicy {
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
    
    /** Retrieves the connection profile for an access point connection. */
    /* CompleteClass */
    var connectionProfile: typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile = js.native
    
    /** Provides the host name for the route policy to the special PDP context. */
    /* CompleteClass */
    var hostName: typings.winrtUwp.Windows.Networking.HostName = js.native
    
    /** Indicates if the HostName is a suffix or a fully qualified domain name reference. Possible values are defined by DomainNameType . */
    /* CompleteClass */
    var hostNameType: typings.winrtUwp.Windows.Networking.DomainNameType = js.native
  }
  
  /** Used with the NetworkUsageStates structure to define the desired roaming state and shared state of a network connection. */
  @JSGlobal("Windows.Networking.Connectivity.TriStates")
  @js.native
  object TriStates extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Connectivity.TriStates & Double] = js.native
    
    /* 0 */ val doNotCare: typings.winrtUwp.Windows.Networking.Connectivity.TriStates.doNotCare & Double = js.native
    
    /* 1 */ val no: typings.winrtUwp.Windows.Networking.Connectivity.TriStates.no & Double = js.native
    
    /* 2 */ val yes: typings.winrtUwp.Windows.Networking.Connectivity.TriStates.yes & Double = js.native
  }
  
  /** Used to access information specific to a WLAN connection. */
  @JSGlobal("Windows.Networking.Connectivity.WlanConnectionProfileDetails")
  @js.native
  abstract class WlanConnectionProfileDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.WlanConnectionProfileDetails {
    
    /**
      * Retrieves the Service Set Identifier (SSID) for a WLAN connection.
      * @return The service set identifier (SSID).
      */
    /* CompleteClass */
    override def getConnectedSsid(): String = js.native
  }
  
  /** Used to access information specific to a WWAN connection. */
  @JSGlobal("Windows.Networking.Connectivity.WwanConnectionProfileDetails")
  @js.native
  abstract class WwanConnectionProfileDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.Connectivity.WwanConnectionProfileDetails {
    
    /** Indicates the name of the access point used to establish the WWAN connection. */
    /* CompleteClass */
    var accessPointName: String = js.native
    
    /**
      * Indicates the class of data service offered by the network currently in use for the WWAN connection.
      * @return The class of data service currently provided.
      */
    /* CompleteClass */
    override def getCurrentDataClass(): WwanDataClass = js.native
    
    /**
      * Retrieves the current network registration state for the WWAN connection.
      * @return The current network registration state.
      */
    /* CompleteClass */
    override def getNetworkRegistrationState(): WwanNetworkRegistrationState = js.native
    
    /** Indicates the Home Network Provider ID. */
    /* CompleteClass */
    var homeProviderId: String = js.native
  }
  
  /** Defines values used to indicate the class of data service provided by a WWAN network connection. */
  @JSGlobal("Windows.Networking.Connectivity.WwanDataClass")
  @js.native
  object WwanDataClass extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass & Double] = js.native
    
    /* 8 */ val cdma1xEvdo: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xEvdo & Double = js.native
    
    /* 9 */ val cdma1xEvdoRevA: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xEvdoRevA & Double = js.native
    
    /* 12 */ val cdma1xEvdoRevB: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xEvdoRevB & Double = js.native
    
    /* 10 */ val cdma1xEvdv: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xEvdv & Double = js.native
    
    /* 7 */ val cdma1xRtt: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.cdma1xRtt & Double = js.native
    
    /* 11 */ val cdma3xRtt: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.cdma3xRtt & Double = js.native
    
    /* 13 */ val cdmaUmb: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.cdmaUmb & Double = js.native
    
    /* 14 */ val custom: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.custom & Double = js.native
    
    /* 2 */ val edge: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.edge & Double = js.native
    
    /* 1 */ val gprs: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.gprs & Double = js.native
    
    /* 4 */ val hsdpa: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.hsdpa & Double = js.native
    
    /* 5 */ val hsupa: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.hsupa & Double = js.native
    
    /* 6 */ val lteAdvanced: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.lteAdvanced & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.none & Double = js.native
    
    /* 3 */ val umts: typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass.umts & Double = js.native
  }
  
  /** Defines the network registration states for a WWAN connection. */
  @JSGlobal("Windows.Networking.Connectivity.WwanNetworkRegistrationState")
  @js.native
  object WwanNetworkRegistrationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState & Double
      ] = js.native
    
    /* 6 */ val denied: typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.denied & Double = js.native
    
    /* 1 */ val deregistered: typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.deregistered & Double = js.native
    
    /* 3 */ val home: typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.home & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.none & Double = js.native
    
    /* 5 */ val partner: typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.partner & Double = js.native
    
    /* 4 */ val roaming: typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.roaming & Double = js.native
    
    /* 2 */ val searching: typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState.searching & Double = js.native
  }
}
