package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

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
  var onaccesschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceAccessInformation, DeviceAccessChangedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accesschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.accesschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceAccessInformation, DeviceAccessChangedEventArgs]
  ): scala.Unit = js.native
  /** Raised when access to a device has changed. */
  def onaccesschanged(
    ev: DeviceAccessChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[DeviceAccessInformation]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_accesschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.accesschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceAccessInformation, DeviceAccessChangedEventArgs]
  ): scala.Unit = js.native
}

/** Contains the information about access to a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceAccessInformation")
@js.native
object DeviceAccessInformation extends js.Object {
  /**
    * Initializes a DeviceAccessInformation object based on a given DeviceClass .
    * @param deviceClass Device class to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given DeviceClass .
    */
  def createFromDeviceClass(deviceClass: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass): winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceAccessInformation = js.native
  /**
    * Initializes a DeviceAccessInformation object based on a device class id.
    * @param deviceClassId Id of the device class to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given device class id.
    */
  def createFromDeviceClassId(deviceClassId: java.lang.String): winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceAccessInformation = js.native
  /**
    * Initializes a DeviceAccessInformation object based on a device id.
    * @param deviceId Id of the device to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given device id.
    */
  def createFromId(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceAccessInformation = js.native
}

