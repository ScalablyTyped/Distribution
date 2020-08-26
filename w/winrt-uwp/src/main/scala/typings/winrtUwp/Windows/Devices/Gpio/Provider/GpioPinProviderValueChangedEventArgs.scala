package typings.winrtUwp.Windows.Devices.Gpio.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GpioPinProviderValueChangedEventArgs extends js.Object {
  var edge: js.Any = js.native
}

object GpioPinProviderValueChangedEventArgs {
  @scala.inline
  def apply(edge: js.Any): GpioPinProviderValueChangedEventArgs = {
    val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any])
    __obj.asInstanceOf[GpioPinProviderValueChangedEventArgs]
  }
  @scala.inline
  implicit class GpioPinProviderValueChangedEventArgsOps[Self <: GpioPinProviderValueChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setEdge(value: js.Any): Self = this.set("edge", value.asInstanceOf[js.Any])
  }
  
}

