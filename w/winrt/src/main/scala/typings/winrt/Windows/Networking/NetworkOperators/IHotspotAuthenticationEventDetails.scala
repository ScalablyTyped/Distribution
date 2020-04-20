package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHotspotAuthenticationEventDetails extends js.Object {
  var eventToken: String
}

object IHotspotAuthenticationEventDetails {
  @scala.inline
  def apply(eventToken: String): IHotspotAuthenticationEventDetails = {
    val __obj = js.Dynamic.literal(eventToken = eventToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotspotAuthenticationEventDetails]
  }
}

