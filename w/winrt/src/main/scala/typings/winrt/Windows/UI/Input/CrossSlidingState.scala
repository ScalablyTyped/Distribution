package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.Input.CrossSlidingState.completed
import typings.winrt.Windows.UI.Input.CrossSlidingState.dragging
import typings.winrt.Windows.UI.Input.CrossSlidingState.rearranging
import typings.winrt.Windows.UI.Input.CrossSlidingState.selectSpeedBumping
import typings.winrt.Windows.UI.Input.CrossSlidingState.selecting
import typings.winrt.Windows.UI.Input.CrossSlidingState.speedBumping
import typings.winrt.Windows.UI.Input.CrossSlidingState.started
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CrossSlidingState with Double] = js.native
  /* 6 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  /* 1 */ @js.native
  object dragging extends TopLevel[dragging with Double]
  
  /* 5 */ @js.native
  object rearranging extends TopLevel[rearranging with Double]
  
  /* 3 */ @js.native
  object selectSpeedBumping extends TopLevel[selectSpeedBumping with Double]
  
  /* 2 */ @js.native
  object selecting extends TopLevel[selecting with Double]
  
  /* 4 */ @js.native
  object speedBumping extends TopLevel[speedBumping with Double]
  
  /* 0 */ @js.native
  object started extends TopLevel[started with Double]
  
}

