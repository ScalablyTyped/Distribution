package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandRadioState extends js.Object

/** Describes radio states for a Mobile Broadband device. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandRadioState")
@js.native
object MobileBroadbandRadioState extends js.Object {
  /** The radio is off. This can be because it has been turned off using a physical switch on the device, or using a software mechanism such as Airplane Mode on the control panel. */
  @js.native
  sealed trait off extends MobileBroadbandRadioState
  
  /** The radio is on. */
  @js.native
  sealed trait on extends MobileBroadbandRadioState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandRadioState with Double] = js.native
  /* 0 */ @js.native
  object off extends TopLevel[off with Double]
  
  /* 1 */ @js.native
  object on extends TopLevel[on with Double]
  
}

