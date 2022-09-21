package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublisherQuery extends StObject {
  
  /**
    * Each filter is a unique query and will have matching set of publishers returned from the request. Each result will have the same index in the resulting array that the filter had in the incoming query.
    */
  var filters: js.Array[QueryFilter]
  
  /**
    * The Flags are used to deterine which set of information the caller would like returned for the matched publishers.
    */
  var flags: PublisherQueryFlags
}
object PublisherQuery {
  
  inline def apply(filters: js.Array[QueryFilter], flags: PublisherQueryFlags): PublisherQuery = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherQuery]
  }
  
  extension [Self <: PublisherQuery](x: Self) {
    
    inline def setFilters(value: js.Array[QueryFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: QueryFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setFlags(value: PublisherQueryFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
  }
}
