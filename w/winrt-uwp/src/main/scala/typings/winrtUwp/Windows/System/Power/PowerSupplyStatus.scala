package typings.winrtUwp.Windows.System.Power

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PowerSupplyStatus with Double] = js.native
  /* 2 */ @js.native
  object adequate extends TopLevel[adequate with Double]
  
  /* 1 */ @js.native
  object inadequate extends TopLevel[inadequate with Double]
  
  /* 0 */ @js.native
  object notPresent extends TopLevel[notPresent with Double]
  
}

