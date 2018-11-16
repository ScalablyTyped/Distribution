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
  
  val canceled: canceled with java.lang.String = js.native
  val completed: completed with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.InputNs.HoldingState with java.lang.String] = js.native
}

