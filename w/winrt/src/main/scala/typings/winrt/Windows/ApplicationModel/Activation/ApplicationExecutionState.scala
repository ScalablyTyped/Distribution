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
  
}

