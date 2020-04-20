package typings.winrtUwp

import typings.winrtUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  /** The network operator hotspot authentication context. */ var context: HotspotAuthenticationContext
  /** If true, the authentication context was retrieved. The authentication context can only be retrieved if the calling application matches the application ID specified in the hotspot profile of the underlying WLAN connection and if the authentication hasn’t be completed by the corresponding context already or timed out. */ var returnValue: Boolean
}

object AnonContext {
  @scala.inline
  def apply(context: HotspotAuthenticationContext, returnValue: Boolean): AnonContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
}

