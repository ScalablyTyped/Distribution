package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CellularApnAuthenticationType extends StObject
/** Defines values that indicate the authentication type used for a APN. These values are referenced when providing APN details using a CellularApnContext object. */
@JSGlobal("Windows.Networking.Connectivity.CellularApnAuthenticationType")
@js.native
object CellularApnAuthenticationType extends StObject {
  
  /** Challenge-Handshake authentication. */
  @js.native
  sealed trait chap
    extends StObject
       with CellularApnAuthenticationType
  
  /** Microsoft Challenge-Handshake authentication (v2) */
  @js.native
  sealed trait mschapv2
    extends StObject
       with CellularApnAuthenticationType
  
  /** No authentication. */
  @js.native
  sealed trait none
    extends StObject
       with CellularApnAuthenticationType
  
  /** Password authentication. */
  @js.native
  sealed trait pap
    extends StObject
       with CellularApnAuthenticationType
}
