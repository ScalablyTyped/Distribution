package typings.winrtUwp.global.Windows.Devices.Usb

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the USB interface including its endpoints, the number of alternate settings the interface supports, and gets the entire descriptor set for those settings. It also obtains pipes associated with the endpoints that the interface supports. */
@JSGlobal("Windows.Devices.Usb.UsbInterface")
@js.native
abstract class UsbInterface ()
  extends typings.winrtUwp.Windows.Devices.Usb.UsbInterface {
  /** Gets an array of objects that represent pipes that the host opened to communicate with bulk IN endpoints defined in the current setting of the USB interface setting. */
  /* CompleteClass */
  override var bulkInPipes: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbBulkInPipe] = js.native
  /** Gets an array of objects that represent pipes that the host opened to communicate with bulk OUT endpoints defined in the current setting of the USB interface. */
  /* CompleteClass */
  override var bulkOutPipes: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbBulkOutPipe] = js.native
  /** Gets an array of objects that represent descriptors for all alternate settings that are part of this USB interface. */
  /* CompleteClass */
  override var descriptors: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbDescriptor] = js.native
  /** Gets the interface number that identifies the USB interface. This value is the bInterfaceNumber field of a standard USB interface descriptor. */
  /* CompleteClass */
  override var interfaceNumber: Double = js.native
  /** Gets an array of objects that represent alternate settings defined for the USB interface. */
  /* CompleteClass */
  override var interfaceSettings: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbInterfaceSetting] = js.native
  /** Gets an array of objects that represent pipes that the host opened to communicate with interrupt IN endpoints defined in the current setting of the USB interface. */
  /* CompleteClass */
  override var interruptInPipes: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbInterruptInPipe] = js.native
  /** Gets an array of objects that represent pipes that the host opened to communicate with interrupt OUT endpoints defined in the current setting of the USB interface. */
  /* CompleteClass */
  override var interruptOutPipes: IVectorView[typings.winrtUwp.Windows.Devices.Usb.UsbInterruptOutPipe] = js.native
}

