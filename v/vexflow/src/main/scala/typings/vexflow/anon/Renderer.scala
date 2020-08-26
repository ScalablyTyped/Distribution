package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  var font: Face = js.native
  var renderer: Backend = js.native
  var stave: Space = js.native
}

object Renderer {
  @scala.inline
  def apply(font: Face, renderer: Backend, stave: Space): Renderer = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], stave = stave.asInstanceOf[js.Any])
    __obj.asInstanceOf[Renderer]
  }
  @scala.inline
  implicit class RendererOps[Self <: Renderer] (val x: Self) extends AnyVal {
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
    def setFont(value: Face): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderer(value: Backend): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def setStave(value: Space): Self = this.set("stave", value.asInstanceOf[js.Any])
  }
  
}

