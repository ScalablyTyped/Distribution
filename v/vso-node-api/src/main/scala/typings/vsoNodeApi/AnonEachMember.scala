package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEachMember extends js.Object {
  var eachMember: Double
  var noDelivery: Double
  var none: Double
  var notSet: Double
  var preferredEmailAddress: Double
}

object AnonEachMember {
  @scala.inline
  def apply(
    eachMember: Double,
    noDelivery: Double,
    none: Double,
    notSet: Double,
    preferredEmailAddress: Double
  ): AnonEachMember = {
    val __obj = js.Dynamic.literal(eachMember = eachMember.asInstanceOf[js.Any], noDelivery = noDelivery.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], preferredEmailAddress = preferredEmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEachMember]
  }
}

