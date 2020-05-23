package typings.winrtUwp.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reports the completion of the print task. */
trait PrintTaskCompletedEventArgs extends js.Object {
  /** Gets the completion status of the print task. */
  var completion: PrintTaskCompletion
}

object PrintTaskCompletedEventArgs {
  @scala.inline
  def apply(completion: PrintTaskCompletion): PrintTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskCompletedEventArgs]
  }
}

