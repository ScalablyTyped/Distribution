package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HoldingState extends js.Object

@JSGlobal("Windows.UI.Input.HoldingState")
@js.native
object HoldingState extends js.Object {
  @js.native
  sealed trait canceled
    extends winrtLib.WindowsNs.UINs.InputNs.HoldingState
  
  @js.native
  sealed trait completed
    extends winrtLib.WindowsNs.UINs.InputNs.HoldingState
  
  @js.native
  sealed trait started
    extends winrtLib.WindowsNs.UINs.InputNs.HoldingState
  
  /* 2 */ val canceled: canceled with scala.Double = js.native
  /* 1 */ val completed: completed with scala.Double = js.native
  /* 0 */ val started: started with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.InputNs.HoldingState with scala.Double] = js.native
}

