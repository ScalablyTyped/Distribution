package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeliveryPreferencesEditable extends js.Object {
  var deliveryPreferencesEditable: Double
  var isGroup: Double
  var isTeam: Double
  var isUser: Double
  var none: Double
  var supportsEachMemberDelivery: Double
  var supportsNoDelivery: Double
  var supportsPreferredEmailAddressDelivery: Double
}

object Anon_DeliveryPreferencesEditable {
  @scala.inline
  def apply(
    deliveryPreferencesEditable: Double,
    isGroup: Double,
    isTeam: Double,
    isUser: Double,
    none: Double,
    supportsEachMemberDelivery: Double,
    supportsNoDelivery: Double,
    supportsPreferredEmailAddressDelivery: Double
  ): Anon_DeliveryPreferencesEditable = {
    val __obj = js.Dynamic.literal(deliveryPreferencesEditable = deliveryPreferencesEditable.asInstanceOf[js.Any], isGroup = isGroup.asInstanceOf[js.Any], isTeam = isTeam.asInstanceOf[js.Any], isUser = isUser.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], supportsEachMemberDelivery = supportsEachMemberDelivery.asInstanceOf[js.Any], supportsNoDelivery = supportsNoDelivery.asInstanceOf[js.Any], supportsPreferredEmailAddressDelivery = supportsPreferredEmailAddressDelivery.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DeliveryPreferencesEditable]
  }
}

