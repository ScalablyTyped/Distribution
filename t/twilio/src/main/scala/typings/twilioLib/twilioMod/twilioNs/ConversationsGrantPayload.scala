package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversationsGrantPayload extends GrantPayload {
  var configuration_profile_sid: java.lang.String
}

object ConversationsGrantPayload {
  @scala.inline
  def apply(configuration_profile_sid: java.lang.String): ConversationsGrantPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configuration_profile_sid")(configuration_profile_sid)
    __obj.asInstanceOf[ConversationsGrantPayload]
  }
}

