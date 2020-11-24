package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.ImagInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputsImagInputs extends js.Object {
  
  var backend: MathBackendWebGL = js.native
  
  var inputs: ImagInputs = js.native
}
object InputsImagInputs {
  
  @scala.inline
  def apply(backend: MathBackendWebGL, inputs: ImagInputs): InputsImagInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsImagInputs]
  }
  
  @scala.inline
  implicit class InputsImagInputsOps[Self <: InputsImagInputs] (val x: Self) extends AnyVal {
    
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
    def setBackend(value: MathBackendWebGL): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: ImagInputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
  }
}
