package typings.twilioChat.userdescriptorsMod

import typings.twilioChat.networkMod.Network
import typings.twilioChat.usersMod.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDescriptorsServices extends js.Object {
  
  var network: Network = js.native
  
  var users: Users = js.native
}
object UserDescriptorsServices {
  
  @scala.inline
  def apply(network: Network, users: Users): UserDescriptorsServices = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDescriptorsServices]
  }
  
  @scala.inline
  implicit class UserDescriptorsServicesOps[Self <: UserDescriptorsServices] (val x: Self) extends AnyVal {
    
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
    def setNetwork(value: Network): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsers(value: Users): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
