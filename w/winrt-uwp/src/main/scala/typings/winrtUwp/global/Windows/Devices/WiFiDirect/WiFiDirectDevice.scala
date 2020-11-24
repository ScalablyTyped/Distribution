package typings.winrtUwp.global.Windows.Devices.WiFiDirect

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages connections to associated Wi-Fi Direct devices. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectDevice")
@js.native
abstract class WiFiDirectDevice ()
  extends typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDevice
/* static members */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectDevice")
@js.native
object WiFiDirectDevice extends js.Object {
  
  /**
    * Creates an instance of the WiFiDirectDevice class for the specified device interface id.
    * @param deviceId The DeviceInformation Id of a Wi-Fi Direct device.
    * @return An asynchronous operation to retrieve the WiFiDirectDevice that was created.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDevice] = js.native
  /**
    * Creates an instance of the WiFiDirectDevice class for the specified device interface id with specific connection parameters.
    * @param deviceId The DeviceInformation Id of a Wi-Fi Direct device.
    * @param connectionParameters Connection parameters for a Wi-Fi Direct connect/pairing operation.
    * @return An asynchronous operation to retrieve the WiFiDirectDevice that was created.
    */
  def fromIdAsync(
    deviceId: String,
    connectionParameters: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectConnectionParameters
  ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDevice] = js.native
  
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
  def getDeviceSelector(`type`: typings.winrtUwp.Windows.Devices.WiFiDirect.WiFiDirectDeviceSelectorType): String = js.native
}
