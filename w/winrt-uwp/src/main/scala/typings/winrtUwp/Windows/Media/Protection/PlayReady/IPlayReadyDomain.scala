package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to metadata about a domain to which the current system is a member. */
trait IPlayReadyDomain extends js.Object {
  /** Gets the current domain account identifier property. */
  var accountId: String
  /** Gets the URL used to join the domain. */
  var domainJoinUrl: Uri
  /** Gets the current domain friendly name. */
  var friendlyName: String
  /** Gets the current domain revision number. */
  var revision: Double
  /** Gets the current domain service identifier property. */
  var serviceId: String
}

object IPlayReadyDomain {
  @scala.inline
  def apply(accountId: String, domainJoinUrl: Uri, friendlyName: String, revision: Double, serviceId: String): IPlayReadyDomain = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], domainJoinUrl = domainJoinUrl.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayReadyDomain]
  }
}

