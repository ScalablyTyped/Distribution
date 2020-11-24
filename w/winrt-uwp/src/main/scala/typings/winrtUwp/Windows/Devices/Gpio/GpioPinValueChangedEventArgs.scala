package typings.winrtUwp.Windows.Devices.Gpio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data about the GpioPin.ValueChanged event that occurs when the value of the general-purpose I/O (GPIO) pin changes, either because of an external stimulus when the pin is configured as an input, or when a value is written to the pin when the pin in configured as an output. */
@js.native
trait GpioPinValueChangedEventArgs extends js.Object {
  
  /** Gets the type of change that occurred to the value of the general-purpose I/O (GPIO) pin for the GpioPin.ValueChanged event. */
  var edge: GpioPinEdge = js.native
}
object GpioPinValueChangedEventArgs {
  
  @scala.inline
  def apply(edge: GpioPinEdge): GpioPinValueChangedEventArgs = {
    val __obj = js.Dynamic.literal(edge = edge.asInstanceOf[js.Any])
    __obj.asInstanceOf[GpioPinValueChangedEventArgs]
  }
  
  @scala.inline
  implicit class GpioPinValueChangedEventArgsOps[Self <: GpioPinValueChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setEdge(value: GpioPinEdge): Self = this.set("edge", value.asInstanceOf[js.Any])
  }
}
