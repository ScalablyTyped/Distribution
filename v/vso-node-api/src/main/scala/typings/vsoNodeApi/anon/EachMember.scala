package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EachMember extends js.Object {
  var eachMember: scala.Double = js.native
  var noDelivery: scala.Double = js.native
  var none: scala.Double = js.native
  var notSet: scala.Double = js.native
  var preferredEmailAddress: scala.Double = js.native
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
  @scala.inline
  implicit class EachMemberOps[Self <: EachMember] (val x: Self) extends AnyVal {
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
    def setEachMember(value: scala.Double): Self = this.set("eachMember", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoDelivery(value: scala.Double): Self = this.set("noDelivery", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotSet(value: scala.Double): Self = this.set("notSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreferredEmailAddress(value: scala.Double): Self = this.set("preferredEmailAddress", value.asInstanceOf[js.Any])
  }
  
}

