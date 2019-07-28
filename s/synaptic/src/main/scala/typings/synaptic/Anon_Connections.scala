package typings.synaptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connections extends js.Object {
  var connections: Double
  var neurons: Double
}

object Anon_Connections {
  @scala.inline
  def apply(connections: Double, neurons: Double): Anon_Connections = {
    val __obj = js.Dynamic.literal(connections = connections, neurons = neurons)
  
    __obj.asInstanceOf[Anon_Connections]
  }
}

