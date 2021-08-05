package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WEBKITWEBGLCompressedTexturePvrtc extends StObject {
  
  val COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: Double
  
  val COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: Double
  
  val COMPRESSED_RGB_PVRTC_2BPPV1_IMG: Double
  
  val COMPRESSED_RGB_PVRTC_4BPPV1_IMG: Double
}
object WEBKITWEBGLCompressedTexturePvrtc {
  
  inline def apply(
    COMPRESSED_RGBA_PVRTC_2BPPV1_IMG: Double,
    COMPRESSED_RGBA_PVRTC_4BPPV1_IMG: Double,
    COMPRESSED_RGB_PVRTC_2BPPV1_IMG: Double,
    COMPRESSED_RGB_PVRTC_4BPPV1_IMG: Double
  ): WEBKITWEBGLCompressedTexturePvrtc = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGBA_PVRTC_2BPPV1_IMG = COMPRESSED_RGBA_PVRTC_2BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGBA_PVRTC_4BPPV1_IMG = COMPRESSED_RGBA_PVRTC_4BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGB_PVRTC_2BPPV1_IMG = COMPRESSED_RGB_PVRTC_2BPPV1_IMG.asInstanceOf[js.Any], COMPRESSED_RGB_PVRTC_4BPPV1_IMG = COMPRESSED_RGB_PVRTC_4BPPV1_IMG.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBKITWEBGLCompressedTexturePvrtc]
  }
  
  extension [Self <: WEBKITWEBGLCompressedTexturePvrtc](x: Self) {
    
    inline def setCOMPRESSED_RGBA_PVRTC_2BPPV1_IMG(value: Double): Self = StObject.set(x, "COMPRESSED_RGBA_PVRTC_2BPPV1_IMG", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGBA_PVRTC_4BPPV1_IMG(value: Double): Self = StObject.set(x, "COMPRESSED_RGBA_PVRTC_4BPPV1_IMG", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGB_PVRTC_2BPPV1_IMG(value: Double): Self = StObject.set(x, "COMPRESSED_RGB_PVRTC_2BPPV1_IMG", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RGB_PVRTC_4BPPV1_IMG(value: Double): Self = StObject.set(x, "COMPRESSED_RGB_PVRTC_4BPPV1_IMG", value.asInstanceOf[js.Any])
  }
}
