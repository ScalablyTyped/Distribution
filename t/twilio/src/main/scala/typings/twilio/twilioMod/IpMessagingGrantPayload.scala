package typings.twilio.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpMessagingGrantPayload extends GrantPayload {
  var deployment_role_sid: String
  var endpoint_id: String
  var push_credential_sid: String
  var service_sid: String
}

object IpMessagingGrantPayload {
  @scala.inline
  def apply(deployment_role_sid: String, endpoint_id: String, push_credential_sid: String, service_sid: String): IpMessagingGrantPayload = {
    val __obj = js.Dynamic.literal(deployment_role_sid = deployment_role_sid, endpoint_id = endpoint_id, push_credential_sid = push_credential_sid, service_sid = service_sid)
  
    __obj.asInstanceOf[IpMessagingGrantPayload]
  }
}

