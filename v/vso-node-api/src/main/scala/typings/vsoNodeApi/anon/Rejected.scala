package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rejected extends js.Object {
  var approved: scala.Double
  var canceled: scala.Double
  var pending: scala.Double
  var rejected: scala.Double
  var unknown: scala.Double
}

object Rejected {
  @scala.inline
  def apply(
    approved: scala.Double,
    canceled: scala.Double,
    pending: scala.Double,
    rejected: scala.Double,
    unknown: scala.Double
  ): Rejected = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rejected]
  }
}

