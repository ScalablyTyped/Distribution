package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLFramebuffer extends StObject {
  
  val __WebGLFramebuffer: Unit
}
object WebGLFramebuffer {
  
  inline def apply(__WebGLFramebuffer: Unit): WebGLFramebuffer = {
    val __obj = js.Dynamic.literal(__WebGLFramebuffer = __WebGLFramebuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLFramebuffer]
  }
  
  extension [Self <: WebGLFramebuffer](x: Self) {
    
    inline def set__WebGLFramebuffer(value: Unit): Self = StObject.set(x, "__WebGLFramebuffer", value.asInstanceOf[js.Any])
  }
}
