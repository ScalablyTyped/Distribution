package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryPreferencesEditable extends js.Object {
  var deliveryPreferencesEditable: scala.Double
  var isGroup: scala.Double
  var isTeam: scala.Double
  var isUser: scala.Double
  var none: scala.Double
  var supportsEachMemberDelivery: scala.Double
  var supportsNoDelivery: scala.Double
  var supportsPreferredEmailAddressDelivery: scala.Double
}

object DeliveryPreferencesEditable {
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
  ): DeliveryPreferencesEditable = {
    val __obj = js.Dynamic.literal(deliveryPreferencesEditable = deliveryPreferencesEditable.asInstanceOf[js.Any], isGroup = isGroup.asInstanceOf[js.Any], isTeam = isTeam.asInstanceOf[js.Any], isUser = isUser.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], supportsEachMemberDelivery = supportsEachMemberDelivery.asInstanceOf[js.Any], supportsNoDelivery = supportsNoDelivery.asInstanceOf[js.Any], supportsPreferredEmailAddressDelivery = supportsPreferredEmailAddressDelivery.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryPreferencesEditable]
  }
}

