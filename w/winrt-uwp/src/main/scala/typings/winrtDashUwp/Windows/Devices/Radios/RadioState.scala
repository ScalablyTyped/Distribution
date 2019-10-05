package typings.winrtDashUwp.Windows.Devices.Radios

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
  
  /* 3 */ val disabled: typings.winrtDashUwp.Windows.Devices.Radios.RadioState.disabled with Double = js.native
  /* 2 */ val off: typings.winrtDashUwp.Windows.Devices.Radios.RadioState.off with Double = js.native
  /* 1 */ val on: typings.winrtDashUwp.Windows.Devices.Radios.RadioState.on with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.Windows.Devices.Radios.RadioState.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RadioState with Double] = js.native
}

