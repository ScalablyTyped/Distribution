package typings.webBluetooth

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceEventHandlers extends StObject {
  
  def onserviceadded(ev: Event): Any
  
  def onservicechanged(ev: Event): Any
  
  def onserviceremoved(ev: Event): Any
}
object ServiceEventHandlers {
  
  inline def apply(onserviceadded: Event => Any, onservicechanged: Event => Any, onserviceremoved: Event => Any): ServiceEventHandlers = {
    val __obj = js.Dynamic.literal(onserviceadded = js.Any.fromFunction1(onserviceadded), onservicechanged = js.Any.fromFunction1(onservicechanged), onserviceremoved = js.Any.fromFunction1(onserviceremoved))
    __obj.asInstanceOf[ServiceEventHandlers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceEventHandlers] (val x: Self) extends AnyVal {
    
    inline def setOnserviceadded(value: Event => Any): Self = StObject.set(x, "onserviceadded", js.Any.fromFunction1(value))
    
    inline def setOnservicechanged(value: Event => Any): Self = StObject.set(x, "onservicechanged", js.Any.fromFunction1(value))
    
    inline def setOnserviceremoved(value: Event => Any): Self = StObject.set(x, "onserviceremoved", js.Any.fromFunction1(value))
  }
}
