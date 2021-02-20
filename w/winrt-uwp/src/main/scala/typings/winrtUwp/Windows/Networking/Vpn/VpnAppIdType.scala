package typings.winrtUwp.Windows.Networking.Vpn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VpnAppIdType extends StObject
/** Specifies the type of AppId understood by the VPN platform. */
@JSGlobal("Windows.Networking.Vpn.VpnAppIdType")
@js.native
object VpnAppIdType extends StObject {
  
  /** File path. */
  @js.native
  sealed trait filePath extends VpnAppIdType
  
  /** Fully qualified binary name (FQBN). */
  @js.native
  sealed trait fullyQualifiedBinaryName extends VpnAppIdType
  
  /** Package family name. */
  @js.native
  sealed trait packageFamilyName extends VpnAppIdType
}
