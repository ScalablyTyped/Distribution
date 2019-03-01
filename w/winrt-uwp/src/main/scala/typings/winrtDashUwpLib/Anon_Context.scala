package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  /** The network operator hotspot authentication context. */ var context: winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.HotspotAuthenticationContext
  /** If true, the authentication context was retrieved. The authentication context can only be retrieved if the calling application matches the application ID specified in the hotspot profile of the underlying WLAN connection and if the authentication hasn’t be completed by the corresponding context already or timed out. */ var returnValue: scala.Boolean
}

object Anon_Context {
  @scala.inline
  def apply(
    context: winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.HotspotAuthenticationContext,
    returnValue: scala.Boolean
  ): Anon_Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_Context]
  }
}

