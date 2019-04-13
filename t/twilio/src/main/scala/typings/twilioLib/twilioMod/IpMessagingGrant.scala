package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "IpMessagingGrant")
@js.native
class IpMessagingGrant () extends Grant {
  def this(options: IpMessagingGrantOptions) = this()
  var deploymentRoleSid: java.lang.String = js.native
  var endpointId: java.lang.String = js.native
  var key: java.lang.String = js.native
  var pushCredentialSid: java.lang.String = js.native
  var serviceSid: java.lang.String = js.native
  /* CompleteClass */
  override def toPayload(): GrantPayload = js.native
}

