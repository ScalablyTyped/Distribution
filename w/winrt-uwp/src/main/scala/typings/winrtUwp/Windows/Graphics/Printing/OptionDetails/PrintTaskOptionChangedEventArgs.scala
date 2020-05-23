package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Called when a print task option has changed. */
trait PrintTaskOptionChangedEventArgs extends js.Object {
  /** Gets the ID of the print task option that changed. */
  var optionId: js.Any
}

object PrintTaskOptionChangedEventArgs {
  @scala.inline
  def apply(optionId: js.Any): PrintTaskOptionChangedEventArgs = {
    val __obj = js.Dynamic.literal(optionId = optionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskOptionChangedEventArgs]
  }
}

