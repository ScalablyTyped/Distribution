package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a controller responsible for turning on or off the phone display based on the readings from the ProximitySensor . */
trait ProximitySensorDisplayOnOffController extends StObject {
  
  /** Disconnects this ProximitySensorDisplayOnOffController instance from the service and frees all the allocated resources. */
  def close(): Unit
}
object ProximitySensorDisplayOnOffController {
  
  inline def apply(close: () => Unit): ProximitySensorDisplayOnOffController = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[ProximitySensorDisplayOnOffController]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProximitySensorDisplayOnOffController] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
  }
}
