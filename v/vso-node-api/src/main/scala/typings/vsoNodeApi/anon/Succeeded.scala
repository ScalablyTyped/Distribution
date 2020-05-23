package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Succeeded extends js.Object {
  var failed: scala.Double
  var inProgress: scala.Double
  var none: scala.Double
  var pending: scala.Double
  var succeeded: scala.Double
}

object Succeeded {
  @scala.inline
  def apply(
    failed: scala.Double,
    inProgress: scala.Double,
    none: scala.Double,
    pending: scala.Double,
    succeeded: scala.Double
  ): Succeeded = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Succeeded]
  }
}

