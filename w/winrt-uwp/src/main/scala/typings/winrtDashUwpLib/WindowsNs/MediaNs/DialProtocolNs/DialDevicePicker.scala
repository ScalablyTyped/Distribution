package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a picker flyout that contains a list of remote devices for the user to choose from. */
@JSGlobal("Windows.Media.DialProtocol.DialDevicePicker")
@js.native
class DialDevicePicker () extends js.Object {
  /** Used to change the colors of the picker. */
  var appearance: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePickerAppearance = js.native
  /** Gets the filter used to choose what devices to show in the picker. */
  var filter: DialDevicePickerFilter = js.native
  /** Indicates that the device picker was light dismissed, which means that the user clicked or touched anywhere other than the picker UI, and so the picker will be closed. */
  @JSName("ondialdevicepickerdismissed")
  var ondialdevicepickerdismissed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DialDevicePicker, _] = js.native
  /** Indicates that the user selected a device from the picker. */
  @JSName("ondialdeviceselected")
  var ondialdeviceselected_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DialDevicePicker, DialDeviceSelectedEventArgs] = js.native
  /** Indicates that the user clicked on the disconnect button in the picker. */
  @JSName("ondisconnectbuttonclicked")
  var ondisconnectbuttonclicked_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DialDevicePicker, DialDisconnectButtonClickedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialdevicepickerdismissed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.dialdevicepickerdismissed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DialDevicePicker, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dialdeviceselected(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.dialdeviceselected,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DialDevicePicker, DialDeviceSelectedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_disconnectbuttonclicked(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.disconnectbuttonclicked,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DialDevicePicker, DialDisconnectButtonClickedEventArgs]
  ): scala.Unit = js.native
  /** Hides the picker. */
  def hide(): scala.Unit = js.native
  /** Indicates that the device picker was light dismissed, which means that the user clicked or touched anywhere other than the picker UI, and so the picker will be closed. */
  def ondialdevicepickerdismissed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[DialDevicePicker]): scala.Unit = js.native
  /** Indicates that the user selected a device from the picker. */
  def ondialdeviceselected(ev: DialDeviceSelectedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[DialDevicePicker]): scala.Unit = js.native
  /** Indicates that the user clicked on the disconnect button in the picker. */
  def ondisconnectbuttonclicked(
    ev: DialDisconnectButtonClickedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[DialDevicePicker]
  ): scala.Unit = js.native
  /**
                   * Shows the picker. Call this method directly to show to show the picker, instead of showing it in response to an event.
                   * @param selection The rectangle from which to show the picker.
                   * @return The device the user selected from the picker.
                   */
  def pickSingleDialDeviceAsync(selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DialDevice] = js.native
  /**
                   * Shows the picker. Call this method directly to show to show the picker, instead of showing it in response to an event.
                   * @param selection The rectangle from which to show the picker.
                   * @param preferredPlacement The edge of the rectangle from which to show the picker.
                   * @return The DialDevice object selected.
                   */
  def pickSingleDialDeviceAsync(
    selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect,
    preferredPlacement: winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DialDevice] = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dialdevicepickerdismissed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.dialdevicepickerdismissed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DialDevicePicker, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dialdeviceselected(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.dialdeviceselected,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DialDevicePicker, DialDeviceSelectedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_disconnectbuttonclicked(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.disconnectbuttonclicked,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DialDevicePicker, DialDisconnectButtonClickedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Updates the picker UI to reflect the status fo a given remote device.
                   * @param device The remote device whose status you want to display.
                   * @param status The status you want displayed.
                   */
  def setDisplayStatus(device: DialDevice, status: DialDeviceDisplayStatus): scala.Unit = js.native
  /**
                   * Displays the picker to the user. When called, the picker flies out from an edge of the provided rectangle.
                   * @param selection The rectangle from which you want the picker to show.
                   */
  def show(selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect): scala.Unit = js.native
  /**
                   * Displays the picker to the user. When called, the picker flies out from the specified edge of the provided rectangle.
                   * @param selection The rectangle from which you want the picker to show.
                   * @param preferredPlacement The edge from which you want the picker to show.
                   */
  def show(
    selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect,
    preferredPlacement: winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement
  ): scala.Unit = js.native
}

