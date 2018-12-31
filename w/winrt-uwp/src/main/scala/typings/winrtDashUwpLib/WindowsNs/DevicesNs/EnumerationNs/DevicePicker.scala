package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a picker flyout that contains a list of devices for the user to choose from. */
@JSGlobal("Windows.Devices.Enumeration.DevicePicker")
@js.native
/** Creates a DevicePicker object. */
class DevicePicker () extends js.Object {
  /** Gets the colors of the picker. */
  var appearance: DevicePickerAppearance = js.native
  /** Gets the filter used to choose what devices to show in the picker. */
  var filter: DevicePickerFilter = js.native
  /** Indicates that the device picker was light dismissed by the user. Light dismiss happens when the user clicks somewhere other than the picker UI and the picker UI disappears. */
  @JSName("ondevicepickerdismissed")
  var ondevicepickerdismissed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DevicePicker, _] = js.native
  /** Indicates that the user selected a device in the picker. */
  @JSName("ondeviceselected")
  var ondeviceselected_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DevicePicker, DeviceSelectedEventArgs] = js.native
  /** Indicates that the user clicked or tapped the disconnect button for a device in the picker. */
  @JSName("ondisconnectbuttonclicked")
  var ondisconnectbuttonclicked_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DevicePicker, DeviceDisconnectButtonClickedEventArgs] = js.native
  /** Gets a collection of properties for the returned device information object. */
  var requestedProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicepickerdismissed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.devicepickerdismissed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DevicePicker, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceselected(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.deviceselected,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DevicePicker, DeviceSelectedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disconnectbuttonclicked(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.disconnectbuttonclicked,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DevicePicker, DeviceDisconnectButtonClickedEventArgs]
  ): scala.Unit = js.native
  /** Hides the picker. */
  def hide(): scala.Unit = js.native
  /** Indicates that the device picker was light dismissed by the user. Light dismiss happens when the user clicks somewhere other than the picker UI and the picker UI disappears. */
  def ondevicepickerdismissed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[DevicePicker]): scala.Unit = js.native
  /** Indicates that the user selected a device in the picker. */
  def ondeviceselected(ev: DeviceSelectedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[DevicePicker]): scala.Unit = js.native
  /** Indicates that the user clicked or tapped the disconnect button for a device in the picker. */
  def ondisconnectbuttonclicked(ev: DeviceDisconnectButtonClickedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[DevicePicker]): scala.Unit = js.native
  /**
    * Shows the picker UI and returns the selected device; does not require you to register for an event. The picker flies out from the edge of the specified rectangle.
    * @param selection The rectangle from which you want the picker to fly out.
    * @return The device selected by the user.
    */
  def pickSingleDeviceAsync(selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DeviceInformation] = js.native
  /**
    * Shows the picker UI and returns the selected device; does not require you to register for an event. The picker flies out from the specified edge of the specified rectangle.
    * @param selection The rectangle from which you want the picker to fly out.
    * @param placement The edge of the rectangle from which you want the picker to fly out.
    * @return The device selected.
    */
  def pickSingleDeviceAsync(
    selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect,
    placement: winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DeviceInformation] = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicepickerdismissed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.devicepickerdismissed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DevicePicker, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceselected(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.deviceselected,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DevicePicker, DeviceSelectedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_disconnectbuttonclicked(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.disconnectbuttonclicked,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DevicePicker, DeviceDisconnectButtonClickedEventArgs]
  ): scala.Unit = js.native
  /**
    * Updates the picker UI to reflect the provided status and display options for a specified device.
    * @param device The device information.
    * @param status The status to display.
    * @param options The display options for the device.
    */
  def setDisplayStatus(device: DeviceInformation, status: java.lang.String, options: DevicePickerDisplayStatusOptions): scala.Unit = js.native
  /**
    * Shows the picker UI. The picker flies out from the edge of the specified rectangle.
    * @param selection The rectangle from which you want the picker to fly out.
    */
  def show(selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect): scala.Unit = js.native
  /**
    * Shows the picker UI. The picker flies out from the specified edge of the specified rectangle.
    * @param selection The rectangle from which you want the picker to fly out.
    * @param placement The edge of the rectangle from which you want the picker to fly out.
    */
  def show(
    selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect,
    placement: winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement
  ): scala.Unit = js.native
}

