package typings.winrtDashUwp.Windows.Graphics.Printing

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
  sealed trait abandoned extends PrintTaskCompletion
  
  /** A canceled print task. */
  @js.native
  sealed trait canceled extends PrintTaskCompletion
  
  /** A failed print task. */
  @js.native
  sealed trait failed extends PrintTaskCompletion
  
  /** A submitted print task. */
  @js.native
  sealed trait submitted extends PrintTaskCompletion
  
  /* 0 */ val abandoned: typings.winrtDashUwp.Windows.Graphics.Printing.PrintTaskCompletion.abandoned with Double = js.native
  /* 1 */ val canceled: typings.winrtDashUwp.Windows.Graphics.Printing.PrintTaskCompletion.canceled with Double = js.native
  /* 2 */ val failed: typings.winrtDashUwp.Windows.Graphics.Printing.PrintTaskCompletion.failed with Double = js.native
  /* 3 */ val submitted: typings.winrtDashUwp.Windows.Graphics.Printing.PrintTaskCompletion.submitted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintTaskCompletion with Double] = js.native
}

