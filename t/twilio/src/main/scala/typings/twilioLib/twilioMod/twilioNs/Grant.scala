package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grant extends js.Object {
  def toPayload(): GrantPayload
}

object Grant {
  @scala.inline
  def apply(toPayload: () => GrantPayload): Grant = {
    val __obj = js.Dynamic.literal(toPayload = js.Any.fromFunction0(toPayload))
  
    __obj.asInstanceOf[Grant]
  }
}

