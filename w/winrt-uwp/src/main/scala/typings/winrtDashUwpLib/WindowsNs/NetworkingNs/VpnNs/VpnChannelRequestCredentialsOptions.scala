package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VpnChannelRequestCredentialsOptions extends js.Object

/** Specifies the values defining whether a requested credential is a retry case, or should be used for single sign on. */
@JSGlobal("Windows.Networking.Vpn.VpnChannelRequestCredentialsOptions")
@js.native
object VpnChannelRequestCredentialsOptions extends js.Object {
  /** None. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnChannelRequestCredentialsOptions
  
  /** Retrying. */
  @js.native
  sealed trait retrying
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnChannelRequestCredentialsOptions
  
  /** Use for single sign on. */
  @js.native
  sealed trait useForSingleSignIn
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnChannelRequestCredentialsOptions
  
  val none: none with java.lang.String = js.native
  val retrying: retrying with java.lang.String = js.native
  val useForSingleSignIn: useForSingleSignIn with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnChannelRequestCredentialsOptions with java.lang.String
  ] = js.native
}

