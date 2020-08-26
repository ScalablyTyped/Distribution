package typings.winrt.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintTaskConfigurationSaveRequestedDeferral extends IPrintTaskConfigurationSaveRequestedDeferral

object PrintTaskConfigurationSaveRequestedDeferral {
  @scala.inline
  def apply(complete: () => Unit): PrintTaskConfigurationSaveRequestedDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[PrintTaskConfigurationSaveRequestedDeferral]
  }
}

