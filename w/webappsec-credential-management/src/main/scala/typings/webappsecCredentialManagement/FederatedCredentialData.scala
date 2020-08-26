package typings.webappsecCredentialManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://www.w3.org/TR/credential-management-1/#dictdef-federatedcredentialdata}
  */
@js.native
trait FederatedCredentialData extends SiteBoundCredentialData {
  var protocol: js.UndefOr[String] = js.native
  var provider: String = js.native
}

object FederatedCredentialData {
  @scala.inline
  def apply(id: String, provider: String): FederatedCredentialData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[FederatedCredentialData]
  }
  @scala.inline
  implicit class FederatedCredentialDataOps[Self <: FederatedCredentialData] (val x: Self) extends AnyVal {
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
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
  }
  
}

