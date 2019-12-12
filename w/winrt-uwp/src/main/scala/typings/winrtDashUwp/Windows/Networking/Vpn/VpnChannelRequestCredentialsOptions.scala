package typings.winrtDashUwp.Windows.Networking.Vpn

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Networking.Vpn.VpnChannelRequestCredentialsOptions.none
import typings.winrtDashUwp.Windows.Networking.Vpn.VpnChannelRequestCredentialsOptions.retrying
import typings.winrtDashUwp.Windows.Networking.Vpn.VpnChannelRequestCredentialsOptions.useForSingleSignIn
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnChannelRequestCredentialsOptions with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object retrying extends TopLevel[retrying with Double]
  
  /* 2 */ @js.native
  object useForSingleSignIn extends TopLevel[useForSingleSignIn with Double]
  
}

