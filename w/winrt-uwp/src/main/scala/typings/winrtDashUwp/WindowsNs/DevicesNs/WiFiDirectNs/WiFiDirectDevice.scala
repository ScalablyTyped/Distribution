package typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.NetworkingNs.EndpointPair
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.connectionstatuschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages connections to associated Wi-Fi Direct devices. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectDevice")
@js.native
abstract class WiFiDirectDevice () extends js.Object {
  /** Gets the connection status for the WiFi-Direct device. */
  var connectionStatus: WiFiDirectConnectionStatus = js.native
  /** Gets the DeviceInformation Id for the Wi-Fi Direct device. */
  var deviceId: String = js.native
  /** Occurs when a Wi-Fi Direct device connection is connected or disconnected. */
  @JSName("onconnectionstatuschanged")
  var onconnectionstatuschanged_Original: TypedEventHandler[WiFiDirectDevice, _] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[WiFiDirectDevice, _]): Unit = js.native
  /** Close the active Wi-Fi Direct device connection. */
  def close(): Unit = js.native
  /**
    * Gets a collection of network addresses for the Wi-Fi Direct device as endpoint pairs.
    * @return A collection of network addresses for the Wi-Fi Direct device as endpoint pairs.
    */
  def getConnectionEndpointPairs(): IVectorView[EndpointPair] = js.native
  /** Occurs when a Wi-Fi Direct device connection is connected or disconnected. */
  def onconnectionstatuschanged(ev: js.Any with WinRTEvent[WiFiDirectDevice]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionstatuschanged(`type`: connectionstatuschanged, listener: TypedEventHandler[WiFiDirectDevice, _]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectDevice")
@js.native
object WiFiDirectDevice extends js.Object {
  /**
    * Creates an instance of the WiFiDirectDevice class for the specified device interface id.
    * @param deviceId The DeviceInformation Id of a Wi-Fi Direct device.
    * @return An asynchronous operation to retrieve the WiFiDirectDevice that was created.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[WiFiDirectDevice] = js.native
  /**
    * Creates an instance of the WiFiDirectDevice class for the specified device interface id with specific connection parameters.
    * @param deviceId The DeviceInformation Id of a Wi-Fi Direct device.
    * @param connectionParameters Connection parameters for a Wi-Fi Direct connect/pairing operation.
    * @return An asynchronous operation to retrieve the WiFiDirectDevice that was created.
    */
  def fromIdAsync(deviceId: String, connectionParameters: WiFiDirectConnectionParameters): IPromiseWithIAsyncOperation[WiFiDirectDevice] = js.native
  /**
    * Returns the class selection string that you can use to enumerate Wi-Fi Direct devices.
    * @return The class selection string that you can use to enumerate Wi-Fi Direct devices.
    */
  def getDeviceSelector(): String = js.native
  /**
    * Returns the class selection string that you can use to enumerate Wi-Fi Direct devices for a specific Wi-Fi Direct device selector type.
    * @param type A specific Wi-Fi Direct device selector type.
    * @return The class selection string that you can use to enumerate Wi-Fi Direct devices.
    */
  def getDeviceSelector(`type`: WiFiDirectDeviceSelectorType): String = js.native
}

