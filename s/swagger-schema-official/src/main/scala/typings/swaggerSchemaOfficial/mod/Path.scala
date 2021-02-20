package typings.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path extends StObject {
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.native
  
  var delete: js.UndefOr[Operation] = js.native
  
  var get: js.UndefOr[Operation] = js.native
  
  var head: js.UndefOr[Operation] = js.native
  
  var options: js.UndefOr[Operation] = js.native
  
  var parameters: js.UndefOr[js.Array[Parameter | Reference]] = js.native
  
  var patch: js.UndefOr[Operation] = js.native
  
  var post: js.UndefOr[Operation] = js.native
  
  var put: js.UndefOr[Operation] = js.native
}
object Path {
  
  @scala.inline
  def apply(): Path = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
    
    @scala.inline
    def setDelete(value: Operation): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    @scala.inline
    def setGet(value: Operation): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setHead(value: Operation): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
    
    @scala.inline
    def setOptions(value: Operation): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setParameters(value: js.Array[Parameter | Reference]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: (Parameter | Reference)*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setPatch(value: Operation): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    @scala.inline
    def setPost(value: Operation): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    @scala.inline
    def setPut(value: Operation): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPutUndefined: Self = StObject.set(x, "put", js.undefined)
  }
}
