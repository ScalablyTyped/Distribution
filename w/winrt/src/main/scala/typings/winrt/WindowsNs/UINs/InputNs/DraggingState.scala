package typings.winrt.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DraggingState extends js.Object

@JSGlobal("Windows.UI.Input.DraggingState")
@js.native
object DraggingState extends js.Object {
  @js.native
  sealed trait completed extends DraggingState
  
  @js.native
  sealed trait continuing extends DraggingState
  
  @js.native
  sealed trait started extends DraggingState
  
  /* 2 */ val completed: typings.winrt.WindowsNs.UINs.InputNs.DraggingState.completed with Double = js.native
  /* 1 */ val continuing: typings.winrt.WindowsNs.UINs.InputNs.DraggingState.continuing with Double = js.native
  /* 0 */ val started: typings.winrt.WindowsNs.UINs.InputNs.DraggingState.started with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DraggingState with Double] = js.native
}

