package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotDeployed extends js.Object {
  var all: scala.Double
  var failed: scala.Double
  var inProgress: scala.Double
  var notDeployed: scala.Double
  var partiallySucceeded: scala.Double
  var succeeded: scala.Double
  var undefined: scala.Double
}

object NotDeployed {
  @scala.inline
  def apply(
    all: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    notDeployed: scala.Double,
    partiallySucceeded: scala.Double,
    succeeded: scala.Double,
    undefined: scala.Double
  ): NotDeployed = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notDeployed = notDeployed.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotDeployed]
  }
}

