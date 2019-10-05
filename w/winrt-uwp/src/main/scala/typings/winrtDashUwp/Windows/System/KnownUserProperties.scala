package typings.winrtDashUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains basic information about a user. */
@JSGlobal("Windows.System.KnownUserProperties")
@js.native
abstract class KnownUserProperties () extends js.Object

/* static members */
@JSGlobal("Windows.System.KnownUserProperties")
@js.native
object KnownUserProperties extends js.Object {
  /** Gets the user's account name. */
  var accountName: String = js.native
  /** Gets the user's display name. */
  var displayName: String = js.native
  /** Gets the user's domain name. */
  var domainName: String = js.native
  /** Gets the user's first name. */
  var firstName: String = js.native
  /** Gets the user's guest host. */
  var guestHost: String = js.native
  /** Gets the user's last name. */
  var lastName: String = js.native
  /** Gets the user's principal name. */
  var principalName: String = js.native
  /** Gets the user's provider name. */
  var providerName: String = js.native
  /** Gets the user's session initiation protocol Uri. */
  var sessionInitiationProtocolUri: String = js.native
}

