package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccepted extends js.Object {
  var accepted: Double
  var open: Double
  var rejected: Double
}

object AnonAccepted {
  @scala.inline
  def apply(accepted: Double, open: Double, rejected: Double): AnonAccepted = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccepted]
  }
}

