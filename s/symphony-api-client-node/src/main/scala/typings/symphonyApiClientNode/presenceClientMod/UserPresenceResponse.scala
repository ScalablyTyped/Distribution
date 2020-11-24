package typings.symphonyApiClientNode.presenceClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPresenceResponse extends js.Object {
  
  var category: String = js.native
  
  var timestamp: Double = js.native
  
  var userId: Double = js.native
}
object UserPresenceResponse {
  
  @scala.inline
  def apply(category: String, timestamp: Double, userId: Double): UserPresenceResponse = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPresenceResponse]
  }
  
  @scala.inline
  implicit class UserPresenceResponseOps[Self <: UserPresenceResponse] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: Double): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
}
