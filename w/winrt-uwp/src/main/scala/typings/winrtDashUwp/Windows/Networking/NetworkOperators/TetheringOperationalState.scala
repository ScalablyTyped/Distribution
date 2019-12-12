package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Networking.NetworkOperators.TetheringOperationalState.inTransition
import typings.winrtDashUwp.Windows.Networking.NetworkOperators.TetheringOperationalState.off
import typings.winrtDashUwp.Windows.Networking.NetworkOperators.TetheringOperationalState.on
import typings.winrtDashUwp.Windows.Networking.NetworkOperators.TetheringOperationalState.unknown
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TetheringOperationalState with Double] = js.native
  /* 3 */ @js.native
  object inTransition extends TopLevel[inTransition with Double]
  
  /* 2 */ @js.native
  object off extends TopLevel[off with Double]
  
  /* 1 */ @js.native
  object on extends TopLevel[on with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

