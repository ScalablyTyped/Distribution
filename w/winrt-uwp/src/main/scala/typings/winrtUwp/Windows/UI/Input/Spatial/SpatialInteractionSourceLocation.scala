package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialInteractionSourceLocation extends StObject {
  
  var position: Any
  
  /* unmapped type */
  var velocity: Any
}
object SpatialInteractionSourceLocation {
  
  inline def apply(position: Any, velocity: Any): SpatialInteractionSourceLocation = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSourceLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpatialInteractionSourceLocation] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Any): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
