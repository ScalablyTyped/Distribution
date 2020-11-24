package typings.winrtUwp.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UsbControlTransferType extends js.Object
/** Defines constants that indicate the type of USB control transfer: standard, class, or vendor. */
@JSGlobal("Windows.Devices.Usb.UsbControlTransferType")
@js.native
object UsbControlTransferType extends js.Object {
  
  /** Indicates a class-specific USB control request described by a specific device class specification. */
  @js.native
  sealed trait `class` extends UsbControlTransferType
  
  /** Indicates a standard USB control request that the app can send to obtain information about the device, its configurations, interfaces, and endpoints. The standard requests are described in section 9.4 of the Universal Serial Bus (USB) specification (www.usb.org). */
  @js.native
  sealed trait standard extends UsbControlTransferType
  
  /** Indicates a vendor-specified USB control request and depends on the requests supported by the device. */
  @js.native
  sealed trait vendor extends UsbControlTransferType
}
