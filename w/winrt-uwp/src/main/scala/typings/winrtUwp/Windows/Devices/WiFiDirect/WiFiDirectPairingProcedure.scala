package typings.winrtUwp.Windows.Devices.WiFiDirect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WiFiDirectPairingProcedure extends StObject
/** Specifies a direct pairing procedure. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectPairingProcedure")
@js.native
object WiFiDirectPairingProcedure extends StObject {
  
  /** Group Owner Negotiation. The connecting device chooses the configuration method. */
  @js.native
  sealed trait groupOwnerNegotiation
    extends StObject
       with WiFiDirectPairingProcedure
  
  /** P2P Invitation. The accepting device chooses the configuration method. */
  @js.native
  sealed trait invitation
    extends StObject
       with WiFiDirectPairingProcedure
}
