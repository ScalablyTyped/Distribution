package typings.winrt.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPrintTaskConfiguration extends js.Object {
  var onsaverequested: js.Any = js.native
  var printerExtensionContext: js.Any = js.native
}

object IPrintTaskConfiguration {
  @scala.inline
  def apply(onsaverequested: js.Any, printerExtensionContext: js.Any): IPrintTaskConfiguration = {
    val __obj = js.Dynamic.literal(onsaverequested = onsaverequested.asInstanceOf[js.Any], printerExtensionContext = printerExtensionContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskConfiguration]
  }
  @scala.inline
  implicit class IPrintTaskConfigurationOps[Self <: IPrintTaskConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnsaverequested(value: js.Any): Self = this.set("onsaverequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrinterExtensionContext(value: js.Any): Self = this.set("printerExtensionContext", value.asInstanceOf[js.Any])
  }
  
}

