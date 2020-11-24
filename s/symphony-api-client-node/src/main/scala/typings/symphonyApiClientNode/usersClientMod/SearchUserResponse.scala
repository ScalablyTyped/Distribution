package typings.symphonyApiClientNode.usersClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchUserResponse extends UsersList {
  
  var count: Double = js.native
  
  var filters: UserFilter = js.native
  
  var limit: Double = js.native
  
  var query: String = js.native
  
  var skip: Double = js.native
}
object SearchUserResponse {
  
  @scala.inline
  def apply(
    count: Double,
    filters: UserFilter,
    limit: Double,
    query: String,
    skip: Double,
    users: js.Array[User]
  ): SearchUserResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUserResponse]
  }
  
  @scala.inline
  implicit class SearchUserResponseOps[Self <: SearchUserResponse] (val x: Self) extends AnyVal {
    
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
    def setFilters(value: UserFilter): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
  }
}
