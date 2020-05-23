package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotApplicable extends js.Object {
  var error: scala.Double
  var failed: scala.Double
  var notApplicable: scala.Double
  var notSet: scala.Double
  var pending: scala.Double
  var succeeded: scala.Double
}

object NotApplicable {
  @scala.inline
  def apply(
    error: scala.Double,
    failed: scala.Double,
    notApplicable: scala.Double,
    notSet: scala.Double,
    pending: scala.Double,
    succeeded: scala.Double
  ): NotApplicable = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], notApplicable = notApplicable.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotApplicable]
  }
}

