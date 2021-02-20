package typings.winrtUwp.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.UI.Popups.Placement
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.devicepickerdismissed
import typings.winrtUwp.winrtUwpStrings.deviceselected
import typings.winrtUwp.winrtUwpStrings.disconnectbuttonclicked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a picker flyout that contains a list of devices for the user to choose from. */
@js.native
trait DevicePicker extends StObject {
  
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
  
  /** Gets the colors of the picker. */
  var appearance: DevicePickerAppearance = js.native
  
  /** Gets the filter used to choose what devices to show in the picker. */
  var filter: DevicePickerFilter = js.native
  
  /** Hides the picker. */
  def hide(): Unit = js.native
  
  /** Indicates that the device picker was light dismissed by the user. Light dismiss happens when the user clicks somewhere other than the picker UI and the picker UI disappears. */
  def ondevicepickerdismissed(ev: js.Any with WinRTEvent[DevicePicker]): Unit = js.native
  /** Indicates that the device picker was light dismissed by the user. Light dismiss happens when the user clicks somewhere other than the picker UI and the picker UI disappears. */
  @JSName("ondevicepickerdismissed")
  var ondevicepickerdismissed_Original: TypedEventHandler[DevicePicker, _] = js.native
  
  /** Indicates that the user selected a device in the picker. */
  def ondeviceselected(ev: DeviceSelectedEventArgs with WinRTEvent[DevicePicker]): Unit = js.native
  /** Indicates that the user selected a device in the picker. */
  @JSName("ondeviceselected")
  var ondeviceselected_Original: TypedEventHandler[DevicePicker, DeviceSelectedEventArgs] = js.native
  
  /** Indicates that the user clicked or tapped the disconnect button for a device in the picker. */
  def ondisconnectbuttonclicked(ev: DeviceDisconnectButtonClickedEventArgs with WinRTEvent[DevicePicker]): Unit = js.native
  /** Indicates that the user clicked or tapped the disconnect button for a device in the picker. */
  @JSName("ondisconnectbuttonclicked")
  var ondisconnectbuttonclicked_Original: TypedEventHandler[DevicePicker, DeviceDisconnectButtonClickedEventArgs] = js.native
  
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
  
  /** Gets a collection of properties for the returned device information object. */
  var requestedProperties: IVector[String] = js.native
  
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
