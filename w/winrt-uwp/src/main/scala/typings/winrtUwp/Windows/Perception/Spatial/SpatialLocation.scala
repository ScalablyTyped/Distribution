package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialLocation extends StObject {
  
  var absoluteAngularAcceleration: js.Any
  
  /* unmapped type */
  var absoluteAngularVelocity: js.Any
  
  /* unmapped type */
  var absoluteLinearAcceleration: js.Any
  
  /* unmapped type */
  var absoluteLinearVelocity: js.Any
  
  /* unmapped type */
  var orientation: js.Any
  
  /* unmapped type */
  var position: js.Any
}
object SpatialLocation {
  
  inline def apply(
    absoluteAngularAcceleration: js.Any,
    absoluteAngularVelocity: js.Any,
    absoluteLinearAcceleration: js.Any,
    absoluteLinearVelocity: js.Any,
    orientation: js.Any,
    position: js.Any
  ): SpatialLocation = {
    val __obj = js.Dynamic.literal(absoluteAngularAcceleration = absoluteAngularAcceleration.asInstanceOf[js.Any], absoluteAngularVelocity = absoluteAngularVelocity.asInstanceOf[js.Any], absoluteLinearAcceleration = absoluteLinearAcceleration.asInstanceOf[js.Any], absoluteLinearVelocity = absoluteLinearVelocity.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialLocation]
  }
  
  extension [Self <: SpatialLocation](x: Self) {
    
    inline def setAbsoluteAngularAcceleration(value: js.Any): Self = StObject.set(x, "absoluteAngularAcceleration", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteAngularVelocity(value: js.Any): Self = StObject.set(x, "absoluteAngularVelocity", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteLinearAcceleration(value: js.Any): Self = StObject.set(x, "absoluteLinearAcceleration", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteLinearVelocity(value: js.Any): Self = StObject.set(x, "absoluteLinearVelocity", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: js.Any): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
