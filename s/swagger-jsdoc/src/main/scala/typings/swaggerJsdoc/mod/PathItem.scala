package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathItem
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  
  var delete: js.UndefOr[Operation] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var get: js.UndefOr[Operation] = js.undefined
  
  var head: js.UndefOr[Operation] = js.undefined
  
  var options: js.UndefOr[Operation] = js.undefined
  
  var parameters: js.UndefOr[Parameter | Reference] = js.undefined
  
  var patch: js.UndefOr[Operation] = js.undefined
  
  var post: js.UndefOr[Operation] = js.undefined
  
  var put: js.UndefOr[Operation] = js.undefined
  
  var servers: js.UndefOr[js.Array[Server]] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
  
  var trace: js.UndefOr[Operation] = js.undefined
}
object PathItem {
  
  inline def apply(): PathItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathItem] (val x: Self) extends AnyVal {
    
    inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    
    inline def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
    
    inline def setDelete(value: Operation): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGet(value: Operation): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setHead(value: Operation): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
    
    inline def setOptions(value: Operation): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setParameters(value: Parameter | Reference): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPatch(value: Operation): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    inline def setPost(value: Operation): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    inline def setPut(value: Operation): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
    
    inline def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
    
    inline def setServers(value: js.Array[Server]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
    
    inline def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
    
    inline def setServersVarargs(value: Server*): Self = StObject.set(x, "servers", js.Array(value*))
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setTrace(value: Operation): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    inline def setTraceUndefined: Self = StObject.set(x, "trace", js.undefined)
  }
}
