package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaDevicesEventMap extends js.Object {
  var devicechange: Event
}

object MediaDevicesEventMap {
  @scala.inline
  def apply(devicechange: Event): MediaDevicesEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("devicechange")(devicechange)
    __obj.asInstanceOf[MediaDevicesEventMap]
  }
}

