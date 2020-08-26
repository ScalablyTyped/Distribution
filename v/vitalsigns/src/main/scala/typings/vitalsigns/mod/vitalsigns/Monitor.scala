package typings.vitalsigns.mod.vitalsigns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Monitor extends js.Object {
  /**
    * Connections.
    * @type {any}
    */
  var connections: js.Any = js.native
}

object Monitor {
  @scala.inline
  def apply(connections: js.Any): Monitor = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Monitor]
  }
  @scala.inline
  implicit class MonitorOps[Self <: Monitor] (val x: Self) extends AnyVal {
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
    def setConnections(value: js.Any): Self = this.set("connections", value.asInstanceOf[js.Any])
  }
  
}

