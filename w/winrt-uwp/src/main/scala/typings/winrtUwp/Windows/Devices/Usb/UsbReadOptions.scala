package typings.winrtUwp.Windows.Devices.Usb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UsbReadOptions extends StObject
/** Defines constants for configuration flags that can be set for a USB pipe that the host opens for a USB bulk IN endpoint. */
@JSGlobal("Windows.Devices.Usb.UsbReadOptions")
@js.native
object UsbReadOptions extends StObject {
  
  /** Allows read requests from a device that returns more data than requested by the caller. */
  @js.native
  sealed trait allowPartialReads
    extends StObject
       with UsbReadOptions
  
  /** Automatically clears a stalled pipe without stopping the data flow. */
  @js.native
  sealed trait autoClearStall
    extends StObject
       with UsbReadOptions
  
  /** The host does not complete a read request when a short packet is received. The read request is completed only when an error occurs, the request is canceled, or all requested bytes have been read. */
  @js.native
  sealed trait ignoreShortPacket
    extends StObject
       with UsbReadOptions
  
  /** Clear all flags. */
  @js.native
  sealed trait none
    extends StObject
       with UsbReadOptions
  
  /** Bypasses queuing and error handling to boost performance for multiple read requests. Read operations must be done in multiples of MaxPacketSize . */
  @js.native
  sealed trait overrideAutomaticBufferManagement
    extends StObject
       with UsbReadOptions
}
