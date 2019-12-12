package typings.winrtDashUwp.Windows.System

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.System.AppMemoryUsageLevel.high
import typings.winrtDashUwp.Windows.System.AppMemoryUsageLevel.low
import typings.winrtDashUwp.Windows.System.AppMemoryUsageLevel.medium
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppMemoryUsageLevel with Double] = js.native
  /* 2 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 0 */ @js.native
  object low extends TopLevel[low with Double]
  
  /* 1 */ @js.native
  object medium extends TopLevel[medium with Double]
  
}

