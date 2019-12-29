package typings.winrtDashUwp.Windows.Devices.Spi

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpiSharingMode with Double] = js.native
  /* 0 */ @js.native
  object exclusive extends TopLevel[exclusive with Double]
  
  /* 1 */ @js.native
  object shared extends TopLevel[shared with Double]
  
}

