package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRejected extends js.Object {
  var approved: Double
  var canceled: Double
  var pending: Double
  var rejected: Double
  var unknown: Double
}

object AnonRejected {
  @scala.inline
  def apply(approved: Double, canceled: Double, pending: Double, rejected: Double, unknown: Double): AnonRejected = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRejected]
  }
}

