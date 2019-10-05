package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Networking.NetworkOperators.HotspotAuthenticationContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  /** The network operator hotspot authentication context. */ var context: HotspotAuthenticationContext
  /** If true, the authentication context was retrieved. The authentication context can only be retrieved if the calling application matches the application ID specified in the hotspot profile of the underlying WLAN connection and if the authentication hasn’t be completed by the corresponding context already or timed out. */ var returnValue: Boolean
}

object Anon_Context {
  @scala.inline
  def apply(context: HotspotAuthenticationContext, returnValue: Boolean): Anon_Context = {
    val __obj = js.Dynamic.literal(context = context, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_Context]
  }
}

