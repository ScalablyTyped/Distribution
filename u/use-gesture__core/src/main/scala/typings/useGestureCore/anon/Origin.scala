package typings.useGestureCore.anon

import typings.useGestureCore.utilsMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Origin extends StObject {
  
  var angle: Double
  
  var distance: Double
  
  var origin: Vector2
}
object Origin {
  
  inline def apply(angle: Double, distance: Double, origin: Vector2): Origin = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origin]
  }
  
  extension [Self <: Origin](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: Vector2): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
