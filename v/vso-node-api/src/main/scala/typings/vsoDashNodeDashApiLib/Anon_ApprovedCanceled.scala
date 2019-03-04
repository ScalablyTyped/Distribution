package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApprovedCanceled extends js.Object {
  var approved: scala.Double
  var canceled: scala.Double
  var pending: scala.Double
  var reassigned: scala.Double
  var rejected: scala.Double
  var skipped: scala.Double
  var undefined: scala.Double
}

object Anon_ApprovedCanceled {
  @scala.inline
  def apply(
    approved: scala.Double,
    canceled: scala.Double,
    pending: scala.Double,
    reassigned: scala.Double,
    rejected: scala.Double,
    skipped: scala.Double,
    undefined: scala.Double
  ): Anon_ApprovedCanceled = {
    val __obj = js.Dynamic.literal(approved = approved, canceled = canceled, pending = pending, reassigned = reassigned, rejected = rejected, skipped = skipped, undefined = undefined)
  
    __obj.asInstanceOf[Anon_ApprovedCanceled]
  }
}

