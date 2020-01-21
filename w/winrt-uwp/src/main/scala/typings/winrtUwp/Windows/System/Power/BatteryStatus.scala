package typings.winrtUwp.Windows.System.Power

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BatteryStatus extends js.Object

/** Indicates the status of the battery. */
@JSGlobal("Windows.System.Power.BatteryStatus")
@js.native
object BatteryStatus extends js.Object {
  /** The battery is charging. */
  @js.native
  sealed trait charging extends BatteryStatus
  
  /** The battery is discharging. */
  @js.native
  sealed trait discharging extends BatteryStatus
  
  /** The battery is idle. */
  @js.native
  sealed trait idle extends BatteryStatus
  
  /** The battery or battery controller is not present. */
  @js.native
  sealed trait notPresent extends BatteryStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BatteryStatus with Double] = js.native
  /* 3 */ @js.native
  object charging extends TopLevel[charging with Double]
  
  /* 1 */ @js.native
  object discharging extends TopLevel[discharging with Double]
  
  /* 2 */ @js.native
  object idle extends TopLevel[idle with Double]
  
  /* 0 */ @js.native
  object notPresent extends TopLevel[notPresent with Double]
  
}

