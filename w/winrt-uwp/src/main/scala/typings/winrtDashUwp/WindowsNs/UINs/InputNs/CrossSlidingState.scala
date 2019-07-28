package typings.winrtDashUwp.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CrossSlidingState extends js.Object

/** Specifies the possible states of the CrossSliding event. */
@JSGlobal("Windows.UI.Input.CrossSlidingState")
@js.native
object CrossSlidingState extends js.Object {
  /** The swipe or slide gesture has stopped, the CrossSliding interaction has been completed, and the touch contact lifted. */
  @js.native
  sealed trait completed extends CrossSlidingState
  
  /** A CrossSliding interaction has started but the swipe or slide gesture has not crossed the minimum distance threshold for a selection action. (See the Remarks section for a diagram showing the CrossSliding distance thresholds.) */
  @js.native
  sealed trait dragging extends CrossSlidingState
  
  /** The swipe or slide gesture has crossed the minimum distance threshold of the rearrange action. This state is valid only when RearrangeStart is enabled in a GestureRecognizer . */
  @js.native
  sealed trait rearranging extends CrossSlidingState
  
  /** The swipe or slide gesture has crossed the minimum distance threshold for a selection action (and the selection speed bump) but has not crossed the maximum distance threshold of the selection speed bump. This state is valid only when both SpeedBumpStart and SelectionStart are enabled in a GestureRecognizer . */
  @js.native
  sealed trait selectSpeedBumping extends CrossSlidingState
  
  /** The swipe or slide gesture has crossed the minimum distance threshold for a selection action but has not crossed the minimum distance threshold of the rearrange action. This state is valid only when SpeedBumpStart is disabled in a GestureRecognizer . */
  @js.native
  sealed trait selecting extends CrossSlidingState
  
  /** The swipe or slide gesture has crossed the minimum distance threshold for a selection action (and the selection speed bump) but has not crossed the maximum distance threshold of the selection speed bump. This state is valid only when SpeedBumpStart is enabled and SelectionStart is disabled in a GestureRecognizer . */
  @js.native
  sealed trait speedBumping extends CrossSlidingState
  
  /** A CrossSliding interaction has been detected. */
  @js.native
  sealed trait started extends CrossSlidingState
  
  /* 6 */ val completed: typings.winrtDashUwp.WindowsNs.UINs.InputNs.CrossSlidingState.completed with Double = js.native
  /* 1 */ val dragging: typings.winrtDashUwp.WindowsNs.UINs.InputNs.CrossSlidingState.dragging with Double = js.native
  /* 5 */ val rearranging: typings.winrtDashUwp.WindowsNs.UINs.InputNs.CrossSlidingState.rearranging with Double = js.native
  /* 3 */ val selectSpeedBumping: typings.winrtDashUwp.WindowsNs.UINs.InputNs.CrossSlidingState.selectSpeedBumping with Double = js.native
  /* 2 */ val selecting: typings.winrtDashUwp.WindowsNs.UINs.InputNs.CrossSlidingState.selecting with Double = js.native
  /* 4 */ val speedBumping: typings.winrtDashUwp.WindowsNs.UINs.InputNs.CrossSlidingState.speedBumping with Double = js.native
  /* 0 */ val started: typings.winrtDashUwp.WindowsNs.UINs.InputNs.CrossSlidingState.started with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CrossSlidingState with Double] = js.native
}

