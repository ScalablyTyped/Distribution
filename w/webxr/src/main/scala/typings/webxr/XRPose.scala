package typings.webxr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a position and orientation in space relative to an XRSpace.
  *
  * ref: https://immersive-web.github.io/webxr/#xrpose-interface
  */
trait XRPose extends StObject {
  
  val emulatedPosition: Boolean
  
  val transform: XRRigidTransform
}
object XRPose {
  
  inline def apply(emulatedPosition: Boolean, transform: XRRigidTransform): XRPose = {
    val __obj = js.Dynamic.literal(emulatedPosition = emulatedPosition.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRPose]
  }
  
  extension [Self <: XRPose](x: Self) {
    
    inline def setEmulatedPosition(value: Boolean): Self = StObject.set(x, "emulatedPosition", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: XRRigidTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
