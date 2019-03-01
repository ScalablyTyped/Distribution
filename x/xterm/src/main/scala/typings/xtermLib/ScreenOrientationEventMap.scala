package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenOrientationEventMap extends js.Object {
  var change: Event
}

object ScreenOrientationEventMap {
  @scala.inline
  def apply(change: Event): ScreenOrientationEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("change")(change)
    __obj.asInstanceOf[ScreenOrientationEventMap]
  }
}

