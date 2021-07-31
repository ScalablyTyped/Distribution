package typings.webxr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRPose extends StObject {
  
  val emulatedPosition: Boolean
  
  val transform: XRRigidTransform
}
object XRPose {
  
  @scala.inline
  def apply(emulatedPosition: Boolean, transform: XRRigidTransform): XRPose = {
    val __obj = js.Dynamic.literal(emulatedPosition = emulatedPosition.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRPose]
  }
  
  @scala.inline
  implicit class XRPoseMutableBuilder[Self <: XRPose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmulatedPosition(value: Boolean): Self = StObject.set(x, "emulatedPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: XRRigidTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
