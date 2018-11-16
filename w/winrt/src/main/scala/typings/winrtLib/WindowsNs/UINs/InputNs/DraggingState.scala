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
  
  val completed: completed with java.lang.String = js.native
  val continuing: continuing with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.InputNs.DraggingState with java.lang.String] = js.native
}

