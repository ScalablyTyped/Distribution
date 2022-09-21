package typings.useGestureCore.anon

import typings.useGestureCore.utilsMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var distance: Vector2
  
  var duration: Double
  
  var velocity: Vector2
}
object Duration {
  
  inline def apply(distance: Vector2, duration: Double, velocity: Vector2): Duration = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDistance(value: Vector2): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Vector2): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
