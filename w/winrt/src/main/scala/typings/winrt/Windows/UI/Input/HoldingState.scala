package typings.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HoldingState extends js.Object

@JSGlobal("Windows.UI.Input.HoldingState")
@js.native
object HoldingState extends js.Object {
  @js.native
  sealed trait canceled extends HoldingState
  
  @js.native
  sealed trait completed extends HoldingState
  
  @js.native
  sealed trait started extends HoldingState
  
  /* 2 */ val canceled: typings.winrt.Windows.UI.Input.HoldingState.canceled with Double = js.native
  /* 1 */ val completed: typings.winrt.Windows.UI.Input.HoldingState.completed with Double = js.native
  /* 0 */ val started: typings.winrt.Windows.UI.Input.HoldingState.started with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HoldingState with Double] = js.native
}

