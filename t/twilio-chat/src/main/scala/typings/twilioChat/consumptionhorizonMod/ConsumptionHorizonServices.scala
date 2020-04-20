package typings.twilioChat.consumptionhorizonMod

import typings.twilioChat.sessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumptionHorizonServices extends js.Object {
  var session: Session
}

object ConsumptionHorizonServices {
  @scala.inline
  def apply(session: Session): ConsumptionHorizonServices = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumptionHorizonServices]
  }
}

