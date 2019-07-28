package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AadOauthTokenRequest extends js.Object {
  var refresh: Boolean
  var resource: String
  var tenantId: String
  var token: String
}

object AadOauthTokenRequest {
  @scala.inline
  def apply(refresh: Boolean, resource: String, tenantId: String, token: String): AadOauthTokenRequest = {
    val __obj = js.Dynamic.literal(refresh = refresh, resource = resource, tenantId = tenantId, token = token)
  
    __obj.asInstanceOf[AadOauthTokenRequest]
  }
}

