package typings.winrtDashUwp.Windows.Devices.WiFiDirect

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.WiFiDirect.WiFiDirectPairingProcedure.groupOwnerNegotiation
import typings.winrtDashUwp.Windows.Devices.WiFiDirect.WiFiDirectPairingProcedure.invitation
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WiFiDirectPairingProcedure with Double] = js.native
  /* 0 */ @js.native
  object groupOwnerNegotiation extends TopLevel[groupOwnerNegotiation with Double]
  
  /* 1 */ @js.native
  object invitation extends TopLevel[invitation with Double]
  
}

