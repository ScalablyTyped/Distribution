package typings.tensorflowTfjsLayers.containerMod

import typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerArgs extends js.Object {
  
  var inputs: SymbolicTensor | js.Array[SymbolicTensor] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var outputs: SymbolicTensor | js.Array[SymbolicTensor] = js.native
}
object ContainerArgs {
  
  @scala.inline
  def apply(
    inputs: SymbolicTensor | js.Array[SymbolicTensor],
    outputs: SymbolicTensor | js.Array[SymbolicTensor]
  ): ContainerArgs = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerArgs]
  }
  
  @scala.inline
  implicit class ContainerArgsOps[Self <: ContainerArgs] (val x: Self) extends AnyVal {
    
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
    def setInputsVarargs(value: SymbolicTensor*): Self = this.set("inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: SymbolicTensor | js.Array[SymbolicTensor]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: SymbolicTensor*): Self = this.set("outputs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: SymbolicTensor | js.Array[SymbolicTensor]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
