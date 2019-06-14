package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs

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
  sealed trait filePath
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnAppIdType
  
  /** Fully qualified binary name (FQBN). */
  @js.native
  sealed trait fullyQualifiedBinaryName
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnAppIdType
  
  /** Package family name. */
  @js.native
  sealed trait packageFamilyName
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnAppIdType
  
  /* 2 */ val filePath: filePath with scala.Double = js.native
  /* 1 */ val fullyQualifiedBinaryName: fullyQualifiedBinaryName with scala.Double = js.native
  /* 0 */ val packageFamilyName: packageFamilyName with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnAppIdType with scala.Double] = js.native
}

