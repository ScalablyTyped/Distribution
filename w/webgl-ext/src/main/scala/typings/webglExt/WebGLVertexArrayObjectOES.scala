package typings.webglExt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLVertexArrayObjectOES extends WebGLObject {
  
  val __WebGLVertexArrayObjectOES: Unit = js.native
}
object WebGLVertexArrayObjectOES {
  
  @scala.inline
  def apply(__WebGLObject: Unit, __WebGLVertexArrayObjectOES: Unit): WebGLVertexArrayObjectOES = {
    val __obj = js.Dynamic.literal(__WebGLObject = __WebGLObject.asInstanceOf[js.Any], __WebGLVertexArrayObjectOES = __WebGLVertexArrayObjectOES.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLVertexArrayObjectOES]
  }
  
  @scala.inline
  implicit class WebGLVertexArrayObjectOESMutableBuilder[Self <: WebGLVertexArrayObjectOES] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__WebGLVertexArrayObjectOES(value: Unit): Self = StObject.set(x, "__WebGLVertexArrayObjectOES", value.asInstanceOf[js.Any])
  }
}
