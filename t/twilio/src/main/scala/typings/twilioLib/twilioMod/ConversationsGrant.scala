package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "ConversationsGrant")
@js.native
class ConversationsGrant ()
  extends twilioLib.twilioMod.twilioNs.ConversationsGrant {
  def this(options: twilioLib.twilioMod.twilioNs.ConversationsGrantOptions) = this()
  /* CompleteClass */
  override var configurationProfileSid: java.lang.String = js.native
  /* CompleteClass */
  override def toPayload(): twilioLib.twilioMod.twilioNs.GrantPayload = js.native
}

