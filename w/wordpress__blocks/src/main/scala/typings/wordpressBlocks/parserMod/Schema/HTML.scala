package typings.wordpressBlocks.parserMod.Schema

import typings.wordpressBlocks.parserMod.Source
import typings.wordpressBlocks.wordpressBlocksStrings.html
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTML
  extends Source[js.Any] {
  var multiline: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any
  ] = js.native
  var selector: js.UndefOr[String] = js.native
  var source: html = js.native
}

object HTML {
  @scala.inline
  def apply(source: html): HTML = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML]
  }
  @scala.inline
  implicit class HTMLOps[Self <: HTML] (val x: Self) extends AnyVal {
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
    def setSource(value: html): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiline(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any): Self = this.set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}

