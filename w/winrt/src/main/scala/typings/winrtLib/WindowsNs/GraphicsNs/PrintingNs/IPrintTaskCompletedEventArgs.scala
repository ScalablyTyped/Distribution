package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskCompletedEventArgs extends js.Object {
  var completion: PrintTaskCompletion
}

object IPrintTaskCompletedEventArgs {
  @scala.inline
  def apply(completion: PrintTaskCompletion): IPrintTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("completion")(completion)
    __obj.asInstanceOf[IPrintTaskCompletedEventArgs]
  }
}

