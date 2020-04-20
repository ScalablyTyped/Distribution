package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbandoned extends js.Object {
  var abandoned: Double
  var canceled: Double
  var failed: Double
  var skipped: Double
  var succeeded: Double
  var succeededWithIssues: Double
}

object AnonAbandoned {
  @scala.inline
  def apply(
    abandoned: Double,
    canceled: Double,
    failed: Double,
    skipped: Double,
    succeeded: Double,
    succeededWithIssues: Double
  ): AnonAbandoned = {
    val __obj = js.Dynamic.literal(abandoned = abandoned.asInstanceOf[js.Any], canceled = canceled.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], succeededWithIssues = succeededWithIssues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbandoned]
  }
}

