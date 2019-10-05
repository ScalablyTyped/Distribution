package typings.winrtDashUwp.Windows.System.Power

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
  sealed trait adequate extends PowerSupplyStatus
  
  /** The device has an inadequate power supply. */
  @js.native
  sealed trait inadequate extends PowerSupplyStatus
  
  /** The device has no power supply. */
  @js.native
  sealed trait notPresent extends PowerSupplyStatus
  
  /* 2 */ val adequate: typings.winrtDashUwp.Windows.System.Power.PowerSupplyStatus.adequate with Double = js.native
  /* 1 */ val inadequate: typings.winrtDashUwp.Windows.System.Power.PowerSupplyStatus.inadequate with Double = js.native
  /* 0 */ val notPresent: typings.winrtDashUwp.Windows.System.Power.PowerSupplyStatus.notPresent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PowerSupplyStatus with Double] = js.native
}

