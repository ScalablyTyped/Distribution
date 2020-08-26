package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentRange extends TextRange {
  var hasTrailingNewLine: js.UndefOr[Boolean] = js.native
  var kind: CommentKind = js.native
}

object CommentRange {
  @scala.inline
  def apply(end: Double, kind: CommentKind, pos: Double): CommentRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentRange]
  }
  @scala.inline
  implicit class CommentRangeOps[Self <: CommentRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: CommentKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasTrailingNewLine(value: Boolean): Self = this.set("hasTrailingNewLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasTrailingNewLine: Self = this.set("hasTrailingNewLine", js.undefined)
  }
  
}

