package typings.terminalKit.anon

import typings.terminalKit.screenBufferHDMod.IsBlending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blending extends js.Object {
  var blending: IsBlending = js.native
}

object Blending {
  @scala.inline
  def apply(blending: IsBlending): Blending = {
    val __obj = js.Dynamic.literal(blending = blending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blending]
  }
  @scala.inline
  implicit class BlendingOps[Self <: Blending] (val x: Self) extends AnyVal {
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
    def setBlending(value: IsBlending): Self = this.set("blending", value.asInstanceOf[js.Any])
  }
  
}

