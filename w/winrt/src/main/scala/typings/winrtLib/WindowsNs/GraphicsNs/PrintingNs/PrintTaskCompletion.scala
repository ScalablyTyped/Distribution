package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintTaskCompletion extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintTaskCompletion")
@js.native
object PrintTaskCompletion extends js.Object {
  @js.native
  sealed trait abandoned
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintTaskCompletion
  
  @js.native
  sealed trait canceled
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintTaskCompletion
  
  @js.native
  sealed trait failed
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintTaskCompletion
  
  @js.native
  sealed trait submitted
    extends winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintTaskCompletion
  
  /* 0 */ val abandoned: abandoned with scala.Double = js.native
  /* 1 */ val canceled: canceled with scala.Double = js.native
  /* 2 */ val failed: failed with scala.Double = js.native
  /* 3 */ val submitted: submitted with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintTaskCompletion with scala.Double] = js.native
}

