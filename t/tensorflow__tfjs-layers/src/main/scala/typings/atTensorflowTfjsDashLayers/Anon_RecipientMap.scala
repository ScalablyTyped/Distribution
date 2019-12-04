package typings.atTensorflowTfjsDashLayers

import typings.atTensorflowTfjsDashLayers.distEngineExecutorMod.RecipientMap
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RecipientMap extends js.Object {
  var recipientMap: RecipientMap
  var sorted: js.Array[SymbolicTensor]
}

object Anon_RecipientMap {
  @scala.inline
  def apply(recipientMap: RecipientMap, sorted: js.Array[SymbolicTensor]): Anon_RecipientMap = {
    val __obj = js.Dynamic.literal(recipientMap = recipientMap.asInstanceOf[js.Any], sorted = sorted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RecipientMap]
  }
}

