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
  def apply(toPayload: js.Function0[GrantPayload]): Grant = {
    val __obj = js.Dynamic.literal(toPayload = toPayload)
  
    __obj.asInstanceOf[Grant]
  }
}

