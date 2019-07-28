package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApprovedCanceled extends js.Object {
  var approved: Double
  var canceled: Double
  var pending: Double
  var reassigned: Double
  var rejected: Double
  var skipped: Double
  var undefined: Double
}

object Anon_ApprovedCanceled {
  @scala.inline
  def apply(
    approved: Double,
    canceled: Double,
    pending: Double,
    reassigned: Double,
    rejected: Double,
    skipped: Double,
    undefined: Double
  ): Anon_ApprovedCanceled = {
    val __obj = js.Dynamic.literal(approved = approved, canceled = canceled, pending = pending, reassigned = reassigned, rejected = rejected, skipped = skipped, undefined = undefined)
  
    __obj.asInstanceOf[Anon_ApprovedCanceled]
  }
}

