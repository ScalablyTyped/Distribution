package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canceled extends js.Object {
  var canceled: scala.Double
  var failed: scala.Double
  var none: scala.Double
  var partiallySucceeded: scala.Double
  var succeeded: scala.Double
}

object Canceled {
  @scala.inline
  def apply(
    canceled: scala.Double,
    failed: scala.Double,
    none: scala.Double,
    partiallySucceeded: scala.Double,
    succeeded: scala.Double
  ): Canceled = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canceled]
  }
}

