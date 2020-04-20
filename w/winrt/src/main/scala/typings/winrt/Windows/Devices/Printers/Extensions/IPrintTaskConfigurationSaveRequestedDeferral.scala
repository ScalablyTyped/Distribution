package typings.winrt.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskConfigurationSaveRequestedDeferral extends js.Object {
  def complete(): Unit
}

object IPrintTaskConfigurationSaveRequestedDeferral {
  @scala.inline
  def apply(complete: () => Unit): IPrintTaskConfigurationSaveRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[IPrintTaskConfigurationSaveRequestedDeferral]
  }
}

