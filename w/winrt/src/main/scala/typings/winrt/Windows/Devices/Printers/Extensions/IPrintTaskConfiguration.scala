package typings.winrt.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskConfiguration extends js.Object {
  var onsaverequested: js.Any
  var printerExtensionContext: js.Any
}

object IPrintTaskConfiguration {
  @scala.inline
  def apply(onsaverequested: js.Any, printerExtensionContext: js.Any): IPrintTaskConfiguration = {
    val __obj = js.Dynamic.literal(onsaverequested = onsaverequested.asInstanceOf[js.Any], printerExtensionContext = printerExtensionContext.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPrintTaskConfiguration]
  }
}

