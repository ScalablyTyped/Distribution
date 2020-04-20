package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanOptOut extends js.Object {
  var canOptOut: Double
  var contributedSubscription: Double
  var groupSubscription: Double
  var none: Double
  var teamSubscription: Double
}

object AnonCanOptOut {
  @scala.inline
  def apply(
    canOptOut: Double,
    contributedSubscription: Double,
    groupSubscription: Double,
    none: Double,
    teamSubscription: Double
  ): AnonCanOptOut = {
    val __obj = js.Dynamic.literal(canOptOut = canOptOut.asInstanceOf[js.Any], contributedSubscription = contributedSubscription.asInstanceOf[js.Any], groupSubscription = groupSubscription.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], teamSubscription = teamSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanOptOut]
  }
}

