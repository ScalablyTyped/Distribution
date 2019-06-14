package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationExecutionState extends js.Object

@JSGlobal("Windows.ApplicationModel.Activation.ApplicationExecutionState")
@js.native
object ApplicationExecutionState extends js.Object {
  @js.native
  sealed trait closedByUser
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  @js.native
  sealed trait notRunning
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  @js.native
  sealed trait running
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  @js.native
  sealed trait suspended
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  @js.native
  sealed trait terminated
    extends winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  /* 4 */ val closedByUser: closedByUser with scala.Double = js.native
  /* 0 */ val notRunning: notRunning with scala.Double = js.native
  /* 1 */ val running: running with scala.Double = js.native
  /* 2 */ val suspended: suspended with scala.Double = js.native
  /* 3 */ val terminated: terminated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState with scala.Double
  ] = js.native
}

