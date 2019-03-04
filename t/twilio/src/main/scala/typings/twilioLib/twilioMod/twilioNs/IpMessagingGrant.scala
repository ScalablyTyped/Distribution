package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpMessagingGrant extends Grant {
  var deploymentRoleSid: java.lang.String
  var endpointId: java.lang.String
  var key: java.lang.String
  var pushCredentialSid: java.lang.String
  var serviceSid: java.lang.String
}

object IpMessagingGrant {
  @scala.inline
  def apply(
    deploymentRoleSid: java.lang.String,
    endpointId: java.lang.String,
    key: java.lang.String,
    pushCredentialSid: java.lang.String,
    serviceSid: java.lang.String,
    toPayload: js.Function0[IpMessagingGrantPayload]
  ): IpMessagingGrant = {
    val __obj = js.Dynamic.literal(deploymentRoleSid = deploymentRoleSid, endpointId = endpointId, key = key, pushCredentialSid = pushCredentialSid, serviceSid = serviceSid, toPayload = toPayload)
  
    __obj.asInstanceOf[IpMessagingGrant]
  }
}

