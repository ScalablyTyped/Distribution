package typings.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLBuffer extends js.Object {
  
  val __WebGLBuffer: Unit = js.native
}
object WebGLBuffer {
  
  @scala.inline
  def apply(__WebGLBuffer: Unit): WebGLBuffer = {
    val __obj = js.Dynamic.literal(__WebGLBuffer = __WebGLBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLBuffer]
  }
  
  @scala.inline
  implicit class WebGLBufferOps[Self <: WebGLBuffer] (val x: Self) extends AnyVal {
    
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
    def set__WebGLBuffer(value: Unit): Self = this.set("__WebGLBuffer", value.asInstanceOf[js.Any])
  }
}
