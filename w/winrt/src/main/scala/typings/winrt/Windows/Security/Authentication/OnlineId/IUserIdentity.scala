package typings.winrt.Windows.Security.Authentication.OnlineId

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUserIdentity extends js.Object {
  
  var firstName: String = js.native
  
  var id: String = js.native
  
  var isBetaAccount: Boolean = js.native
  
  var isConfirmedPC: Boolean = js.native
  
  var lastName: String = js.native
  
  var safeCustomerId: String = js.native
  
  var signInName: String = js.native
  
  var tickets: IVectorView[OnlineIdServiceTicket] = js.native
}
object IUserIdentity {
  
  @scala.inline
  def apply(
    firstName: String,
    id: String,
    isBetaAccount: Boolean,
    isConfirmedPC: Boolean,
    lastName: String,
    safeCustomerId: String,
    signInName: String,
    tickets: IVectorView[OnlineIdServiceTicket]
  ): IUserIdentity = {
    val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBetaAccount = isBetaAccount.asInstanceOf[js.Any], isConfirmedPC = isConfirmedPC.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], safeCustomerId = safeCustomerId.asInstanceOf[js.Any], signInName = signInName.asInstanceOf[js.Any], tickets = tickets.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserIdentity]
  }
  
  @scala.inline
  implicit class IUserIdentityOps[Self <: IUserIdentity] (val x: Self) extends AnyVal {
    
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
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBetaAccount(value: Boolean): Self = this.set("isBetaAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsConfirmedPC(value: Boolean): Self = this.set("isConfirmedPC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeCustomerId(value: String): Self = this.set("safeCustomerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignInName(value: String): Self = this.set("signInName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickets(value: IVectorView[OnlineIdServiceTicket]): Self = this.set("tickets", value.asInstanceOf[js.Any])
  }
}
