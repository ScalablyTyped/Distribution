package typings
package winrtLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserIdentity extends js.Object {
  var firstName: java.lang.String
  var id: java.lang.String
  var isBetaAccount: scala.Boolean
  var isConfirmedPC: scala.Boolean
  var lastName: java.lang.String
  var safeCustomerId: java.lang.String
  var signInName: java.lang.String
  var tickets: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[OnlineIdServiceTicket]
}

object IUserIdentity {
  @scala.inline
  def apply(
    firstName: java.lang.String,
    id: java.lang.String,
    isBetaAccount: scala.Boolean,
    isConfirmedPC: scala.Boolean,
    lastName: java.lang.String,
    safeCustomerId: java.lang.String,
    signInName: java.lang.String,
    tickets: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[OnlineIdServiceTicket]
  ): IUserIdentity = {
    val __obj = js.Dynamic.literal(firstName = firstName, id = id, isBetaAccount = isBetaAccount, isConfirmedPC = isConfirmedPC, lastName = lastName, safeCustomerId = safeCustomerId, signInName = signInName, tickets = tickets)
  
    __obj.asInstanceOf[IUserIdentity]
  }
}

