package typings.winrtUwp.global.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the event arguments for the PrintTask.Progressing event. This event is raised during the submitting phase of the PrintTask . */
@JSGlobal("Windows.Graphics.Printing.PrintTaskProgressingEventArgs")
@js.native
abstract class PrintTaskProgressingEventArgs ()
  extends typings.winrtUwp.Windows.Graphics.Printing.PrintTaskProgressingEventArgs {
  /** Gets the page count for a print task. */
  /* CompleteClass */
  override var documentPageCount: Double = js.native
}

