package typings.symphonyApiClientNode.streamsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchRoomResponse extends js.Object {
  
  var count: Double = js.native
  
  var facetedMatchCount: js.Array[FacetedMatch] = js.native
  
  var limit: Double = js.native
  
  var query: Query = js.native
  
  var rooms: RoomInfo = js.native
  
  var skip: Double = js.native
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
  implicit class SearchRoomResponseOps[Self <: SearchRoomResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetedMatchCountVarargs(value: FacetedMatch*): Self = this.set("facetedMatchCount", js.Array(value :_*))
    
    @scala.inline
    def setFacetedMatchCount(value: js.Array[FacetedMatch]): Self = this.set("facetedMatchCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRooms(value: RoomInfo): Self = this.set("rooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
  }
}
