package typings.synaptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnections extends js.Object {
  var connections: Double
  var neurons: Double
}

object AnonConnections {
  @scala.inline
  def apply(connections: Double, neurons: Double): AnonConnections = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any], neurons = neurons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConnections]
  }
}

