package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import typings.typedoc.tagMod.CommentTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.Comment> */
@js.native
trait PartialComment extends StObject {
  
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
  implicit class PartialCommentMutableBuilder[Self <: PartialComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturns(value: ModelToObject[js.UndefOr[String]] | String): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
    
    @scala.inline
    def setReturnsVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "returns", js.Array(value :_*))
    
    @scala.inline
    def setShortText(value: ModelToObject[String] | String): Self = StObject.set(x, "shortText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortTextUndefined: Self = StObject.set(x, "shortText", js.undefined)
    
    @scala.inline
    def setShortTextVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "shortText", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: ModelToObject[js.UndefOr[js.Array[CommentTag]]] | js.Array[CommentTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: (CommentTag | _ModelToObject[js.Any])*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setText(value: ModelToObject[String] | String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "text", js.Array(value :_*))
  }
}
