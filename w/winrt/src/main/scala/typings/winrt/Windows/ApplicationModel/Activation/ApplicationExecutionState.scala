package typings.winrt.Windows.ApplicationModel.Activation

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
  
  /* 4 */ val closedByUser: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.closedByUser with Double = js.native
  /* 0 */ val notRunning: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.notRunning with Double = js.native
  /* 1 */ val running: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.running with Double = js.native
  /* 2 */ val suspended: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.suspended with Double = js.native
  /* 3 */ val terminated: typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState.terminated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationExecutionState with Double] = js.native
}

