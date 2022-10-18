package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.WiFi.WiFiAccessStatus
import typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus
import typings.winrtUwp.Windows.Devices.WiFi.WiFiNetworkKind
import typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.Connectivity.NetworkSecuritySettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a means to scan for nearby WiFi access points, enumerate those that are found, and connect to an access point. */
object WiFi {
  
  @JSGlobal("Windows.Devices.WiFi")
  @js.native
  val ^ : js.Any = js.native
  
  /** Used to report the results of an attempt to request access to a Wi-Fi adapter. */
  @JSGlobal("Windows.Devices.WiFi.WiFiAccessStatus")
  @js.native
  object WiFiAccessStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.WiFi.WiFiAccessStatus & Double] = js.native
    
    /* 1 */ val allowed: typings.winrtUwp.Windows.Devices.WiFi.WiFiAccessStatus.allowed & Double = js.native
    
    /* 3 */ val deniedBySystem: typings.winrtUwp.Windows.Devices.WiFi.WiFiAccessStatus.deniedBySystem & Double = js.native
    
    /* 2 */ val deniedByUser: typings.winrtUwp.Windows.Devices.WiFi.WiFiAccessStatus.deniedByUser & Double = js.native
    
    /* 0 */ val unspecified: typings.winrtUwp.Windows.Devices.WiFi.WiFiAccessStatus.unspecified & Double = js.native
  }
  
  /** Use this class to enumerate local Wi-Fi adapters, initiate Wi-Fi scans, enumerate scan results, and to connect or disconnect individual adapters. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.WiFi.WiFiAdapter")
  @js.native
  open class WiFiAdapter ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.WiFi.WiFiAdapter
  object WiFiAdapter {
    
    @JSGlobal("Windows.Devices.WiFi.WiFiAdapter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A static method that initiates an asynchronous operation to enumerate all Wi-Fi adapters in the system.
      * @return An asynchronous enumeration operation. On successful completion, returns a list of available Wi-Fi adapters.
      */
    /* static member */
    inline def findAllAdaptersAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAdaptersAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
    
    /**
      * A static method that initiates an asynchronous operation to get a WiFiAdapter object.
      * @param deviceId The Device ID of the Wi-Fi adapter to be retrieved. Obtain a Device ID through the Windows.Devices.Enumeration namespace.
      * @return An asynchronous get operation. On successful completion, returns a WiFiAdapter object specific to the requested Device ID.
      */
    /* static member */
    inline def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.WiFi.WiFiAdapter] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.WiFi.WiFiAdapter]]
    
    /**
      * A static method that returns an Advanced Query Syntax (AQS) string to be used to enumerate Wi-Fi adapters using Windows.Devices.Enumeration.DeviceInformation.FindAllAsync and related methods.
      * @return An identifier to be used to enumerate Wi-Fi devices.
      */
    /* static member */
    inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
    
    /**
      * A static method for determining whether the current user can access any of the Wi-Fi adapters on this device.
      * @return An asynchronous access operation. On successful completion, returns a status enumeration value describing whether the current user can access any Wi-Fi adapter.
      */
    /* static member */
    inline def requestAccessAsync(): IPromiseWithIAsyncOperation[WiFiAccessStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAccessAsync")().asInstanceOf[IPromiseWithIAsyncOperation[WiFiAccessStatus]]
  }
  
  /** Describes an available Wi-Fi network. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.WiFi.WiFiAvailableNetwork")
  @js.native
  open class WiFiAvailableNetwork ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.WiFi.WiFiAvailableNetwork {
    
    /** Gets the interval between 802.11 Beacon frames used by this network. */
    /* CompleteClass */
    var beaconInterval: Double = js.native
    
    /** Gets the MAC address of the access point. */
    /* CompleteClass */
    var bssid: String = js.native
    
    /** Gets the channel center frequency of the band on which the 802.11 Beacon or Probe Response was received. */
    /* CompleteClass */
    var channelCenterFrequencyInKilohertz: Double = js.native
    
    /** Gets a value indicating whether this network originates from a Wi-Fi Direct access point. */
    /* CompleteClass */
    var isWiFiDirect: Boolean = js.native
    
    /** Gets a value describing the kind of network being described. */
    /* CompleteClass */
    var networkKind: WiFiNetworkKind = js.native
    
    /** Gets the signal strength of the network. */
    /* CompleteClass */
    var networkRssiInDecibelMilliwatts: Double = js.native
    
    /** Gets a value describing the kind of PHY used by this network. */
    /* CompleteClass */
    var phyKind: WiFiPhyKind = js.native
    
    /** Gets the security configuration of the network. */
    /* CompleteClass */
    var securitySettings: NetworkSecuritySettings = js.native
    
    /** Gets the strength of the signal as a number of bars. */
    /* CompleteClass */
    var signalBars: Double = js.native
    
    /** Gets the SSID (name) of the network. */
    /* CompleteClass */
    var ssid: String = js.native
    
    /** Gets the uptime value reported by the network. */
    /* CompleteClass */
    var uptime: Double = js.native
  }
  
  /** Describes the results of an attempt to connect to a Wi-Fi network. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.WiFi.WiFiConnectionResult")
  @js.native
  open class WiFiConnectionResult ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionResult {
    
    /** Gets the connection result value. */
    /* CompleteClass */
    var connectionStatus: WiFiConnectionStatus = js.native
  }
  
  /** Status of the connection attempt. */
  @JSGlobal("Windows.Devices.WiFi.WiFiConnectionStatus")
  @js.native
  object WiFiConnectionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus & Double] = js.native
    
    /* 2 */ val accessRevoked: typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus.accessRevoked & Double = js.native
    
    /* 3 */ val invalidCredential: typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus.invalidCredential & Double = js.native
    
    /* 4 */ val networkNotAvailable: typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus.networkNotAvailable & Double = js.native
    
    /* 1 */ val success: typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus.success & Double = js.native
    
    /* 5 */ val timeout: typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus.timeout & Double = js.native
    
    /* 0 */ val unspecifiedFailure: typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus.unspecifiedFailure & Double = js.native
    
    /* 6 */ val unsupportedAuthenticationProtocol: typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus.unsupportedAuthenticationProtocol & Double = js.native
  }
  
  /** Describes the kinds of Wi-Fi networks. */
  @JSGlobal("Windows.Devices.WiFi.WiFiNetworkKind")
  @js.native
  object WiFiNetworkKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.WiFi.WiFiNetworkKind & Double] = js.native
    
    /* 2 */ val adhoc: typings.winrtUwp.Windows.Devices.WiFi.WiFiNetworkKind.adhoc & Double = js.native
    
    /* 0 */ val any: typings.winrtUwp.Windows.Devices.WiFi.WiFiNetworkKind.any & Double = js.native
    
    /* 1 */ val infrastructure: typings.winrtUwp.Windows.Devices.WiFi.WiFiNetworkKind.infrastructure & Double = js.native
  }
  
  /** Contains the result of a network scan operation. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.WiFi.WiFiNetworkReport")
  @js.native
  open class WiFiNetworkReport ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.WiFi.WiFiNetworkReport {
    
    /** A list of available networks. */
    /* CompleteClass */
    var availableNetworks: IVectorView[typings.winrtUwp.Windows.Devices.WiFi.WiFiAvailableNetwork] = js.native
    
    /** Contains the result of a network scan operation. */
    /* CompleteClass */
    var timestamp: js.Date = js.native
  }
  
  /** Describes PHY types supported by standard 802.11. */
  @JSGlobal("Windows.Devices.WiFi.WiFiPhyKind")
  @js.native
  object WiFiPhyKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind & Double] = js.native
    
    /* 2 */ val dsss: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.dsss & Double = js.native
    
    /* 6 */ val erp: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.erp & Double = js.native
    
    /* 1 */ val fhss: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.fhss & Double = js.native
    
    /* 5 */ val hrdsss: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.hrdsss & Double = js.native
    
    /* 7 */ val ht: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.ht & Double = js.native
    
    /* 3 */ val irBaseband: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.irBaseband & Double = js.native
    
    /* 4 */ val ofdm: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.ofdm & Double = js.native
    
    /* 0 */ val unknown: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.unknown & Double = js.native
    
    /* 8 */ val vht: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.vht & Double = js.native
  }
  
  /** Describes whether to automatically reconnect to this network. */
  @JSGlobal("Windows.Devices.WiFi.WiFiReconnectionKind")
  @js.native
  object WiFiReconnectionKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.WiFi.WiFiReconnectionKind & Double] = js.native
    
    /* 0 */ val automatic: typings.winrtUwp.Windows.Devices.WiFi.WiFiReconnectionKind.automatic & Double = js.native
    
    /* 1 */ val manual: typings.winrtUwp.Windows.Devices.WiFi.WiFiReconnectionKind.manual & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.WiFi.irect")
  @js.native
  def irect: Any = js.native
  inline def irect_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("irect")(x.asInstanceOf[js.Any])
}
