package typings
package synapticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connections extends js.Object {
  var connections: scala.Double
  var neurons: scala.Double
}

object Anon_Connections {
  @scala.inline
  def apply(connections: scala.Double, neurons: scala.Double): Anon_Connections = {
    val __obj = js.Dynamic.literal(connections = connections, neurons = neurons)
  
    __obj.asInstanceOf[Anon_Connections]
  }
}

