package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  var component: Any
  
  var monitor: Any
}
object Component {
  
  inline def apply(component: Any, monitor: Any): Component = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setComponent(value: Any): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setMonitor(value: Any): Self = StObject.set(x, "monitor", value.asInstanceOf[js.Any])
  }
}
