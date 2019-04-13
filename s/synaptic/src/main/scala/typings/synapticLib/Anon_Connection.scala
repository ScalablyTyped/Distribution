package typings
package synapticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connection extends js.Object {
  /**
    * Represents a connection from one layer to another, and keeps track of its weight and gain.
    */
  var LayerConnection: Anon_Uid
}

object Anon_Connection {
  @scala.inline
  def apply(LayerConnection: Anon_Uid): Anon_Connection = {
    val __obj = js.Dynamic.literal(LayerConnection = LayerConnection)
  
    __obj.asInstanceOf[Anon_Connection]
  }
}

