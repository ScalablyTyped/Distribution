package typings.typescript.mod

import typings.typescript.typescriptNumbers.`-1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SynthesizedComment extends CommentRange {
  @JSName("end")
  var end_SynthesizedComment: `-1` = js.native
  @JSName("pos")
  var pos_SynthesizedComment: `-1` = js.native
  var text: java.lang.String = js.native
}

object SynthesizedComment {
  @scala.inline
  def apply(end: `-1`, kind: CommentKind, pos: `-1`, text: java.lang.String): SynthesizedComment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizedComment]
  }
  @scala.inline
  implicit class SynthesizedCommentOps[Self <: SynthesizedComment] (val x: Self) extends AnyVal {
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
    def setEnd(value: `-1`): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: `-1`): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: java.lang.String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

