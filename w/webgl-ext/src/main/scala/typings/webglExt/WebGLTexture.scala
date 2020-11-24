package typings.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLTexture extends js.Object {
  
  val __WebGLTexture: Unit = js.native
}
object WebGLTexture {
  
  @scala.inline
  def apply(__WebGLTexture: Unit): WebGLTexture = {
    val __obj = js.Dynamic.literal(__WebGLTexture = __WebGLTexture.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLTexture]
  }
  
  @scala.inline
  implicit class WebGLTextureOps[Self <: WebGLTexture] (val x: Self) extends AnyVal {
    
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
    def set__WebGLTexture(value: Unit): Self = this.set("__WebGLTexture", value.asInstanceOf[js.Any])
  }
}
