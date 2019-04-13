package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "ConversationsGrant")
@js.native
class ConversationsGrant () extends Grant {
  def this(options: ConversationsGrantOptions) = this()
  var configurationProfileSid: java.lang.String = js.native
  /* CompleteClass */
  override def toPayload(): GrantPayload = js.native
}

