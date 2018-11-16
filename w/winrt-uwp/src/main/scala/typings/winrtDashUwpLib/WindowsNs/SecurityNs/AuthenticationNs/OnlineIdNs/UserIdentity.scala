package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the ID, tickets, and other information associated with a user. */
@JSGlobal("Windows.Security.Authentication.OnlineId.UserIdentity")
@js.native
abstract class UserIdentity () extends js.Object {
  /** Contains the first name of the user. This value is available only to Microsoft application partners. */
  var firstName: java.lang.String = js.native
  /** Gets the user's unique Microsoft account identifier. This value is available only to Microsoft application partners. */
  var id: java.lang.String = js.native
  /** Indicates if the user is part of a beta program. This value is available only to Microsoft application partners. */
  var isBetaAccount: scala.Boolean = js.native
  /** Indicates if the user is on a PC that they have confirmed as their PC. This value is available only to Microsoft application partners. */
  var isConfirmedPC: scala.Boolean = js.native
  /** Contains the user's last name. This value is available only to Microsoft application partners. */
  var lastName: java.lang.String = js.native
  /** Gets an obfuscated customer ID specific to the calling application. This ID allows your application to identify the user across sessions but cannot be used to share data between separate applications since each application will receive a distinct SafeCustomerId value for the same Microsoft account. */
  var safeCustomerId: java.lang.String = js.native
  /** The sign in name of the user. This value is available only to Microsoft application partners. */
  var signInName: java.lang.String = js.native
  /** Contains an array of tickets that identify the user. If your app uses the JWT policy, only one ticket is returned. This value is only available to Microsoft application partners. */
  var tickets: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[OnlineIdServiceTicket] = js.native
}

