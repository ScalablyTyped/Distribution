package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApprovedBroken extends js.Object {
  var approved: Double
  var broken: Double
  var notApplicable: Double
  var queued: Double
  var rejected: Double
  var running: Double
}

object Anon_ApprovedBroken {
  @scala.inline
  def apply(
    approved: Double,
    broken: Double,
    notApplicable: Double,
    queued: Double,
    rejected: Double,
    running: Double
  ): Anon_ApprovedBroken = {
    val __obj = js.Dynamic.literal(approved = approved, broken = broken, notApplicable = notApplicable, queued = queued, rejected = rejected, running = running)
  
    __obj.asInstanceOf[Anon_ApprovedBroken]
  }
}

