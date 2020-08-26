package typings.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebGL 1 Type Branding
@js.native
trait WebGLObject extends js.Object {
  val __WebGLObject: Unit = js.native
}

object WebGLObject {
  @scala.inline
  def apply(__WebGLObject: Unit): WebGLObject = {
    val __obj = js.Dynamic.literal(__WebGLObject = __WebGLObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLObject]
  }
  @scala.inline
  implicit class WebGLObjectOps[Self <: WebGLObject] (val x: Self) extends AnyVal {
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
    def set__WebGLObject(value: Unit): Self = this.set("__WebGLObject", value.asInstanceOf[js.Any])
  }
  
}

