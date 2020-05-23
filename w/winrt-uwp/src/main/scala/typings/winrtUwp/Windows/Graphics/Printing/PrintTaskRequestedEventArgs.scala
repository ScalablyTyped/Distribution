package typings.winrtUwp.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event arguments associated with the PrintTaskRequest . */
trait PrintTaskRequestedEventArgs extends js.Object {
  /** Gets the PrintTaskRequest object for a print task. */
  var request: PrintTaskRequest
}

object PrintTaskRequestedEventArgs {
  @scala.inline
  def apply(request: PrintTaskRequest): PrintTaskRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskRequestedEventArgs]
  }
}

