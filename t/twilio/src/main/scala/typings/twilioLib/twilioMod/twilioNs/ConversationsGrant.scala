package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversationsGrant extends Grant {
  var configurationProfileSid: java.lang.String
}

object ConversationsGrant {
  @scala.inline
  def apply(configurationProfileSid: java.lang.String, toPayload: () => ConversationsGrantPayload): ConversationsGrant = {
    val __obj = js.Dynamic.literal(configurationProfileSid = configurationProfileSid, toPayload = js.Any.fromFunction0(toPayload))
  
    __obj.asInstanceOf[ConversationsGrant]
  }
}

