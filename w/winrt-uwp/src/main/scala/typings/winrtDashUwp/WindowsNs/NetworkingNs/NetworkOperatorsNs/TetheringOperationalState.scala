package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TetheringOperationalState extends js.Object

/** Defines values used by the TetheringOperationalState property to indicate the operational state of a device's tethering capabilities. */
@JSGlobal("Windows.Networking.NetworkOperators.TetheringOperationalState")
@js.native
object TetheringOperationalState extends js.Object {
  /** The tethering feature is currently in transition between the On and Off states. */
  @js.native
  sealed trait inTransition extends TetheringOperationalState
  
  /** Tethering is off. */
  @js.native
  sealed trait off extends TetheringOperationalState
  
  /** Tethering is on. */
  @js.native
  sealed trait on extends TetheringOperationalState
  
  /** Current operational state is unknown. */
  @js.native
  sealed trait unknown extends TetheringOperationalState
  
  /* 3 */ val inTransition: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringOperationalState.inTransition with Double = js.native
  /* 2 */ val off: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringOperationalState.off with Double = js.native
  /* 1 */ val on: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringOperationalState.on with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringOperationalState.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TetheringOperationalState with Double] = js.native
}

