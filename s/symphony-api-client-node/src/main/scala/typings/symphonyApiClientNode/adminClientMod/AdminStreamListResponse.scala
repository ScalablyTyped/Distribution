package typings.symphonyApiClientNode.adminClientMod

import typings.symphonyApiClientNode.anon.StreamTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminStreamListResponse extends js.Object {
  
  var count: Double = js.native
  
  var filter: StreamTypes = js.native
  
  var limit: Double = js.native
  
  var skip: Double = js.native
  
  var streams: js.Array[AdminStreamInfo] = js.native
}
object AdminStreamListResponse {
  
  @scala.inline
  def apply(
    count: Double,
    filter: StreamTypes,
    limit: Double,
    skip: Double,
    streams: js.Array[AdminStreamInfo]
  ): AdminStreamListResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminStreamListResponse]
  }
  
  @scala.inline
  implicit class AdminStreamListResponseOps[Self <: AdminStreamListResponse] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: StreamTypes): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamsVarargs(value: AdminStreamInfo*): Self = this.set("streams", js.Array(value :_*))
    
    @scala.inline
    def setStreams(value: js.Array[AdminStreamInfo]): Self = this.set("streams", value.asInstanceOf[js.Any])
  }
}
