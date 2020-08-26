package typings.terminalKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Misc extends js.Object {
  var attr: Double = js.native
  var misc: js.Any = js.native
  var offset: Double = js.native
  var text: String = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object Misc {
  @scala.inline
  def apply(attr: Double, misc: js.Any, offset: Double, text: String, x: Double, y: Double): Misc = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], misc = misc.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Misc]
  }
  @scala.inline
  implicit class MiscOps[Self <: Misc] (val x: Self) extends AnyVal {
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
    def setAttr(value: Double): Self = this.set("attr", value.asInstanceOf[js.Any])
    @scala.inline
    def setMisc(value: js.Any): Self = this.set("misc", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

