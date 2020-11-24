package typings.webglExt

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
  implicit class WebGLVertexArrayObjectOESOps[Self <: WebGLVertexArrayObjectOES] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set__WebGLVertexArrayObjectOES(value: Unit): Self = this.set("__WebGLVertexArrayObjectOES", value.asInstanceOf[js.Any])
  }
}
