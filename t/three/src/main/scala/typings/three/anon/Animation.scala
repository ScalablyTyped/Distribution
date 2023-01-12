package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animation extends StObject {
  
  var animation: Boolean
  
  var cameraAnimation: Boolean
  
  var grant: Boolean
  
  var ik: Boolean
  
  var physics: Boolean
}
object Animation {
  
  inline def apply(animation: Boolean, cameraAnimation: Boolean, grant: Boolean, ik: Boolean, physics: Boolean): Animation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], cameraAnimation = cameraAnimation.asInstanceOf[js.Any], grant = grant.asInstanceOf[js.Any], ik = ik.asInstanceOf[js.Any], physics = physics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setCameraAnimation(value: Boolean): Self = StObject.set(x, "cameraAnimation", value.asInstanceOf[js.Any])
    
    inline def setGrant(value: Boolean): Self = StObject.set(x, "grant", value.asInstanceOf[js.Any])
    
    inline def setIk(value: Boolean): Self = StObject.set(x, "ik", value.asInstanceOf[js.Any])
    
    inline def setPhysics(value: Boolean): Self = StObject.set(x, "physics", value.asInstanceOf[js.Any])
  }
}
