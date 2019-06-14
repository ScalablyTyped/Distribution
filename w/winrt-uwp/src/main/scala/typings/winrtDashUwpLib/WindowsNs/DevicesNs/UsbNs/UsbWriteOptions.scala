package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UsbWriteOptions extends js.Object

/** Defines constants for configuration flags that can be set for a USB pipe that the host opens for a USB OUT endpoint. */
@JSGlobal("Windows.Devices.Usb.UsbWriteOptions")
@js.native
object UsbWriteOptions extends js.Object {
  /** Automatically clears a stalled pipe without stopping the data flow. */
  @js.native
  sealed trait autoClearStall
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbWriteOptions
  
  /** Clear all flags. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbWriteOptions
  
  /** Sends a zero length packet for a write request in which the buffer is a multiple of the maximum packet size supported by the endpoint. */
  @js.native
  sealed trait shortPacketTerminate
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbWriteOptions
  
  /* 1 */ val autoClearStall: autoClearStall with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val shortPacketTerminate: shortPacketTerminate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbWriteOptions with scala.Double] = js.native
}

