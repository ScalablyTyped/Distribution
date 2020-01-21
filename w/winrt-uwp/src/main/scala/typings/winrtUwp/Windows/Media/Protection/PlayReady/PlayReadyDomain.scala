package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to metadata about a domain to which the current system is a member. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyDomain")
@js.native
abstract class PlayReadyDomain () extends js.Object {
  /** Gets the current domain account identifier property. */
  var accountId: String = js.native
  /** Gets the URL used to join the domain. */
  var domainJoinUrl: Uri = js.native
  /** Gets the current domain friendly name. */
  var friendlyName: String = js.native
  /** Gets the current domain revision number. */
  var revision: Double = js.native
  /** Gets the current domain service identifier property. */
  var serviceId: String = js.native
}

