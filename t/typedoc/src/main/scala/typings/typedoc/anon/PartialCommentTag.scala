package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.CommentTag> */
trait PartialCommentTag extends StObject {
  
  var param: js.UndefOr[String] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[ModelToObject[String] | String] = js.undefined
}
object PartialCommentTag {
  
  inline def apply(): PartialCommentTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCommentTag]
  }
  
  extension [Self <: PartialCommentTag](x: Self) {
    
    inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setText(value: ModelToObject[String] | String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "text", js.Array(value :_*))
  }
}
