package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskCompletedEventArgs extends js.Object {
  var completion: PrintTaskCompletion
}

object IPrintTaskCompletedEventArgs {
  @scala.inline
  def apply(completion: PrintTaskCompletion): IPrintTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion)
  
    __obj.asInstanceOf[IPrintTaskCompletedEventArgs]
  }
}

