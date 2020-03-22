package typings.synaptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofLayer extends js.Object {
  /**
    * Represents a connection from one layer to another, and keeps track of its weight and gain.
    */
  var LayerConnection: TypeofLayerConnection
}

object TypeofLayer {
  @scala.inline
  def apply(LayerConnection: TypeofLayerConnection): TypeofLayer = {
    val __obj = js.Dynamic.literal(LayerConnection = LayerConnection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofLayer]
  }
}

