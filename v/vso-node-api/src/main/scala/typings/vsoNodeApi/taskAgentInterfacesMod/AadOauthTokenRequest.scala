package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AadOauthTokenRequest extends js.Object {
  var refresh: Boolean = js.native
  var resource: String = js.native
  var tenantId: String = js.native
  var token: String = js.native
}

object AadOauthTokenRequest {
  @scala.inline
  def apply(refresh: Boolean, resource: String, tenantId: String, token: String): AadOauthTokenRequest = {
    val __obj = js.Dynamic.literal(refresh = refresh.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AadOauthTokenRequest]
  }
  @scala.inline
  implicit class AadOauthTokenRequestOps[Self <: AadOauthTokenRequest] (val x: Self) extends AnyVal {
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
    def setRefresh(value: Boolean): Self = this.set("refresh", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setTenantId(value: String): Self = this.set("tenantId", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
  
}

