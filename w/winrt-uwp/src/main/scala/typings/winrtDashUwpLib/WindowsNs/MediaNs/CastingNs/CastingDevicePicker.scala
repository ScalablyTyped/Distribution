package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CastingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a device picker that contains a list of casting devices for the user to choose from. */
@JSGlobal("Windows.Media.Casting.CastingDevicePicker")
@js.native
class CastingDevicePicker () extends js.Object {
  /** Gets the colors of the picker UI. */
  var appearance: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DevicePickerAppearance = js.native
  /** Gets the filter information for which devices to show in the picker. */
  var filter: CastingDevicePickerFilter = js.native
  /** Indicates that the user has dismissed the picker UI. */
  @JSName("oncastingdevicepickerdismissed")
  var oncastingdevicepickerdismissed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CastingDevicePicker, _] = js.native
  /** Indicates that the user has selected a device from the picker. */
  @JSName("oncastingdeviceselected")
  var oncastingdeviceselected_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CastingDevicePicker, CastingDeviceSelectedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_castingdevicepickerdismissed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.castingdevicepickerdismissed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CastingDevicePicker, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_castingdeviceselected(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.castingdeviceselected,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CastingDevicePicker, CastingDeviceSelectedEventArgs]
  ): scala.Unit = js.native
  /** Hides the device picker UI. */
  def hide(): scala.Unit = js.native
  /** Indicates that the user has dismissed the picker UI. */
  def oncastingdevicepickerdismissed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[CastingDevicePicker]): scala.Unit = js.native
  /** Indicates that the user has selected a device from the picker. */
  def oncastingdeviceselected(ev: CastingDeviceSelectedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CastingDevicePicker]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_castingdevicepickerdismissed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.castingdevicepickerdismissed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CastingDevicePicker, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_castingdeviceselected(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.castingdeviceselected,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CastingDevicePicker, CastingDeviceSelectedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Shows the casting device picker UI, which flies out from an edge of the provided rectangle.
                   * @param selection The rectangle from which the picker UI should fly out.
                   */
  def show(selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect): scala.Unit = js.native
  /**
                   * Shows the casting device picker UI, which flies out from the specified edge of the provided rectangle.
                   * @param selection The rectangle from which the picker should fly out.
                   * @param preferredPlacement The edge of the rectangle from which the picker should fly out.
                   */
  def show(
    selection: winrtDashUwpLib.WindowsNs.FoundationNs.Rect,
    preferredPlacement: winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement
  ): scala.Unit = js.native
}

