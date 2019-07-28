package typings.winrtDashUwp.WindowsNs.DevicesNs.GpioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GpioSharingMode extends js.Object

/** Describes the modes in which you can open a general-purpose I/O (GPIO) pin. These modes determine whether other connections to the GPIO pin can be opened while you have the pin open. */
@JSGlobal("Windows.Devices.Gpio.GpioSharingMode")
@js.native
object GpioSharingMode extends js.Object {
  /** Opens the GPIO pin exclusively, so that no other connection to the pin can be opened. */
  @js.native
  sealed trait exclusive extends GpioSharingMode
  
  /** Opens the GPIO pin as shared, so that other connections in SharedReadOnly mode to the pin can be opened. */
  @js.native
  sealed trait sharedReadOnly extends GpioSharingMode
  
  /* 0 */ val exclusive: typings.winrtDashUwp.WindowsNs.DevicesNs.GpioNs.GpioSharingMode.exclusive with Double = js.native
  /* 1 */ val sharedReadOnly: typings.winrtDashUwp.WindowsNs.DevicesNs.GpioNs.GpioSharingMode.sharedReadOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GpioSharingMode with Double] = js.native
}

