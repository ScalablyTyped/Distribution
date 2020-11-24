package typings.winrtUwp.Windows.System.Power

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
