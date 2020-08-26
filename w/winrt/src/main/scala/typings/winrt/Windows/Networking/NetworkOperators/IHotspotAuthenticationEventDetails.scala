package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHotspotAuthenticationEventDetails extends js.Object {
  var eventToken: String = js.native
}

object IHotspotAuthenticationEventDetails {
  @scala.inline
  def apply(eventToken: String): IHotspotAuthenticationEventDetails = {
    val __obj = js.Dynamic.literal(eventToken = eventToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotspotAuthenticationEventDetails]
  }
  @scala.inline
  implicit class IHotspotAuthenticationEventDetailsOps[Self <: IHotspotAuthenticationEventDetails] (val x: Self) extends AnyVal {
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
    def setEventToken(value: String): Self = this.set("eventToken", value.asInstanceOf[js.Any])
  }
  
}

