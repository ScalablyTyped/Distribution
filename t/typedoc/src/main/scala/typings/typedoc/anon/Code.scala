package typings.typedoc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  var code: Boolean = js.native
  var pre: Boolean = js.native
  var script: Boolean = js.native
  var style: Boolean = js.native
  var textarea: Boolean = js.native
}

object Code {
  @scala.inline
  def apply(code: Boolean, pre: Boolean, script: Boolean, style: Boolean, textarea: Boolean): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  @scala.inline
  implicit class CodeOps[Self <: Code] (val x: Self) extends AnyVal {
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
    def setCode(value: Boolean): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setPre(value: Boolean): Self = this.set("pre", value.asInstanceOf[js.Any])
    @scala.inline
    def setScript(value: Boolean): Self = this.set("script", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: Boolean): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextarea(value: Boolean): Self = this.set("textarea", value.asInstanceOf[js.Any])
  }
  
}

