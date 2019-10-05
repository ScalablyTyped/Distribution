package typings.winrtDashUwp.Windows.Devices.Enumeration

import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.Rect
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.UI.Popups.Placement
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.devicepickerdismissed
import typings.winrtDashUwp.winrtDashUwpStrings.deviceselected
import typings.winrtDashUwp.winrtDashUwpStrings.disconnectbuttonclicked
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
  var ondevicepickerdismissed_Original: TypedEventHandler[DevicePicker, _] = js.native
  /** Indicates that the user selected a device in the picker. */
  @JSName("ondeviceselected")
  var ondeviceselected_Original: TypedEventHandler[DevicePicker, DeviceSelectedEventArgs] = js.native
  /** Indicates that the user clicked or tapped the disconnect button for a device in the picker. */
  @JSName("ondisconnectbuttonclicked")
  var ondisconnectbuttonclicked_Original: TypedEventHandler[DevicePicker, DeviceDisconnectButtonClickedEventArgs] = js.native
  /** Gets a collection of properties for the returned device information object. */
  var requestedProperties: IVector[String] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicepickerdismissed(`type`: devicepickerdismissed, listener: TypedEventHandler[DevicePicker, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_deviceselected(`type`: deviceselected, listener: TypedEventHandler[DevicePicker, DeviceSelectedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disconnectbuttonclicked(
    `type`: disconnectbuttonclicked,
    listener: TypedEventHandler[DevicePicker, DeviceDisconnectButtonClickedEventArgs]
  ): Unit = js.native
  /** Hides the picker. */
  def hide(): Unit = js.native
  /** Indicates that the device picker was light dismissed by the user. Light dismiss happens when the user clicks somewhere other than the picker UI and the picker UI disappears. */
  def ondevicepickerdismissed(ev: js.Any with WinRTEvent[DevicePicker]): Unit = js.native
  /** Indicates that the user selected a device in the picker. */
  def ondeviceselected(ev: DeviceSelectedEventArgs with WinRTEvent[DevicePicker]): Unit = js.native
  /** Indicates that the user clicked or tapped the disconnect button for a device in the picker. */
  def ondisconnectbuttonclicked(ev: DeviceDisconnectButtonClickedEventArgs with WinRTEvent[DevicePicker]): Unit = js.native
  /**
    * Shows the picker UI and returns the selected device; does not require you to register for an event. The picker flies out from the edge of the specified rectangle.
    * @param selection The rectangle from which you want the picker to fly out.
    * @return The device selected by the user.
    */
  def pickSingleDeviceAsync(selection: Rect): IPromiseWithIAsyncOperation[DeviceInformation] = js.native
  /**
    * Shows the picker UI and returns the selected device; does not require you to register for an event. The picker flies out from the specified edge of the specified rectangle.
    * @param selection The rectangle from which you want the picker to fly out.
    * @param placement The edge of the rectangle from which you want the picker to fly out.
    * @return The device selected.
    */
  def pickSingleDeviceAsync(selection: Rect, placement: Placement): IPromiseWithIAsyncOperation[DeviceInformation] = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicepickerdismissed(`type`: devicepickerdismissed, listener: TypedEventHandler[DevicePicker, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_deviceselected(`type`: deviceselected, listener: TypedEventHandler[DevicePicker, DeviceSelectedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_disconnectbuttonclicked(
    `type`: disconnectbuttonclicked,
    listener: TypedEventHandler[DevicePicker, DeviceDisconnectButtonClickedEventArgs]
  ): Unit = js.native
  /**
    * Updates the picker UI to reflect the provided status and display options for a specified device.
    * @param device The device information.
    * @param status The status to display.
    * @param options The display options for the device.
    */
  def setDisplayStatus(device: DeviceInformation, status: String, options: DevicePickerDisplayStatusOptions): Unit = js.native
  /**
    * Shows the picker UI. The picker flies out from the edge of the specified rectangle.
    * @param selection The rectangle from which you want the picker to fly out.
    */
  def show(selection: Rect): Unit = js.native
  /**
    * Shows the picker UI. The picker flies out from the specified edge of the specified rectangle.
    * @param selection The rectangle from which you want the picker to fly out.
    * @param placement The edge of the rectangle from which you want the picker to fly out.
    */
  def show(selection: Rect, placement: Placement): Unit = js.native
}

