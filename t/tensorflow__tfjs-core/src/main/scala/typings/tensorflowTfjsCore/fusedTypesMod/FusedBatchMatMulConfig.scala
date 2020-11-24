package typings.tensorflowTfjsCore.fusedTypesMod

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FusedBatchMatMulConfig extends js.Object {
  
  var a: Tensor3D = js.native
  
  var activation: js.UndefOr[Activation] = js.native
  
  var b: Tensor3D = js.native
  
  var bias: js.UndefOr[Tensor[Rank]] = js.native
  
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.native
  
  var transposeA: Boolean = js.native
  
  var transposeB: Boolean = js.native
}
object FusedBatchMatMulConfig {
  
  @scala.inline
  def apply(a: Tensor3D, b: Tensor3D, transposeA: Boolean, transposeB: Boolean): FusedBatchMatMulConfig = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], transposeA = transposeA.asInstanceOf[js.Any], transposeB = transposeB.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedBatchMatMulConfig]
  }
  
  @scala.inline
  implicit class FusedBatchMatMulConfigOps[Self <: FusedBatchMatMulConfig] (val x: Self) extends AnyVal {
    
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
    def setA(value: Tensor3D): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: Tensor3D): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeA(value: Boolean): Self = this.set("transposeA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeB(value: Boolean): Self = this.set("transposeB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivation(value: Activation): Self = this.set("activation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivation: Self = this.set("activation", js.undefined)
    
    @scala.inline
    def setBias(value: Tensor[Rank]): Self = this.set("bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBias: Self = this.set("bias", js.undefined)
    
    @scala.inline
    def setPreluActivationWeights(value: Tensor[Rank]): Self = this.set("preluActivationWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreluActivationWeights: Self = this.set("preluActivationWeights", js.undefined)
  }
}
