package typings.winrtUwp.global.Windows.Devices

import typings.std.Date
import typings.winrtUwp.Windows.Devices.WiFi.WiFiAccessStatus
import typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus
import typings.winrtUwp.Windows.Devices.WiFi.WiFiNetworkKind
import typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.Connectivity.NetworkSecuritySettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a means to scan for nearby WiFi access points, enumerate those that are found, and connect to an access point. */
@JSGlobal("Windows.Devices.WiFi")
@js.native
object WiFi extends js.Object {
  /** Use this class to enumerate local Wi-Fi adapters, initiate Wi-Fi scans, enumerate scan results, and to connect or disconnect individual adapters. */
  @js.native
  abstract class WiFiAdapter ()
    extends typings.winrtUwp.Windows.Devices.WiFi.WiFiAdapter
  
  /** Describes an available Wi-Fi network. */
  @js.native
  abstract class WiFiAvailableNetwork ()
    extends typings.winrtUwp.Windows.Devices.WiFi.WiFiAvailableNetwork {
    /** Gets the interval between 802.11 Beacon frames used by this network. */
    /* CompleteClass */
    override var beaconInterval: Double = js.native
    /** Gets the MAC address of the access point. */
    /* CompleteClass */
    override var bssid: String = js.native
    /** Gets the channel center frequency of the band on which the 802.11 Beacon or Probe Response was received. */
    /* CompleteClass */
    override var channelCenterFrequencyInKilohertz: Double = js.native
    /** Gets a value indicating whether this network originates from a Wi-Fi Direct access point. */
    /* CompleteClass */
    override var isWiFiDirect: Boolean = js.native
    /** Gets a value describing the kind of network being described. */
    /* CompleteClass */
    override var networkKind: WiFiNetworkKind = js.native
    /** Gets the signal strength of the network. */
    /* CompleteClass */
    override var networkRssiInDecibelMilliwatts: Double = js.native
    /** Gets a value describing the kind of PHY used by this network. */
    /* CompleteClass */
    override var phyKind: WiFiPhyKind = js.native
    /** Gets the security configuration of the network. */
    /* CompleteClass */
    override var securitySettings: NetworkSecuritySettings = js.native
    /** Gets the strength of the signal as a number of bars. */
    /* CompleteClass */
    override var signalBars: Double = js.native
    /** Gets the SSID (name) of the network. */
    /* CompleteClass */
    override var ssid: String = js.native
    /** Gets the uptime value reported by the network. */
    /* CompleteClass */
    override var uptime: Double = js.native
  }
  
  /** Describes the results of an attempt to connect to a Wi-Fi network. */
  @js.native
  abstract class WiFiConnectionResult ()
    extends typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionResult {
    /** Gets the connection result value. */
    /* CompleteClass */
    override var connectionStatus: WiFiConnectionStatus = js.native
  }
  
  /** Contains the result of a network scan operation. */
  @js.native
  abstract class WiFiNetworkReport ()
    extends typings.winrtUwp.Windows.Devices.WiFi.WiFiNetworkReport {
    /** A list of available networks. */
    /* CompleteClass */
    override var availableNetworks: IVectorView[typings.winrtUwp.Windows.Devices.WiFi.WiFiAvailableNetwork] = js.native
    /** Contains the result of a network scan operation. */
    /* CompleteClass */
    override var timestamp: Date = js.native
  }
  
