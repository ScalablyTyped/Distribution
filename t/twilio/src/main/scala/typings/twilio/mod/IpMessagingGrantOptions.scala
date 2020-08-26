package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpMessagingGrantOptions extends js.Object {
  var deploymentRoleSid: String = js.native
  var endpointId: String = js.native
  var pushCredentialSid: String = js.native
  var serviceSid: String = js.native
}

object IpMessagingGrantOptions {
  @scala.inline
  def apply(deploymentRoleSid: String, endpointId: String, pushCredentialSid: String, serviceSid: String): IpMessagingGrantOptions = {
    val __obj = js.Dynamic.literal(deploymentRoleSid = deploymentRoleSid.asInstanceOf[js.Any], endpointId = endpointId.asInstanceOf[js.Any], pushCredentialSid = pushCredentialSid.asInstanceOf[js.Any], serviceSid = serviceSid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpMessagingGrantOptions]
  }
  @scala.inline
  implicit class IpMessagingGrantOptionsOps[Self <: IpMessagingGrantOptions] (val x: Self) extends AnyVal {
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
    def setDeploymentRoleSid(value: String): Self = this.set("deploymentRoleSid", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointId(value: String): Self = this.set("endpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPushCredentialSid(value: String): Self = this.set("pushCredentialSid", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceSid(value: String): Self = this.set("serviceSid", value.asInstanceOf[js.Any])
  }
  
}

