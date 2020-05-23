package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EachMember extends js.Object {
  var eachMember: scala.Double
  var noDelivery: scala.Double
  var none: scala.Double
  var notSet: scala.Double
  var preferredEmailAddress: scala.Double
}

object EachMember {
  @scala.inline
  def apply(
    eachMember: scala.Double,
    noDelivery: scala.Double,
    none: scala.Double,
    notSet: scala.Double,
    preferredEmailAddress: scala.Double
  ): EachMember = {
    val __obj = js.Dynamic.literal(eachMember = eachMember.asInstanceOf[js.Any], noDelivery = noDelivery.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any], preferredEmailAddress = preferredEmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EachMember]
  }
}

