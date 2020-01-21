package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "ConversationsGrant")
@js.native
class ConversationsGrant () extends Grant {
  def this(options: ConversationsGrantOptions) = this()
  var configurationProfileSid: String = js.native
  /* CompleteClass */
  override def toPayload(): GrantPayload = js.native
}

