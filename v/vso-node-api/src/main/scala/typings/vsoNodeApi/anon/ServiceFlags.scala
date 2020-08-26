package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceFlags extends js.Object {
  var disabled: scala.Double = js.native
  var none: scala.Double = js.native
  var serviceFlags: scala.Double = js.native
  var unChanged: scala.Double = js.native
  var verified: scala.Double = js.native
}

object ServiceFlags {
  @scala.inline
  def apply(
    disabled: scala.Double,
    none: scala.Double,
    serviceFlags: scala.Double,
    unChanged: scala.Double,
    verified: scala.Double
  ): ServiceFlags = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], serviceFlags = serviceFlags.asInstanceOf[js.Any], unChanged = unChanged.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceFlags]
  }
  @scala.inline
  implicit class ServiceFlagsOps[Self <: ServiceFlags] (val x: Self) extends AnyVal {
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
    def setDisabled(value: scala.Double): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceFlags(value: scala.Double): Self = this.set("serviceFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnChanged(value: scala.Double): Self = this.set("unChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerified(value: scala.Double): Self = this.set("verified", value.asInstanceOf[js.Any])
  }
  
}

