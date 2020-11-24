package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a controller responsible for turning on or off the phone display based on the readings from the ProximitySensor . */
@js.native
trait ProximitySensorDisplayOnOffController extends js.Object {
  
  /** Disconnects this ProximitySensorDisplayOnOffController instance from the service and frees all the allocated resources. */
  def close(): Unit = js.native
}
object ProximitySensorDisplayOnOffController {
  
  @scala.inline
  def apply(close: () => Unit): ProximitySensorDisplayOnOffController = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[ProximitySensorDisplayOnOffController]
  }
  
  @scala.inline
  implicit class ProximitySensorDisplayOnOffControllerOps[Self <: ProximitySensorDisplayOnOffController] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
  }
}
