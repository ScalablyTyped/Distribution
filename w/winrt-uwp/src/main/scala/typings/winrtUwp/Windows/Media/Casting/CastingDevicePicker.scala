package typings.winrtUwp.Windows.Media.Casting

import typings.winrtUwp.Windows.Devices.Enumeration.DevicePickerAppearance
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.UI.Popups.Placement
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.castingdevicepickerdismissed
import typings.winrtUwp.winrtUwpStrings.castingdeviceselected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a device picker that contains a list of casting devices for the user to choose from. */
@JSGlobal("Windows.Media.Casting.CastingDevicePicker")
@js.native
/** Creates a CastingDevicePicker object. */
class CastingDevicePicker () extends js.Object {
  /** Gets the colors of the picker UI. */
  var appearance: DevicePickerAppearance = js.native
  /** Gets the filter information for which devices to show in the picker. */
  var filter: CastingDevicePickerFilter = js.native
  /** Indicates that the user has dismissed the picker UI. */
  @JSName("oncastingdevicepickerdismissed")
  var oncastingdevicepickerdismissed_Original: TypedEventHandler[CastingDevicePicker, _] = js.native
  /** Indicates that the user has selected a device from the picker. */
  @JSName("oncastingdeviceselected")
  var oncastingdeviceselected_Original: TypedEventHandler[CastingDevicePicker, CastingDeviceSelectedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_castingdevicepickerdismissed(`type`: castingdevicepickerdismissed, listener: TypedEventHandler[CastingDevicePicker, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_castingdeviceselected(
    `type`: castingdeviceselected,
    listener: TypedEventHandler[CastingDevicePicker, CastingDeviceSelectedEventArgs]
  ): Unit = js.native
  /** Hides the device picker UI. */
  def hide(): Unit = js.native
  /** Indicates that the user has dismissed the picker UI. */
  def oncastingdevicepickerdismissed(ev: js.Any with WinRTEvent[CastingDevicePicker]): Unit = js.native
  /** Indicates that the user has selected a device from the picker. */
  def oncastingdeviceselected(ev: CastingDeviceSelectedEventArgs with WinRTEvent[CastingDevicePicker]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_castingdevicepickerdismissed(`type`: castingdevicepickerdismissed, listener: TypedEventHandler[CastingDevicePicker, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_castingdeviceselected(
    `type`: castingdeviceselected,
    listener: TypedEventHandler[CastingDevicePicker, CastingDeviceSelectedEventArgs]
  ): Unit = js.native
  /**
    * Shows the casting device picker UI, which flies out from an edge of the provided rectangle.
    * @param selection The rectangle from which the picker UI should fly out.
    */
  def show(selection: Rect): Unit = js.native
  /**
    * Shows the casting device picker UI, which flies out from the specified edge of the provided rectangle.
    * @param selection The rectangle from which the picker should fly out.
    * @param preferredPlacement The edge of the rectangle from which the picker should fly out.
    */
  def show(selection: Rect, preferredPlacement: Placement): Unit = js.native
}

