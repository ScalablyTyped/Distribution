package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KERNELSIZE extends StObject {
  
  var KERNEL_SIZE: Double
  
  var PERSPECTIVE_CAMERA: Double
}
object KERNELSIZE {
  
  inline def apply(KERNEL_SIZE: Double, PERSPECTIVE_CAMERA: Double): KERNELSIZE = {
    val __obj = js.Dynamic.literal(KERNEL_SIZE = KERNEL_SIZE.asInstanceOf[js.Any], PERSPECTIVE_CAMERA = PERSPECTIVE_CAMERA.asInstanceOf[js.Any])
    __obj.asInstanceOf[KERNELSIZE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KERNELSIZE] (val x: Self) extends AnyVal {
    
    inline def setKERNEL_SIZE(value: Double): Self = StObject.set(x, "KERNEL_SIZE", value.asInstanceOf[js.Any])
    
    inline def setPERSPECTIVE_CAMERA(value: Double): Self = StObject.set(x, "PERSPECTIVE_CAMERA", value.asInstanceOf[js.Any])
  }
}
