package typings.typedoc.schemaMod

import typings.typedoc.typedocStrings.`@$LeftcurlybracketstringRightcurlybracket`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.CommentTag, 'tag' | 'name'> */
trait CommentTag
  extends StObject
     with __ModelToObject[Any] {
  
  var content: js.Array[CommentDisplayPart]
  
  var name: ToSerialized[js.UndefOr[String]]
  
  var tag: ToSerialized[`@$LeftcurlybracketstringRightcurlybracket`]
}
object CommentTag {
  
  inline def apply(
    content: js.Array[CommentDisplayPart],
    tag: ToSerialized[`@$LeftcurlybracketstringRightcurlybracket`]
  ): CommentTag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentTag]
  }
  
  extension [Self <: CommentTag](x: Self) {
    
    inline def setContent(value: js.Array[CommentDisplayPart]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentVarargs(value: CommentDisplayPart*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setName(value: ToSerialized[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setTag(value: ToSerialized[`@$LeftcurlybracketstringRightcurlybracket`]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagVarargs(value: _ModelToObject[Any]*): Self = StObject.set(x, "tag", js.Array(value*))
  }
}
