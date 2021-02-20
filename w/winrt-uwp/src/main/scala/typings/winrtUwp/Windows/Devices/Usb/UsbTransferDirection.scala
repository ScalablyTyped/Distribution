package typings.winrtUwp.Windows.Devices.Usb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UsbTransferDirection extends StObject
/** Defines constants that indicate the direction of USB transfer: IN or OUT transfers. */
@JSGlobal("Windows.Devices.Usb.UsbTransferDirection")
@js.native
object UsbTransferDirection extends StObject {
  
  /** Indicates an IN transfer from the device to the host. */
  @js.native
  sealed trait in extends UsbTransferDirection
  
  /** Indicates an OUT transfer from the host to the device. */
  @js.native
  sealed trait out extends UsbTransferDirection
}
