package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRoomResponse extends StObject {
  
  var count: Double
  
  var facetedMatchCount: js.Array[FacetedMatch]
  
  var limit: Double
  
  var query: Query
  
  var rooms: RoomInfo
  
  var skip: Double
}
object SearchRoomResponse {
  
  @scala.inline
  def apply(
    count: Double,
    facetedMatchCount: js.Array[FacetedMatch],
    limit: Double,
    query: Query,
    rooms: RoomInfo,
    skip: Double
  ): SearchRoomResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], facetedMatchCount = facetedMatchCount.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], rooms = rooms.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchRoomResponse]
  }
  
  @scala.inline
  implicit class SearchRoomResponseMutableBuilder[Self <: SearchRoomResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetedMatchCount(value: js.Array[FacetedMatch]): Self = StObject.set(x, "facetedMatchCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetedMatchCountVarargs(value: FacetedMatch*): Self = StObject.set(x, "facetedMatchCount", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRooms(value: RoomInfo): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
  }
}
