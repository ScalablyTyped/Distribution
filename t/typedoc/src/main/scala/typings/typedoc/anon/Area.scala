package typings.typedoc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Area extends js.Object {
  var area: Boolean = js.native
  var base: Boolean = js.native
  var br: Boolean = js.native
  var col: Boolean = js.native
  var command: Boolean = js.native
  var embed: Boolean = js.native
  var hr: Boolean = js.native
  var img: Boolean = js.native
  var input: Boolean = js.native
  var link: Boolean = js.native
  var meta: Boolean = js.native
  var param: Boolean = js.native
  var source: Boolean = js.native
  var wbr: Boolean = js.native
}

object Area {
  @scala.inline
  def apply(
    area: Boolean,
    base: Boolean,
    br: Boolean,
    col: Boolean,
    command: Boolean,
    embed: Boolean,
    hr: Boolean,
    img: Boolean,
    input: Boolean,
    link: Boolean,
    meta: Boolean,
    param: Boolean,
    source: Boolean,
    wbr: Boolean
  ): Area = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], wbr = wbr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Area]
  }
  @scala.inline
  implicit class AreaOps[Self <: Area] (val x: Self) extends AnyVal {
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
    def setArea(value: Boolean): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase(value: Boolean): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setBr(value: Boolean): Self = this.set("br", value.asInstanceOf[js.Any])
    @scala.inline
    def setCol(value: Boolean): Self = this.set("col", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommand(value: Boolean): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmbed(value: Boolean): Self = this.set("embed", value.asInstanceOf[js.Any])
    @scala.inline
    def setHr(value: Boolean): Self = this.set("hr", value.asInstanceOf[js.Any])
    @scala.inline
    def setImg(value: Boolean): Self = this.set("img", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: Boolean): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: Boolean): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: Boolean): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setParam(value: Boolean): Self = this.set("param", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: Boolean): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setWbr(value: Boolean): Self = this.set("wbr", value.asInstanceOf[js.Any])
  }
  
}

