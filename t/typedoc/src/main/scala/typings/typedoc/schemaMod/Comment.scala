package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.Comment, 'shortText' | 'text' | 'returns' | 'tags'>> */
trait Comment
  extends StObject
     with __ModelToObject[js.Any] {
  
  var returns: js.UndefOr[ModelToObject[js.UndefOr[String]] | String] = js.undefined
  
  var shortText: js.UndefOr[ModelToObject[String] | String] = js.undefined
  
  var tags: js.UndefOr[
    ModelToObject[js.UndefOr[js.Array[typings.typedoc.tagMod.CommentTag]]] | js.Array[typings.typedoc.tagMod.CommentTag]
  ] = js.undefined
  
  var text: js.UndefOr[ModelToObject[String] | String] = js.undefined
}
object Comment {
  
  @scala.inline
  def apply(): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
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
    def setTags(
      value: ModelToObject[js.UndefOr[js.Array[typings.typedoc.tagMod.CommentTag]]] | js.Array[typings.typedoc.tagMod.CommentTag]
    ): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: (typings.typedoc.tagMod.CommentTag | _ModelToObject[js.Any])*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setText(value: ModelToObject[String] | String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "text", js.Array(value :_*))
  }
}
