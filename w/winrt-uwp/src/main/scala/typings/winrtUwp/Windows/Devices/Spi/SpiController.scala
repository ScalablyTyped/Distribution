package typings.winrtUwp.Windows.Devices.Spi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the SPI controller on the system. */
@js.native
trait SpiController extends js.Object {
  
  /**
    * Gets the SPI device with the specified settings.
    * @param settings The desired connection settings.
    * @return The SPI device.
    */
  def getDevice(settings: SpiConnectionSettings): SpiDevice = js.native
}
object SpiController {
  
  @scala.inline
  def apply(getDevice: SpiConnectionSettings => SpiDevice): SpiController = {
    val __obj = js.Dynamic.literal(getDevice = js.Any.fromFunction1(getDevice))
    __obj.asInstanceOf[SpiController]
  }
  
  @scala.inline
  implicit class SpiControllerOps[Self <: SpiController] (val x: Self) extends AnyVal {
    
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
    def setGetDevice(value: SpiConnectionSettings => SpiDevice): Self = this.set("getDevice", js.Any.fromFunction1(value))
  }
}
