package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerEventMap extends ProxyEventMap {
  var update: AccelerometerUpdateEvent
}

object AccelerometerEventMap {
  @scala.inline
  def apply(update: AccelerometerUpdateEvent): AccelerometerEventMap = {
    val __obj = js.Dynamic.literal(update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerEventMap]
  }
}

