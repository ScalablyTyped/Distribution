package typings.twilioDashChat.libServicesConsumptionhorizonMod

import typings.twilioDashChat.libSessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumptionHorizonServices extends js.Object {
  var session: Session
}

object ConsumptionHorizonServices {
  @scala.inline
  def apply(session: Session): ConsumptionHorizonServices = {
    val __obj = js.Dynamic.literal(session = session)
  
    __obj.asInstanceOf[ConsumptionHorizonServices]
  }
}

