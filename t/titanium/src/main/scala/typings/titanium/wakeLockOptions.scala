package typings.titanium

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
  var flags: js.UndefOr[Double] = js.undefined
  /**
  	 * Minimum time the device will be switched on (plus device switch-off time)
  	 */
  var time: js.UndefOr[Double] = js.undefined
}

object wakeLockOptions {
  @scala.inline
  def apply(flags: Int | Double = null, time: Int | Double = null): wakeLockOptions = {
    val __obj = js.Dynamic.literal()
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[wakeLockOptions]
  }
}

