package typings.useDashPosition.useDashPositionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionOptions extends js.Object {
  /**
    * Setting this to true will ask the browser to get the position with the best accuracy possible.
    * Enabling this feature could consume a lot of battery in handled devices.
    *
    * @default false
    */
  var enableHighAccuracy: Boolean
  /**
    * The maximum cached position age.
    *
    * @default Infinity
    */
  var maximumAge: Double
  /**
    * The amount of time before the error callback is invoked, if 0 it will never invoke.
    *
    * @default 0
    */
  var timeout: Double
}

object PositionOptions {
  @scala.inline
  def apply(enableHighAccuracy: Boolean, maximumAge: Double, timeout: Double): PositionOptions = {
    val __obj = js.Dynamic.literal(enableHighAccuracy = enableHighAccuracy.asInstanceOf[js.Any], maximumAge = maximumAge.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PositionOptions]
  }
}

