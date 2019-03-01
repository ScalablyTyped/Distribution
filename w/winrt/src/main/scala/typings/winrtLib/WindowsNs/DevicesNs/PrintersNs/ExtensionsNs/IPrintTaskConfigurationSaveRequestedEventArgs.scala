package typings
package winrtLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskConfigurationSaveRequestedEventArgs extends js.Object {
  var request: PrintTaskConfigurationSaveRequest
}

object IPrintTaskConfigurationSaveRequestedEventArgs {
  @scala.inline
  def apply(request: PrintTaskConfigurationSaveRequest): IPrintTaskConfigurationSaveRequestedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[IPrintTaskConfigurationSaveRequestedEventArgs]
  }
}

