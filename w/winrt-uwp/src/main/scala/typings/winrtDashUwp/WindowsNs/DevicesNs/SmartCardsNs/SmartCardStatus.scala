package typings.winrtDashUwp.WindowsNs.DevicesNs.SmartCardsNs

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
  sealed trait disconnected extends SmartCardStatus
  
  /** The smart card is allocated for exclusive use by another app. */
  @js.native
  sealed trait exclusive extends SmartCardStatus
  
  /** The smart card is ready. */
  @js.native
  sealed trait ready extends SmartCardStatus
  
  /** The smart card can be used by multiple apps. */
  @js.native
  sealed trait shared extends SmartCardStatus
  
  /** The smart card is unresponsive. */
  @js.native
  sealed trait unresponsive extends SmartCardStatus
  
  /* 0 */ val disconnected: typings.winrtDashUwp.WindowsNs.DevicesNs.SmartCardsNs.SmartCardStatus.disconnected with Double = js.native
  /* 3 */ val exclusive: typings.winrtDashUwp.WindowsNs.DevicesNs.SmartCardsNs.SmartCardStatus.exclusive with Double = js.native
  /* 1 */ val ready: typings.winrtDashUwp.WindowsNs.DevicesNs.SmartCardsNs.SmartCardStatus.ready with Double = js.native
  /* 2 */ val shared: typings.winrtDashUwp.WindowsNs.DevicesNs.SmartCardsNs.SmartCardStatus.shared with Double = js.native
  /* 4 */ val unresponsive: typings.winrtDashUwp.WindowsNs.DevicesNs.SmartCardsNs.SmartCardStatus.unresponsive with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmartCardStatus with Double] = js.native
}

