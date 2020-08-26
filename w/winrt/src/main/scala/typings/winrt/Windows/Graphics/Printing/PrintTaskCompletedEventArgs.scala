package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintTaskCompletedEventArgs extends IPrintTaskCompletedEventArgs

object PrintTaskCompletedEventArgs {
  @scala.inline
  def apply(completion: PrintTaskCompletion): PrintTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskCompletedEventArgs]
  }
}

