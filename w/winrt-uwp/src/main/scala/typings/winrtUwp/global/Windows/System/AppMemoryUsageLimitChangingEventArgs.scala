package typings.winrtUwp.global.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AppMemoryUsageLimitChanging event. */
@JSGlobal("Windows.System.AppMemoryUsageLimitChangingEventArgs")
@js.native
abstract class AppMemoryUsageLimitChangingEventArgs ()
  extends typings.winrtUwp.Windows.System.AppMemoryUsageLimitChangingEventArgs {
  /** Gets the new limit for how much total memory the app can use, in bytes. */
  /* CompleteClass */
  override var newLimit: Double = js.native
  /** Gets the old limit for how much total memory the app can use, in bytes. */
  /* CompleteClass */
  override var oldLimit: Double = js.native
}

