package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "IpMessagingGrant")
@js.native
class IpMessagingGrant ()
  extends twilioLib.twilioMod.twilioNs.IpMessagingGrant {
  def this(options: twilioLib.twilioMod.twilioNs.IpMessagingGrantOptions) = this()
  /* CompleteClass */
  override var deploymentRoleSid: java.lang.String = js.native
  /* CompleteClass */
  override var endpointId: java.lang.String = js.native
  /* CompleteClass */
  override var key: java.lang.String = js.native
  /* CompleteClass */
  override var pushCredentialSid: java.lang.String = js.native
  /* CompleteClass */
  override var serviceSid: java.lang.String = js.native
  /* CompleteClass */
  override def toPayload(): twilioLib.twilioMod.twilioNs.GrantPayload = js.native
}

