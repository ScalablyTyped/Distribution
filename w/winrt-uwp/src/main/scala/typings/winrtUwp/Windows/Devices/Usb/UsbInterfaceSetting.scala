package typings.winrtUwp.Windows.Devices.Usb

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an alternate setting and select that setting. The app can get the USB interface descriptors for the setting and its endpoints, and determine whether this setting is currently selected. */
trait UsbInterfaceSetting extends js.Object {
  /** Gets an array of objects that represent descriptors associated with USB bulk IN endpoints that are defined in the alternate setting. */
  var bulkInEndpoints: IVectorView[UsbBulkInEndpointDescriptor]
  /** Gets an array of objects that represent descriptors associated with USB bulk OUT endpoints that are defined in the alternate setting. */
  var bulkOutEndpoints: IVectorView[UsbBulkOutEndpointDescriptor]
  /** Gets an array of objects that represent descriptors associated with the alternate setting. */
  var descriptors: IVectorView[UsbDescriptor]
  /** Gets an object that represents the descriptor that describes the alternate setting. */
  var interfaceDescriptor: UsbInterfaceDescriptor
  /** Gets an array of objects that represent descriptors associated with USB interrupt IN endpoints that are defined in the alternate setting. */
  var interruptInEndpoints: IVectorView[UsbInterruptInEndpointDescriptor]
  /** Gets an array of objects that represent descriptors associated with USB interrupt OUT endpoints that are defined in the alternate setting. */
  var interruptOutEndpoints: IVectorView[UsbInterruptOutEndpointDescriptor]
  /** Determines whether the alternate setting is currently selected. */
  var selected: Boolean
  /**
    * Selects the alternate setting as the current setting in the USB interface.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def selectSettingAsync(): IPromiseWithIAsyncAction
}

object UsbInterfaceSetting {
  @scala.inline
  def apply(
    bulkInEndpoints: IVectorView[UsbBulkInEndpointDescriptor],
    bulkOutEndpoints: IVectorView[UsbBulkOutEndpointDescriptor],
    descriptors: IVectorView[UsbDescriptor],
    interfaceDescriptor: UsbInterfaceDescriptor,
    interruptInEndpoints: IVectorView[UsbInterruptInEndpointDescriptor],
    interruptOutEndpoints: IVectorView[UsbInterruptOutEndpointDescriptor],
    selectSettingAsync: () => IPromiseWithIAsyncAction,
    selected: Boolean
  ): UsbInterfaceSetting = {
    val __obj = js.Dynamic.literal(bulkInEndpoints = bulkInEndpoints.asInstanceOf[js.Any], bulkOutEndpoints = bulkOutEndpoints.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], interfaceDescriptor = interfaceDescriptor.asInstanceOf[js.Any], interruptInEndpoints = interruptInEndpoints.asInstanceOf[js.Any], interruptOutEndpoints = interruptOutEndpoints.asInstanceOf[js.Any], selectSettingAsync = js.Any.fromFunction0(selectSettingAsync), selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbInterfaceSetting]
  }
}

