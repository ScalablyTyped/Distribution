package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KERNELRADIUS extends StObject {
  
  var DEPTH_PACKING: Double
  
  var KERNEL_RADIUS: Double
  
  var PERSPECTIVE_CAMERA: Double
}
object KERNELRADIUS {
  
  inline def apply(DEPTH_PACKING: Double, KERNEL_RADIUS: Double, PERSPECTIVE_CAMERA: Double): KERNELRADIUS = {
    val __obj = js.Dynamic.literal(DEPTH_PACKING = DEPTH_PACKING.asInstanceOf[js.Any], KERNEL_RADIUS = KERNEL_RADIUS.asInstanceOf[js.Any], PERSPECTIVE_CAMERA = PERSPECTIVE_CAMERA.asInstanceOf[js.Any])
    __obj.asInstanceOf[KERNELRADIUS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KERNELRADIUS] (val x: Self) extends AnyVal {
    
    inline def setDEPTH_PACKING(value: Double): Self = StObject.set(x, "DEPTH_PACKING", value.asInstanceOf[js.Any])
    
    inline def setKERNEL_RADIUS(value: Double): Self = StObject.set(x, "KERNEL_RADIUS", value.asInstanceOf[js.Any])
    
    inline def setPERSPECTIVE_CAMERA(value: Double): Self = StObject.set(x, "PERSPECTIVE_CAMERA", value.asInstanceOf[js.Any])
  }
}
