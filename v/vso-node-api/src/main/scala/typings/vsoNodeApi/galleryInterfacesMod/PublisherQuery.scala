package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublisherQuery extends StObject {
  
  /**
    * Each filter is a unique query and will have matching set of publishers returned from the request. Each result will have the same index in the resulting array that the filter had in the incoming query.
    */
  var filters: js.Array[QueryFilter] = js.native
  
  /**
    * The Flags are used to deterine which set of information the caller would like returned for the matched publishers.
    */
  var flags: PublisherQueryFlags = js.native
}
object PublisherQuery {
  
  @scala.inline
  def apply(filters: js.Array[QueryFilter], flags: PublisherQueryFlags): PublisherQuery = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherQuery]
  }
  
  @scala.inline
  implicit class PublisherQueryMutableBuilder[Self <: PublisherQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Array[QueryFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: QueryFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: PublisherQueryFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
  }
}
