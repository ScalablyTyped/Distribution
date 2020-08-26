package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.CommentTag> */
@js.native
trait PartialCommentTag extends js.Object {
  var param: js.UndefOr[String] = js.native
  var tag: js.UndefOr[String] = js.native
  var text: js.UndefOr[ModelToObject[String] | String] = js.native
}

object PartialCommentTag {
  @scala.inline
  def apply(): PartialCommentTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCommentTag]
  }
  @scala.inline
  implicit class PartialCommentTagOps[Self <: PartialCommentTag] (val x: Self) extends AnyVal {
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
    def setParam(value: String): Self = this.set("param", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParam: Self = this.set("param", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setTextVarargs(value: _ModelToObject[js.Any]*): Self = this.set("text", js.Array(value :_*))
    @scala.inline
    def setText(value: ModelToObject[String] | String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

