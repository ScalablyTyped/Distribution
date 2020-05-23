package typings.winrtUwp.global.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines constants for configuration flags that can be set for a USB pipe that the host opens for a USB OUT endpoint. */
@JSGlobal("Windows.Devices.Usb.UsbWriteOptions")
@js.native
object UsbWriteOptions extends js.Object {
  /* 1 */ val autoClearStall: typings.winrtUwp.Windows.Devices.Usb.UsbWriteOptions.autoClearStall with Double = js.native
  /* 0 */ val none: typings.winrtUwp.Windows.Devices.Usb.UsbWriteOptions.none with Double = js.native
  /* 2 */ val shortPacketTerminate: typings.winrtUwp.Windows.Devices.Usb.UsbWriteOptions.shortPacketTerminate with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Usb.UsbWriteOptions with Double] = js.native
}

