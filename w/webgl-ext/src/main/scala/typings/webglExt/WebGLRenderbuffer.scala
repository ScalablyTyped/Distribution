package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLRenderbuffer extends StObject {
  
  val __WebGLRenderbuffer: Unit
}
object WebGLRenderbuffer {
  
  inline def apply(__WebGLRenderbuffer: Unit): WebGLRenderbuffer = {
    val __obj = js.Dynamic.literal(__WebGLRenderbuffer = __WebGLRenderbuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLRenderbuffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGLRenderbuffer] (val x: Self) extends AnyVal {
    
    inline def set__WebGLRenderbuffer(value: Unit): Self = StObject.set(x, "__WebGLRenderbuffer", value.asInstanceOf[js.Any])
  }
}
