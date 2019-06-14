package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CrossSlidingState extends js.Object

@JSGlobal("Windows.UI.Input.CrossSlidingState")
@js.native
object CrossSlidingState extends js.Object {
  @js.native
  sealed trait completed
    extends winrtLib.WindowsNs.UINs.InputNs.CrossSlidingState
  
  @js.native
  sealed trait dragging
    extends winrtLib.WindowsNs.UINs.InputNs.CrossSlidingState
  
  @js.native
  sealed trait rearranging
    extends winrtLib.WindowsNs.UINs.InputNs.CrossSlidingState
  
  @js.native
  sealed trait selectSpeedBumping
    extends winrtLib.WindowsNs.UINs.InputNs.CrossSlidingState
  
  @js.native
  sealed trait selecting
    extends winrtLib.WindowsNs.UINs.InputNs.CrossSlidingState
  
  @js.native
  sealed trait speedBumping
    extends winrtLib.WindowsNs.UINs.InputNs.CrossSlidingState
  
  @js.native
  sealed trait started
    extends winrtLib.WindowsNs.UINs.InputNs.CrossSlidingState
  
  /* 6 */ val completed: completed with scala.Double = js.native
  /* 1 */ val dragging: dragging with scala.Double = js.native
  /* 5 */ val rearranging: rearranging with scala.Double = js.native
  /* 3 */ val selectSpeedBumping: selectSpeedBumping with scala.Double = js.native
  /* 2 */ val selecting: selecting with scala.Double = js.native
  /* 4 */ val speedBumping: speedBumping with scala.Double = js.native
  /* 0 */ val started: started with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.InputNs.CrossSlidingState with scala.Double] = js.native
}

