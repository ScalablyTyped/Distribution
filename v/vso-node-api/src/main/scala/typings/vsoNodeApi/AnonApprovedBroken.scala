package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApprovedBroken extends js.Object {
  var approved: Double
  var broken: Double
  var notApplicable: Double
  var queued: Double
  var rejected: Double
  var running: Double
}

object AnonApprovedBroken {
  @scala.inline
  def apply(
    approved: Double,
    broken: Double,
    notApplicable: Double,
    queued: Double,
    rejected: Double,
    running: Double
  ): AnonApprovedBroken = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], broken = broken.asInstanceOf[js.Any], notApplicable = notApplicable.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApprovedBroken]
  }
}

