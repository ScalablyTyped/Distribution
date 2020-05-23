package typings.winrtUwp.Windows.System

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
  
}

