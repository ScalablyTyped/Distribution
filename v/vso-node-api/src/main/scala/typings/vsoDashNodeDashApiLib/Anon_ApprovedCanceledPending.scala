package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApprovedCanceledPending extends js.Object {
  var approved: scala.Double
  var canceled: scala.Double
  var pending: scala.Double
  var rejected: scala.Double
  var unknown: scala.Double
}

object Anon_ApprovedCanceledPending {
  @scala.inline
  def apply(
    approved: scala.Double,
    canceled: scala.Double,
    pending: scala.Double,
    rejected: scala.Double,
    unknown: scala.Double
  ): Anon_ApprovedCanceledPending = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("approved")(approved)
    __obj.updateDynamic("canceled")(canceled)
    __obj.updateDynamic("pending")(pending)
    __obj.updateDynamic("rejected")(rejected)
    __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[Anon_ApprovedCanceledPending]
  }
}

