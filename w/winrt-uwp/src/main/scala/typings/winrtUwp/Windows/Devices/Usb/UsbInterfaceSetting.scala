package typings.winrtUwp.Windows.Devices.Usb

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an alternate setting and select that setting. The app can get the USB interface descriptors for the setting and its endpoints, and determine whether this setting is currently selected. */
@JSGlobal("Windows.Devices.Usb.UsbInterfaceSetting")
@js.native
abstract class UsbInterfaceSetting () extends js.Object {
  /** Gets an array of objects that represent descriptors associated with USB bulk IN endpoints that are defined in the alternate setting. */
  var bulkInEndpoints: IVectorView[UsbBulkInEndpointDescriptor] = js.native
  /** Gets an array of objects that represent descriptors associated with USB bulk OUT endpoints that are defined in the alternate setting. */
  var bulkOutEndpoints: IVectorView[UsbBulkOutEndpointDescriptor] = js.native
  /** Gets an array of objects that represent descriptors associated with the alternate setting. */
  var descriptors: IVectorView[UsbDescriptor] = js.native
  /** Gets an object that represents the descriptor that describes the alternate setting. */
  var interfaceDescriptor: UsbInterfaceDescriptor = js.native
  /** Gets an array of objects that represent descriptors associated with USB interrupt IN endpoints that are defined in the alternate setting. */
  var interruptInEndpoints: IVectorView[UsbInterruptInEndpointDescriptor] = js.native
  /** Gets an array of objects that represent descriptors associated with USB interrupt OUT endpoints that are defined in the alternate setting. */
  var interruptOutEndpoints: IVectorView[UsbInterruptOutEndpointDescriptor] = js.native
  /** Determines whether the alternate setting is currently selected. */
  var selected: Boolean = js.native
  /**
    * Selects the alternate setting as the current setting in the USB interface.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def selectSettingAsync(): IPromiseWithIAsyncAction = js.native
}

