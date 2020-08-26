package typings.winrtUwp.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reports the completion of the print task. */
@js.native
trait PrintTaskCompletedEventArgs extends js.Object {
  /** Gets the completion status of the print task. */
  var completion: PrintTaskCompletion = js.native
}

object PrintTaskCompletedEventArgs {
  @scala.inline
  def apply(completion: PrintTaskCompletion): PrintTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskCompletedEventArgs]
  }
  @scala.inline
  implicit class PrintTaskCompletedEventArgsOps[Self <: PrintTaskCompletedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompletion(value: PrintTaskCompletion): Self = this.set("completion", value.asInstanceOf[js.Any])
  }
  
}

