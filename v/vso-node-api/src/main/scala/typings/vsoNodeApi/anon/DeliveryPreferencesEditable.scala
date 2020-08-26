package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryPreferencesEditable extends js.Object {
  var deliveryPreferencesEditable: scala.Double = js.native
  var isGroup: scala.Double = js.native
  var isTeam: scala.Double = js.native
  var isUser: scala.Double = js.native
  var none: scala.Double = js.native
  var supportsEachMemberDelivery: scala.Double = js.native
  var supportsNoDelivery: scala.Double = js.native
  var supportsPreferredEmailAddressDelivery: scala.Double = js.native
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
  @scala.inline
  implicit class DeliveryPreferencesEditableOps[Self <: DeliveryPreferencesEditable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeliveryPreferencesEditable(value: scala.Double): Self = this.set("deliveryPreferencesEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsGroup(value: scala.Double): Self = this.set("isGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTeam(value: scala.Double): Self = this.set("isTeam", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsUser(value: scala.Double): Self = this.set("isUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsEachMemberDelivery(value: scala.Double): Self = this.set("supportsEachMemberDelivery", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsNoDelivery(value: scala.Double): Self = this.set("supportsNoDelivery", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportsPreferredEmailAddressDelivery(value: scala.Double): Self = this.set("supportsPreferredEmailAddressDelivery", value.asInstanceOf[js.Any])
  }
  
}

