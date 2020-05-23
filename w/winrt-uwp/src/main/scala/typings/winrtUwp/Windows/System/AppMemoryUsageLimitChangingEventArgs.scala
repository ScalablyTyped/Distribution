package typings.winrtUwp.Windows.System

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AppMemoryUsageLimitChanging event. */
trait AppMemoryUsageLimitChangingEventArgs extends js.Object {
  /** Gets the new limit for how much total memory the app can use, in bytes. */
  var newLimit: Double
  /** Gets the old limit for how much total memory the app can use, in bytes. */
  var oldLimit: Double
}

object AppMemoryUsageLimitChangingEventArgs {
  @scala.inline
  def apply(newLimit: Double, oldLimit: Double): AppMemoryUsageLimitChangingEventArgs = {
    val __obj = js.Dynamic.literal(newLimit = newLimit.asInstanceOf[js.Any], oldLimit = oldLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppMemoryUsageLimitChangingEventArgs]
  }
}

