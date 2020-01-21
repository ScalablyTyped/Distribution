package typings.winrtUwp.Windows.Networking.Vpn

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnManagementErrorStatus with Double] = js.native
  /* 5 */ @js.native
  object accessDenied extends TopLevel[accessDenied with Double]
  
  /* 2 */ @js.native
  object invalidXmlSyntax extends TopLevel[invalidXmlSyntax with Double]
  
  /* 0 */ @js.native
  object ok extends TopLevel[ok with Double]
  
  /* 1 */ @js.native
  object other extends TopLevel[other with Double]
  
  /* 4 */ @js.native
  object profileInvalidAppId extends TopLevel[profileInvalidAppId with Double]
  
  /* 3 */ @js.native
  object profileNameTooLong extends TopLevel[profileNameTooLong with Double]
  
}

