package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotDeployed extends js.Object {
  var all: Double
  var failed: Double
  var inProgress: Double
  var notDeployed: Double
  var partiallySucceeded: Double
  var succeeded: Double
  var undefined: Double
}

object AnonNotDeployed {
  @scala.inline
  def apply(
    all: Double,
    failed: Double,
    inProgress: Double,
    notDeployed: Double,
    partiallySucceeded: Double,
    succeeded: Double,
    undefined: Double
  ): AnonNotDeployed = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], inProgress = inProgress.asInstanceOf[js.Any], notDeployed = notDeployed.asInstanceOf[js.Any], partiallySucceeded = partiallySucceeded.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNotDeployed]
  }
}

