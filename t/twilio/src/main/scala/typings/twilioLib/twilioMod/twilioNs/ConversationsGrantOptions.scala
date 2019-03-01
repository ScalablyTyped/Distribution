package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversationsGrantOptions extends js.Object {
  var configurationProfileSid: java.lang.String
}

object ConversationsGrantOptions {
  @scala.inline
  def apply(configurationProfileSid: java.lang.String): ConversationsGrantOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configurationProfileSid")(configurationProfileSid)
    __obj.asInstanceOf[ConversationsGrantOptions]
  }
}

