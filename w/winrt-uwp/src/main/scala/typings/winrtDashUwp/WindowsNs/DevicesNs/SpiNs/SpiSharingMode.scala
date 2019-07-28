package typings.winrtDashUwp.WindowsNs.DevicesNs.SpiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpiSharingMode extends js.Object

/** Defines the sharing mode for the SPI bus. */
@JSGlobal("Windows.Devices.Spi.SpiSharingMode")
@js.native
object SpiSharingMode extends js.Object {
  /** SPI bus segment is not shared. */
  @js.native
  sealed trait exclusive extends SpiSharingMode
  
  /** SPI bus is shared. */
  @js.native
  sealed trait shared extends SpiSharingMode
  
  /* 0 */ val exclusive: typings.winrtDashUwp.WindowsNs.DevicesNs.SpiNs.SpiSharingMode.exclusive with Double = js.native
  /* 1 */ val shared: typings.winrtDashUwp.WindowsNs.DevicesNs.SpiNs.SpiSharingMode.shared with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpiSharingMode with Double] = js.native
}

