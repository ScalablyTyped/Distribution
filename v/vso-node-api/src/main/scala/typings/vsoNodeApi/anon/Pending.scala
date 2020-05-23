package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pending extends js.Object {
  var approved: scala.Double
  var canceled: scala.Double
  var pending: scala.Double
  var reassigned: scala.Double
  var rejected: scala.Double
  var skipped: scala.Double
  var undefined: scala.Double
}

object Pending {
  @scala.inline
  def apply(
    approved: scala.Double,
    canceled: scala.Double,
    pending: scala.Double,
    reassigned: scala.Double,
    rejected: scala.Double,
    skipped: scala.Double,
    undefined: scala.Double
  ): Pending = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], reassigned = reassigned.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pending]
  }
}

