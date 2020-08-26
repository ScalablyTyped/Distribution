package typings.synaptic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofLayer extends js.Object {
  /**
    * Represents a connection from one layer to another, and keeps track of its weight and gain.
    */
  var LayerConnection: TypeofLayerConnection = js.native
}

object TypeofLayer {
  @scala.inline
  def apply(LayerConnection: TypeofLayerConnection): TypeofLayer = {
    val __obj = js.Dynamic.literal(LayerConnection = LayerConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofLayer]
  }
  @scala.inline
  implicit class TypeofLayerOps[Self <: TypeofLayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLayerConnection(value: TypeofLayerConnection): Self = this.set("LayerConnection", value.asInstanceOf[js.Any])
  }
  
}

