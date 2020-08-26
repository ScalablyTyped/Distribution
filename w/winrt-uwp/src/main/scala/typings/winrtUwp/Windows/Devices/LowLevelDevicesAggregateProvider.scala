package typings.winrtUwp.Windows.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LowLevelDevicesAggregateProvider extends js.Object {
  var adcControllerProvider: js.Any = js.native
   /* unmapped type */ var gpioControllerProvider: js.Any = js.native
   /* unmapped type */ var i2cControllerProvider: js.Any = js.native
   /* unmapped type */ var pwmControllerProvider: js.Any = js.native
   /* unmapped type */ var spiControllerProvider: js.Any = js.native
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
  @scala.inline
  implicit class LowLevelDevicesAggregateProviderOps[Self <: LowLevelDevicesAggregateProvider] (val x: Self) extends AnyVal {
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
    def setAdcControllerProvider(value: js.Any): Self = this.set("adcControllerProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setGpioControllerProvider(value: js.Any): Self = this.set("gpioControllerProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setI2cControllerProvider(value: js.Any): Self = this.set("i2cControllerProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setPwmControllerProvider(value: js.Any): Self = this.set("pwmControllerProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpiControllerProvider(value: js.Any): Self = this.set("spiControllerProvider", value.asInstanceOf[js.Any])
  }
  
}

