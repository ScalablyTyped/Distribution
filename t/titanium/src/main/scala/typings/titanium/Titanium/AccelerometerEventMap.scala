package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccelerometerEventMap extends ProxyEventMap {
  var update: AccelerometerUpdateEvent = js.native
}

object AccelerometerEventMap {
  @scala.inline
  def apply(update: AccelerometerUpdateEvent): AccelerometerEventMap = {
    val __obj = js.Dynamic.literal(update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerEventMap]
  }
  @scala.inline
  implicit class AccelerometerEventMapOps[Self <: AccelerometerEventMap] (val x: Self) extends AnyVal {
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
    def setUpdate(value: AccelerometerUpdateEvent): Self = this.set("update", value.asInstanceOf[js.Any])
  }
  
}

