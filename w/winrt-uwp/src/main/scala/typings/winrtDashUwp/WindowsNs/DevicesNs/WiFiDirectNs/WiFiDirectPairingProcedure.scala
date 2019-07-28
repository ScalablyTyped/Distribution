package typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WiFiDirectPairingProcedure extends js.Object

/** Specifies a direct pairing procedure. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectPairingProcedure")
@js.native
object WiFiDirectPairingProcedure extends js.Object {
  /** Group Owner Negotiation. The connecting device chooses the configuration method. */
  @js.native
  sealed trait groupOwnerNegotiation extends WiFiDirectPairingProcedure
  
  /** P2P Invitation. The accepting device chooses the configuration method. */
  @js.native
  sealed trait invitation extends WiFiDirectPairingProcedure
  
  /* 0 */ val groupOwnerNegotiation: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectPairingProcedure.groupOwnerNegotiation with Double = js.native
  /* 1 */ val invitation: typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs.WiFiDirectPairingProcedure.invitation with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectPairingProcedure with Double] = js.native
}

