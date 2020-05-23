package typings.winrtUwp.Windows.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LowLevelDevicesAggregateProvider extends js.Object {
  var adcControllerProvider: js.Any
   /* unmapped type */ var gpioControllerProvider: js.Any
   /* unmapped type */ var i2cControllerProvider: js.Any
   /* unmapped type */ var pwmControllerProvider: js.Any
   /* unmapped type */ var spiControllerProvider: js.Any
}

object LowLevelDevicesAggregateProvider {
  @scala.inline
  def apply(
    adcControllerProvider: js.Any,
    gpioControllerProvider: js.Any,
    i2cControllerProvider: js.Any,
    pwmControllerProvider: js.Any,
    spiControllerProvider: js.Any
  ): LowLevelDevicesAggregateProvider = {
    val __obj = js.Dynamic.literal(adcControllerProvider = adcControllerProvider.asInstanceOf[js.Any], gpioControllerProvider = gpioControllerProvider.asInstanceOf[js.Any], i2cControllerProvider = i2cControllerProvider.asInstanceOf[js.Any], pwmControllerProvider = pwmControllerProvider.asInstanceOf[js.Any], spiControllerProvider = spiControllerProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[LowLevelDevicesAggregateProvider]
  }
}

