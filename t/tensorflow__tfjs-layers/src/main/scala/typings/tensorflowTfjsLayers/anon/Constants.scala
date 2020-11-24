package typings.tensorflowTfjsLayers.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constants extends js.Object {
  
  var constants: js.Array[SymbolicTensor | Tensor[Rank]] = js.native
  
  var initialState: js.Array[SymbolicTensor | Tensor[Rank]] = js.native
  
  var inputs: Tensor[Rank] | SymbolicTensor = js.native
}
object Constants {
  
  @scala.inline
  def apply(
    constants: js.Array[SymbolicTensor | Tensor[Rank]],
    initialState: js.Array[SymbolicTensor | Tensor[Rank]],
    inputs: Tensor[Rank] | SymbolicTensor
  ): Constants = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constants]
  }
  
  @scala.inline
  implicit class ConstantsOps[Self <: Constants] (val x: Self) extends AnyVal {
    
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
    def setConstantsVarargs(value: (SymbolicTensor | Tensor[Rank])*): Self = this.set("constants", js.Array(value :_*))
    
    @scala.inline
    def setConstants(value: js.Array[SymbolicTensor | Tensor[Rank]]): Self = this.set("constants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateVarargs(value: (SymbolicTensor | Tensor[Rank])*): Self = this.set("initialState", js.Array(value :_*))
    
    @scala.inline
    def setInitialState(value: js.Array[SymbolicTensor | Tensor[Rank]]): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: Tensor[Rank] | SymbolicTensor): Self = this.set("inputs", value.asInstanceOf[js.Any])
  }
}
