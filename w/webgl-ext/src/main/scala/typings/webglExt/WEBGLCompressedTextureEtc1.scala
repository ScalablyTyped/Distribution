package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WEBGLCompressedTextureEtc1 extends StObject {
  
  val COMPRESSED_RGB_ETC1_WEBGL: Double
}
object WEBGLCompressedTextureEtc1 {
  
  inline def apply(COMPRESSED_RGB_ETC1_WEBGL: Double): WEBGLCompressedTextureEtc1 = {
    val __obj = js.Dynamic.literal(COMPRESSED_RGB_ETC1_WEBGL = COMPRESSED_RGB_ETC1_WEBGL.asInstanceOf[js.Any])
    __obj.asInstanceOf[WEBGLCompressedTextureEtc1]
  }
  
  extension [Self <: WEBGLCompressedTextureEtc1](x: Self) {
    
    inline def setCOMPRESSED_RGB_ETC1_WEBGL(value: Double): Self = StObject.set(x, "COMPRESSED_RGB_ETC1_WEBGL", value.asInstanceOf[js.Any])
  }
}
