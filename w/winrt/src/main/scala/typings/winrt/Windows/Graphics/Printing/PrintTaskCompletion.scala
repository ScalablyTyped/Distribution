package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintTaskCompletion extends js.Object

@JSGlobal("Windows.Graphics.Printing.PrintTaskCompletion")
@js.native
object PrintTaskCompletion extends js.Object {
  @js.native
  sealed trait abandoned extends PrintTaskCompletion
  
  @js.native
  sealed trait canceled extends PrintTaskCompletion
  
  @js.native
  sealed trait failed extends PrintTaskCompletion
  
  @js.native
  sealed trait submitted extends PrintTaskCompletion
  
  /* 0 */ val abandoned: typings.winrt.Windows.Graphics.Printing.PrintTaskCompletion.abandoned with Double = js.native
  /* 1 */ val canceled: typings.winrt.Windows.Graphics.Printing.PrintTaskCompletion.canceled with Double = js.native
  /* 2 */ val failed: typings.winrt.Windows.Graphics.Printing.PrintTaskCompletion.failed with Double = js.native
  /* 3 */ val submitted: typings.winrt.Windows.Graphics.Printing.PrintTaskCompletion.submitted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintTaskCompletion with Double] = js.native
}

