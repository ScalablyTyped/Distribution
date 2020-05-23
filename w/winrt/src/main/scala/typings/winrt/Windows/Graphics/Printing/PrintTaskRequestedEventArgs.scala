package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintTaskRequestedEventArgs extends IPrintTaskRequestedEventArgs

object PrintTaskRequestedEventArgs {
  @scala.inline
  def apply(request: PrintTaskRequest): PrintTaskRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskRequestedEventArgs]
  }
}

