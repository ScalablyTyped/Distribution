package typings.winrtDashUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppMemoryUsageLevel extends js.Object

/** An enumeration containing 3 levels of app memory usage: low, medium, and high. */
@JSGlobal("Windows.System.AppMemoryUsageLevel")
@js.native
object AppMemoryUsageLevel extends js.Object {
  /** High app memory usage. */
  @js.native
  sealed trait high extends AppMemoryUsageLevel
  
  /** Low app memory usage. */
  @js.native
  sealed trait low extends AppMemoryUsageLevel
  
  /** Medium app memory usage. */
  @js.native
  sealed trait medium extends AppMemoryUsageLevel
  
  /* 2 */ val high: typings.winrtDashUwp.Windows.System.AppMemoryUsageLevel.high with Double = js.native
  /* 0 */ val low: typings.winrtDashUwp.Windows.System.AppMemoryUsageLevel.low with Double = js.native
  /* 1 */ val medium: typings.winrtDashUwp.Windows.System.AppMemoryUsageLevel.medium with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppMemoryUsageLevel with Double] = js.native
}

