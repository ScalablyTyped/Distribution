package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllFailed extends js.Object {
  var all: Double
  var failed: Double
  var inProgress: Double
  var notDeployed: Double
  var partiallySucceeded: Double
  var succeeded: Double
  var undefined: Double
}

object Anon_AllFailed {
  @scala.inline
  def apply(
    all: Double,
    failed: Double,
    inProgress: Double,
    notDeployed: Double,
    partiallySucceeded: Double,
    succeeded: Double,
    undefined: Double
  ): Anon_AllFailed = {
    val __obj = js.Dynamic.literal(all = all, failed = failed, inProgress = inProgress, notDeployed = notDeployed, partiallySucceeded = partiallySucceeded, succeeded = succeeded, undefined = undefined)
  
    __obj.asInstanceOf[Anon_AllFailed]
  }
}

