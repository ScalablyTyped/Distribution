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
  
  val accessDenied: accessDenied with java.lang.String = js.native
  val invalidXmlSyntax: invalidXmlSyntax with java.lang.String = js.native
  val ok: ok with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  val profileInvalidAppId: profileInvalidAppId with java.lang.String = js.native
  val profileNameTooLong: profileNameTooLong with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnManagementErrorStatus with java.lang.String
  ] = js.native
}

