package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Conflicts extends js.Object {
  var conflicts: scala.Double
  var failure: scala.Double
  var notSet: scala.Double
  var queued: scala.Double
  var rejectedByPolicy: scala.Double
  var succeeded: scala.Double
}

object Anon_Conflicts {
  @scala.inline
  def apply(
    conflicts: scala.Double,
    failure: scala.Double,
    notSet: scala.Double,
    queued: scala.Double,
    rejectedByPolicy: scala.Double,
    succeeded: scala.Double
  ): Anon_Conflicts = {
    val __obj = js.Dynamic.literal(conflicts = conflicts, failure = failure, notSet = notSet, queued = queued, rejectedByPolicy = rejectedByPolicy, succeeded = succeeded)
  
    __obj.asInstanceOf[Anon_Conflicts]
  }
}

