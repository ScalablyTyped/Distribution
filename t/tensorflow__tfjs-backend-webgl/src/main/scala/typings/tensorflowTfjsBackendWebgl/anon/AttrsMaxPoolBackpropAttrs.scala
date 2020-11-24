package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.MaxPoolBackpropAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.MaxPoolBackpropInputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsMaxPoolBackpropAttrs extends js.Object {
  
  var attrs: MaxPoolBackpropAttrs = js.native
  
  var backend: MathBackendWebGL = js.native
  
  var inputs: MaxPoolBackpropInputs = js.native
}
object AttrsMaxPoolBackpropAttrs {
  
  @scala.inline
  def apply(attrs: MaxPoolBackpropAttrs, backend: MathBackendWebGL, inputs: MaxPoolBackpropInputs): AttrsMaxPoolBackpropAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMaxPoolBackpropAttrs]
  }
  
  @scala.inline
  implicit class AttrsMaxPoolBackpropAttrsOps[Self <: AttrsMaxPoolBackpropAttrs] (val x: Self) extends AnyVal {
    
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
    def setAttrs(value: MaxPoolBackpropAttrs): Self = this.set("attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendWebGL): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: MaxPoolBackpropInputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
  }
}
