package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncoming extends js.Object {
  var inProgress: Double
  var incoming: Double
  var outgoing: Double
}

object AnonIncoming {
  @scala.inline
  def apply(inProgress: Double, incoming: Double, outgoing: Double): AnonIncoming = {
    val __obj = js.Dynamic.literal(inProgress = inProgress.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncoming]
  }
}

