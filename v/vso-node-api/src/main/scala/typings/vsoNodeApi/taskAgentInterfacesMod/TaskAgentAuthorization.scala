package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgentAuthorization extends js.Object {
  /**
    * Gets or sets the endpoint used to obtain access tokens from the configured token service.
    */
  var authorizationUrl: String = js.native
  /**
    * Gets or sets the client identifier for this agent.
    */
  var clientId: String = js.native
  /**
    * Gets or sets the public key used to verify the identity of this agent.
    */
  var publicKey: TaskAgentPublicKey = js.native
}

object TaskAgentAuthorization {
  @scala.inline
  def apply(authorizationUrl: String, clientId: String, publicKey: TaskAgentPublicKey): TaskAgentAuthorization = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentAuthorization]
  }
  @scala.inline
  implicit class TaskAgentAuthorizationOps[Self <: TaskAgentAuthorization] (val x: Self) extends AnyVal {
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
    def setAuthorizationUrl(value: String): Self = this.set("authorizationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKey(value: TaskAgentPublicKey): Self = this.set("publicKey", value.asInstanceOf[js.Any])
  }
  
}

