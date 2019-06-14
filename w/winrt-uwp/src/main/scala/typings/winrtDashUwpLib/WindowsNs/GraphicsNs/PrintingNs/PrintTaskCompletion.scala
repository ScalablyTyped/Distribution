package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintTaskCompletion extends js.Object

/** Specifies the completion status of a print task. */
@JSGlobal("Windows.Graphics.Printing.PrintTaskCompletion")
@js.native
object PrintTaskCompletion extends js.Object {
  /** An abandoned print task. */
  @js.native
  sealed trait abandoned
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintTaskCompletion
  
  /** A canceled print task. */
  @js.native
  sealed trait canceled
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintTaskCompletion
  
  /** A failed print task. */
  @js.native
  sealed trait failed
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintTaskCompletion
  
  /** A submitted print task. */
  @js.native
  sealed trait submitted
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintTaskCompletion
  
  /* 0 */ val abandoned: abandoned with scala.Double = js.native
  /* 1 */ val canceled: canceled with scala.Double = js.native
  /* 2 */ val failed: failed with scala.Double = js.native
  /* 3 */ val submitted: submitted with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintTaskCompletion with scala.Double
  ] = js.native
}

