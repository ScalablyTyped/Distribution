package typings.webglExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OESTextureFloat extends js.Object {
  val __OES_texture_float: Unit = js.native
}

object OESTextureFloat {
  @scala.inline
  def apply(__OES_texture_float: Unit): OESTextureFloat = {
    val __obj = js.Dynamic.literal(__OES_texture_float = __OES_texture_float.asInstanceOf[js.Any])
    __obj.asInstanceOf[OESTextureFloat]
  }
  @scala.inline
  implicit class OESTextureFloatOps[Self <: OESTextureFloat] (val x: Self) extends AnyVal {
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
    def set__OES_texture_float(value: Unit): Self = this.set("__OES_texture_float", value.asInstanceOf[js.Any])
  }
  
}

