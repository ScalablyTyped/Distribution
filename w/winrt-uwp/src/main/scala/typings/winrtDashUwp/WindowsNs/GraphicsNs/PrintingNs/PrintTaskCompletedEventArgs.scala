package typings.winrtDashUwp.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reports the completion of the print task. */
@JSGlobal("Windows.Graphics.Printing.PrintTaskCompletedEventArgs")
@js.native
abstract class PrintTaskCompletedEventArgs () extends js.Object {
  /** Gets the completion status of the print task. */
  var completion: PrintTaskCompletion = js.native
}

