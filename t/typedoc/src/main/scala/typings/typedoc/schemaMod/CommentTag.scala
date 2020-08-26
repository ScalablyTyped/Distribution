package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.CommentTag, 'text'> */
@js.native
trait CommentTag
  extends __ModelToObject[js.Any] {
  var param: js.UndefOr[String] = js.native
  var tag: String = js.native
  var text: ModelToObject[String] | String = js.native
}

object CommentTag {
  @scala.inline
  def apply(tag: String, text: ModelToObject[String] | String): CommentTag = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentTag]
  }
  @scala.inline
  implicit class CommentTagOps[Self <: CommentTag] (val x: Self) extends AnyVal {
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
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextVarargs(value: _ModelToObject[js.Any]*): Self = this.set("text", js.Array(value :_*))
    @scala.inline
    def setText(value: ModelToObject[String] | String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setParam(value: String): Self = this.set("param", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParam: Self = this.set("param", js.undefined)
  }
  
}

