package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AppMemoryUsageLimitChanging event. */
@JSGlobal("Windows.System.AppMemoryUsageLimitChangingEventArgs")
@js.native
abstract class AppMemoryUsageLimitChangingEventArgs () extends js.Object {
  /** Gets the new limit for how much total memory the app can use, in bytes. */
  var newLimit: Double = js.native
  /** Gets the old limit for how much total memory the app can use, in bytes. */
  var oldLimit: Double = js.native
}

