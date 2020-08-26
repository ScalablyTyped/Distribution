package typings.winrtUwp.Windows.Security.Authentication.OnlineId

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the ID, tickets, and other information associated with a user. */
@js.native
trait UserIdentity extends js.Object {
  /** Contains the first name of the user. This value is available only to Microsoft application partners. */
  var firstName: String = js.native
  /** Gets the user's unique Microsoft account identifier. This value is available only to Microsoft application partners. */
  var id: String = js.native
  /** Indicates if the user is part of a beta program. This value is available only to Microsoft application partners. */
  var isBetaAccount: Boolean = js.native
  /** Indicates if the user is on a PC that they have confirmed as their PC. This value is available only to Microsoft application partners. */
  var isConfirmedPC: Boolean = js.native
  /** Contains the user's last name. This value is available only to Microsoft application partners. */
  var lastName: String = js.native
  /** Gets an obfuscated customer ID specific to the calling application. This ID allows your application to identify the user across sessions but cannot be used to share data between separate applications since each application will receive a distinct SafeCustomerId value for the same Microsoft account. */
  var safeCustomerId: String = js.native
  /** The sign in name of the user. This value is available only to Microsoft application partners. */
  var signInName: String = js.native
  /** Contains an array of tickets that identify the user. If your app uses the JWT policy, only one ticket is returned. This value is only available to Microsoft application partners. */
  var tickets: IVectorView[OnlineIdServiceTicket] = js.native
}

object UserIdentity {
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
  ): UserIdentity = {
    val __obj = js.Dynamic.literal(firstName = firstName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBetaAccount = isBetaAccount.asInstanceOf[js.Any], isConfirmedPC = isConfirmedPC.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], safeCustomerId = safeCustomerId.asInstanceOf[js.Any], signInName = signInName.asInstanceOf[js.Any], tickets = tickets.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentity]
  }
  @scala.inline
  implicit class UserIdentityOps[Self <: UserIdentity] (val x: Self) extends AnyVal {
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

