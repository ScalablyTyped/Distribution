package typings.winrt.Windows.Graphics.Printing

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintTaskRequest extends IPrintTaskRequest

object PrintTaskRequest {
  @scala.inline
  def apply(
    createPrintTask: (String, PrintTaskSourceRequestedHandler) => PrintTask,
    deadline: Date,
    getDeferral: () => PrintTaskRequestedDeferral
  ): PrintTaskRequest = {
    val __obj = js.Dynamic.literal(createPrintTask = js.Any.fromFunction2(createPrintTask), deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[PrintTaskRequest]
  }
}

