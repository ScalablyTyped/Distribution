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

