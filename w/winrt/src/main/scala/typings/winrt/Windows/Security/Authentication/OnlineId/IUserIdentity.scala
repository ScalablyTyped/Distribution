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
    val __obj = js.Dynamic.literal(firstName = firstName, id = id, isBetaAccount = isBetaAccount, isConfirmedPC = isConfirmedPC, lastName = lastName, safeCustomerId = safeCustomerId, signInName = signInName, tickets = tickets)
  
    __obj.asInstanceOf[IUserIdentity]
  }
}

