package typings.tensorflowTfjsLayers.anon

import typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientMap extends js.Object {
  
  var recipientMap: typings.tensorflowTfjsLayers.executorMod.RecipientMap = js.native
  
  var sorted: js.Array[SymbolicTensor] = js.native
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
  
  @scala.inline
  implicit class RecipientMapOps[Self <: RecipientMap] (val x: Self) extends AnyVal {
    
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
    def setRecipientMap(value: typings.tensorflowTfjsLayers.executorMod.RecipientMap): Self = this.set("recipientMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortedVarargs(value: SymbolicTensor*): Self = this.set("sorted", js.Array(value :_*))
    
    @scala.inline
    def setSorted(value: js.Array[SymbolicTensor]): Self = this.set("sorted", value.asInstanceOf[js.Any])
  }
}
