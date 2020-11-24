package typings.twilioChat.memberMod.Member

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatedEventArgs extends js.Object {
  
  var member: typings.twilioChat.memberMod.Member = js.native
  
  var updateReasons: js.Array[UpdateReason] = js.native
}
object UpdatedEventArgs {
  
  @scala.inline
  def apply(member: typings.twilioChat.memberMod.Member, updateReasons: js.Array[UpdateReason]): UpdatedEventArgs = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any], updateReasons = updateReasons.asInstanceOf[js.Any])
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
    def setMember(value: typings.twilioChat.memberMod.Member): Self = this.set("member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateReasonsVarargs(value: UpdateReason*): Self = this.set("updateReasons", js.Array(value :_*))
    
    @scala.inline
    def setUpdateReasons(value: js.Array[UpdateReason]): Self = this.set("updateReasons", value.asInstanceOf[js.Any])
  }
}
