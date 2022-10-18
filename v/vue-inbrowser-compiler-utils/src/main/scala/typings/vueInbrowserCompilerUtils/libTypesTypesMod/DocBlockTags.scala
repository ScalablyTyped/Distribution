package typings.vueInbrowserCompilerUtils.libTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocBlockTags extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[js.Array[ParamTag | Tag]] = js.undefined
}
object DocBlockTags {
  
  inline def apply(): DocBlockTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocBlockTags]
  }
  
  extension [Self <: DocBlockTags](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTags(value: js.Array[ParamTag | Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: (ParamTag | Tag)*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
