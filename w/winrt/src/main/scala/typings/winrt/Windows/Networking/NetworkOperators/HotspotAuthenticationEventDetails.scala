package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HotspotAuthenticationEventDetails extends IHotspotAuthenticationEventDetails

object HotspotAuthenticationEventDetails {
  @scala.inline
  def apply(eventToken: String): HotspotAuthenticationEventDetails = {
    val __obj = js.Dynamic.literal(eventToken = eventToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotspotAuthenticationEventDetails]
  }
}

