package typings.winrtUwp.Windows.Devices.Gpio.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GpioPinProviderValueChangedEventArgs extends js.Object {
  var edge: js.Any
}

object GpioPinProviderValueChangedEventArgs {
  @scala.inline
  def apply(edge: js.Any): GpioPinProviderValueChangedEventArgs = {
    val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any])
    __obj.asInstanceOf[GpioPinProviderValueChangedEventArgs]
  }
}

