package typings.winrtUwp.Windows.Devices.Spi.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderSpiConnectionSettings extends js.Object {
  var chipSelectLine: js.Any
   /* unmapped type */ var clockFrequency: js.Any
   /* unmapped type */ var dataBitLength: js.Any
   /* unmapped type */ var mode: js.Any
   /* unmapped type */ var sharingMode: js.Any
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
}

