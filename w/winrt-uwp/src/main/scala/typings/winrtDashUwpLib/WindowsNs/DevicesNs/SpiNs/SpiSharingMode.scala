package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SpiNs

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
  sealed trait exclusive
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SpiNs.SpiSharingMode
  
  /** SPI bus is shared. */
  @js.native
  sealed trait shared
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SpiNs.SpiSharingMode
  
  val exclusive: exclusive with java.lang.String = js.native
  val shared: shared with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SpiNs.SpiSharingMode with java.lang.String] = js.native
}

