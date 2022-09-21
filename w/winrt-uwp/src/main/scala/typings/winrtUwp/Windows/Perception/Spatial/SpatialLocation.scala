package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialLocation extends StObject {
  
  var absoluteAngularAcceleration: Any
  
  /* unmapped type */
  var absoluteAngularVelocity: Any
  
  /* unmapped type */
  var absoluteLinearAcceleration: Any
  
  /* unmapped type */
  var absoluteLinearVelocity: Any
  
  /* unmapped type */
  var orientation: Any
  
  /* unmapped type */
  var position: Any
}
object SpatialLocation {
  
  inline def apply(
    absoluteAngularAcceleration: Any,
    absoluteAngularVelocity: Any,
    absoluteLinearAcceleration: Any,
    absoluteLinearVelocity: Any,
    orientation: Any,
    position: Any
  ): SpatialLocation = {
    val __obj = js.Dynamic.literal(absoluteAngularAcceleration = absoluteAngularAcceleration.asInstanceOf[js.Any], absoluteAngularVelocity = absoluteAngularVelocity.asInstanceOf[js.Any], absoluteLinearAcceleration = absoluteLinearAcceleration.asInstanceOf[js.Any], absoluteLinearVelocity = absoluteLinearVelocity.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialLocation]
  }
  
  extension [Self <: SpatialLocation](x: Self) {
    
    inline def setAbsoluteAngularAcceleration(value: Any): Self = StObject.set(x, "absoluteAngularAcceleration", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteAngularVelocity(value: Any): Self = StObject.set(x, "absoluteAngularVelocity", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteLinearAcceleration(value: Any): Self = StObject.set(x, "absoluteLinearAcceleration", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteLinearVelocity(value: Any): Self = StObject.set(x, "absoluteLinearVelocity", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Any): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
