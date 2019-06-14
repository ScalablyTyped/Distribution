package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmartCardStatus extends js.Object

/** Specifies the smart card's status. */
@JSGlobal("Windows.Devices.SmartCards.SmartCardStatus")
@js.native
object SmartCardStatus extends js.Object {
  /** The smart card is disconnected. */
  @js.native
  sealed trait disconnected
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardStatus
  
  /** The smart card is allocated for exclusive use by another app. */
  @js.native
  sealed trait exclusive
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardStatus
  
  /** The smart card is ready. */
  @js.native
  sealed trait ready
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardStatus
  
  /** The smart card can be used by multiple apps. */
  @js.native
  sealed trait shared
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardStatus
  
  /** The smart card is unresponsive. */
  @js.native
  sealed trait unresponsive
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardStatus
  
  /* 0 */ val disconnected: disconnected with scala.Double = js.native
  /* 3 */ val exclusive: exclusive with scala.Double = js.native
  /* 1 */ val ready: ready with scala.Double = js.native
  /* 2 */ val shared: shared with scala.Double = js.native
  /* 4 */ val unresponsive: unresponsive with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardStatus with scala.Double
  ] = js.native
}

