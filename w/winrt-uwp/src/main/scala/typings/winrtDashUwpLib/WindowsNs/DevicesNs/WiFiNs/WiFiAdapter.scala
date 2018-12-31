package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Use this class to enumerate local Wi-Fi adapters, initiate Wi-Fi scans, enumerate scan results, and to connect or disconnect individual adapters. */
@JSGlobal("Windows.Devices.WiFi.WiFiAdapter")
@js.native
abstract class WiFiAdapter () extends js.Object {
  /** Gets information about a Wi-Fi adapter. */
  var networkAdapter: winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkAdapter = js.native
  /** Gets a list of available networks populated by the last Wi-Fi scan on this WiFiNetworkAdapter. */
  var networkReport: WiFiNetworkReport = js.native
  /** Event raised when a scan completes on this Wi-Fi adapter. This even cannot be raised from a background task. */
  @JSName("onavailablenetworkschanged")
  var onavailablenetworkschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiAdapter, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_availablenetworkschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.availablenetworkschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiAdapter, _]
  ): scala.Unit = js.native
  /**
    * Connect this Wi-Fi device to the specified network, with the specified reconnection policy.
    * @param availableNetwork Describes the Wi-Fi network to be connected.
    * @param reconnectionKind Specifies how to reconnect if the connection is lost.
    * @return An asynchronous connect operation. On successful conclusion of the operation, returns an object that describes the result of the connect operation.
    */
  def connectAsync(availableNetwork: WiFiAvailableNetwork, reconnectionKind: WiFiReconnectionKind): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[WiFiConnectionResult] = js.native
  /**
    * Connect this Wi-Fi device to the specified network, with the specified passphrase and reconnection policy.
    * @param availableNetwork Specifies the Wi-Fi network to connect to.
    * @param reconnectionKind Describes how to reconnect to the network if connection is lost.
    * @param passwordCredential The passphrase to be used to connect to the access point.
    * @return An asynchronous connect operation. On successful conclusion of the operation, returns an object that describes the result of the connect operation.
    */
  def connectAsync(
    availableNetwork: WiFiAvailableNetwork,
    reconnectionKind: WiFiReconnectionKind,
    passwordCredential: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[WiFiConnectionResult] = js.native
  /**
    * Connect this Wi-Fi device to a hidden network, with the given passphrase and reconnection policy.
    * @param availableNetwork Describes the Wi-Fi network to connect to.
    * @param reconnectionKind Describes how to reconnect to the network if connection is lost.
    * @param passwordCredential Password or other credential to use to connect to the network.
    * @param ssid When the network SSID is hidden, use this parameter to provide the SSID.
    * @return An asynchronous connect operation. On successful conclusion of the operation, returns an object that describes the result of the connect operation.
    */
  def connectAsync(
    availableNetwork: WiFiAvailableNetwork,
    reconnectionKind: WiFiReconnectionKind,
    passwordCredential: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential,
    ssid: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[WiFiConnectionResult] = js.native
  /** Disconnects any active Wi-Fi connection through this adapter. */
  def disconnect(): scala.Unit = js.native
  /** Event raised when a scan completes on this Wi-Fi adapter. This even cannot be raised from a background task. */
  def onavailablenetworkschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[WiFiAdapter]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_availablenetworkschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.availablenetworkschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiAdapter, _]
  ): scala.Unit = js.native
  /**
    * Directs this adapter to initiate an asynchronous network scan.
    * @return An asynchronous scan operation. On successful completion, returns a list of networks scanned by this adapter.
    */
  def scanAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

/** Use this class to enumerate local Wi-Fi adapters, initiate Wi-Fi scans, enumerate scan results, and to connect or disconnect individual adapters. */
@JSGlobal("Windows.Devices.WiFi.WiFiAdapter")
@js.native
object WiFiAdapter extends js.Object {
  /**
    * A static method that initiates an asynchronous operation to enumerate all Wi-Fi adapters in the system.
    * @return An asynchronous enumeration operation. On successful completion, returns a list of available Wi-Fi adapters.
    */
  def findAllAdaptersAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * A static method that initiates an asynchronous operation to get a WiFiAdapter object.
    * @param deviceId The Device ID of the Wi-Fi adapter to be retrieved. Obtain a Device ID through the Windows.Devices.Enumeration namespace.
    * @return An asynchronous get operation. On successful completion, returns a WiFiAdapter object specific to the requested Device ID.
    */
  def fromIdAsync(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiAdapter] = js.native
  /**
    * A static method that returns an Advanced Query Syntax (AQS) string to be used to enumerate Wi-Fi adapters using Windows.Devices.Enumeration.DeviceInformation.FindAllAsync and related methods.
    * @return An identifier to be used to enumerate Wi-Fi devices.
    */
  def getDeviceSelector(): java.lang.String = js.native
  /**
    * A static method for determining whether the current user can access any of the Wi-Fi adapters on this device.
    * @return An asynchronous access operation. On successful completion, returns a status enumeration value describing whether the current user can access any Wi-Fi adapter.
    */
  def requestAccessAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.WiFiNs.WiFiAccessStatus] = js.native
}

