package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLTexture extends StObject {
  
  val __WebGLTexture: Unit
}
object WebGLTexture {
  
  inline def apply(__WebGLTexture: Unit): WebGLTexture = {
    val __obj = js.Dynamic.literal(__WebGLTexture = __WebGLTexture.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLTexture]
  }
  
  extension [Self <: WebGLTexture](x: Self) {
    
    inline def set__WebGLTexture(value: Unit): Self = StObject.set(x, "__WebGLTexture", value.asInstanceOf[js.Any])
  }
}
