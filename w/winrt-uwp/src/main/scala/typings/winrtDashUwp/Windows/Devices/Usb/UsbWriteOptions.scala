package typings.winrtDashUwp.Windows.Devices.Usb

import org.scalablytyped.runtime.TopLevel
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
  sealed trait autoClearStall extends UsbWriteOptions
  
  /** Clear all flags. */
  @js.native
  sealed trait none extends UsbWriteOptions
  
  /** Sends a zero length packet for a write request in which the buffer is a multiple of the maximum packet size supported by the endpoint. */
  @js.native
  sealed trait shortPacketTerminate extends UsbWriteOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UsbWriteOptions with Double] = js.native
  /* 1 */ @js.native
  object autoClearStall extends TopLevel[autoClearStall with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object shortPacketTerminate extends TopLevel[shortPacketTerminate with Double]
  
}

