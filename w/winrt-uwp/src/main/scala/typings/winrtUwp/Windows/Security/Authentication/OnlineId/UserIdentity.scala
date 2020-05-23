package typings.winrtUwp.Windows.Security.Authentication.OnlineId

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the ID, tickets, and other information associated with a user. */
trait UserIdentity extends js.Object {
  /** Contains the first name of the user. This value is available only to Microsoft application partners. */
  var firstName: String
  /** Gets the user's unique Microsoft account identifier. This value is available only to Microsoft application partners. */
  var id: String
  /** Indicates if the user is part of a beta program. This value is available only to Microsoft application partners. */
  var isBetaAccount: Boolean
  /** Indicates if the user is on a PC that they have confirmed as their PC. This value is available only to Microsoft application partners. */
  var isConfirmedPC: Boolean
  /** Contains the user's last name. This value is available only to Microsoft application partners. */
  var lastName: String
  /** Gets an obfuscated customer ID specific to the calling application. This ID allows your application to identify the user across sessions but cannot be used to share data between separate applications since each application will receive a distinct SafeCustomerId value for the same Microsoft account. */
  var safeCustomerId: String
  /** The sign in name of the user. This value is available only to Microsoft application partners. */
  var signInName: String
  /** Contains an array of tickets that identify the user. If your app uses the JWT policy, only one ticket is returned. This value is only available to Microsoft application partners. */
  var tickets: IVectorView[OnlineIdServiceTicket]
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
}

