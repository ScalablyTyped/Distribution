package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLVertexArrayObjectOES
  extends StObject
     with WebGLObject {
  
  val __WebGLVertexArrayObjectOES: Unit
}
object WebGLVertexArrayObjectOES {
  
  inline def apply(__WebGLObject: Unit, __WebGLVertexArrayObjectOES: Unit): WebGLVertexArrayObjectOES = {
    val __obj = js.Dynamic.literal(__WebGLObject = __WebGLObject.asInstanceOf[js.Any], __WebGLVertexArrayObjectOES = __WebGLVertexArrayObjectOES.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLVertexArrayObjectOES]
  }
  
  extension [Self <: WebGLVertexArrayObjectOES](x: Self) {
    
    inline def set__WebGLVertexArrayObjectOES(value: Unit): Self = StObject.set(x, "__WebGLVertexArrayObjectOES", value.asInstanceOf[js.Any])
  }
}
