package typings.winrtUwp.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.accesschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information about access to a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceAccessInformation")
@js.native
abstract class DeviceAccessInformation () extends js.Object {
  /** The current device access status. */
  var currentStatus: DeviceAccessStatus = js.native
  /** Raised when access to a device has changed. */
  @JSName("onaccesschanged")
  var onaccesschanged_Original: TypedEventHandler[DeviceAccessInformation, DeviceAccessChangedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accesschanged(
    `type`: accesschanged,
    listener: TypedEventHandler[DeviceAccessInformation, DeviceAccessChangedEventArgs]
  ): Unit = js.native
  /** Raised when access to a device has changed. */
  def onaccesschanged(ev: DeviceAccessChangedEventArgs with WinRTEvent[DeviceAccessInformation]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_accesschanged(
    `type`: accesschanged,
    listener: TypedEventHandler[DeviceAccessInformation, DeviceAccessChangedEventArgs]
  ): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Enumeration.DeviceAccessInformation")
@js.native
object DeviceAccessInformation extends js.Object {
  /**
    * Initializes a DeviceAccessInformation object based on a given DeviceClass .
    * @param deviceClass Device class to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given DeviceClass .
    */
  def createFromDeviceClass(deviceClass: DeviceClass): DeviceAccessInformation = js.native
  /**
    * Initializes a DeviceAccessInformation object based on a device class id.
    * @param deviceClassId Id of the device class to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given device class id.
    */
  def createFromDeviceClassId(deviceClassId: String): DeviceAccessInformation = js.native
  /**
    * Initializes a DeviceAccessInformation object based on a device id.
    * @param deviceId Id of the device to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given device id.
    */
  def createFromId(deviceId: String): DeviceAccessInformation = js.native
}

