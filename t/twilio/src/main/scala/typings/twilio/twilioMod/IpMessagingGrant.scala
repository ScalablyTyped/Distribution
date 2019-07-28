package typings.twilio.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "IpMessagingGrant")
@js.native
class IpMessagingGrant () extends Grant {
  def this(options: IpMessagingGrantOptions) = this()
  var deploymentRoleSid: String = js.native
  var endpointId: String = js.native
  var key: String = js.native
  var pushCredentialSid: String = js.native
  var serviceSid: String = js.native
  /* CompleteClass */
  override def toPayload(): GrantPayload = js.native
}

