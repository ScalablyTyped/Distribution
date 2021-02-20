package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.ConcatAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.ConcatInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttrsConcatAttrs extends StObject {
  
  var attrs: ConcatAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: ConcatInputs = js.native
}
object AttrsConcatAttrs {
  
  @scala.inline
  def apply(attrs: ConcatAttrs, backend: MathBackendCPU, inputs: ConcatInputs): AttrsConcatAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsConcatAttrs]
  }
  
  @scala.inline
  implicit class AttrsConcatAttrsMutableBuilder[Self <: AttrsConcatAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: ConcatAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: ConcatInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: TensorInfo*): Self = StObject.set(x, "inputs", js.Array(value :_*))
  }
}
