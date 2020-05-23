package typings.winrtUwp.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the event arguments for the PrintTask.Progressing event. This event is raised during the submitting phase of the PrintTask . */
trait PrintTaskProgressingEventArgs extends js.Object {
  /** Gets the page count for a print task. */
  var documentPageCount: Double
}

object PrintTaskProgressingEventArgs {
  @scala.inline
  def apply(documentPageCount: Double): PrintTaskProgressingEventArgs = {
    val __obj = js.Dynamic.literal(documentPageCount = documentPageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskProgressingEventArgs]
  }
}

