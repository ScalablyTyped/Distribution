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
  
  val abandoned: abandoned with java.lang.String = js.native
  val canceled: canceled with java.lang.String = js.native
  val failed: failed with java.lang.String = js.native
  val submitted: submitted with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs.PrintTaskCompletion with java.lang.String
  ] = js.native
}

