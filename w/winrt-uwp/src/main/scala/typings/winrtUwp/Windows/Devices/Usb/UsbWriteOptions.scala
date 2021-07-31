package typings.winrtUwp.Windows.Devices.Usb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UsbWriteOptions extends StObject
/** Defines constants for configuration flags that can be set for a USB pipe that the host opens for a USB OUT endpoint. */
@JSGlobal("Windows.Devices.Usb.UsbWriteOptions")
@js.native
object UsbWriteOptions extends StObject {
  
  /** Automatically clears a stalled pipe without stopping the data flow. */
  @js.native
  sealed trait autoClearStall
    extends StObject
       with UsbWriteOptions
  
  /** Clear all flags. */
  @js.native
  sealed trait none
    extends StObject
       with UsbWriteOptions
  
  /** Sends a zero length packet for a write request in which the buffer is a multiple of the maximum packet size supported by the endpoint. */
  @js.native
  sealed trait shortPacketTerminate
    extends StObject
       with UsbWriteOptions
}
