package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SpiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpiMode extends js.Object

/** Defines the SPI communication mode. The communication mode defines the clock edge on which the master out line toggles, the master in line samples, and the signal clock's signal steady level (named SCLK). Each mode is defined with a pair of parameters called clock polarity (CPOL) and clock phase (CPHA). */
@JSGlobal("Windows.Devices.Spi.SpiMode")
@js.native
object SpiMode extends js.Object {
  /** CPOL = 0, CPHA = 0. */
  @js.native
  sealed trait mode0
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SpiNs.SpiMode
  
  /** CPOL = 0, CPHA = 1. */
  @js.native
  sealed trait mode1
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SpiNs.SpiMode
  
  /** CPOL = 1, CPHA = 0. */
  @js.native
  sealed trait mode2
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SpiNs.SpiMode
  
  /** CPOL = 1, CPHA = 1. */
  @js.native
  sealed trait mode3
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SpiNs.SpiMode
  
  /* 0 */ val mode0: mode0 with scala.Double = js.native
  /* 1 */ val mode1: mode1 with scala.Double = js.native
  /* 2 */ val mode2: mode2 with scala.Double = js.native
  /* 3 */ val mode3: mode3 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SpiNs.SpiMode with scala.Double] = js.native
}

