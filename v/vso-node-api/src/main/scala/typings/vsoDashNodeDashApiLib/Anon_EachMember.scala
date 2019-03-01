package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EachMember extends js.Object {
  var eachMember: scala.Double
  var noDelivery: scala.Double
  var none: scala.Double
  var notSet: scala.Double
  var preferredEmailAddress: scala.Double
}

object Anon_EachMember {
  @scala.inline
  def apply(
    eachMember: scala.Double,
    noDelivery: scala.Double,
    none: scala.Double,
    notSet: scala.Double,
    preferredEmailAddress: scala.Double
  ): Anon_EachMember = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eachMember")(eachMember)
    __obj.updateDynamic("noDelivery")(noDelivery)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("notSet")(notSet)
    __obj.updateDynamic("preferredEmailAddress")(preferredEmailAddress)
    __obj.asInstanceOf[Anon_EachMember]
  }
}

