package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationInformation extends StObject {
  
  var delta: Double
  
  var direction: NavigationDirection
  
  var `type`: NavigationType
}
object NavigationInformation {
  
  inline def apply(delta: Double, direction: NavigationDirection, `type`: NavigationType): NavigationInformation = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationInformation] (val x: Self) extends AnyVal {
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: NavigationDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setType(value: NavigationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
