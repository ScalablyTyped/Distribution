package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameter for wakeLock
  */
@js.native
trait wakeLockOptions extends js.Object {
  /**
    * Wake lock level and flag. See [PowerManager.newWakeLock in the Android API Reference](https://developer.android.com/reference/android/os/PowerManager.html#newWakeLock(int,%20java.lang.String))
    */
  var flags: js.UndefOr[Double] = js.native
  /**
    * Minimum time the device will be switched on (plus device switch-off time)
    */
  var time: js.UndefOr[Double] = js.native
}

object wakeLockOptions {
  @scala.inline
  def apply(): wakeLockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[wakeLockOptions]
  }
  @scala.inline
  implicit class wakeLockOptionsOps[Self <: wakeLockOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
  
}

