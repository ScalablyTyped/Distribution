package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CellularApnAuthenticationType extends js.Object
/** Defines values that indicate the authentication type used for a APN. These values are referenced when providing APN details using a CellularApnContext object. */
@JSGlobal("Windows.Networking.Connectivity.CellularApnAuthenticationType")
@js.native
object CellularApnAuthenticationType extends js.Object {
  
  /** Challenge-Handshake authentication. */
  @js.native
  sealed trait chap extends CellularApnAuthenticationType
  
  /** Microsoft Challenge-Handshake authentication (v2) */
  @js.native
  sealed trait mschapv2 extends CellularApnAuthenticationType
  
  /** No authentication. */
  @js.native
  sealed trait none extends CellularApnAuthenticationType
  
  /** Password authentication. */
  @js.native
  sealed trait pap extends CellularApnAuthenticationType
}
