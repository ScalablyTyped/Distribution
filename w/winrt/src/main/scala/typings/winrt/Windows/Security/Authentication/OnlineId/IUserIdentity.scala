package typings.winrt.Windows.Security.Authentication.OnlineId

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserIdentity extends js.Object {
  var firstName: String
  var id: String
  var isBetaAccount: Boolean
  var isConfirmedPC: Boolean
  var lastName: String
  var safeCustomerId: String
  var signInName: String
  var tickets: IVectorView[OnlineIdServiceTicket]
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
}

