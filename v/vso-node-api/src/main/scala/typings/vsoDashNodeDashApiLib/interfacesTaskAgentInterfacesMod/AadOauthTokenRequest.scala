package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AadOauthTokenRequest extends js.Object {
  var refresh: scala.Boolean
  var resource: java.lang.String
  var tenantId: java.lang.String
  var token: java.lang.String
}

object AadOauthTokenRequest {
  @scala.inline
  def apply(
    refresh: scala.Boolean,
    resource: java.lang.String,
    tenantId: java.lang.String,
    token: java.lang.String
  ): AadOauthTokenRequest = {
    val __obj = js.Dynamic.literal(refresh = refresh, resource = resource, tenantId = tenantId, token = token)
  
    __obj.asInstanceOf[AadOauthTokenRequest]
  }
}

