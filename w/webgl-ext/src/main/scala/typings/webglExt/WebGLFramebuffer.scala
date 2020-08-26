package typings.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLFramebuffer extends js.Object {
  val __WebGLFramebuffer: Unit = js.native
}

object WebGLFramebuffer {
  @scala.inline
  def apply(__WebGLFramebuffer: Unit): WebGLFramebuffer = {
    val __obj = js.Dynamic.literal(__WebGLFramebuffer = __WebGLFramebuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLFramebuffer]
  }
  @scala.inline
  implicit class WebGLFramebufferOps[Self <: WebGLFramebuffer] (val x: Self) extends AnyVal {
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
    def set__WebGLFramebuffer(value: Unit): Self = this.set("__WebGLFramebuffer", value.asInstanceOf[js.Any])
  }
  
}

