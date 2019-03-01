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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("firstName")(firstName)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isBetaAccount")(isBetaAccount)
    __obj.updateDynamic("isConfirmedPC")(isConfirmedPC)
    __obj.updateDynamic("lastName")(lastName)
    __obj.updateDynamic("safeCustomerId")(safeCustomerId)
    __obj.updateDynamic("signInName")(signInName)
    __obj.updateDynamic("tickets")(tickets)
    __obj.asInstanceOf[IUserIdentity]
  }
}

