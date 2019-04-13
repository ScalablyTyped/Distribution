package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpMessagingGrantOptions extends js.Object {
  var deploymentRoleSid: java.lang.String
  var endpointId: java.lang.String
  var pushCredentialSid: java.lang.String
  var serviceSid: java.lang.String
}

object IpMessagingGrantOptions {
  @scala.inline
  def apply(
    deploymentRoleSid: java.lang.String,
    endpointId: java.lang.String,
    pushCredentialSid: java.lang.String,
    serviceSid: java.lang.String
  ): IpMessagingGrantOptions = {
    val __obj = js.Dynamic.literal(deploymentRoleSid = deploymentRoleSid, endpointId = endpointId, pushCredentialSid = pushCredentialSid, serviceSid = serviceSid)
  
    __obj.asInstanceOf[IpMessagingGrantOptions]
  }
}

