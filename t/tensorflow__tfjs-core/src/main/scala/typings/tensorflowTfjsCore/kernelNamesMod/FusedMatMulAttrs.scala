package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.fusedTypesMod.Activation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FusedMatMulAttrs extends js.Object {
  
  var activation: Activation = js.native
  
  var transposeA: Boolean = js.native
  
  var transposeB: Boolean = js.native
}
object FusedMatMulAttrs {
  
  @scala.inline
  def apply(activation: Activation, transposeA: Boolean, transposeB: Boolean): FusedMatMulAttrs = {
    val __obj = js.Dynamic.literal(activation = activation.asInstanceOf[js.Any], transposeA = transposeA.asInstanceOf[js.Any], transposeB = transposeB.asInstanceOf[js.Any])
    __obj.asInstanceOf[FusedMatMulAttrs]
  }
  
  @scala.inline
  implicit class FusedMatMulAttrsOps[Self <: FusedMatMulAttrs] (val x: Self) extends AnyVal {
    
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
    def setActivation(value: Activation): Self = this.set("activation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeA(value: Boolean): Self = this.set("transposeA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeB(value: Boolean): Self = this.set("transposeB", value.asInstanceOf[js.Any])
  }
}
