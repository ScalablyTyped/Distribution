package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import typings.typedoc.tagMod.CommentTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.Comment> */
@js.native
trait PartialComment extends js.Object {
  
  var returns: js.UndefOr[ModelToObject[js.UndefOr[String]] | String] = js.native
  
  var shortText: js.UndefOr[ModelToObject[String] | String] = js.native
  
  var tags: js.UndefOr[ModelToObject[js.UndefOr[js.Array[CommentTag]]] | js.Array[CommentTag]] = js.native
  
  var text: js.UndefOr[ModelToObject[String] | String] = js.native
}
object PartialComment {
  
  @scala.inline
  def apply(): PartialComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialComment]
  }
  
  @scala.inline
  implicit class PartialCommentOps[Self <: PartialComment] (val x: Self) extends AnyVal {
    
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
    def setReturnsVarargs(value: _ModelToObject[js.Any]*): Self = this.set("returns", js.Array(value :_*))
    
    @scala.inline
    def setReturns(value: ModelToObject[js.UndefOr[String]] | String): Self = this.set("returns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturns: Self = this.set("returns", js.undefined)
    
    @scala.inline
    def setShortTextVarargs(value: _ModelToObject[js.Any]*): Self = this.set("shortText", js.Array(value :_*))
    
    @scala.inline
    def setShortText(value: ModelToObject[String] | String): Self = this.set("shortText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortText: Self = this.set("shortText", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: (CommentTag | _ModelToObject[js.Any])*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: ModelToObject[js.UndefOr[js.Array[CommentTag]]] | js.Array[CommentTag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: _ModelToObject[js.Any]*): Self = this.set("text", js.Array(value :_*))
    
    @scala.inline
    def setText(value: ModelToObject[String] | String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
