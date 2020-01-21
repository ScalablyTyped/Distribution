package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpMessagingGrantOptions extends js.Object {
  var deploymentRoleSid: String
  var endpointId: String
  var pushCredentialSid: String
  var serviceSid: String
}

object IpMessagingGrantOptions {
  @scala.inline
  def apply(deploymentRoleSid: String, endpointId: String, pushCredentialSid: String, serviceSid: String): IpMessagingGrantOptions = {
    val __obj = js.Dynamic.literal(deploymentRoleSid = deploymentRoleSid.asInstanceOf[js.Any], endpointId = endpointId.asInstanceOf[js.Any], pushCredentialSid = pushCredentialSid.asInstanceOf[js.Any], serviceSid = serviceSid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IpMessagingGrantOptions]
  }
}

