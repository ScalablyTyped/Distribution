package typings.winrtUwp.Windows.Devices.Spi

import org.scalablytyped.runtime.TopLevel
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
  sealed trait mode0 extends SpiMode
  
  /** CPOL = 0, CPHA = 1. */
  @js.native
  sealed trait mode1 extends SpiMode
  
  /** CPOL = 1, CPHA = 0. */
  @js.native
  sealed trait mode2 extends SpiMode
  
  /** CPOL = 1, CPHA = 1. */
  @js.native
  sealed trait mode3 extends SpiMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpiMode with Double] = js.native
  /* 0 */ @js.native
  object mode0 extends TopLevel[mode0 with Double]
  
  /* 1 */ @js.native
  object mode1 extends TopLevel[mode1 with Double]
  
  /* 2 */ @js.native
  object mode2 extends TopLevel[mode2 with Double]
  
  /* 3 */ @js.native
  object mode3 extends TopLevel[mode3 with Double]
  
}

