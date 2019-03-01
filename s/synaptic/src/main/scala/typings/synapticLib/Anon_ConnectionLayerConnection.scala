package typings
package synapticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConnectionLayerConnection extends js.Object {
  /**
    * Represents a connection from one layer to another, and keeps track of its weight and gain.
    */
  var LayerConnection: Anon_Uid
}

object Anon_ConnectionLayerConnection {
  @scala.inline
  def apply(LayerConnection: Anon_Uid): Anon_ConnectionLayerConnection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LayerConnection")(LayerConnection)
    __obj.asInstanceOf[Anon_ConnectionLayerConnection]
  }
}

