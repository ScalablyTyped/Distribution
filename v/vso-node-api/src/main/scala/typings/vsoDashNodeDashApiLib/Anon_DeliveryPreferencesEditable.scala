package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeliveryPreferencesEditable extends js.Object {
  var deliveryPreferencesEditable: scala.Double
  var isGroup: scala.Double
  var isTeam: scala.Double
  var isUser: scala.Double
  var none: scala.Double
  var supportsEachMemberDelivery: scala.Double
  var supportsNoDelivery: scala.Double
  var supportsPreferredEmailAddressDelivery: scala.Double
}

object Anon_DeliveryPreferencesEditable {
  @scala.inline
  def apply(
    deliveryPreferencesEditable: scala.Double,
    isGroup: scala.Double,
    isTeam: scala.Double,
    isUser: scala.Double,
    none: scala.Double,
    supportsEachMemberDelivery: scala.Double,
    supportsNoDelivery: scala.Double,
    supportsPreferredEmailAddressDelivery: scala.Double
  ): Anon_DeliveryPreferencesEditable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deliveryPreferencesEditable")(deliveryPreferencesEditable)
    __obj.updateDynamic("isGroup")(isGroup)
    __obj.updateDynamic("isTeam")(isTeam)
    __obj.updateDynamic("isUser")(isUser)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("supportsEachMemberDelivery")(supportsEachMemberDelivery)
    __obj.updateDynamic("supportsNoDelivery")(supportsNoDelivery)
    __obj.updateDynamic("supportsPreferredEmailAddressDelivery")(supportsPreferredEmailAddressDelivery)
    __obj.asInstanceOf[Anon_DeliveryPreferencesEditable]
  }
}

