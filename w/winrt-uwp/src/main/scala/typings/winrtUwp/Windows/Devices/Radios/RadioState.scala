package typings.winrtUwp.Windows.Devices.Radios

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RadioState extends js.Object

/** Enumeration that describes possible radio states. */
@JSGlobal("Windows.Devices.Radios.RadioState")
@js.native
object RadioState extends js.Object {
  /** The radio is powered off and disabled by the device firmware or a hardware switch on the device. */
  @js.native
  sealed trait disabled extends RadioState
  
  /** The radio is powered off. */
  @js.native
  sealed trait off extends RadioState
  
  /** The radio is powered on. */
  @js.native
  sealed trait on extends RadioState
  
  /** The radio state is unknown, or the radio is in a bad or uncontrollable state. */
  @js.native
  sealed trait unknown extends RadioState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RadioState with Double] = js.native
  /* 3 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  /* 2 */ @js.native
  object off extends TopLevel[off with Double]
  
  /* 1 */ @js.native
  object on extends TopLevel[on with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

