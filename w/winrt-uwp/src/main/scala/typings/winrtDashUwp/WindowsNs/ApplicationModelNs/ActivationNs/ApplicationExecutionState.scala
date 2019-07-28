package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs

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
  sealed trait closedByUser extends ApplicationExecutionState
  
  /** The app is not running. */
  @js.native
  sealed trait notRunning extends ApplicationExecutionState
  
  /** The app is running. */
  @js.native
  sealed trait running extends ApplicationExecutionState
  
  /** The app is suspended. */
  @js.native
  sealed trait suspended extends ApplicationExecutionState
  
  /** The app was terminated after being suspended. */
  @js.native
  sealed trait terminated extends ApplicationExecutionState
  
  /* 4 */ val closedByUser: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState.closedByUser with Double = js.native
  /* 0 */ val notRunning: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState.notRunning with Double = js.native
  /* 1 */ val running: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState.running with Double = js.native
  /* 2 */ val suspended: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState.suspended with Double = js.native
  /* 3 */ val terminated: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState.terminated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationExecutionState with Double] = js.native
}

