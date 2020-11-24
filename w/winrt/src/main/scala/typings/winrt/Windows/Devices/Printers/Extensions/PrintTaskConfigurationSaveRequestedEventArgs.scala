package typings.winrt.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintTaskConfigurationSaveRequestedEventArgs extends IPrintTaskConfigurationSaveRequestedEventArgs
object PrintTaskConfigurationSaveRequestedEventArgs {
  
  @scala.inline
  def apply(request: PrintTaskConfigurationSaveRequest): PrintTaskConfigurationSaveRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskConfigurationSaveRequestedEventArgs]
  }
}
