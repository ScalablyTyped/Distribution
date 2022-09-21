package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DEPTHPACKING extends StObject {
  
  var DEPTH_PACKING: Double
  
  var PERSPECTIVE_CAMERA: Double
}
object DEPTHPACKING {
  
  inline def apply(DEPTH_PACKING: Double, PERSPECTIVE_CAMERA: Double): DEPTHPACKING = {
    val __obj = js.Dynamic.literal(DEPTH_PACKING = DEPTH_PACKING.asInstanceOf[js.Any], PERSPECTIVE_CAMERA = PERSPECTIVE_CAMERA.asInstanceOf[js.Any])
    __obj.asInstanceOf[DEPTHPACKING]
  }
  
  extension [Self <: DEPTHPACKING](x: Self) {
    
    inline def setDEPTH_PACKING(value: Double): Self = StObject.set(x, "DEPTH_PACKING", value.asInstanceOf[js.Any])
    
    inline def setPERSPECTIVE_CAMERA(value: Double): Self = StObject.set(x, "PERSPECTIVE_CAMERA", value.asInstanceOf[js.Any])
  }
}
