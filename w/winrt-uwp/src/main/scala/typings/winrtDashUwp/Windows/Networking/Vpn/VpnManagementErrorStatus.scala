package typings.winrtDashUwp.Windows.Networking.Vpn

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
  sealed trait accessDenied extends VpnManagementErrorStatus
  
  /** Invalid XML syntax */
  @js.native
  sealed trait invalidXmlSyntax extends VpnManagementErrorStatus
  
  /** OK */
  @js.native
  sealed trait ok extends VpnManagementErrorStatus
  
  /** Other */
  @js.native
  sealed trait other extends VpnManagementErrorStatus
  
  /** The app id is invalid. */
  @js.native
  sealed trait profileInvalidAppId extends VpnManagementErrorStatus
  
  /** The profile name is too long. */
  @js.native
  sealed trait profileNameTooLong extends VpnManagementErrorStatus
  
  /* 5 */ val accessDenied: typings.winrtDashUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.accessDenied with Double = js.native
  /* 2 */ val invalidXmlSyntax: typings.winrtDashUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.invalidXmlSyntax with Double = js.native
  /* 0 */ val ok: typings.winrtDashUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.ok with Double = js.native
  /* 1 */ val other: typings.winrtDashUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.other with Double = js.native
  /* 4 */ val profileInvalidAppId: typings.winrtDashUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.profileInvalidAppId with Double = js.native
  /* 3 */ val profileNameTooLong: typings.winrtDashUwp.Windows.Networking.Vpn.VpnManagementErrorStatus.profileNameTooLong with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnManagementErrorStatus with Double] = js.native
}

