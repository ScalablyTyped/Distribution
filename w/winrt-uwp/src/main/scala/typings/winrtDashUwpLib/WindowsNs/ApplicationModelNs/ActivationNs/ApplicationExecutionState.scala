package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationExecutionState extends js.Object

/** Specifies the execution state of the app. */
@JSGlobal("Windows.ApplicationModel.Activation.ApplicationExecutionState")
@js.native
object ApplicationExecutionState extends js.Object {
  /** The app was closed by the user. */
  @js.native
  sealed trait closedByUser
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  /** The app is not running. */
  @js.native
  sealed trait notRunning
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  /** The app is running. */
  @js.native
  sealed trait running
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  /** The app is suspended. */
  @js.native
  sealed trait suspended
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  /** The app was terminated after being suspended. */
  @js.native
  sealed trait terminated
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState
  
  /* 4 */ val closedByUser: closedByUser with scala.Double = js.native
  /* 0 */ val notRunning: notRunning with scala.Double = js.native
  /* 1 */ val running: running with scala.Double = js.native
  /* 2 */ val suspended: suspended with scala.Double = js.native
  /* 3 */ val terminated: terminated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState with scala.Double
  ] = js.native
}

