package typings.winrt.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationExecutionState with Double] = js.native
  /* 4 */ @js.native
  object closedByUser extends TopLevel[closedByUser with Double]
  
  /* 0 */ @js.native
  object notRunning extends TopLevel[notRunning with Double]
  
  /* 1 */ @js.native
  object running extends TopLevel[running with Double]
  
  /* 2 */ @js.native
  object suspended extends TopLevel[suspended with Double]
  
  /* 3 */ @js.native
  object terminated extends TopLevel[terminated with Double]
  
}

