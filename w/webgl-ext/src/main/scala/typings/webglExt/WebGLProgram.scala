package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLProgram extends StObject {
  
  val __WebGLProgram: Unit
}
object WebGLProgram {
  
  inline def apply(__WebGLProgram: Unit): WebGLProgram = {
    val __obj = js.Dynamic.literal(__WebGLProgram = __WebGLProgram.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLProgram]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGLProgram] (val x: Self) extends AnyVal {
    
    inline def set__WebGLProgram(value: Unit): Self = StObject.set(x, "__WebGLProgram", value.asInstanceOf[js.Any])
  }
}
