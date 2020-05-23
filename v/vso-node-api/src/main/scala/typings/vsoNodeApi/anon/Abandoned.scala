package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Abandoned extends js.Object {
  var abandoned: scala.Double
  var canceled: scala.Double
  var failed: scala.Double
  var skipped: scala.Double
  var succeeded: scala.Double
  var succeededWithIssues: scala.Double
}

object Abandoned {
  @scala.inline
  def apply(
    abandoned: scala.Double,
    canceled: scala.Double,
    failed: scala.Double,
    skipped: scala.Double,
    succeeded: scala.Double,
    succeededWithIssues: scala.Double
  ): Abandoned = {
    val __obj = js.Dynamic.literal(abandoned = abandoned.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], succeededWithIssues = succeededWithIssues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abandoned]
  }
}

