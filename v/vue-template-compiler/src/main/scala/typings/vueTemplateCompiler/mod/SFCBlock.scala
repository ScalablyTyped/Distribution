package typings.vueTemplateCompiler.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SFCBlock extends js.Object {
  var attrs: Record[String, String] = js.native
  var content: String = js.native
  var end: js.UndefOr[Double] = js.native
  var lang: js.UndefOr[String] = js.native
  var module: js.UndefOr[String | Boolean] = js.native
  var scoped: js.UndefOr[Boolean] = js.native
  var src: js.UndefOr[String] = js.native
  var start: js.UndefOr[Double] = js.native
  var `type`: String = js.native
}

object SFCBlock {
  @scala.inline
  def apply(attrs: Record[String, String], content: String, `type`: String): SFCBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCBlock]
  }
  @scala.inline
  implicit class SFCBlockOps[Self <: SFCBlock] (val x: Self) extends AnyVal {
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
    def setAttrs(value: Record[String, String]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setModule(value: String | Boolean): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    @scala.inline
    def setScoped(value: Boolean): Self = this.set("scoped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoped: Self = this.set("scoped", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

