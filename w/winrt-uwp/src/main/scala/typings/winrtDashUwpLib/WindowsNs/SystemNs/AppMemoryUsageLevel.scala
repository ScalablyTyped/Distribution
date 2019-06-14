package typings
package winrtDashUwpLib.WindowsNs.SystemNs

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
  sealed trait high
    extends winrtDashUwpLib.WindowsNs.SystemNs.AppMemoryUsageLevel
  
  /** Low app memory usage. */
  @js.native
  sealed trait low
    extends winrtDashUwpLib.WindowsNs.SystemNs.AppMemoryUsageLevel
  
  /** Medium app memory usage. */
  @js.native
  sealed trait medium
    extends winrtDashUwpLib.WindowsNs.SystemNs.AppMemoryUsageLevel
  
  /* 2 */ val high: high with scala.Double = js.native
  /* 0 */ val low: low with scala.Double = js.native
  /* 1 */ val medium: medium with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.SystemNs.AppMemoryUsageLevel with scala.Double] = js.native
}

