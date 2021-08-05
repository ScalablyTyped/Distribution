package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLShader extends StObject {
  
  val __WebGLShader: Unit
}
object WebGLShader {
  
  inline def apply(__WebGLShader: Unit): WebGLShader = {
    val __obj = js.Dynamic.literal(__WebGLShader = __WebGLShader.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLShader]
  }
  
  extension [Self <: WebGLShader](x: Self) {
    
    inline def set__WebGLShader(value: Unit): Self = StObject.set(x, "__WebGLShader", value.asInstanceOf[js.Any])
  }
}
