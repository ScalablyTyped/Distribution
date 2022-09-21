package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DIFFUSETEXTURE extends StObject {
  
  var DEPTH_PACKING: Double
  
  var DIFFUSE_TEXTURE: Double
  
  var NORMAL_TEXTURE: Double
  
  var NUM_RINGS: Double
  
  var NUM_SAMPLES: Double
  
  var PERSPECTIVE_CAMERA: Double
}
object DIFFUSETEXTURE {
  
  inline def apply(
    DEPTH_PACKING: Double,
    DIFFUSE_TEXTURE: Double,
    NORMAL_TEXTURE: Double,
    NUM_RINGS: Double,
    NUM_SAMPLES: Double,
    PERSPECTIVE_CAMERA: Double
  ): DIFFUSETEXTURE = {
    val __obj = js.Dynamic.literal(DEPTH_PACKING = DEPTH_PACKING.asInstanceOf[js.Any], DIFFUSE_TEXTURE = DIFFUSE_TEXTURE.asInstanceOf[js.Any], NORMAL_TEXTURE = NORMAL_TEXTURE.asInstanceOf[js.Any], NUM_RINGS = NUM_RINGS.asInstanceOf[js.Any], NUM_SAMPLES = NUM_SAMPLES.asInstanceOf[js.Any], PERSPECTIVE_CAMERA = PERSPECTIVE_CAMERA.asInstanceOf[js.Any])
    __obj.asInstanceOf[DIFFUSETEXTURE]
  }
  
  extension [Self <: DIFFUSETEXTURE](x: Self) {
    
    inline def setDEPTH_PACKING(value: Double): Self = StObject.set(x, "DEPTH_PACKING", value.asInstanceOf[js.Any])
    
    inline def setDIFFUSE_TEXTURE(value: Double): Self = StObject.set(x, "DIFFUSE_TEXTURE", value.asInstanceOf[js.Any])
    
    inline def setNORMAL_TEXTURE(value: Double): Self = StObject.set(x, "NORMAL_TEXTURE", value.asInstanceOf[js.Any])
    
    inline def setNUM_RINGS(value: Double): Self = StObject.set(x, "NUM_RINGS", value.asInstanceOf[js.Any])
    
    inline def setNUM_SAMPLES(value: Double): Self = StObject.set(x, "NUM_SAMPLES", value.asInstanceOf[js.Any])
    
    inline def setPERSPECTIVE_CAMERA(value: Double): Self = StObject.set(x, "PERSPECTIVE_CAMERA", value.asInstanceOf[js.Any])
  }
}
