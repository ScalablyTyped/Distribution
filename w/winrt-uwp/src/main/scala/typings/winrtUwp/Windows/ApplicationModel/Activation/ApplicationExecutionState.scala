package typings.winrtUwp.Windows.ApplicationModel.Activation

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
  
}

