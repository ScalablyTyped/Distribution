package typings.symphonyApiClientNode.adminClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamMembers_ extends js.Object {
  
  var count: Double = js.native
  
  var limit: Double = js.native
  
  var members: js.Array[StreamMember] = js.native
  
  var skip: Double = js.native
}
object StreamMembers_ {
  
  @scala.inline
  def apply(count: Double, limit: Double, members: js.Array[StreamMember], skip: Double): StreamMembers_ = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamMembers_]
  }
  
  @scala.inline
  implicit class StreamMembers_Ops[Self <: StreamMembers_] (val x: Self) extends AnyVal {
    
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: StreamMember*): Self = this.set("members", js.Array(value :_*))
    
    @scala.inline
    def setMembers(value: js.Array[StreamMember]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
  }
}
