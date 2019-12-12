package typings.winrtDashUwp.Windows.Networking.Vpn

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Networking.Vpn.VpnAppIdType.filePath
import typings.winrtDashUwp.Windows.Networking.Vpn.VpnAppIdType.fullyQualifiedBinaryName
import typings.winrtDashUwp.Windows.Networking.Vpn.VpnAppIdType.packageFamilyName
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnAppIdType with Double] = js.native
  /* 2 */ @js.native
  object filePath extends TopLevel[filePath with Double]
  
  /* 1 */ @js.native
  object fullyQualifiedBinaryName extends TopLevel[fullyQualifiedBinaryName with Double]
  
  /* 0 */ @js.native
  object packageFamilyName extends TopLevel[packageFamilyName with Double]
  
}

