package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to metadata about a domain to which the current system is a member. */
@js.native
trait IPlayReadyDomain extends js.Object {
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

object IPlayReadyDomain {
  @scala.inline
  def apply(accountId: String, domainJoinUrl: Uri, friendlyName: String, revision: Double, serviceId: String): IPlayReadyDomain = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], domainJoinUrl = domainJoinUrl.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayReadyDomain]
  }
  @scala.inline
  implicit class IPlayReadyDomainOps[Self <: IPlayReadyDomain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainJoinUrl(value: Uri): Self = this.set("domainJoinUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
  }
  
}

