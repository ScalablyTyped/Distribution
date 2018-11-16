package typings
package winrtDashUwpLib.WindowsNs.SystemNs.PowerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PowerSupplyStatus extends js.Object

/** Represents the device's power supply status. */
@JSGlobal("Windows.System.Power.PowerSupplyStatus")
@js.native
object PowerSupplyStatus extends js.Object {
  /** The device has an adequate power supply. */
  @js.native
  sealed trait adequate
    extends winrtDashUwpLib.WindowsNs.SystemNs.PowerNs.PowerSupplyStatus
  
  /** The device has an inadequate power supply. */
  @js.native
  sealed trait inadequate
    extends winrtDashUwpLib.WindowsNs.SystemNs.PowerNs.PowerSupplyStatus
  
  /** The device has no power supply. */
  @js.native
  sealed trait notPresent
    extends winrtDashUwpLib.WindowsNs.SystemNs.PowerNs.PowerSupplyStatus
  
  val adequate: adequate with java.lang.String = js.native
  val inadequate: inadequate with java.lang.String = js.native
  val notPresent: notPresent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SystemNs.PowerNs.PowerSupplyStatus with java.lang.String
  ] = js.native
}

