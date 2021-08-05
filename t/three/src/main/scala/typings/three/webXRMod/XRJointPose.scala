package typings.three.webXRMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRJointPose
  extends StObject
     with XRPose {
  
  var radius: js.UndefOr[Double] = js.undefined
}
object XRJointPose {
  
  inline def apply(emulatedPosition: Boolean, transform: XRRigidTransform): XRJointPose = {
    val __obj = js.Dynamic.literal(emulatedPosition = emulatedPosition.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRJointPose]
  }
  
  extension [Self <: XRJointPose](x: Self) {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
  }
}
