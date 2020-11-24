package typings.winrtUwp.Windows.Devices.I2c

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the I²C controller for the system. */
@js.native
trait I2cController extends js.Object {
  
  /**
    * Gets the I²C device with the specified settings.
    * @param settings The desired connection settings.
    * @return The I²C device.
    */
  def getDevice(settings: I2cConnectionSettings): I2cDevice = js.native
}
object I2cController {
  
  @scala.inline
  def apply(getDevice: I2cConnectionSettings => I2cDevice): I2cController = {
    val __obj = js.Dynamic.literal(getDevice = js.Any.fromFunction1(getDevice))
    __obj.asInstanceOf[I2cController]
  }
  
  @scala.inline
  implicit class I2cControllerOps[Self <: I2cController] (val x: Self) extends AnyVal {
    
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
    def setGetDevice(value: I2cConnectionSettings => I2cDevice): Self = this.set("getDevice", js.Any.fromFunction1(value))
  }
}
