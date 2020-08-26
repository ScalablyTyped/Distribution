package typings.winrtUwp.Windows.Devices.Spi.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderSpiConnectionSettings extends js.Object {
  var chipSelectLine: js.Any = js.native
   /* unmapped type */ var clockFrequency: js.Any = js.native
   /* unmapped type */ var dataBitLength: js.Any = js.native
   /* unmapped type */ var mode: js.Any = js.native
   /* unmapped type */ var sharingMode: js.Any = js.native
}

object ProviderSpiConnectionSettings {
  @scala.inline
  def apply(
    chipSelectLine: js.Any,
    clockFrequency: js.Any,
    dataBitLength: js.Any,
    mode: js.Any,
    sharingMode: js.Any
  ): ProviderSpiConnectionSettings = {
    val __obj = js.Dynamic.literal(chipSelectLine = chipSelectLine.asInstanceOf[js.Any], clockFrequency = clockFrequency.asInstanceOf[js.Any], dataBitLength = dataBitLength.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], sharingMode = sharingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderSpiConnectionSettings]
  }
  @scala.inline
  implicit class ProviderSpiConnectionSettingsOps[Self <: ProviderSpiConnectionSettings] (val x: Self) extends AnyVal {
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
    def setChipSelectLine(value: js.Any): Self = this.set("chipSelectLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setClockFrequency(value: js.Any): Self = this.set("clockFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataBitLength(value: js.Any): Self = this.set("dataBitLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: js.Any): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSharingMode(value: js.Any): Self = this.set("sharingMode", value.asInstanceOf[js.Any])
  }
  
}

