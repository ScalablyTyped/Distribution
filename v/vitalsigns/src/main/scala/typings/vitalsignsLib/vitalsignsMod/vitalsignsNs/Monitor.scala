package typings
package vitalsignsLib.vitalsignsMod.vitalsignsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monitor extends js.Object {
  /**
    * Connections.
    * @type {any}
    */
  var connections: js.Any
}

object Monitor {
  @scala.inline
  def apply(connections: js.Any): Monitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connections")(connections)
    __obj.asInstanceOf[Monitor]
  }
}

