package typings.winrtDashUwp.Windows.Networking.Vpn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VpnAppIdType extends js.Object

/** Specifies the type of AppId understood by the VPN platform. */
@JSGlobal("Windows.Networking.Vpn.VpnAppIdType")
@js.native
object VpnAppIdType extends js.Object {
  /** File path. */
  @js.native
  sealed trait filePath extends VpnAppIdType
  
  /** Fully qualified binary name (FQBN). */
  @js.native
  sealed trait fullyQualifiedBinaryName extends VpnAppIdType
  
  /** Package family name. */
  @js.native
  sealed trait packageFamilyName extends VpnAppIdType
  
  /* 2 */ val filePath: typings.winrtDashUwp.Windows.Networking.Vpn.VpnAppIdType.filePath with Double = js.native
  /* 1 */ val fullyQualifiedBinaryName: typings.winrtDashUwp.Windows.Networking.Vpn.VpnAppIdType.fullyQualifiedBinaryName with Double = js.native
  /* 0 */ val packageFamilyName: typings.winrtDashUwp.Windows.Networking.Vpn.VpnAppIdType.packageFamilyName with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnAppIdType with Double] = js.native
}

