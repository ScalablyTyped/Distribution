package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to metadata about a domain to which the current system is a member. */

trait IPlayReadyDomain extends js.Object {
  /** Gets the current domain account identifier property. */
  var accountId: java.lang.String
  /** Gets the URL used to join the domain. */
  var domainJoinUrl: winrtDashUwpLib.WindowsNs.FoundationNs.Uri
  /** Gets the current domain friendly name. */
  var friendlyName: java.lang.String
  /** Gets the current domain revision number. */
  var revision: scala.Double
  /** Gets the current domain service identifier property. */
  var serviceId: java.lang.String
}

