package typings.usePosition.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PositionOptions extends js.Object {
  /**
    * Setting this to true will ask the browser to get the position with the best accuracy possible.
    * Enabling this feature could consume a lot of battery in handled devices.
    *
    * @default false
    */
  var enableHighAccuracy: Boolean = js.native
  /**
    * The maximum cached position age.
    *
    * @default Infinity
    */
  var maximumAge: Double = js.native
  /**
    * The amount of time before the error callback is invoked, if 0 it will never invoke.
    *
    * @default 0
    */
  var timeout: Double = js.native
}

object PositionOptions {
  @scala.inline
  def apply(enableHighAccuracy: Boolean, maximumAge: Double, timeout: Double): PositionOptions = {
    val __obj = js.Dynamic.literal(enableHighAccuracy = enableHighAccuracy.asInstanceOf[js.Any], maximumAge = maximumAge.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionOptions]
  }
  @scala.inline
  implicit class PositionOptionsOps[Self <: PositionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnableHighAccuracy(value: Boolean): Self = this.set("enableHighAccuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximumAge(value: Double): Self = this.set("maximumAge", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
  
}

