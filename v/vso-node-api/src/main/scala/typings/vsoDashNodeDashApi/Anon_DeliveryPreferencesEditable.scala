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
    val __obj = js.Dynamic.literal(deliveryPreferencesEditable = deliveryPreferencesEditable, isGroup = isGroup, isTeam = isTeam, isUser = isUser, none = none, supportsEachMemberDelivery = supportsEachMemberDelivery, supportsNoDelivery = supportsNoDelivery, supportsPreferredEmailAddressDelivery = supportsPreferredEmailAddressDelivery)
  
    __obj.asInstanceOf[Anon_DeliveryPreferencesEditable]
  }
}

