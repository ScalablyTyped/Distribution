package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanOptOut extends js.Object {
  var canOptOut: scala.Double
  var contributedSubscription: scala.Double
  var groupSubscription: scala.Double
  var none: scala.Double
  var teamSubscription: scala.Double
}

object Anon_CanOptOut {
  @scala.inline
  def apply(
    canOptOut: scala.Double,
    contributedSubscription: scala.Double,
    groupSubscription: scala.Double,
    none: scala.Double,
    teamSubscription: scala.Double
  ): Anon_CanOptOut = {
    val __obj = js.Dynamic.literal(canOptOut = canOptOut, contributedSubscription = contributedSubscription, groupSubscription = groupSubscription, none = none, teamSubscription = teamSubscription)
  
    __obj.asInstanceOf[Anon_CanOptOut]
  }
}

