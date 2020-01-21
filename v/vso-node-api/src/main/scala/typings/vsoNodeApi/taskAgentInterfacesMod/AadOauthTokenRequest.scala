package typings.vsoNodeApi.taskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(refresh = refresh.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], tenantId = tenantId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AadOauthTokenRequest]
  }
}

