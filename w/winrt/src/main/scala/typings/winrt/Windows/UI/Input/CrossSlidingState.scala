package typings.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CrossSlidingState extends js.Object

@JSGlobal("Windows.UI.Input.CrossSlidingState")
@js.native
object CrossSlidingState extends js.Object {
  @js.native
  sealed trait completed extends CrossSlidingState
  
  @js.native
  sealed trait dragging extends CrossSlidingState
  
  @js.native
  sealed trait rearranging extends CrossSlidingState
  
  @js.native
  sealed trait selectSpeedBumping extends CrossSlidingState
  
  @js.native
  sealed trait selecting extends CrossSlidingState
  
  @js.native
  sealed trait speedBumping extends CrossSlidingState
  
  @js.native
  sealed trait started extends CrossSlidingState
  
  /* 6 */ val completed: typings.winrt.Windows.UI.Input.CrossSlidingState.completed with Double = js.native
  /* 1 */ val dragging: typings.winrt.Windows.UI.Input.CrossSlidingState.dragging with Double = js.native
  /* 5 */ val rearranging: typings.winrt.Windows.UI.Input.CrossSlidingState.rearranging with Double = js.native
  /* 3 */ val selectSpeedBumping: typings.winrt.Windows.UI.Input.CrossSlidingState.selectSpeedBumping with Double = js.native
  /* 2 */ val selecting: typings.winrt.Windows.UI.Input.CrossSlidingState.selecting with Double = js.native
  /* 4 */ val speedBumping: typings.winrt.Windows.UI.Input.CrossSlidingState.speedBumping with Double = js.native
  /* 0 */ val started: typings.winrt.Windows.UI.Input.CrossSlidingState.started with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CrossSlidingState with Double] = js.native
}

