package typings.twilioChat.memberMod

import typings.twilioChat.memberMod.Member.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberDescriptor extends js.Object {
  
  var attributes: js.UndefOr[js.Object] = js.native
  
  var dateCreated: js.Any = js.native
  
  var dateUpdated: js.Any = js.native
  
  var identity: String = js.native
  
  var lastConsumedMessageIndex: Double = js.native
  
  var lastConsumptionTimestamp: Double = js.native
  
  var roleSid: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[Type] = js.native
  
  var userInfo: String = js.native
}
object MemberDescriptor {
  
  @scala.inline
  def apply(
    dateCreated: js.Any,
    dateUpdated: js.Any,
    identity: String,
    lastConsumedMessageIndex: Double,
    lastConsumptionTimestamp: Double,
    userInfo: String
  ): MemberDescriptor = {
    val __obj = js.Dynamic.literal(dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], lastConsumedMessageIndex = lastConsumedMessageIndex.asInstanceOf[js.Any], lastConsumptionTimestamp = lastConsumptionTimestamp.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberDescriptor]
  }
  
  @scala.inline
  implicit class MemberDescriptorOps[Self <: MemberDescriptor] (val x: Self) extends AnyVal {
    
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
    def setDateCreated(value: js.Any): Self = this.set("dateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUpdated(value: js.Any): Self = this.set("dateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: String): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastConsumedMessageIndex(value: Double): Self = this.set("lastConsumedMessageIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastConsumptionTimestamp(value: Double): Self = this.set("lastConsumptionTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInfo(value: String): Self = this.set("userInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: js.Object): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setRoleSid(value: String): Self = this.set("roleSid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleSid: Self = this.set("roleSid", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
