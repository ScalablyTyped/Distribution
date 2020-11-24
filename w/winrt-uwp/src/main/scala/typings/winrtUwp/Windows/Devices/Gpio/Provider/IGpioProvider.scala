package typings.winrtUwp.Windows.Devices.Gpio.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents actions common to general-purpose I/O (GPIO) controller providers. */
@js.native
trait IGpioProvider extends js.Object {
  
  var getControllers: js.Any = js.native
}
object IGpioProvider {
  
  @scala.inline
  def apply(getControllers: js.Any): IGpioProvider = {
    val __obj = js.Dynamic.literal(getControllers = getControllers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGpioProvider]
  }
  
  @scala.inline
  implicit class IGpioProviderOps[Self <: IGpioProvider] (val x: Self) extends AnyVal {
    
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
    def setGetControllers(value: js.Any): Self = this.set("getControllers", value.asInstanceOf[js.Any])
  }
}
