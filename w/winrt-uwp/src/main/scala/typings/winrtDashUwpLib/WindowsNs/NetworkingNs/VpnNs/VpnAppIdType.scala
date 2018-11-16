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
  
  val filePath: filePath with java.lang.String = js.native
  val fullyQualifiedBinaryName: fullyQualifiedBinaryName with java.lang.String = js.native
  val packageFamilyName: packageFamilyName with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnAppIdType with java.lang.String] = js.native
}

