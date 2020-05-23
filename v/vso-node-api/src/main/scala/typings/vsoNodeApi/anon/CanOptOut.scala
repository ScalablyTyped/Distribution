package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanOptOut extends js.Object {
  var canOptOut: scala.Double
  var contributedSubscription: scala.Double
  var groupSubscription: scala.Double
  var none: scala.Double
  var teamSubscription: scala.Double
}

object CanOptOut {
  @scala.inline
  def apply(
    canOptOut: scala.Double,
    contributedSubscription: scala.Double,
    groupSubscription: scala.Double,
    none: scala.Double,
    teamSubscription: scala.Double
  ): CanOptOut = {
    val __obj = js.Dynamic.literal(canOptOut = canOptOut.asInstanceOf[js.Any], contributedSubscription = contributedSubscription.asInstanceOf[js.Any], groupSubscription = groupSubscription.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], teamSubscription = teamSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanOptOut]
  }
}

