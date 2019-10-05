package typings.winrtDashUwp.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the event arguments for the PrintTask.Progressing event. This event is raised during the submitting phase of the PrintTask . */
@JSGlobal("Windows.Graphics.Printing.PrintTaskProgressingEventArgs")
@js.native
abstract class PrintTaskProgressingEventArgs () extends js.Object {
  /** Gets the page count for a print task. */
  var documentPageCount: Double = js.native
}

