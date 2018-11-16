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
  
  val disconnected: disconnected with java.lang.String = js.native
  val exclusive: exclusive with java.lang.String = js.native
  val ready: ready with java.lang.String = js.native
  val shared: shared with java.lang.String = js.native
  val unresponsive: unresponsive with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardStatus with java.lang.String
  ] = js.native
}

