package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApprovedCanceledPending extends js.Object {
  var approved: Double
  var canceled: Double
  var pending: Double
  var rejected: Double
  var unknown: Double
}

object Anon_ApprovedCanceledPending {
  @scala.inline
  def apply(approved: Double, canceled: Double, pending: Double, rejected: Double, unknown: Double): Anon_ApprovedCanceledPending = {
    val __obj = js.Dynamic.literal(approved = approved, canceled = canceled, pending = pending, rejected = rejected, unknown = unknown)
  
    __obj.asInstanceOf[Anon_ApprovedCanceledPending]
  }
}

