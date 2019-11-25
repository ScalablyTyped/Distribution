package typings.vitalsigns.vitalsignsMod.vitalsigns

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
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Monitor]
  }
}

