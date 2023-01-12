package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.Comment, 'blockTags'>> */
trait Comment extends StObject {
  
  var blockTags: js.UndefOr[
    ToSerialized[js.Array[typings.typedoc.distLibModelsCommentsCommentMod.CommentTag]]
  ] = js.undefined
  
  var modifierTags: js.UndefOr[js.Array[String]] = js.undefined
  
  var summary: js.Array[CommentDisplayPart]
}
object Comment {
  
  inline def apply(summary: js.Array[CommentDisplayPart]): Comment = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    inline def setBlockTags(value: ToSerialized[js.Array[typings.typedoc.distLibModelsCommentsCommentMod.CommentTag]]): Self = StObject.set(x, "blockTags", value.asInstanceOf[js.Any])
    
    inline def setBlockTagsUndefined: Self = StObject.set(x, "blockTags", js.undefined)
    
    inline def setBlockTagsVarargs(value: typings.typedoc.distLibModelsCommentsCommentMod.CommentTag*): Self = StObject.set(x, "blockTags", js.Array(value*))
    
    inline def setModifierTags(value: js.Array[String]): Self = StObject.set(x, "modifierTags", value.asInstanceOf[js.Any])
    
    inline def setModifierTagsUndefined: Self = StObject.set(x, "modifierTags", js.undefined)
    
    inline def setModifierTagsVarargs(value: String*): Self = StObject.set(x, "modifierTags", js.Array(value*))
    
    inline def setSummary(value: js.Array[CommentDisplayPart]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryVarargs(value: CommentDisplayPart*): Self = StObject.set(x, "summary", js.Array(value*))
  }
}
