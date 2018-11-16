package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UsbReadOptions extends js.Object

/** Defines constants for configuration flags that can be set for a USB pipe that the host opens for a USB bulk IN endpoint. */
@JSGlobal("Windows.Devices.Usb.UsbReadOptions")
@js.native
object UsbReadOptions extends js.Object {
  /** Allows read requests from a device that returns more data than requested by the caller. */
  @js.native
  sealed trait allowPartialReads
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbReadOptions
  
  /** Automatically clears a stalled pipe without stopping the data flow. */
  @js.native
  sealed trait autoClearStall
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbReadOptions
  
  /** The host does not complete a read request when a short packet is received. The read request is completed only when an error occurs, the request is canceled, or all requested bytes have been read. */
  @js.native
  sealed trait ignoreShortPacket
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbReadOptions
  
  /** Clear all flags. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbReadOptions
  
  /** Bypasses queuing and error handling to boost performance for multiple read requests. Read operations must be done in multiples of MaxPacketSize . */
  @js.native
  sealed trait overrideAutomaticBufferManagement
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbReadOptions
  
  val allowPartialReads: allowPartialReads with java.lang.String = js.native
  val autoClearStall: autoClearStall with java.lang.String = js.native
  val ignoreShortPacket: ignoreShortPacket with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val overrideAutomaticBufferManagement: overrideAutomaticBufferManagement with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbReadOptions with java.lang.String] = js.native
}

