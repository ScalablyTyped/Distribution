package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanOptOut extends js.Object {
  var canOptOut: Double
  var contributedSubscription: Double
  var groupSubscription: Double
  var none: Double
  var teamSubscription: Double
}

object Anon_CanOptOut {
  @scala.inline
  def apply(
    canOptOut: Double,
    contributedSubscription: Double,
    groupSubscription: Double,
    none: Double,
    teamSubscription: Double
  ): Anon_CanOptOut = {
    val __obj = js.Dynamic.literal(canOptOut = canOptOut, contributedSubscription = contributedSubscription, groupSubscription = groupSubscription, none = none, teamSubscription = teamSubscription)
  
    __obj.asInstanceOf[Anon_CanOptOut]
  }
}

