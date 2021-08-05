package typings.webBluetooth

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceEventHandlers extends StObject {
  
  def onserviceadded(ev: Event): js.Any
  
  def onservicechanged(ev: Event): js.Any
  
  def onserviceremoved(ev: Event): js.Any
}
object ServiceEventHandlers {
  
  inline def apply(
    onserviceadded: Event => js.Any,
    onservicechanged: Event => js.Any,
    onserviceremoved: Event => js.Any
  ): ServiceEventHandlers = {
    val __obj = js.Dynamic.literal(onserviceadded = js.Any.fromFunction1(onserviceadded), onservicechanged = js.Any.fromFunction1(onservicechanged), onserviceremoved = js.Any.fromFunction1(onserviceremoved))
    __obj.asInstanceOf[ServiceEventHandlers]
  }
  
  extension [Self <: ServiceEventHandlers](x: Self) {
    
    inline def setOnserviceadded(value: Event => js.Any): Self = StObject.set(x, "onserviceadded", js.Any.fromFunction1(value))
    
    inline def setOnservicechanged(value: Event => js.Any): Self = StObject.set(x, "onservicechanged", js.Any.fromFunction1(value))
    
    inline def setOnserviceremoved(value: Event => js.Any): Self = StObject.set(x, "onserviceremoved", js.Any.fromFunction1(value))
  }
}
