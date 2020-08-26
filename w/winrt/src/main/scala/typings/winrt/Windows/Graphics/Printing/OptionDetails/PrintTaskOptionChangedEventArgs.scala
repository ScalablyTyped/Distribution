package typings.winrt.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintTaskOptionChangedEventArgs extends IPrintTaskOptionChangedEventArgs

object PrintTaskOptionChangedEventArgs {
  @scala.inline
  def apply(optionId: js.Any): PrintTaskOptionChangedEventArgs = {
    val __obj = js.Dynamic.literal(optionId = optionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskOptionChangedEventArgs]
  }
}

