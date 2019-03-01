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

object wakeLockOptions {
  @scala.inline
  def apply(flags: scala.Int | scala.Double = null, time: scala.Int | scala.Double = null): wakeLockOptions = {
    val __obj = js.Dynamic.literal()
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[wakeLockOptions]
  }
}

