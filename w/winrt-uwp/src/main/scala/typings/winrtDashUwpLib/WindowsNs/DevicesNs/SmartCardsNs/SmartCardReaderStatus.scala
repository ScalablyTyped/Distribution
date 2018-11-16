package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmartCardReaderStatus extends js.Object

/** Specifies the smart card reader's status. */
@JSGlobal("Windows.Devices.SmartCards.SmartCardReaderStatus")
@js.native
object SmartCardReaderStatus extends js.Object {
  /** The smart card reader is disconnected. */
  @js.native
  sealed trait disconnected
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardReaderStatus
  
  /** The smart card reader is allocated for exclusive use by another app. */
  @js.native
  sealed trait exclusive
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardReaderStatus
  
  /** The smart card reader is ready. */
  @js.native
  sealed trait ready
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardReaderStatus
  
  val disconnected: disconnected with java.lang.String = js.native
  val exclusive: exclusive with java.lang.String = js.native
  val ready: ready with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SmartCardsNs.SmartCardReaderStatus with java.lang.String
  ] = js.native
}

