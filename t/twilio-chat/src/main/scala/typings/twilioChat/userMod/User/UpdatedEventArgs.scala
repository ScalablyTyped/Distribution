package typings.twilioChat.userMod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatedEventArgs extends js.Object {
  
  var updateReasons: js.Array[UpdateReason] = js.native
  
  var user: typings.twilioChat.userMod.User = js.native
}
object UpdatedEventArgs {
  
  @scala.inline
  def apply(updateReasons: js.Array[UpdateReason], user: typings.twilioChat.userMod.User): UpdatedEventArgs = {
    val __obj = js.Dynamic.literal(updateReasons = updateReasons.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatedEventArgs]
  }
  
  @scala.inline
  implicit class UpdatedEventArgsOps[Self <: UpdatedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setUpdateReasonsVarargs(value: UpdateReason*): Self = this.set("updateReasons", js.Array(value :_*))
    
    @scala.inline
    def setUpdateReasons(value: js.Array[UpdateReason]): Self = this.set("updateReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: typings.twilioChat.userMod.User): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
