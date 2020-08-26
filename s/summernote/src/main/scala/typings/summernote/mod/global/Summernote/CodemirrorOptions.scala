package typings.summernote.mod.global.Summernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodemirrorOptions extends js.Object {
  var htmlNode: js.UndefOr[Boolean] = js.native
  var lineNumbers: js.UndefOr[Boolean] = js.native
  var mode: js.UndefOr[String] = js.native
  var theme: js.UndefOr[String] = js.native
}

object CodemirrorOptions {
  @scala.inline
  def apply(): CodemirrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodemirrorOptions]
  }
  @scala.inline
  implicit class CodemirrorOptionsOps[Self <: CodemirrorOptions] (val x: Self) extends AnyVal {
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
    def setHtmlNode(value: Boolean): Self = this.set("htmlNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlNode: Self = this.set("htmlNode", js.undefined)
    @scala.inline
    def setLineNumbers(value: Boolean): Self = this.set("lineNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineNumbers: Self = this.set("lineNumbers", js.undefined)
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

