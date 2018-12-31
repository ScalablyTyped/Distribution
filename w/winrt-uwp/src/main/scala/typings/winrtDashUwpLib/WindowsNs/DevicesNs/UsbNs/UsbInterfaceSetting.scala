package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an alternate setting and select that setting. The app can get the USB interface descriptors for the setting and its endpoints, and determine whether this setting is currently selected. */
@JSGlobal("Windows.Devices.Usb.UsbInterfaceSetting")
@js.native
abstract class UsbInterfaceSetting () extends js.Object {
  /** Gets an array of objects that represent descriptors associated with USB bulk IN endpoints that are defined in the alternate setting. */
  var bulkInEndpoints: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[UsbBulkInEndpointDescriptor] = js.native
  /** Gets an array of objects that represent descriptors associated with USB bulk OUT endpoints that are defined in the alternate setting. */
  var bulkOutEndpoints: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[UsbBulkOutEndpointDescriptor] = js.native
  /** Gets an array of objects that represent descriptors associated with the alternate setting. */
  var descriptors: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[UsbDescriptor] = js.native
  /** Gets an object that represents the descriptor that describes the alternate setting. */
  var interfaceDescriptor: UsbInterfaceDescriptor = js.native
  /** Gets an array of objects that represent descriptors associated with USB interrupt IN endpoints that are defined in the alternate setting. */
  var interruptInEndpoints: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[UsbInterruptInEndpointDescriptor] = js.native
  /** Gets an array of objects that represent descriptors associated with USB interrupt OUT endpoints that are defined in the alternate setting. */
  var interruptOutEndpoints: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[UsbInterruptOutEndpointDescriptor] = js.native
  /** Determines whether the alternate setting is currently selected. */
  var selected: scala.Boolean = js.native
  /**
    * Selects the alternate setting as the current setting in the USB interface.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def selectSettingAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

