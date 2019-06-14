package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DraggingState extends js.Object

@JSGlobal("Windows.UI.Input.DraggingState")
@js.native
object DraggingState extends js.Object {
  @js.native
  sealed trait completed
    extends winrtLib.WindowsNs.UINs.InputNs.DraggingState
  
  @js.native
  sealed trait continuing
    extends winrtLib.WindowsNs.UINs.InputNs.DraggingState
  
  @js.native
  sealed trait started
    extends winrtLib.WindowsNs.UINs.InputNs.DraggingState
  
  /* 2 */ val completed: completed with scala.Double = js.native
  /* 1 */ val continuing: continuing with scala.Double = js.native
  /* 0 */ val started: started with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.InputNs.DraggingState with scala.Double] = js.native
}

