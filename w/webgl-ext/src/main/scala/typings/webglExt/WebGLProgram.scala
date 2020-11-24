package typings.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLProgram extends js.Object {
  
  val __WebGLProgram: Unit = js.native
}
object WebGLProgram {
  
  @scala.inline
  def apply(__WebGLProgram: Unit): WebGLProgram = {
    val __obj = js.Dynamic.literal(__WebGLProgram = __WebGLProgram.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLProgram]
  }
  
  @scala.inline
  implicit class WebGLProgramOps[Self <: WebGLProgram] (val x: Self) extends AnyVal {
    
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
    def set__WebGLProgram(value: Unit): Self = this.set("__WebGLProgram", value.asInstanceOf[js.Any])
  }
}