  var irect: js.Any = js.native
  /** Used to report the results of an attempt to request access to a Wi-Fi adapter. */
  @js.native
  object WiFiAccessStatus extends js.Object {
    /* 1 */ val allowed: typings.winrtUwp.Windows.Devices.WiFi.WiFiAccessStatus.allowed with Double = js.native
    /* 3 */ val deniedBySystem: typings.winrtUwp.Windows.Devices.WiFi.WiFiAccessStatus.deniedBySystem with Double = js.native
    /* 2 */ val deniedByUser: typings.winrtUwp.Windows.Devices.WiFi.WiFiAccessStatus.deniedByUser with Double = js.native
    /* 0 */ val unspecified: typings.winrtUwp.Windows.Devices.WiFi.WiFiAccessStatus.unspecified with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.WiFi.WiFiAccessStatus with Double] = js.native
  }
  
  /* static members */
  @js.native
  object WiFiAdapter extends js.Object {
    /**
      * A static method that initiates an asynchronous operation to enumerate all Wi-Fi adapters in the system.
      * @return An asynchronous enumeration operation. On successful completion, returns a list of available Wi-Fi adapters.
      */
    def findAllAdaptersAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * A static method that initiates an asynchronous operation to get a WiFiAdapter object.
      * @param deviceId The Device ID of the Wi-Fi adapter to be retrieved. Obtain a Device ID through the Windows.Devices.Enumeration namespace.
      * @return An asynchronous get operation. On successful completion, returns a WiFiAdapter object specific to the requested Device ID.
      */
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.WiFi.WiFiAdapter] = js.native
    /**
      * A static method that returns an Advanced Query Syntax (AQS) string to be used to enumerate Wi-Fi adapters using Windows.Devices.Enumeration.DeviceInformation.FindAllAsync and related methods.
      * @return An identifier to be used to enumerate Wi-Fi devices.
      */
    def getDeviceSelector(): String = js.native
    /**
      * A static method for determining whether the current user can access any of the Wi-Fi adapters on this device.
      * @return An asynchronous access operation. On successful completion, returns a status enumeration value describing whether the current user can access any Wi-Fi adapter.
      */
    def requestAccessAsync(): IPromiseWithIAsyncOperation[WiFiAccessStatus] = js.native
  }
  
  /** Status of the connection attempt. */
  @js.native
  object WiFiConnectionStatus extends js.Object {
    /* 2 */ val accessRevoked: typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus.accessRevoked with Double = js.native
    /* 3 */ val invalidCredential: typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus.invalidCredential with Double = js.native
    /* 4 */ val networkNotAvailable: typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus.networkNotAvailable with Double = js.native
    /* 1 */ val success: typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus.success with Double = js.native
    /* 5 */ val timeout: typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus.timeout with Double = js.native
    /* 0 */ val unspecifiedFailure: typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus.unspecifiedFailure with Double = js.native
    /* 6 */ val unsupportedAuthenticationProtocol: typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus.unsupportedAuthenticationProtocol with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.WiFi.WiFiConnectionStatus with Double] = js.native
  }
  
  /** Describes the kinds of Wi-Fi networks. */
  @js.native
  object WiFiNetworkKind extends js.Object {
    /* 2 */ val adhoc: typings.winrtUwp.Windows.Devices.WiFi.WiFiNetworkKind.adhoc with Double = js.native
    /* 0 */ val any: typings.winrtUwp.Windows.Devices.WiFi.WiFiNetworkKind.any with Double = js.native
    /* 1 */ val infrastructure: typings.winrtUwp.Windows.Devices.WiFi.WiFiNetworkKind.infrastructure with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.WiFi.WiFiNetworkKind with Double] = js.native
  }
  
  /** Describes PHY types supported by standard 802.11. */
  @js.native
  object WiFiPhyKind extends js.Object {
    /* 2 */ val dsss: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.dsss with Double = js.native
    /* 6 */ val erp: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.erp with Double = js.native
    /* 1 */ val fhss: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.fhss with Double = js.native
    /* 5 */ val hrdsss: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.hrdsss with Double = js.native
    /* 7 */ val ht: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.ht with Double = js.native
    /* 3 */ val irBaseband: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.irBaseband with Double = js.native
    /* 4 */ val ofdm: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.ofdm with Double = js.native
    /* 0 */ val unknown: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.unknown with Double = js.native
    /* 8 */ val vht: typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind.vht with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.WiFi.WiFiPhyKind with Double] = js.native
  }
  
  /** Describes whether to automatically reconnect to this network. */
  @js.native
  object WiFiReconnectionKind extends js.Object {
    /* 0 */ val automatic: typings.winrtUwp.Windows.Devices.WiFi.WiFiReconnectionKind.automatic with Double = js.native
    /* 1 */ val manual: typings.winrtUwp.Windows.Devices.WiFi.WiFiReconnectionKind.manual with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.WiFi.WiFiReconnectionKind with Double] = js.native
  }
  
}

