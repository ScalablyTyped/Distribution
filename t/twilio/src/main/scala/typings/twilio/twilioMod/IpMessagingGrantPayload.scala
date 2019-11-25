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
    val __obj = js.Dynamic.literal(deployment_role_sid = deployment_role_sid.asInstanceOf[js.Any], endpoint_id = endpoint_id.asInstanceOf[js.Any], push_credential_sid = push_credential_sid.asInstanceOf[js.Any], service_sid = service_sid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IpMessagingGrantPayload]
  }
}

