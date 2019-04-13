package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpMessagingGrantPayload extends GrantPayload {
  var deployment_role_sid: java.lang.String
  var endpoint_id: java.lang.String
  var push_credential_sid: java.lang.String
  var service_sid: java.lang.String
}

object IpMessagingGrantPayload {
  @scala.inline
  def apply(
    deployment_role_sid: java.lang.String,
    endpoint_id: java.lang.String,
    push_credential_sid: java.lang.String,
    service_sid: java.lang.String
  ): IpMessagingGrantPayload = {
    val __obj = js.Dynamic.literal(deployment_role_sid = deployment_role_sid, endpoint_id = endpoint_id, push_credential_sid = push_credential_sid, service_sid = service_sid)
  
    __obj.asInstanceOf[IpMessagingGrantPayload]
  }
}

