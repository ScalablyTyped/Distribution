package typings.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLUniformLocation extends js.Object {
  val __WebGLUniformLocation: Unit = js.native
}

object WebGLUniformLocation {
  @scala.inline
  def apply(__WebGLUniformLocation: Unit): WebGLUniformLocation = {
    val __obj = js.Dynamic.literal(__WebGLUniformLocation = __WebGLUniformLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLUniformLocation]
  }
  @scala.inline
  implicit class WebGLUniformLocationOps[Self <: WebGLUniformLocation] (val x: Self) extends AnyVal {
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
    def set__WebGLUniformLocation(value: Unit): Self = this.set("__WebGLUniformLocation", value.asInstanceOf[js.Any])
  }
  
}

