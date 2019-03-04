package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllFailed extends js.Object {
  var all: scala.Double
  var failed: scala.Double
  var inProgress: scala.Double
  var notDeployed: scala.Double
  var partiallySucceeded: scala.Double
  var succeeded: scala.Double
  var undefined: scala.Double
}

object Anon_AllFailed {
  @scala.inline
  def apply(
    all: scala.Double,
    failed: scala.Double,
    inProgress: scala.Double,
    notDeployed: scala.Double,
    partiallySucceeded: scala.Double,
    succeeded: scala.Double,
    undefined: scala.Double
  ): Anon_AllFailed = {
    val __obj = js.Dynamic.literal(all = all, failed = failed, inProgress = inProgress, notDeployed = notDeployed, partiallySucceeded = partiallySucceeded, succeeded = succeeded, undefined = undefined)
  
    __obj.asInstanceOf[Anon_AllFailed]
  }
}

