package typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs

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
  sealed trait none extends VpnChannelRequestCredentialsOptions
  
  /** Retrying. */
  @js.native
  sealed trait retrying extends VpnChannelRequestCredentialsOptions
  
  /** Use for single sign on. */
  @js.native
  sealed trait useForSingleSignIn extends VpnChannelRequestCredentialsOptions
  
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnChannelRequestCredentialsOptions.none with Double = js.native
  /* 1 */ val retrying: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnChannelRequestCredentialsOptions.retrying with Double = js.native
  /* 2 */ val useForSingleSignIn: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnChannelRequestCredentialsOptions.useForSingleSignIn with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnChannelRequestCredentialsOptions with Double] = js.native
}

