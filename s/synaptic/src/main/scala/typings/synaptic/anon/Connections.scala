package typings.synaptic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connections extends js.Object {
  var connections: Double
  var neurons: Double
}

object Connections {
  @scala.inline
  def apply(connections: Double, neurons: Double): Connections = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any], neurons = neurons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connections]
  }
}

