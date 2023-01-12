package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  /**
    * The query filter consists of key and string data.
    */
  var filter: js.UndefOr[Any] = js.undefined
  
  /**
    * The resource interface specified as a filter for the resource.
    */
  var resourceInterface: js.UndefOr[ResourceInterface | Null] = js.undefined
  
  /**
    * The resource type specified as a filter for the resource.
    */
  var resourceType: js.UndefOr[ResourceType | Null] = js.undefined
}
object Query {
  
  @JSImport("tizen-common-web", "Query")
  @js.native
  val ^ : Query = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setResourceInterface(value: ResourceInterface): Self = StObject.set(x, "resourceInterface", value.asInstanceOf[js.Any])
    
    inline def setResourceInterfaceNull: Self = StObject.set(x, "resourceInterface", null)
    
    inline def setResourceInterfaceUndefined: Self = StObject.set(x, "resourceInterface", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeNull: Self = StObject.set(x, "resourceType", null)
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
