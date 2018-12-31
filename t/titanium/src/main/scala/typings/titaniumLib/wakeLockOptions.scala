package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameter for wakeLock
  */
trait wakeLockOptions extends js.Object {
  /**
  	 * Wake lock level and flag. See [PowerManager.newWakeLock in the Android API Reference](https://developer.android.com/reference/android/os/PowerManager.html#newWakeLock(int,%20java.lang.String))
  	 */
  var flags: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Minimum time the device will be switched on (plus device switch-off time)
  	 */
  var time: js.UndefOr[scala.Double] = js.undefined
}

