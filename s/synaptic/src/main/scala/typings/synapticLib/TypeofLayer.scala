package typings
package synapticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofLayer extends js.Object {
  /**
    * Represents a connection from one layer to another, and keeps track of its weight and gain.
    */
  var LayerConnection: TypeofClassLayerConnection
}

object TypeofLayer {
  @scala.inline
  def apply(LayerConnection: TypeofClassLayerConnection): TypeofLayer = {
    val __obj = js.Dynamic.literal(LayerConnection = LayerConnection)
  
    __obj.asInstanceOf[TypeofLayer]
  }
}

