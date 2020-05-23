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
  def apply(flags: js.UndefOr[Double] = js.undefined, time: js.UndefOr[Double] = js.undefined): wakeLockOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flags)) __obj.updateDynamic("flags")(flags.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[wakeLockOptions]
  }
}

