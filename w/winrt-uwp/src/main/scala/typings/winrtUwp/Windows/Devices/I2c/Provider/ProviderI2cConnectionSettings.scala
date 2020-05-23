package typings.winrtUwp.Windows.Devices.I2c.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderI2cConnectionSettings extends js.Object {
  var busSpeed: js.Any
   /* unmapped type */ var sharingMode: js.Any
   /* unmapped type */ var slaveAddress: js.Any
}

object ProviderI2cConnectionSettings {
  @scala.inline
  def apply(busSpeed: js.Any, sharingMode: js.Any, slaveAddress: js.Any): ProviderI2cConnectionSettings = {
    val __obj = js.Dynamic.literal(busSpeed = busSpeed.asInstanceOf[js.Any], sharingMode = sharingMode.asInstanceOf[js.Any], slaveAddress = slaveAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderI2cConnectionSettings]
  }
}

