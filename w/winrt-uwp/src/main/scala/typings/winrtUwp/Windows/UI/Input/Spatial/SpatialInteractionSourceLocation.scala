package typings.winrtUwp.Windows.UI.Input.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialInteractionSourceLocation extends StObject {
  
  var position: js.Any
  
  /* unmapped type */
  var velocity: js.Any
}
object SpatialInteractionSourceLocation {
  
  inline def apply(position: js.Any, velocity: js.Any): SpatialInteractionSourceLocation = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSourceLocation]
  }
  
  extension [Self <: SpatialInteractionSourceLocation](x: Self) {
    
    inline def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: js.Any): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
