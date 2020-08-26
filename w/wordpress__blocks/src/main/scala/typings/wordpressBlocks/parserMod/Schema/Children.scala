package typings.wordpressBlocks.parserMod.Schema

import typings.wordpressBlocks.parserMod.Source
import typings.wordpressBlocks.wordpressBlocksStrings.children
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children
  extends Source[js.Any] {
  var selector: js.UndefOr[String] = js.native
  var source: children = js.native
}

object Children {
  @scala.inline
  def apply(source: children): Children = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
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
    def setSource(value: children): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}

