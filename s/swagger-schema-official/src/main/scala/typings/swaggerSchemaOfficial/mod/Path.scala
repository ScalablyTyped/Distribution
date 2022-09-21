package typings.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path extends StObject {
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  
  var delete: js.UndefOr[Operation] = js.undefined
  
  var get: js.UndefOr[Operation] = js.undefined
  
  var head: js.UndefOr[Operation] = js.undefined
  
  var options: js.UndefOr[Operation] = js.undefined
  
  var parameters: js.UndefOr[js.Array[Parameter | Reference]] = js.undefined
  
  var patch: js.UndefOr[Operation] = js.undefined
  
  var post: js.UndefOr[Operation] = js.undefined
  
  var put: js.UndefOr[Operation] = js.undefined
}
object Path {
  
  inline def apply(): Path = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Path]
  }
  
  extension [Self <: Path](x: Self) {
    
    inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    
    inline def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
    
    inline def setDelete(value: Operation): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setGet(value: Operation): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setHead(value: Operation): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
    
    inline def setOptions(value: Operation): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setParameters(value: js.Array[Parameter | Reference]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: (Parameter | Reference)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setPatch(value: Operation): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    inline def setPost(value: Operation): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    inline def setPut(value: Operation): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
    
    inline def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
  }
}
