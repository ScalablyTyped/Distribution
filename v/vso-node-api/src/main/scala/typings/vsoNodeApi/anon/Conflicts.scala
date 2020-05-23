package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conflicts extends js.Object {
  var conflicts: scala.Double
  var failure: scala.Double
  var notSet: scala.Double
  var queued: scala.Double
  var rejectedByPolicy: scala.Double
  var succeeded: scala.Double
}

object Conflicts {
  @scala.inline
  def apply(
    conflicts: scala.Double,
    failure: scala.Double,
    notSet: scala.Double,
    queued: scala.Double,
    rejectedByPolicy: scala.Double,
    succeeded: scala.Double
  ): Conflicts = {
    val __obj = js.Dynamic.literal(conflicts = conflicts.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], rejectedByPolicy = rejectedByPolicy.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
}

