package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Broken extends js.Object {
  var approved: scala.Double
  var broken: scala.Double
  var notApplicable: scala.Double
  var queued: scala.Double
  var rejected: scala.Double
  var running: scala.Double
}

object Broken {
  @scala.inline
  def apply(
    approved: scala.Double,
    broken: scala.Double,
    notApplicable: scala.Double,
    queued: scala.Double,
    rejected: scala.Double,
    running: scala.Double
  ): Broken = {
    val __obj = js.Dynamic.literal(approved = approved.asInstanceOf[js.Any], broken = broken.asInstanceOf[js.Any], notApplicable = notApplicable.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], rejected = rejected.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broken]
  }
}

