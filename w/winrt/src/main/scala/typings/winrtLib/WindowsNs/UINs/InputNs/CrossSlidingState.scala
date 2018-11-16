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
  
  val completed: completed with java.lang.String = js.native
  val dragging: dragging with java.lang.String = js.native
  val rearranging: rearranging with java.lang.String = js.native
  val selectSpeedBumping: selectSpeedBumping with java.lang.String = js.native
  val selecting: selecting with java.lang.String = js.native
  val speedBumping: speedBumping with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.InputNs.CrossSlidingState with java.lang.String] = js.native
}

