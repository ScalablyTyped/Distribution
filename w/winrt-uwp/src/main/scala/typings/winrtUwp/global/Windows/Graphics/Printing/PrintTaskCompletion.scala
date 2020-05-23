package typings.winrtUwp.global.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the completion status of a print task. */
@JSGlobal("Windows.Graphics.Printing.PrintTaskCompletion")
@js.native
object PrintTaskCompletion extends js.Object {
  /* 0 */ val abandoned: typings.winrtUwp.Windows.Graphics.Printing.PrintTaskCompletion.abandoned with Double = js.native
  /* 1 */ val canceled: typings.winrtUwp.Windows.Graphics.Printing.PrintTaskCompletion.canceled with Double = js.native
  /* 2 */ val failed: typings.winrtUwp.Windows.Graphics.Printing.PrintTaskCompletion.failed with Double = js.native
  /* 3 */ val submitted: typings.winrtUwp.Windows.Graphics.Printing.PrintTaskCompletion.submitted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Graphics.Printing.PrintTaskCompletion with Double] = js.native
}

