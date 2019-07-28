package typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationExecutionState extends js.Object

@JSGlobal("Windows.ApplicationModel.Activation.ApplicationExecutionState")
@js.native
object ApplicationExecutionState extends js.Object {
  @js.native
  sealed trait closedByUser extends ApplicationExecutionState
  
  @js.native
  sealed trait notRunning extends ApplicationExecutionState
  
  @js.native
  sealed trait running extends ApplicationExecutionState
  
  @js.native
  sealed trait suspended extends ApplicationExecutionState
  
  @js.native
  sealed trait terminated extends ApplicationExecutionState
  
  /* 4 */ val closedByUser: typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState.closedByUser with Double = js.native
  /* 0 */ val notRunning: typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState.notRunning with Double = js.native
  /* 1 */ val running: typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState.running with Double = js.native
  /* 2 */ val suspended: typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState.suspended with Double = js.native
  /* 3 */ val terminated: typings.winrt.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState.terminated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationExecutionState with Double] = js.native
}

