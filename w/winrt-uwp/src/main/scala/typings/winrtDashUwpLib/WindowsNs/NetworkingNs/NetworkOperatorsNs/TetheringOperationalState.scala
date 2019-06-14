package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

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
  sealed trait inTransition
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringOperationalState
  
  /** Tethering is off. */
  @js.native
  sealed trait off
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringOperationalState
  
  /** Tethering is on. */
  @js.native
  sealed trait on
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringOperationalState
  
  /** Current operational state is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringOperationalState
  
  /* 3 */ val inTransition: inTransition with scala.Double = js.native
  /* 2 */ val off: off with scala.Double = js.native
  /* 1 */ val on: on with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.TetheringOperationalState with scala.Double
  ] = js.native
}

