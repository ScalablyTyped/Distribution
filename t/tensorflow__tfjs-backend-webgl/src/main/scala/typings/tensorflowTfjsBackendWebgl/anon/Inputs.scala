package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsBackendWebgl.backendWebglMod.MathBackendWebGL
import typings.tensorflowTfjsCore.kernelNamesMod.FusedBatchNormAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.FusedBatchNormInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inputs extends StObject {
  
  var attrs: FusedBatchNormAttrs = js.native
  
  var backend: MathBackendWebGL = js.native
  
  var inputs: FusedBatchNormInputs = js.native
}
object Inputs {
  
  @scala.inline
  def apply(attrs: FusedBatchNormAttrs, backend: MathBackendWebGL, inputs: FusedBatchNormInputs): Inputs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inputs]
  }
  
  @scala.inline
  implicit class InputsMutableBuilder[Self <: Inputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: FusedBatchNormAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendWebGL): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: FusedBatchNormInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
