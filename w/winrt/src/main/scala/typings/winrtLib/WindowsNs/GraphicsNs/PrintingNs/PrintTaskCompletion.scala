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
  
  val abandoned: abandoned with java.lang.String = js.native
  val canceled: canceled with java.lang.String = js.native
  val failed: failed with java.lang.String = js.native
  val submitted: submitted with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintTaskCompletion with java.lang.String
  ] = js.native
}

