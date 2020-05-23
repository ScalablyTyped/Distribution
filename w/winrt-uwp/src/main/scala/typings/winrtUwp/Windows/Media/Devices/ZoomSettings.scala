package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents zoom settings that can be applied to the ZoomControl by calling the Configure method. */
trait ZoomSettings extends js.Object {
  /** Gets or sets a ZoomTransitionMode value indicating how the capture device should transition to the new zoom value specified with the Value property. */
  var mode: ZoomTransitionMode
  /** Gets or sets the zoom value to which the ZoomControl will transition. */
  var value: Double
}

object ZoomSettings {
  @scala.inline
  def apply(mode: ZoomTransitionMode, value: Double): ZoomSettings = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomSettings]
  }
}

