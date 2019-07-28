package typings.winrtDashUwp.WindowsNs.DevicesNs.UsbNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the USB interface including its endpoints, the number of alternate settings the interface supports, and gets the entire descriptor set for those settings. It also obtains pipes associated with the endpoints that the interface supports. */
@JSGlobal("Windows.Devices.Usb.UsbInterface")
@js.native
abstract class UsbInterface () extends js.Object {
  /** Gets an array of objects that represent pipes that the host opened to communicate with bulk IN endpoints defined in the current setting of the USB interface setting. */
  var bulkInPipes: IVectorView[UsbBulkInPipe] = js.native
  /** Gets an array of objects that represent pipes that the host opened to communicate with bulk OUT endpoints defined in the current setting of the USB interface. */
  var bulkOutPipes: IVectorView[UsbBulkOutPipe] = js.native
  /** Gets an array of objects that represent descriptors for all alternate settings that are part of this USB interface. */
  var descriptors: IVectorView[UsbDescriptor] = js.native
  /** Gets the interface number that identifies the USB interface. This value is the bInterfaceNumber field of a standard USB interface descriptor. */
  var interfaceNumber: Double = js.native
  /** Gets an array of objects that represent alternate settings defined for the USB interface. */
  var interfaceSettings: IVectorView[UsbInterfaceSetting] = js.native
  /** Gets an array of objects that represent pipes that the host opened to communicate with interrupt IN endpoints defined in the current setting of the USB interface. */
  var interruptInPipes: IVectorView[UsbInterruptInPipe] = js.native
  /** Gets an array of objects that represent pipes that the host opened to communicate with interrupt OUT endpoints defined in the current setting of the USB interface. */
  var interruptOutPipes: IVectorView[UsbInterruptOutPipe] = js.native
}

