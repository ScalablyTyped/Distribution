package typings.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.CommentTag, 'text'> */
trait CommentTag
  extends StObject
     with __ModelToObject[js.Any] {
  
  var param: js.UndefOr[String] = js.undefined
  
  var tag: String
  
  var text: ModelToObject[String] | String
}
object CommentTag {
  
  inline def apply(tag: String, text: ModelToObject[String] | String): CommentTag = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentTag]
  }
  
  extension [Self <: CommentTag](x: Self) {
    
    inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setText(value: ModelToObject[String] | String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "text", js.Array(value :_*))
  }
}
