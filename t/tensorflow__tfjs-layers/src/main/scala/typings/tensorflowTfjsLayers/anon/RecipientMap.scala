package typings.tensorflowTfjsLayers.anon

import typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientMap extends js.Object {
  var recipientMap: typings.tensorflowTfjsLayers.executorMod.RecipientMap
  var sorted: js.Array[SymbolicTensor]
}

object RecipientMap {
  @scala.inline
  def apply(
    recipientMap: typings.tensorflowTfjsLayers.executorMod.RecipientMap,
    sorted: js.Array[SymbolicTensor]
  ): RecipientMap = {
    val __obj = js.Dynamic.literal(recipientMap = recipientMap.asInstanceOf[js.Any], sorted = sorted.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientMap]
  }
}

