package typings.winrt.WindowsNs.UINs.InputNs

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
  
  /* 6 */ val completed: typings.winrt.WindowsNs.UINs.InputNs.CrossSlidingState.completed with Double = js.native
  /* 1 */ val dragging: typings.winrt.WindowsNs.UINs.InputNs.CrossSlidingState.dragging with Double = js.native
  /* 5 */ val rearranging: typings.winrt.WindowsNs.UINs.InputNs.CrossSlidingState.rearranging with Double = js.native
  /* 3 */ val selectSpeedBumping: typings.winrt.WindowsNs.UINs.InputNs.CrossSlidingState.selectSpeedBumping with Double = js.native
  /* 2 */ val selecting: typings.winrt.WindowsNs.UINs.InputNs.CrossSlidingState.selecting with Double = js.native
  /* 4 */ val speedBumping: typings.winrt.WindowsNs.UINs.InputNs.CrossSlidingState.speedBumping with Double = js.native
  /* 0 */ val started: typings.winrt.WindowsNs.UINs.InputNs.CrossSlidingState.started with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CrossSlidingState with Double] = js.native
}

