package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VpnManagementErrorStatus extends js.Object

/** Describes the known VPN management errors. */
@JSGlobal("Windows.Networking.Vpn.VpnManagementErrorStatus")
@js.native
object VpnManagementErrorStatus extends js.Object {
  /** Access is denied. */
  @js.native
  sealed trait accessDenied
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnManagementErrorStatus
  
  /** Invalid XML syntax */
  @js.native
  sealed trait invalidXmlSyntax
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnManagementErrorStatus
  
  /** OK */
  @js.native
  sealed trait ok
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnManagementErrorStatus
  
  /** Other */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnManagementErrorStatus
  
  /** The app id is invalid. */
  @js.native
  sealed trait profileInvalidAppId
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnManagementErrorStatus
  
  /** The profile name is too long. */
  @js.native
  sealed trait profileNameTooLong
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnManagementErrorStatus
  
  /* 5 */ val accessDenied: accessDenied with scala.Double = js.native
  /* 2 */ val invalidXmlSyntax: invalidXmlSyntax with scala.Double = js.native
  /* 0 */ val ok: ok with scala.Double = js.native
  /* 1 */ val other: other with scala.Double = js.native
  /* 4 */ val profileInvalidAppId: profileInvalidAppId with scala.Double = js.native
  /* 3 */ val profileNameTooLong: profileNameTooLong with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnManagementErrorStatus with scala.Double
  ] = js.native
}

